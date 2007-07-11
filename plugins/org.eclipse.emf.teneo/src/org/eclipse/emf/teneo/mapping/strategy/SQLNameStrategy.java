/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others
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
 * $Id: SQLNameStrategy.java,v 1.2 2007/07/11 14:41:05 mtaal Exp $
 */

package org.eclipse.emf.teneo.mapping.strategy;

import java.util.List;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.extension.ExtensionPoint;

/**
 * Takes care of creating correct names for sql artifacts such as tables, columns, foreign keys,
 * etc.
 * 
 * Note that strategies are normally created once for each instance of persistenceoptions.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public interface SQLNameStrategy extends ExtensionPoint {

	String getPrimaryKeyJoinColumnName(PAnnotatedEClass aSuperClass, String idFeature);

	String getSecondaryTablePrimaryKeyJoinColumnName(PAnnotatedEStructuralFeature iddef);

	String getTableName(PAnnotatedEClass aClass);

	String getColumnName(PAnnotatedEStructuralFeature aStructuralFeature);

	String getForeignKeyName(PAnnotatedEReference aReference);

	List<String> getManyToOneJoinColumnNames(PAnnotatedEReference aReference);

	List<String> getOneToManyEAttributeJoinColumns(PAnnotatedEAttribute aAttribute);

	List<String> getOneToManyEReferenceJoinColumns(PAnnotatedEReference aReference);

	List<String> getJoinTableJoinColumns(PAnnotatedEReference aReference, boolean inverse);

	String getJoinTableName(PAnnotatedEReference aReference);

	String getDiscriminatorColumnName();

	String getVersionColumnName();

	String getIdBagIDColumn();

	String getSyntheticIDColumnName();

	public String convert(String name);

	void setPersistenceOptions(PersistenceOptions po);
}