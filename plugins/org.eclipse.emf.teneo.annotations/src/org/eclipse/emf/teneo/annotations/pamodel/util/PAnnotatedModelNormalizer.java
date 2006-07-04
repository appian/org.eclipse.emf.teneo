package org.eclipse.emf.teneo.annotations.pamodel.util;

import java.util.Iterator;
import java.util.ListIterator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;
import org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEClassImpl;
import org.eclipse.emf.teneo.annotations.pannotation.Column;
import org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorColumn;
import org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorType;
import org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorValue;
import org.eclipse.emf.teneo.annotations.pannotation.Entity;
import org.eclipse.emf.teneo.annotations.pannotation.ManyToMany;
import org.eclipse.emf.teneo.annotations.pannotation.ManyToOne;
import org.eclipse.emf.teneo.annotations.pannotation.OneToMany;
import org.eclipse.emf.teneo.annotations.pannotation.OneToOne;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationFactory;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage;
import org.eclipse.emf.teneo.annotations.pannotation.Table;

public class PAnnotatedModelNormalizer {

	/** The logger */
	private static final Log log = LogFactory.getLog(PAnnotatedModelNormalizer.class);

	
	/**
	 * normalize the given model.
	 * @param model
	 */
	void normalizeModel(PAnnotatedModel model) {
		if (log.isDebugEnabled())
			log.debug("Normalizing model " + model);
		for (ListIterator i = model.getPaEPackages().listIterator(); i.hasNext(); ) {
			PAnnotatedEPackage paPackage = (PAnnotatedEPackage) i.next(); 
			normalizePackage(paPackage);
			if (paPackage.getPaEClasses().size() == 0) {
				log.info("Removing empty package" + paPackage);
				i.remove();
			}
		}
	}
	
	/**
	 * Remove non persistent annotated eclasses and normalize
	 * persistent annotated eclasses.
	 * @param paPackage the package to normalize
	 */
	protected void normalizePackage(PAnnotatedEPackage paPackage) {
		if (log.isDebugEnabled())
			log.debug("Normalizing package " + paPackage);
		for (ListIterator i = paPackage.getPaEClasses().listIterator(); i.hasNext(); ) {
			PAnnotatedEClassImpl paClass = (PAnnotatedEClassImpl) i.next();
			if (paClass.getEntity() != null)
				normalizeEntity(paClass);
			else if (paClass.getMappedSuperclass() != null)
				normalizeMappedSuperclass(paClass);
			else if (paClass.getEmbeddable() != null)
				normalizeEmbeddable(paClass);
			else {
				log.info("Removing non annotated " + paClass);
				i.remove();
			}
		}
	}
	
	protected void normalizeEmbeddable(PAnnotatedEClassImpl paClass) {
		if (log.isDebugEnabled())
			log.debug("Normalizing Embeddable " + paClass);
		for (Iterator i = paClass.getPaEStructuralFeatures().iterator(); i.hasNext(); ) {
			PAnnotatedEStructuralFeature paFeature = (PAnnotatedEStructuralFeature) i.next();
			
		}
	}

	protected void normalizeMappedSuperclass(PAnnotatedEClassImpl paClass) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Set defaults.
	 * @param paEClass TODO
	 */
	public void normalizeEntity(PAnnotatedEClass paEClass) {
		Entity entity = paEClass.getEntity();
		if (entity != null && !entity.eIsSet(PannotationPackage.eINSTANCE.getEntity_Name()))
			entity.setName(paEClass.getAnnotatedEClass().getName());
		Table table = paEClass.getTable();
		if (table != null && !table.eIsSet(PannotationPackage.eINSTANCE.getTable_Name())) {
			table.setName(entity.getName());
		}
		// TODO add DiscriminatorColumn on root and whenever inheritance strategy changes?
		DiscriminatorColumn dColumn = paEClass.getDiscriminatorColumn();
		DiscriminatorValue dValue = paEClass.getDiscriminatorValue();
		if (dColumn != null && dValue == null) {
			paEClass.setDiscriminatorValue(dValue = PannotationFactory.eINSTANCE.createDiscriminatorValue());
			if (DiscriminatorType.STRING_LITERAL.equals(dColumn.getDiscriminatorType()))
				dValue.setValue(entity.getName());
		}
		// TODO add PrimaryKeyJoinColumn if this is a sub entity with strategy JOIN
	}

	void normalize(PAnnotatedEReference paReference) {
		OneToOne oneToOne = paReference.getOneToOne();
		if (oneToOne != null && !oneToOne.eIsSet(PannotationPackage.eINSTANCE.getOneToOne_TargetEntity())) {
			// TODO change type of target entity to EClass ??
			oneToOne.setTargetEntity(EcoreUtil.getURI(paReference.getAnnotatedEReference().getEReferenceType()).toString());
		}
		ManyToOne manyToOne = paReference.getManyToOne();
		if (manyToOne != null && !manyToOne.eIsSet(PannotationPackage.eINSTANCE.getManyToOne_TargetEntity())) {
			// TODO change type of target entity to EClass ??
			manyToOne.setTargetEntity(EcoreUtil.getURI(paReference.getAnnotatedEReference().getEReferenceType()).toString());
		}
		ManyToMany manyToMany = paReference.getManyToMany();
		if (manyToMany != null && !manyToMany.eIsSet(PannotationPackage.eINSTANCE.getManyToMany_TargetEntity())) {
			// TODO change type of target entity to EClass ??
			manyToMany.setTargetEntity(EcoreUtil.getURI(paReference.getAnnotatedEReference().getEReferenceType()).toString());
		}
	}

	void normalize(PAnnotatedEStructuralFeature paFeature) {
		OneToMany oneToMany = paFeature.getOneToMany();
		if (oneToMany != null && !oneToMany.eIsSet(PannotationPackage.eINSTANCE.getManyToMany_TargetEntity())) {
			// TODO change type of target entity to EClass ??
			oneToMany.setTargetEntity(EcoreUtil.getURI(paFeature.getAnnotatedEStructuralFeature().getEType()).toString());
		}
		Column column = paFeature.getColumn();
		if (column != null && !column.eIsSet(PannotationPackage.eINSTANCE.getColumn_Name()))
			column.setName(paFeature.getAnnotatedEStructuralFeature().getName());
	}

}
