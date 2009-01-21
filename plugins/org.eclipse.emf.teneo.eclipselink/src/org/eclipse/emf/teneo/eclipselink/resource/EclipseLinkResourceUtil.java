/*******************************************************************************
 * Copyright (c) 2008 Oracle and Geensys.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oracle and Geensys - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.teneo.eclipselink.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * This class contains convenient static methods for working with EclipseLink resources.
 */
public class EclipseLinkResourceUtil {

	/**
	 * Creates a EclipseLink {@link org.eclipse.emf.common.util.URI URI} from the given EclipseLink settings.
	 * <p>
	 * The resulting EclipseLink {@link org.eclipse.emf.common.util.URI URI} will have the following format:
	 * </p>
	 * <ul>
	 * <code>eclipselink://loginAlias/sessionName?contentsQueryAlias</code>
	 * </ul>
	 * </p>
	 * 
	 * @param loginAlias
	 *            the alias for a database login to be used. It refers to a
	 *            {@link org.eclipse.persistence.sessions.DatabaseLogin DatabaseLogin} instance which has been made
	 *            available through the {@link EclipseLinkSettingsRegistry}. If set to null, the database login
	 *            specified within the EclipseLink session configuration will be taken as a default.
	 * @param persistenceUnitName
	 *            the name of applicable database session declared in the EclipseLink sessions configuration. Must not
	 *            be null nor empty. The sessions configuration is expected to be provided in a file on the
	 *            application's classpath, and therefore doesn't need to be specified explicitly. The name of this file
	 *            has either to be left at its default <code>sesssions.xml</code> or must be specified using
	 *            {@link org.eclipse.emf.teneo.eclipselink.common.resource.EclipseLinkResource.OPTION_SESSIONS_CONFIGURATION_FILE_NAME
	 *            OPTION_SESSIONS_CONFIGURATION_FILE_NAME}.
	 * @param contentsQueryAlias
	 *            the alias for a contents query. Must not be null nor empty. It refers to a
	 *            {@link org.eclipse.persistence.queries.ReadAllQuery ReadAllQuery} instance which has been made
	 *            available through the {@link EclipseLinkSettingsRegistry}. If the alias is a qualified Java class name
	 *            and no matching contents query can be found, a new
	 *            {@link org.eclipse.persistence.queries.ReadAllQuery contents query} for reading all instances of the
	 *            given class will be created on the fly and added to the {@link EclipseLinkSettingsRegistry}.
	 * @return the newly created EclipseLink {@link org.eclipse.emf.common.util.URI URI} instance.
	 */
	public static URI createEclipseLinkURI(String persistenceUnitName, String contentsQueryAlias) {

		if (persistenceUnitName == null || persistenceUnitName.trim().length() == 0) {
			String msg = "Argument for parameter 'persistenceUnitName' must not be blank.";
			throw new WrappedException(new IllegalArgumentException(msg));
		}
		if (contentsQueryAlias == null || contentsQueryAlias.trim().length() == 0) {
			String msg = "Argument for parameter 'contentsQueryAlias' must not be blank.";
			throw new WrappedException(new IllegalArgumentException(msg));
		}

		String result = "eclipselink:///" + persistenceUnitName + "?" + contentsQueryAlias;
		return URI.createURI(result);
	}

	/**
	 * Checks if given {@link org.eclipse.emf.common.util.URI URI} is a EclipseLink URI.
	 * 
	 * @param uri
	 *            the {@link org.eclipse.emf.common.util.URI URI} to be analyzed. Must not be null.
	 * @return true if URI is a EclipseLink URI, false otherwise.
	 */
	public static boolean isEclipseLinkURI(URI uri) {

		if (uri == null) {
			String msg = "Argument for parameter 'uri' must not be null.";
			throw new WrappedException(new IllegalArgumentException(msg));
		}

		return "eclipselink".equals(uri.scheme());
	}

	/**
	 * TODO add comment
	 * 
	 * @param qualifiedType
	 * @return
	 */
	public static String createContentsInstancesOfQuery(EClass contentsType) {

		if (contentsType == null) {
			String msg = "Argument for parameter 'contentsType' must not be null.";
			throw new WrappedException(new IllegalArgumentException(msg));
		}

		return "select o from " + contentsType.getName() + " o";
	}

	/**
	 * Creates a {@link org.eclipse.persistence.queries.ReadAllQuery contents query} for a given type with a given value
	 * of a given feature.
	 * 
	 * @param contentsType
	 *            the type which the contents query has to be created for. Must not be null.
	 * @param feature
	 *            the feature on given type which is relevant to the contents query. Must not be null.
	 * @param value
	 *            the value which contents query to be created will check for equality on given feature of objects with
	 *            given type. Must not be null.
	 * @return the newly created {@link org.eclipse.persistence.queries.ReadAllQuery contents query}
	 */
	public static String createContentsEqualQuery(EClass contentsType, EStructuralFeature feature, Object value) {

		if (contentsType == null) {
			String msg = "Argument for parameter 'contentsType' must not be null.";
			throw new WrappedException(new IllegalArgumentException(msg));
		}
		if (feature == null) {
			String msg = "Argument for parameter 'feature' must not be null.";
			throw new WrappedException(new IllegalArgumentException(msg));
		}
		if (value == null) {
			String msg = "Argument for parameter 'value' must not be null.";
			throw new WrappedException(new IllegalArgumentException(msg));
		}

		return "select o from " + contentsType.getName() + " o where o." + feature.getName() + " = '" + value + "'";
	}

	/**
	 * TODO add comment
	 */
	public static String createContentsExampleQuery(EObject contentsExample) {

		if (contentsExample == null) {
			String msg = "Argument for parameter 'contentsExample' must not be null.";
			throw new WrappedException(new IllegalArgumentException(msg));
		}

		EAttribute idAttribute = contentsExample.eClass().getEIDAttribute();
		if (idAttribute != null) {
			return createContentsEqualQuery(contentsExample.eClass(), idAttribute, contentsExample.eGet(idAttribute));
		}
		return "";
	}
}
