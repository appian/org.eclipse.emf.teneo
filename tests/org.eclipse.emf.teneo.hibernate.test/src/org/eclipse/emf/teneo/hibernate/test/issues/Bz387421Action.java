/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * AgilAction.java,v 1.1 2007/03/28 13:58:33 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.issues;

import java.util.Properties;

import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.di.BpmnDiPackage;
import org.eclipse.dd.dc.DcPackage;
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
		super(new EPackage[] {Bpmn2Package.eINSTANCE, BpmnDiPackage.eINSTANCE, DcPackage.eINSTANCE, DiPackage.eINSTANCE });
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.MAP_DOCUMENT_ROOT, "true");
		return props;
	}

	public void setExtensions(ExtensionManager extensionManager) {
		extensionManager.registerExtension(EntityNameStrategy.class.getName(), DocumentRootHandlingNameStrategy.class
			.getName());
		super.setExtensions(extensionManager);
	}

	@Override
	public void doAction(TestStore store) {
	}
	
	public static class DocumentRootHandlingNameStrategy extends QualifyingEntityNameStrategy {
		public EClass toEClass(String eClassStr) {
			if (eClassStr.startsWith("dd_di")) {
				return (EClass)DiPackage.eINSTANCE.getEClassifier(eClassStr.substring(eClassStr.indexOf(".") + 1));
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
