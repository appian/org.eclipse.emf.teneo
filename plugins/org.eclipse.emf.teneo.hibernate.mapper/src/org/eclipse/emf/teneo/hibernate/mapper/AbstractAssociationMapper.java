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
 *   Martin Taal
 * </copyright>
 *
 * $Id: AbstractAssociationMapper.java,v 1.9 2007/02/08 23:13:12 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapper;

import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pannotation.CascadeType;
import org.eclipse.emf.teneo.annotations.pannotation.FetchType;
import org.eclipse.emf.teneo.annotations.pannotation.JoinColumn;
import org.eclipse.emf.teneo.annotations.pannotation.JoinTable;
import org.eclipse.emf.teneo.hibernate.hbannotation.IdBag;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEReference;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedETypeElement;
import org.eclipse.emf.teneo.simpledom.Element;

/**
 * Class contains different convenience methods which are of use for association mapping.
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
abstract class AbstractAssociationMapper extends AbstractMapper {

	/** Logger */
	private static final Log log = LogFactory.getLog(AbstractAssociationMapper.class);

	/**
	 * Constructor
	 * 
	 * @param hbmContext
	 *            the context used by this mapper curing processing
	 */
	public AbstractAssociationMapper(MappingContext hbmContext) {
		super(hbmContext);
	}

	/** Adds a manytoone tag to the current element of the hbmcontext */
	protected Element addManyToOne(PAnnotatedEReference aReference, String referedTo, boolean isReferedEntity) {
		final String assocName = getHbmContext().getPropertyName(aReference.getAnnotatedEReference());
		log.debug("addManyToOne " + assocName + "/" + referedTo);

		if (isEObject(referedTo)) {
			return getHbmContext().getCurrent().addElement("any").addAttribute("name", assocName) 
				.addAttribute("id-type", "long");
		}
		if (isReferedEntity) {
			return getHbmContext().getCurrent().addElement("many-to-one").addAttribute("name", assocName).addAttribute(
					"entity-name", referedTo);
		} else {
			return getHbmContext().getCurrent().addElement("many-to-one").addAttribute("name", assocName).addAttribute(
					"class", referedTo);
		}
	}

	/**
	 * Adds joincolumns to the associationElement, sets the insert and update attributes of the associationElement on
	 * the basis of the insertable/updatable attributes of the joinColumns. Note that the joinColumns list can be empty.
	 * forcenullable is set to true when a feature map entry is being processed.
	 */
	protected void addJoinColumns(Element associationElement, List<JoinColumn> joinColumns, boolean forceNullable) {
		log.debug("addJoinColumns " + associationElement.getName() + "/ no of joincolumns" + joinColumns.size());

		// assumption is that if one column is not insertable then the association is
		// not insertable, same for updatable
		boolean insertable = true;
		boolean updatable = true;

		for (JoinColumn joinColumn : joinColumns) {
			log.debug("JoinColumn " + joinColumn.getName());

			Element columnElement = associationElement.addElement("column").addAttribute("not-null",
					joinColumn.isNullable() || forceNullable ? "false" : "true").addAttribute("unique",
					joinColumn.isUnique() ? "true" : "false");
			if (joinColumn.getName() != null)
				columnElement.addAttribute("name", getHbmContext().trunc(joinColumn.getName()));

			// keep track if all joinColumns are insertable/updatable for in that case the
			// associationElement is also insertable/updatable or not
			insertable &= joinColumn.isInsertable();
			updatable &= joinColumn.isUpdatable();

			// disabled this because not-null is specified as optional on the many-to-one tag
			// also unique is more difficult
			// associationElement.addAttribute("not-null", !joinColumn.isNullable() ? "true" : "false");
			// associationElement.addAttribute("unique", joinColumn.isUnique() ? "true" : "false");
			// if (joinColumn.eIsSet(PannotationPackage.eINSTANCE.getJoinColumn_ReferencedColumnName()))
			// TODO is this foreign key ?
			// MT: see the property-ref in hibernate, is used when the reference is not on the primary key
			// of the target table but on some other column

			// MT: TODO add check on not insertable/updatable which is strange for a joincolumn, this check
			// is present in onetomany mapper
		}
		associationElement.addAttribute("insert", Boolean.toString(insertable));
		associationElement.addAttribute("update", Boolean.toString(updatable));
	}

	/**
	 * Creates cascades for onetoone/manytoone, they differ from many relations because no delete-orphan is supported.
	 * 
	 * @param associationElement:
	 *            the element to which the cascades are added.
	 * @param cascade:
	 *            list of cascade annotation types
	 */
	protected void addCascadesForSingle(Element associationElement, List<CascadeType> cascades) {
		addCascades(associationElement, cascades, false);
	}

	/**
	 * Creates cascades for onetomany, it differs from single relations because delete-orphan is supported when
	 * cascade=all
	 * 
	 * @param associationElement:
	 *            the element to which the cascades are added.
	 * @param cascade:
	 *            list of cascade annotation types
	 */
	protected void addCascadesForMany(Element associationElement, List<CascadeType> cascades) {
		addCascades(associationElement, cascades, true);
	}

	/**
	 * Creates cascades for onetoone/manytoone, they differ from many relations because no delete-orphan is supported.
	 * 
	 * @param associationElement:
	 *            the element to which the cascades are added.
	 * @param cascade:
	 *            list of cascade annotation types
	 * @param addDeleteOrphan:
	 *            if true then delete-orphan is added in case of cascade all
	 */
	protected void addCascades(Element associationElement, List<CascadeType> cascades, boolean addDeleteOrphan) {
		if (!cascades.isEmpty()) {
			StringBuffer sb = new StringBuffer();
			for (CascadeType cascade : cascades) {
				switch (cascade.getValue()) {
				case CascadeType.ALL:
					sb.append("all,"); // assuming all appears alone

					if (addDeleteOrphan) {
						sb.append("delete-orphan,");
					}
					break;
				case CascadeType.PERSIST:
					sb.append("persist,save-update,lock,");
					break;
				case CascadeType.MERGE:
					sb.append("merge,");
					break;
				case CascadeType.REFRESH:
					sb.append("refresh,");
					break;
				case CascadeType.REMOVE:
					sb.append("delete,");
					break;
				}
			}
			associationElement.addAttribute("cascade", sb.substring(0, sb.length() - 1));
		}
	}

	/**
	 * Sets the lazy attribute of the associationElement based on the fetchtype.
	 */
	protected void addFetchType(Element associationElement, FetchType fetch, boolean useProxy) {
		// TODO: when proxies are supported the below should be changed!
		if (useProxy) {
			associationElement.addAttribute("lazy", FetchType.LAZY_LITERAL.equals(fetch) ? "true" : "false");
		} else {
			associationElement.addAttribute("lazy", FetchType.LAZY_LITERAL.equals(fetch) ? "true" : "false");
		}
	}

	/**
	 * Adds a listindex element with the column name set to the give collection element.
	 */
	protected void addListIndex(Element collElement, PAnnotatedEStructuralFeature aFeature) {
		// TODO use column name generator
		String name = (aFeature.getPaEClass().getAnnotatedEClass().getName() + "_"
				+ aFeature.getAnnotatedEStructuralFeature().getName() + "_IDX").toUpperCase();

		log.debug("Add list index " + name + " to " + aFeature.getAnnotatedEStructuralFeature().getName());

		collElement.addElement("list-index").addAttribute("column", getHbmContext().trunc(name));
	}

	/**
	 * @return a newly added hibernate for given collection
	 * @deprecated use addCollectionElement(PAnnotatedEStructuralFeature) instead. protected Element
	 *             addCollectionElement(String name, boolean isIndexed) { return
	 *             getHbmContext().getCurrent().addElement(isIndexed ? "list" : "bag").addAttribute("name", name); //
	 *             .addAttribute("access", "org.eclipse.emf.teneo.hibernate.mapping.elist.EListPropertyAccessor"); }
	 */

	/**
	 * Creates a Hibernate collection element:
	 * <ul>
	 * <li>"&lt;list&gt;" if the collection is indexed.
	 * <li>"&lt;bag&gt;" if the collection is not indexed.
	 * <li>"&lt;idbag&gt;" if the collection is not indexed and has an IdBag annotation.
	 * </ul>
	 * 
	 * @param hbFeature
	 *            The structural feature for which to create collection.
	 * @return The collection element.
	 */
	protected Element addCollectionElement(PAnnotatedEStructuralFeature paFeature) {
		final Element collectionElement;
		HbAnnotatedETypeElement hbFeature = (HbAnnotatedETypeElement) paFeature;
		final IdBag idBag = hbFeature.getHbIdBag();

		boolean isMap = false;
		if (hbFeature instanceof PAnnotatedEReference) {
			EClass refType = ((PAnnotatedEReference) hbFeature).getAnnotatedEReference().getEReferenceType();
			final Class<?> instanceClass = refType.getInstanceClass();
			isMap = (null != instanceClass && Map.Entry.class.isAssignableFrom(instanceClass));
		}

		final EStructuralFeature estruct = paFeature.getAnnotatedEStructuralFeature();
		final boolean isArray = estruct instanceof EAttribute && estruct.getEType().getInstanceClass() != null
				&& estruct.getEType().getInstanceClass().isArray();

		// disabled following check because it also failed for many eattribute which even with a onetomany
		// do not create a onetomany tag
		// if (paFeature.getOneToMany() != null && paFeature.getJoinTable() == null && idBag != null) {
		// throw new MappingException("Cannot use one-to-many attribute mapping without jointable in combination with
		// IdBag.");
		// }
		final EClass eclass = paFeature.getPaEClass().getAnnotatedEClass();
		final boolean isEasyGenerated = getHbmContext().isEasyEMFGenerated(eclass) ||
			getHbmContext().isEasyEMFDynamic(eclass);
		if (isArray) { // array type
			collectionElement = getHbmContext().getCurrent().addElement("array");
		} else if (isMap && false) {
			collectionElement = getHbmContext().getCurrent().addElement("map");
		} else if (idBag != null) {
			collectionElement = getHbmContext().getCurrent().addElement("idbag");
		} else if (hbFeature.getOneToMany() != null && hbFeature.getOneToMany().isIndexed()) {
			collectionElement = getHbmContext().getCurrent().addElement("list");
		} else if (isEasyGenerated && 
				hbFeature.getOneToMany() != null && !hbFeature.getOneToMany().isIndexed() &&
				hbFeature.getJoinTable() == null) {
			collectionElement = getHbmContext().getCurrent().addElement("set");
		} else if (hbFeature instanceof PAnnotatedEReference
				&& ((PAnnotatedEReference) hbFeature).getManyToMany() != null
				&& ((PAnnotatedEReference) hbFeature).getManyToMany().isIndexed()) {
			collectionElement = getHbmContext().getCurrent().addElement("list");
		} else {
			collectionElement = getHbmContext().getCurrent().addElement("bag");
		}
		collectionElement.addAttribute("name", getHbmContext().getPropertyName(
				hbFeature.getAnnotatedEStructuralFeature()));
		if (idBag != null) {
			final String generator = (idBag.getGenerator() == null ? "increment" : idBag.getGenerator());
			final String type = (idBag.getType() == null ? "long" : idBag.getType());
			final Element collectionIdElement = collectionElement.addElement("collection-id");
			collectionIdElement.addAttribute("column", "ID");
			collectionIdElement.addAttribute("type", type);
			collectionIdElement.addElement("generator").addAttribute("class", generator);
		}
		
		if (hbFeature instanceof HbAnnotatedEReference) {
			final HbAnnotatedEReference hae = (HbAnnotatedEReference)hbFeature;
			if (hae.getHbFetch() != null) {
				collectionElement.addAttribute("fetch", hae.getHbFetch().getValue().getName().toLowerCase());
			}
		}
		
		if (paFeature instanceof PAnnotatedEReference && ((PAnnotatedEReference)paFeature).getOrderBy() != null) {
			collectionElement.addAttribute("order-by", ((PAnnotatedEReference)paFeature).getOrderBy().getValue());
		}
		
		return collectionElement;
	}

	/**
	 * Adds columns to a key element. Also sets update on the key element based on the values in the columns.
	 */
	protected void addKeyColumns(Element keyElement, List<JoinColumn> joinColumns) {
		log.debug("Adding key columns");
		boolean setUpdatable = false;
		boolean isUpdatable = false;
		for (JoinColumn joinColumn : joinColumns) {
			log.debug("Column " + joinColumn.getName());

			if (!setUpdatable) {
				isUpdatable = joinColumn.isUpdatable();
				keyElement.addAttribute("update", isUpdatable ? "true" : "false");
				setUpdatable = true;
			}

			if (!joinColumn.isInsertable()) {
				log.error("Unsupported non insertable join column in " + joinColumn);
				throw new MappingException("Unsupported non insertable join column", joinColumn);
			}
			if (joinColumn.isUpdatable() != isUpdatable) {
				log.error("Unsupported join column updatable in " + joinColumn);
				throw new MappingException("Unsupported join column updatable", joinColumn);
			}

			keyElement.addElement("column").addAttribute("name", getHbmContext().trunc(joinColumn.getName()))
					.addAttribute("not-null", joinColumn.isNullable() ? "false" : "true").addAttribute("unique",
							joinColumn.isUnique() ? "true" : "false");

			if (joinColumn.getTable() != null) {
				log.error("Unsupported secondary table in " + joinColumn);
				throw new MappingException("Unsupported secondary table", joinColumn);
			}

			if (joinColumn.getColumnDefinition() != null) {
				log.error("Unsupported column definition in " + joinColumn);
				throw new MappingException("Unsupported column definition", joinColumn);
			}
		}
		// TODO jc.getReferencedColumnName();
	}

	/**
	 * Adds a jointable and possible joincolumns to the passed key element.
	 * 
	 * @param collElement
	 * @param joinTable
	 */
	protected void addJoinTable(Element collElement, Element keyElement, JoinTable joinTable) {
		if (joinTable == null) {
			log.debug("No joinTable");
			return;
		}
		if (joinTable.getCatalog() != null) {
			collElement.addAttribute("catalog", joinTable.getCatalog());
		}
		if (joinTable.getSchema() != null) {
			collElement.addAttribute("schema", joinTable.getSchema());
		}
		if (joinTable.getName() != null) {
			collElement.addAttribute("table", joinTable.getName());
		}
		if (joinTable.getUniqueConstraints().size() > 0) {
			log.error("Unsupported unique constraints in " + joinTable);
			throw new MappingException("Unsupported unique constraints", joinTable);
		}
		addKeyColumns(keyElement, joinTable.getJoinColumns()/*
															 * == null ? new ArrayList() :
															 * (List)joinTable.getJoinColumns().getValue()
															 */);
	}
}
