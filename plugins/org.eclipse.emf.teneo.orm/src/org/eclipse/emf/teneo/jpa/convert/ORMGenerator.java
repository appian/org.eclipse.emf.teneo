/**
 * <copyright>
 *
 * Copyright (c) 2009 Springsite BV (The Netherlands) and others
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
 * $Id: ORMGenerator.java,v 1.6 2010/03/02 20:45:39 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpa.convert;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.emf.teneo.ERuntime;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.annotations.mapper.PersistenceMappingBuilder;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;
import org.eclipse.emf.teneo.annotations.pannotation.CascadeType;
import org.eclipse.emf.teneo.extension.DefaultExtensionManager;
import org.eclipse.emf.teneo.extension.ExtensionManager;
import org.eclipse.emf.teneo.jpa.orm.AccessType;
import org.eclipse.emf.teneo.jpa.orm.AttributeOverride;
import org.eclipse.emf.teneo.jpa.orm.Attributes;
import org.eclipse.emf.teneo.jpa.orm.Basic;
import org.eclipse.emf.teneo.jpa.orm.Column;
import org.eclipse.emf.teneo.jpa.orm.DocumentRoot;
import org.eclipse.emf.teneo.jpa.orm.Embedded;
import org.eclipse.emf.teneo.jpa.orm.EmbeddedId;
import org.eclipse.emf.teneo.jpa.orm.Entity;
import org.eclipse.emf.teneo.jpa.orm.EntityMappingsType;
import org.eclipse.emf.teneo.jpa.orm.Id;
import org.eclipse.emf.teneo.jpa.orm.IdClass;
import org.eclipse.emf.teneo.jpa.orm.JoinColumn;
import org.eclipse.emf.teneo.jpa.orm.ManyToMany;
import org.eclipse.emf.teneo.jpa.orm.ManyToOne;
import org.eclipse.emf.teneo.jpa.orm.MappedSuperclass;
import org.eclipse.emf.teneo.jpa.orm.OneToMany;
import org.eclipse.emf.teneo.jpa.orm.OneToOne;
import org.eclipse.emf.teneo.jpa.orm.OrmFactory;
import org.eclipse.emf.teneo.jpa.orm.PersistenceUnitDefaults;
import org.eclipse.emf.teneo.jpa.orm.PersistenceUnitMetadata;
import org.eclipse.emf.teneo.jpa.orm.Transient;
import org.eclipse.emf.teneo.jpa.orm.Version;

/**
 * Converts a PAnnotatedModel to an ORM model.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
 */

public class ORMGenerator {

	private OrmFactory factory = OrmFactory.eINSTANCE;

	// public static void main(String[] args) {
	// final ORMGenerator ormGenerator = new ORMGenerator();
	// ormGenerator.testGenerateORM();
	// }
	//
	// public void testGenerateORM() {
	// final Properties props = new Properties();
	// props.setProperty(PersistenceOptions.SQL_TABLE_NAME_PREFIX, "EMFLIB_");
	//
	// final ORMGenerator converter = new ORMGenerator();
	// final String orm = converter.generateORM(
	// new EPackage[] { DataPackage.eINSTANCE }, converter
	// .getDefaultPersistenceOptions(props));
	// System.err.println(orm);
	// // writeToFile(orm, "bin/META-INF/orm.xml");
	// // writeToFile(orm, "src/META-INF/orm.xml");
	// }
	//
	// private void writeToFile(String content, String path) {
	// try {
	// FileWriter fw = new FileWriter(
	// "/home/mtaal/mydata/dev/workspaces/nextspace/org.eclipse.emf.teneo.eclipselink.examples.library/"
	// + path);
	// fw.write(content);
	// fw.close();
	// } catch (Exception e) {
	// throw new IllegalStateException(e);
	// }
	// }

