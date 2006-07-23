/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 *   Davide Marchignoli
 * </copyright>
 *
 * $Id: HbMapperConstants.java,v 1.2 2006/07/23 23:49:22 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapper;

/**
 * Constants used by the hibernate mapper
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class HbMapperConstants {
	/** Name used for the feature property in the featuremap entry */
	public static final String PROPERTY_FEATURE = "fme_feature";

	/** Name used for the text property in a mixed featuremap entry */
	public static final String PROPERTY_MIXED_TEXT = "fme_mixed_text";

	/** Name used for the text property in a mixed featuremap entry */
	public static final String PROPERTY_MIXED_COMMENT = "fme_mixed_comment";

	/** Name used for the text property in a mixed featuremap entry */
	public static final String PROPERTY_MIXED_CDATA = "fme_mixed_cdata";

	/** Name used for the version property */
	public static final String PROPERTY_VERSION = "e_version";

	/** Name used for the id property */
	public static final String PROPERTY_ID_SYNTHETIC = "e_id";

	/** Name used for the eclass meta data */
	public static final String ECLASS_META = "eclass";
}