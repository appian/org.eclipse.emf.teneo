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
import org.eclipse.emf.teneo.samples.issues.nonmandatoryjoincolumn.Bar;
import org.eclipse.emf.teneo.samples.issues.nonmandatoryjoincolumn.Foo;
import org.eclipse.emf.teneo.samples.issues.nonmandatoryjoincolumn.NonmandatoryjoincolumnFactory;
import org.eclipse.emf.teneo.samples.issues.nonmandatoryjoincolumn.NonmandatoryjoincolumnPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class NonMandatoryJoinColumnAction extends AbstractTestAction {

	public NonMandatoryJoinColumnAction() {
		super(new EPackage[] { NonmandatoryjoincolumnPackage.eINSTANCE });
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(
				PersistenceOptions.PERSISTENCE_XML,
				"org/eclipse/emf/teneo/hibernate/test/issues/nonmandatoryjoincolumn.persistence.xml");
		return props;
	}

	@Override
	public void doAction(TestStore store) {
		store.beginTransaction();
		final Foo foo = NonmandatoryjoincolumnFactory.eINSTANCE.createFoo();
		store.store(foo);
		store.commitTransaction();
	}
}
