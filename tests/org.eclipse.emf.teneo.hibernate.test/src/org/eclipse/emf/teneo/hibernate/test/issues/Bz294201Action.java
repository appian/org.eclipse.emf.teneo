/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * AgilAction.java,v 1.1 2007/03/28 13:58:33 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.issues;

import java.util.Collection;
import java.util.Properties;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;
import org.eclipse.xsd.ecore.XSDEcoreBuilder;

/**
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class Bz294201Action extends AbstractTestAction {

	private static EPackage ePackage = readEPackage();

	public static EPackage readEPackage() {
		try {
			XSDEcoreBuilder xsdEcoreBuilder = new XSDEcoreBuilder();
			final java.net.URL url = Bz294201Action.class
					.getResource("/org/eclipse/emf/teneo/hibernate/test/issues/documentrootexp_2.xsd");
			Collection<EObject> eCoreObjects = xsdEcoreBuilder.generate(URI.createURI(url.toURI()
					.toString()));
			for (EObject ecoreObject : eCoreObjects) {
				if (ecoreObject instanceof EPackage) {
					return (EPackage) ecoreObject;
				}
			}
		} catch (Exception e) {
			e.printStackTrace(System.err);
			throw new IllegalStateException(e);
		}
		throw new IllegalArgumentException("No epackages found");
	}

	public Bz294201Action() {
		super(new EPackage[] { ePackage });
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.MAP_DOCUMENT_ROOT, "true");
		return props;
	}

	@Override
	public void doAction(TestStore store) {
		store.beginTransaction();
		store.commitTransaction();
	}
}