	/**
	 * Returns the default settings of some persistence options
	 * 
	 * @param props
	 *            properties set by the user, new properties override current ones
	 * @return the PersistenceOptions object
	 */
	public PersistenceOptions getDefaultPersistenceOptions(Properties props) {
		props.setProperty(PersistenceOptions.SQL_NAME_ESCAPE_CHARACTER, "");
		props.setProperty(PersistenceOptions.EMAP_AS_TRUE_MAP, "false");
		props.setProperty(PersistenceOptions.SET_DEFAULT_CASCADE_ON_NON_CONTAINMENT, "true");
		props.setProperty(PersistenceOptions.CASCADE_POLICY_ON_NON_CONTAINMENT, "REFRESH,PERSIST,MERGE");
		props.setProperty(PersistenceOptions.ID_FEATURE_AS_PRIMARY_KEY, "false");
		props.setProperty(PersistenceOptions.SQL_CASE_STRATEGY, "uppercase");
		final ExtensionManager extensionManager = new DefaultExtensionManager();
		return extensionManager.getExtension(PersistenceOptions.class, new Object[] { props });
	}

	/**
	 * Generate the ORM for a set of EPackages. Uses the default PersistenceOptions settings.
	 * 
	 * @param ePackages
	 *            the ePackages to generate an ORM for
	 * @return the orm.xml as a String
	 */
	public String generateORM(EPackage[] ePackages) {
		return generateORM(ePackages, getDefaultPersistenceOptions(new Properties()));
	}

	/**
	 * Generate the ORM for a set of EPackages
	 * 
	 * @param ePackages
	 *            the ePackages to generate an ORM for
	 * @param po
	 *            the PersistenceOptions to use for generation
	 * @return the orm.xml as a String
	 */
	public String generateORM(EPackage[] ePackages, PersistenceOptions po) {
		final ExtensionManager extensionManager = new DefaultExtensionManager();
		final PAnnotatedModel paModel = extensionManager.getExtension(PersistenceMappingBuilder.class).buildMapping(
				ePackages, po, extensionManager);
		return generateORM(paModel.getPaEPackages(), po);
	}

