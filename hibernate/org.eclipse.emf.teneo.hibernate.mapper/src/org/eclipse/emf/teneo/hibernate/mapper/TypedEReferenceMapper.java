/**
 * <copyright> Copyright (c) 2011 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal
 * </copyright> $Id: ManyAttributeMapper.java,v 1.27 2009/11/02 18:14:18 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapper;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pannotation.JoinColumn;
import org.eclipse.emf.teneo.annotations.pannotation.JoinTable;
import org.eclipse.emf.teneo.annotations.pannotation.OneToMany;
import org.eclipse.emf.teneo.extension.ExtensionPoint;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEAttribute;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEReference;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedETypeElement;
import org.eclipse.emf.teneo.simpledom.Element;

/**
 * Maps an EReference with a type annotation. This type of ereference is mapped
 * as an eattribute with a type parameter.
 * 
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
public class TypedEReferenceMapper extends AbstractAssociationMapper implements
		ExtensionPoint {
	public void process(PAnnotatedEReference paReference) {
		if (paReference.getModelEReference().isMany()) {
			processMany(paReference);
		} else {
			processSingle(paReference);
		}
	}

	private void processSingle(PAnnotatedEStructuralFeature paEFeature) {
		final String name = getHbmContext().getPropertyName(
				paEFeature.getModelEStructuralFeature());
		final Element propElement = getHbmContext().getCurrent()
				.addElement("property").addAttribute("name", name);
		addColumnsAndFormula(propElement, paEFeature, getColumns(paEFeature), true, true);
		setType(paEFeature, propElement);
		addAccessor(propElement);
	}

	private void processMany(PAnnotatedEStructuralFeature paEFeature) {
		final HbAnnotatedEReference hbReference = (HbAnnotatedEReference) paEFeature;

		final Element collElement = addCollectionElement(paEFeature);
		final Element keyElement = collElement.addElement("key");

		final JoinTable jt = paEFeature.getJoinTable();
		final List<JoinColumn> jcs = paEFeature.getJoinColumns() == null ? new ArrayList<JoinColumn>()
				: paEFeature.getJoinColumns();
		final OneToMany otm = paEFeature.getOneToMany();

		if (jt != null) {
			addJoinTable(hbReference, collElement, keyElement, jt);
			addKeyColumns(hbReference, keyElement, jcs);
		} else {
			addKeyColumns(hbReference, keyElement, jcs);
		}

		if (otm.isIndexed() && hbReference.getHbIdBag() == null) {
			addListIndex(collElement, paEFeature);
		}

		addFetchType(collElement, otm.getFetch());
		addCascadesForMany(collElement,
				getCascades(hbReference.getHbCascade(), otm.getCascade()));

		addElementElement(collElement, paEFeature, getColumns(paEFeature),
				otm.getTargetEntity());

		addAccessor(collElement);

		mapFilter(collElement,
				((HbAnnotatedETypeElement) paEFeature).getFilter());
	}
}
