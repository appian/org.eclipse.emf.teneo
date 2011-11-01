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
 *   Martin Taal
 * </copyright>
 *
 * $Id: HbConstants.java,v 1.9 2010/04/02 15:24:12 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate;

import org.eclipse.emf.teneo.PersistenceOptions;

/**
 * AnnotationUtil used in the runtime layer as well as the hibernate mapping step.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.9 $
 */
public class HbConstants {
	/**
	 * Column names used to store the econtainer class
	 * 
	 * @deprecated use {@link PersistenceOptions#ECONTAINER_CLASS_COLUMN}
	 */
	public final static String COLUMN_ECONTAINER_CLASS = "econtainer_class";

	/** Property Name of the econtainer property */
	public final static String PROPERTY_ECONTAINER = "e_container";

	/**
	 * Column names used to store the econtainer hibernate id.
	 * 
	 * @deprecated use {@link PersistenceOptions#ECONTAINER_COLUMN}
	 */
	public final static String COLUMN_ECONTAINER = "e_container";

	/**
	 * Column names used to store the econtainer feature name.
	 * 
	 * @deprecated use {@link PersistenceOptions#ECONTAINER_FEATURE_NAME_COLUMN}
	 */
	public final static String COLUMN_ECONTAINER_FEATURE_NAME = "e_container_feature_name";

	/** Property Name of the econtainer feature id property */
	public final static String PROPERTY_ECONTAINER_FEATURE_ID = "e_container_featureid";

	/** Property Name of the econtainer feature name property */
	public final static String PROPERTY_ECONTAINER_FEATURE_NAME = "e_container_featurename";

	/** Column names used to store the econtainer feature id */
	public final static String COLUMN_ECONTAINER_FEATUREID = "e_container_featureid";

	/** The filename of a hibernate file */
	public final static String HBM_FILE_NAME = "hibernate.hbm.xml";

	/** The file extension used for ehb files */
	public final static String EHB_FILE_EXTENSION = "ehb";

	/** The ex/import format from and to xml */
	public final static int EXCHANGE_FORMAT_XML = 0;

	/** The ex/import format from and to xmi */
	public final static int EXCHANGE_FORMAT_XMI = 1;
	
	public final static String EAV_TABLE_PREFIX_PARAMETER_REGEX = "\\{tableprefix\\}";
	
	public final static String EAV_COLLECTIONLAZY_REGEX = "\\{collectionLazySetting\\}";
	
	public final static String SYNTHETIC_PROPERTY_INDICATOR = "synthetic-property";
}