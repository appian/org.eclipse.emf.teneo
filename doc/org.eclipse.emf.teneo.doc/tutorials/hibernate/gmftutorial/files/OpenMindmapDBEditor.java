/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: OpenMindmapDBEditor.java,v 1.12 2008/06/29 14:24:23 mtaal Exp $
 */
package org.eclipse.gmf.examples.mindmap.diagram.db;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.hibernate.resource.HibernateXMLResource;
import org.eclipse.gmf.examples.mindmap.Map;
import org.eclipse.gmf.examples.mindmap.MindmapFactory;
import org.eclipse.gmf.examples.mindmap.diagram.edit.parts.MapEditPart;
import org.eclipse.gmf.examples.mindmap.diagram.part.MindmapDiagramEditor;
import org.eclipse.gmf.examples.mindmap.diagram.part.MindmapDiagramEditorPlugin;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

/**
 * Rather generic class which opens an editor using the static ID member in the
 * MindmapDiagramDBEditor class.
 * 
 * @author mtaal@elver.org
 */
public class OpenMindmapDBEditor implements IWorkbenchWindowActionDelegate {

	private IWorkbenchWindow window;

	public void dispose() {
	}

	public void init(IWorkbenchWindow window) {
		this.window = window;
		StoreController.getInstance().initializeDataStore();
	}

	public void selectionChanged(IAction action, ISelection selection) {
	}

	public void run(IAction action) {

		try {
			initializeData();
			final IWorkbenchPage page = window.getActivePage();
			page.openEditor(new URIEditorInput(StoreController.DATABASE_URI),
					MindmapDiagramEditor.ID);
		} catch (Exception e) {
			throw new IllegalStateException(e);
		}
	}

	// Ensure that the resource at least contains a Map and a diagram object
	private void initializeData() {
		try {
			final Resource res = new HibernateXMLResource(
					StoreController.DATABASE_URI);
			res.load(Collections.EMPTY_MAP);
			boolean addMap = true;
			boolean addDiagram = true;
			Map map = null;
			for (Object o : res.getContents()) {
				if (o instanceof Map) {
					addMap = false;
					map = (Map) o;
				}
				if (o instanceof Diagram) {
					addDiagram = false;
				}
			}
			if (addMap) {
				map = MindmapFactory.eINSTANCE.createMap();
				res.getContents().add(map);
			}
			if (addDiagram) {
				Diagram diagram = ViewService.createDiagram(map,
						MapEditPart.MODEL_ID,
						MindmapDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				res.getContents().add(diagram);
				diagram.setName("mindmap");
				diagram.setElement(map);
			}
			if (addMap || addDiagram) {
				res.save(Collections.EMPTY_MAP);
			}
			res.unload();
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}
	}
}