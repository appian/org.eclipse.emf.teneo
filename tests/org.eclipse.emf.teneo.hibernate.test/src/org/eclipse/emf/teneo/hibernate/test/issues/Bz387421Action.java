/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * AgilAction.java,v 1.1 2007/03/28 13:58:33 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.issues;

import java.util.Properties;

import org.eclipse.bpmn2.Bpmn2Factory;
import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.Definitions;
import org.eclipse.bpmn2.DocumentRoot;
import org.eclipse.bpmn2.EndEvent;
import org.eclipse.bpmn2.Process;
import org.eclipse.bpmn2.SequenceFlow;
import org.eclipse.bpmn2.StartEvent;
import org.eclipse.bpmn2.di.BPMNDiagram;
import org.eclipse.bpmn2.di.BPMNEdge;
import org.eclipse.bpmn2.di.BPMNPlane;
import org.eclipse.bpmn2.di.BPMNShape;
import org.eclipse.bpmn2.di.BpmnDiFactory;
import org.eclipse.bpmn2.di.BpmnDiPackage;
import org.eclipse.dd.dc.Bounds;
import org.eclipse.dd.dc.DcFactory;
import org.eclipse.dd.dc.DcPackage;
import org.eclipse.dd.dc.Point;
import org.eclipse.dd.di.DiPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.extension.ExtensionManager;
import org.eclipse.emf.teneo.mapping.strategy.EntityNameStrategy;
import org.eclipse.emf.teneo.mapping.strategy.impl.QualifyingEntityNameStrategy;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class Bz387421Action extends AbstractTestAction {

	public Bz387421Action() {
		super(new EPackage[] { Bpmn2Package.eINSTANCE, BpmnDiPackage.eINSTANCE, DcPackage.eINSTANCE,
				DiPackage.eINSTANCE });
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.PERSISTENCE_XML,
				"org/eclipse/emf/teneo/hibernate/test/issues/bz387421.persistence.xml");
		// props.setProperty(PersistenceOptions.JOIN_TABLE_FOR_NON_CONTAINED_ASSOCIATIONS,
		// "true");
		props.setProperty(PersistenceOptions.MAP_DOCUMENT_ROOT, "true");
		props.setProperty(PersistenceOptions.INHERITANCE_MAPPING, "JOINED");
		props.setProperty(PersistenceOptions.MAP_ALL_LISTS_AS_IDBAG, "true");
		props.setProperty(PersistenceOptions.AUTO_ADD_REFERENCED_EPACKAGES, "true");
		return props;
	}

	public void setExtensions(ExtensionManager extensionManager) {
		extensionManager.registerExtension(EntityNameStrategy.class.getName(),
				DocumentRootHandlingNameStrategy.class.getName());
		super.setExtensions(extensionManager);
	}

	@Override
	public void doAction(TestStore store) {
		store.beginTransaction();

		DocumentRoot docRoot = Bpmn2Factory.eINSTANCE.createDocumentRoot();

		BPMNPlane plane = BpmnDiFactory.eINSTANCE.createBPMNPlane();
		plane.setId("147");
		Definitions defs = Bpmn2Factory.eINSTANCE.createDefinitions();
		defs.setId("12");
		defs.setTargetNamespace("http://wiki.eclipse.org");

		docRoot.setDefinitions(defs);
		Process process = Bpmn2Factory.eINSTANCE.createProcess();
		defs.getRootElements().add(process);
		String name = "pz";
		process.setName(name + " Process");
		// the Process ID should be the same as the resource name
		process.setId("214");

		// create StartEvent
		StartEvent startEvent = Bpmn2Factory.eINSTANCE.createStartEvent();
		// startEvent.setName("Start Event");
		process.getFlowElements().add(startEvent);
		startEvent.setId("525");

		// create SequenceFlow
		SequenceFlow flow = Bpmn2Factory.eINSTANCE.createSequenceFlow();

		process.getFlowElements().add(flow);
		flow.setId("526");
		// create EndEvent
		EndEvent endEvent = Bpmn2Factory.eINSTANCE.createEndEvent();
		// endEvent.setName("End Event");
		process.getFlowElements().add(endEvent);
		endEvent.setId("527");
		// hook 'em up
		startEvent.getOutgoing().add(flow);
		endEvent.getIncoming().add(flow);
		flow.setSourceRef(startEvent);
		flow.setTargetRef(endEvent);

		// create DI shapes
		BPMNShape shape = BpmnDiFactory.eINSTANCE.createBPMNShape();
		shape.setId("345");

		// StartEvent shape
		shape.setBpmnElement(startEvent);
		Bounds bounds = DcFactory.eINSTANCE.createBounds();
		bounds.setX(100);
		bounds.setY(100);
		bounds.setWidth(100f);
		bounds.setHeight(100f);
		shape.setBounds(bounds);
		plane.getPlaneElement().add(shape);
		// Bpmn2Preferences pref = new Bpmn2Preferences();
		// pref.applyBPMNDIDefaults(shape, null);

		// SequenceFlow edge
		BPMNEdge edge = BpmnDiFactory.eINSTANCE.createBPMNEdge();
		edge.setId("271");
		edge.setBpmnElement(flow);
		edge.setSourceElement(shape);

		Point wp = DcFactory.eINSTANCE.createPoint();
		wp.setX(100 + 100f);
		wp.setY(100 + 100f / 2);
		edge.getWaypoint().add(wp);

		wp = DcFactory.eINSTANCE.createPoint();
		wp.setX(500);
		wp.setY(100 + 100f / 2);
		edge.getWaypoint().add(wp);

		plane.getPlaneElement().add(edge);

		// EndEvent shape
		shape = BpmnDiFactory.eINSTANCE.createBPMNShape();
		shape.setId("489");

		shape.setBpmnElement(endEvent);
		bounds = DcFactory.eINSTANCE.createBounds();
		bounds.setX(500);
		bounds.setY(100);
		bounds.setWidth(100f);
		bounds.setHeight(100f);
		shape.setBounds(bounds);
		plane.getPlaneElement().add(shape);
		// pref.applyBPMNDIDefaults(shape, null);

		edge.setTargetElement(shape);

		// add to BPMNDiagram

		final BPMNDiagram bpmnDiagram = BpmnDiFactory.eINSTANCE.createBPMNDiagram();
		bpmnDiagram.setId("124");

		plane.setBpmnElement(process);
		bpmnDiagram.setPlane(plane);
		bpmnDiagram.setName(name + " Process Diagram");
		defs.getDiagrams().add(bpmnDiagram);
		store.store(docRoot);
		// defs = EcoreUtil.copy(defs);
		store.commitTransaction();

	}

	public static class DocumentRootHandlingNameStrategy extends QualifyingEntityNameStrategy {
		public EClass toEClass(String eClassStr) {
			if (eClassStr.startsWith("dd_di")) {
				return (EClass) DiPackage.eINSTANCE.getEClassifier(eClassStr.substring(eClassStr
						.indexOf(".") + 1));
			}
			return super.toEClass(eClassStr);
		}

		public String toEntityName(EClass eClass) {
			// handle di specifically
			if (eClass.getEPackage() == DiPackage.eINSTANCE) {
				return "dd_di." + eClass.getName();
			}
			return super.toEntityName(eClass);
		}

	}
}