	/**
	 * Convert a PAnnotated model to an ORM model.
	 * 
	 * @param annotatedEPackages
	 *            the annotated EPackages to convert
	 * @param po
	 *            some {@link PersistenceOptions}
	 * @return the orm model as a XML string
	 */
	public String generateORM(List<PAnnotatedEPackage> annotatedEPackages, PersistenceOptions po) {
		final XMLResource res = new XMLResourceImpl();
		final Map<String, Object> options = new HashMap<String, Object>();
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, true);
		options.put(XMLResource.OPTION_SCHEMA_LOCATION, true);
		options.put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, true);

		final StringWriter sw = new StringWriter();
		final DocumentRoot dr = factory.createDocumentRoot();
		dr.setEntityMappings(convertPAnnotatedEPackages(annotatedEPackages, po));
		dr.getXMLNSPrefixMap().put("xsi", "http://www.w3.org/2001/XMLSchema-instance");
		dr.getXSISchemaLocation().put("http://java.sun.com/xml/ns/persistence/orm",
				"http://java.sun.com/xml/ns/persistence/orm_1_0.xsd");
		res.getContents().add(dr);
		try {
			res.save(sw, options);
			return sw.toString();
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}
	}

	/**
	 * Convert an annotated model to an instance of an ORM model
	 * 
	 * @param annotatedEPackages
	 *            the annotated model
	 * @param po
	 *            the persistence options influencing the mapping
	 * @return an instance of an ORM model
	 */
	public EntityMappingsType convertPAnnotatedEPackages(List<PAnnotatedEPackage> annotatedEPackages,
			PersistenceOptions po) {
		final EntityMappingsType entityMappings = OrmFactory.eINSTANCE.createEntityMappingsType();
		entityMappings.setVersion("1.0");
		entityMappings.setPersistenceUnitMetadata(getMetaData());
		for (PAnnotatedEPackage pPackage : annotatedEPackages) {

			copyFeatures(pPackage, entityMappings);

			for (PAnnotatedEClass pClass : pPackage.getPaEClasses()) {
				if (pClass.getEntity() == null) {
					continue;
				}
				if (ERuntime.INSTANCE.getJavaClass(pClass.getModelEClass()) == null) {
					continue;
				}
				convertPAnnotatedEClass(entityMappings, pClass);
			}
		}
		escape(entityMappings, po.getSqlNameEscapeCharacter());

		return entityMappings;
	}

	/**
	 * Escape the table and column names in the model, using an eannotation flag on the orm meta model.
	 * 
	 * @param entityMappings
	 *            the model containing the table/column instances of which the names will be escaped
	 * @param escapeChar
	 *            the character to use for escaping
	 */
	private void escape(EntityMappingsType entityMappings, String escapeChar) {
		if (escapeChar == null || escapeChar.trim().length() == 0) {
			return;
		}
		for (Iterator<EObject> it = entityMappings.eAllContents(); it.hasNext();) {
			final EObject eObject = it.next();
			for (EStructuralFeature eFeature : eObject.eClass().getEAllAttributes()) {
				final EAnnotation eAnnotation = eFeature.getEAnnotation("teneo.escape");
				if (eAnnotation != null) {
					final String value = (String) eObject.eGet(eFeature);
					if (value != null && value.trim().length() > 0 && !value.startsWith(escapeChar)
							&& !value.endsWith(escapeChar)) {
						eObject.eSet(eFeature, "'\"" + value + "\"'");
					}
				}
			}
		}
	}

	/**
	 * Converts an annotated EClass by creating an ORM model equivalent and adding it to the passed entityTypes.
	 * 
	 * @param entityTypes
	 *            the ORM model to fill
	 * @param pClass
	 *            the annotated EClass to convert to ORM
	 */
	private void convertPAnnotatedEClass(EntityMappingsType entityTypes, PAnnotatedEClass pClass) {
		List<PAnnotatedEPackage> annotatedEPackages = pClass.getPaModel().getPaEPackages();
		final EObject mainType;
		if (pClass.getMappedSuperclass() != null) {
			final MappedSuperclass mappedSuperclass = factory.createMappedSuperclass();
			entityTypes.getMappedSuperclass().add(mappedSuperclass);
			mainType = mappedSuperclass;
			mappedSuperclass.setClass(ERuntime.INSTANCE.getJavaClass(pClass.getModelEClass()).getName());
		} else {
			final Entity entity = factory.createEntity();
			entityTypes.getEntity().add(entity);
			mainType = entity;
			entity.setName(pClass.getEntity().getName());
			entity.setClass(ERuntime.INSTANCE.getJavaClass(pClass.getModelEClass()).getName());

		}
		copyFeatures(pClass, mainType);

		final Attributes attributes = factory.createAttributes();
		mainType.eSet(mainType.eClass().getEStructuralFeature("attributes"), attributes);

		if (isMapEntry(pClass.getModelEClass())) {
			addEMapAnnotations((Entity) mainType, attributes, pClass);
		}

		for (PAnnotatedEStructuralFeature pFeature : pClass.getPaEStructuralFeatures()) {
			mapEFeature(pFeature, attributes);
		}

		// add container featureid
		if (pClass.getPaSuperEntity() == null) {
			final Basic basic = factory.createBasic();
			basic.setName("eContainerFeatureID");
			final Column c = factory.createColumn();
			c.setName("ECONT_FEAT_ID");
			basic.setColumn(c);
			attributes.getBasic().add(basic);
		}

		final PAnnotatedEReference containmentRef = getContainmentFeature(pClass, annotatedEPackages);
		if (containmentRef != null) {
			if (containmentRef.getModelEReference().isMany()) {
				final ManyToOne mto = factory.createManyToOne();
				mto.setName("eContainer");
				mto.setTargetEntity(ERuntime.INSTANCE.getJavaClass(containmentRef.getPaEClass().getModelEClass())
						.getName());
				attributes.getManyToOne().add(mto);

				final JoinColumn jc = factory.createJoinColumn();
				jc.setName(containmentRef.getJoinColumns().get(0).getName());
				mto.getJoinColumn().add(jc);

				final org.eclipse.emf.teneo.jpa.orm.CascadeType ct = factory.createCascadeType();
				ct.setCascadeAll(factory.createEmptyType());
				mto.setCascade(ct);
			} else {
				final OneToOne oto = factory.createOneToOne();
				oto.setName("eContainer");
				oto.setTargetEntity(ERuntime.INSTANCE.getJavaClass(containmentRef.getPaEClass().getModelEClass())
						.getName());
				attributes.getOneToOne().add(oto);
				oto.setMappedBy(containmentRef.getModelEReference().getName());
				final org.eclipse.emf.teneo.jpa.orm.CascadeType ct = factory.createCascadeType();
				ct.setCascadeAll(factory.createEmptyType());
				oto.setCascade(ct);
			}
		}

	}

	/**
	 * Translate one annotated EStructuralFeature to its ORM equivalent and add it to the ORM attributes
	 * 
	 * @param pFeature
	 *            the annotated EFeature to map
	 * @param attributes
	 *            the ORM attributes
	 */
	private void mapEFeature(PAnnotatedEStructuralFeature pFeature, Attributes attributes) {
		if (isMapEntry(pFeature.getPaEClass().getModelEClass()) && pFeature.getModelElement().getName().equals("key")) {
			return;
		}

		if (pFeature instanceof PAnnotatedEAttribute) {
			final PAnnotatedEAttribute pAttribute = (PAnnotatedEAttribute) pFeature;
			if (pAttribute.getTransient() != null) {
				final Transient t = factory.createTransient();
				t.setName(pAttribute.getModelEAttribute().getName());
				attributes.getTransient().add(t);
			} else if (pAttribute.getVersion() != null) {
				final Version v = factory.createVersion();
				v.setName(pAttribute.getModelEAttribute().getName());
				copyFeatures(pAttribute, v);
				copyFeatures(pAttribute.getVersion(), v);
				attributes.getVersion().add(v);
			} else if (pAttribute.getId() != null) {
				final Id id = factory.createId();
				id.setName(pAttribute.getModelEAttribute().getName());
				copyFeatures(pAttribute, id);
				copyFeatures(pAttribute.getId(), id);
				attributes.getId().add(id);
			} else if (pAttribute.getBasic() != null) {
				final Basic b = factory.createBasic();
				b.setName(pAttribute.getModelEAttribute().getName());
				copyFeatures(pAttribute, b);
				copyFeatures(pAttribute.getBasic(), b);
				attributes.getBasic().add(b);
			}
		} else {
			final PAnnotatedEReference pReference = (PAnnotatedEReference) pFeature;
			if (pReference.getModelEReference().isContainer()) {
				// do nothing ignore
			} else if (pReference.getTransient() != null) {
				final Transient t = factory.createTransient();
				t.setName(pReference.getModelEReference().getName());
				attributes.getTransient().add(t);
			} else if (pReference.getEmbedded() != null) {
				final Embedded embedded = factory.createEmbedded();
				embedded.setName(pReference.getModelEReference().getName());
				copyFeatures(pReference, embedded);
				copyFeatures(pReference.getEmbedded(), embedded);
				attributes.getEmbedded().add(embedded);
			} else if (pReference.getEmbeddedId() != null) {
				final EmbeddedId embeddedId = factory.createEmbeddedId();
				embeddedId.setName(pReference.getModelEReference().getName());
				copyFeatures(pReference, embeddedId);
				copyFeatures(pReference.getEmbeddedId(), embeddedId);
				attributes.setEmbeddedId(embeddedId);
			} else if (pReference.getManyToOne() != null) {
				if (pReference.getModelEReference().isContainment()) {
					final OneToOne oto = factory.createOneToOne();
					oto.setName(pReference.getModelEReference().getName());
					copyFeatures(pReference, oto);
					copyFeatures(pReference.getManyToOne(), oto);
					attributes.getOneToOne().add(oto);

					if (oto.getMappedBy() != null) {
						oto.getJoinColumn().clear();
					}

					setTargetEntity(oto, pReference);
				} else {
					final ManyToOne mto = factory.createManyToOne();
					mto.setName(pReference.getModelEReference().getName());
					copyFeatures(pReference, mto);
					copyFeatures(pReference.getManyToOne(), mto);
					attributes.getManyToOne().add(mto);
					setTargetEntity(mto, pReference);
				}
			} else if (pReference.getManyToMany() != null) {
				// // do a small repair action, in case of a mtm only one side
				// // should have the jointable and the other side the mappedby
				// final EReference thisSide = pReference.getModelEReference();
				// final EReference thatSide = thisSide.getEOpposite();
				// if (thatSide != null) {
				// final String thatName = thatSide.getEContainingClass()
				// .getEPackage().getNsURI()
				// + thatSide.getEContainingClass().getName()
				// + "."
				// + thatSide.getName();
				// final String thisName = thisSide.getEContainingClass()
				// .getEPackage().getNsURI()
				// + thisSide.getEContainingClass().getName()
				// + "."
				// + thisSide.getName();
				//
				// if (thisName.compareTo(thatName) > 0
				// && pReference.getJoinTable() != null) {
				// pReference.setJoinTable(null);
				// pReference.getManyToMany().setMappedBy(
				// thatSide.getName());
				// } else {
				// pReference.getManyToMany().setMappedBy(null);
				// }
				// }

				final ManyToMany mtm = factory.createManyToMany();
				mtm.setName(pReference.getModelEReference().getName());
				copyFeatures(pReference, mtm);
				copyFeatures(pReference.getManyToMany(), mtm);
				attributes.getManyToMany().add(mtm);
				setTargetEntity(mtm, pReference);
			} else if (pReference.getOneToMany() != null) {
				final OneToMany otm = factory.createOneToMany();
				otm.setName(pReference.getModelEReference().getName());
				copyFeatures(pReference, otm);
				copyFeatures(pReference.getOneToMany(), otm);
				attributes.getOneToMany().add(otm);
				if (pReference.getModelEReference().isContainment()
						&& pReference.getModelEReference().getEOpposite() == null) {
					otm.setMappedBy("eContainer");
				}
				if (otm.getMappedBy() != null) {
					otm.getJoinColumn().clear();
				}
				setTargetEntity(otm, pReference);
			} else if (pReference.getOneToOne() != null) {
				final OneToOne oto = factory.createOneToOne();
				oto.setName(pReference.getModelEReference().getName());
				copyFeatures(pReference, oto);
				copyFeatures(pReference.getOneToOne(), oto);
				attributes.getOneToOne().add(oto);
				setTargetEntity(oto, pReference);
				// do some clean up
				if (oto.getMappedBy() != null) {
					oto.getJoinColumn().clear();
				}
			}
		}
	}

	// an EMap can be handled in two ways:
	// 1) there is a superclass which has an id attribute in this case attribute
	// overrides needs to be added, and the overridden attribute needs to be
	// mapped to the column of the owner id
	// 2) no super class, so the owner id is mapped as an id
	// note that if an EMAP has a superclass then it must always be mapped
	// to the same table or as a mappedsuperclass
	private void addEMapAnnotations(Entity entity, Attributes attributes, PAnnotatedEClass aClass) {

		final IdClass idClass = factory.createIdClass();
		idClass.setClass("org.eclipse.emf.teneo.eclipselink.util.MapEntryId");
		final Id id = factory.createId();
		id.setName("key");
		final Column idColumn = factory.createColumn();
		// TODO: uses special prefix to prevent use of reserved name
		idColumn.setName("e_key");
		id.setColumn(idColumn);
		attributes.getId().add(id);

		final Transient t = factory.createTransient();
		t.setName("hash");
		attributes.getTransient().add(t);

		// add an attribute overrides
		if (hasSuperTypeWithId(aClass)) {
			// get the one-to-many of the owning type
			PAnnotatedEReference owningReference = getContainmentFeature(aClass, aClass.getPaModel().getPaEPackages());
			if (owningReference == null) {
				System.err.println("EMap " + aClass.getModelEClass().getName() + " has no owning type");
				return;
			}

			final AttributeOverride ao = factory.createAttributeOverride();
			final Column c = factory.createColumn();
			c.setName(owningReference.getJoinColumns().get(0).getName());
			c.setUpdatable(false);
			c.setInsertable(false);
			ao.setName("id");
			ao.setColumn(c);
			entity.getAttributeOverride().add(ao);
		} else { // create our own id
			final Id eContainerId = factory.createId();
			eContainerId.setName("eContainer");
			attributes.getId().add(eContainerId);
		}
	}

	private boolean isMapEntry(EClass eclass) {
		return eclass != null && eclass.getInstanceClass() != null
				&& Map.Entry.class.isAssignableFrom(eclass.getInstanceClass())
				&& eclass.getEStructuralFeatures().size() == 2 && eclass.getEStructuralFeature("key") != null
				&& eclass.getEStructuralFeature("value") != null;
	}

	private boolean hasSuperTypeWithId(PAnnotatedEClass aClass) {
		for (PAnnotatedEClass aSuperClass : aClass.getPaMappedSupers()) {
			for (PAnnotatedEStructuralFeature aFeature : aSuperClass.getPaEStructuralFeatures()) {
				if (aFeature instanceof PAnnotatedEAttribute) {
					final PAnnotatedEAttribute aAttribute = (PAnnotatedEAttribute) aFeature;
					if (aAttribute.getId() != null) {
						return true;
					}
				}
			}
			if (hasSuperTypeWithId(aSuperClass)) {
				return true;
			}
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	private void copyFeatures(final EObject from, EObject to) {
		for (EStructuralFeature eToFeature : to.eClass().getEAllStructuralFeatures()) {
			EObject localFrom = from;
			String postFix = "";
			if (eToFeature.isMany()) {
				postFix = "s";
			}
			final String lookingFor = eToFeature.getName() + postFix;
			EStructuralFeature eFromFeature = localFrom.eClass().getEStructuralFeature(lookingFor);
			if (eFromFeature == null) {
				// System.err.println("ERROR FEATURE " + eToFeature.getName()
				// + " not defined for PAnnotatedEClass "
				// + from.eClass().getName() + " " + lookingFor);
				continue;
			}

			if (eFromFeature.getEType().getName().equals("CascadeType")) {
				to.eSet(eToFeature, getCascade((List<Object>) from.eGet(eFromFeature)));
				continue;
			}

			if (eFromFeature.isMany() != eToFeature.isMany()) {
				System.err.println("ERROR FEATURES HAVE DIFFERENT MANIES " + eFromFeature.getName());
				continue;
			}

			if (eFromFeature.eClass() != eToFeature.eClass()) {
				// special case DiscriminatorValue
				localFrom = (EObject) from.eGet(eFromFeature);
				if (localFrom != null) {
					eFromFeature = localFrom.eClass().getEStructuralFeature("value");
				} else {
					continue;
				}
			}

			if (eFromFeature.isMany()) {
				copyList(eFromFeature, (List<Object>) from.eGet(eFromFeature), (List<Object>) to.eGet(eToFeature),
						eToFeature);
			} else { // if (localFrom.eIsSet(eFromFeature)) {
				to.eSet(eToFeature, convertValue(eFromFeature, localFrom.eGet(eFromFeature), eToFeature));
			}
		}
	}

	private Object convertValue(EStructuralFeature from, Object value, EStructuralFeature to) {
		if (value == null) {
			return null;
		}
		if (from instanceof EAttribute && ((EAttribute) from).getEAttributeType() instanceof EEnum) {
			final EAttribute eAttribute = (EAttribute) to;
			final Enumerator eenum = (Enumerator) value;
			final EDataType eDataType = eAttribute.getEAttributeType();
			final Object newValue = factory.createFromString(eDataType, eenum.getName());
			if (newValue == null) {
				System.err.println("EENUM NOT DEFINED " + eenum.getName() + " for datatype " + eDataType.getName());
			}
			return newValue;
		} else if (from instanceof EReference) {
			final EObject eValue = (EObject) value;
			final EObject ormObject = factory.create(((EReference) to).getEReferenceType());
			copyFeatures(eValue, ormObject);
			return ormObject;
		} else {
			return value;
		}
	}

	private void copyList(EStructuralFeature fromFeature, List<Object> from, List<Object> to,
			EStructuralFeature toFeature) {
		for (Object o : from) {
			to.add(convertValue(fromFeature, o, toFeature));
		}
	}

	private PersistenceUnitMetadata getMetaData() {
		final PersistenceUnitMetadata metaData = factory.createPersistenceUnitMetadata();
		metaData.setXmlMappingMetadataComplete(factory.createEmptyType());
		final PersistenceUnitDefaults defaults = factory.createPersistenceUnitDefaults();
		defaults.setAccess(AccessType.FIELD);
		metaData.setPersistenceUnitDefaults(defaults);
		return metaData;
	}

	private org.eclipse.emf.teneo.jpa.orm.CascadeType getCascade(List<Object> cascades) {
		final org.eclipse.emf.teneo.jpa.orm.CascadeType newCascade = factory.createCascadeType();
		for (Object o : cascades) {
			CascadeType cascadeType = (org.eclipse.emf.teneo.annotations.pannotation.CascadeType) o;
			if (cascadeType == CascadeType.ALL) {
				newCascade.setCascadeAll(factory.createEmptyType());
			} else if (cascadeType == CascadeType.MERGE) {
				newCascade.setCascadeMerge(factory.createEmptyType());
			} else if (cascadeType == CascadeType.PERSIST) {
				newCascade.setCascadePersist(factory.createEmptyType());
			} else if (cascadeType == CascadeType.REFRESH) {
				newCascade.setCascadeRefresh(factory.createEmptyType());
			} else if (cascadeType == CascadeType.REMOVE) {
				newCascade.setCascadeRemove(factory.createEmptyType());
			}
		}
		return newCascade;
	}

	private PAnnotatedEReference getContainmentFeature(PAnnotatedEClass pClass,
			List<PAnnotatedEPackage> annotatedEPackages) {
		for (PAnnotatedEPackage pPackage : annotatedEPackages) {
			for (PAnnotatedEClass paClass : pPackage.getPaEClasses()) {
				for (PAnnotatedEStructuralFeature pFeature : paClass.getPaEStructuralFeatures()) {
					if (pFeature instanceof PAnnotatedEReference
							&& ((PAnnotatedEReference) pFeature).getModelEReference().isContainment()
							&& ((PAnnotatedEReference) pFeature).getAReferenceType() == pClass) {
						return (PAnnotatedEReference) pFeature;
					}
				}
			}
		}
		return null;
	}

	private void setTargetEntity(EObject ormType, PAnnotatedEReference pReference) {
		final Class<?> clz = ERuntime.INSTANCE.getJavaClass(pReference.getModelEReference().getEReferenceType());
		ormType.eSet(ormType.eClass().getEStructuralFeature("targetEntity"), clz.getName());
	}
}