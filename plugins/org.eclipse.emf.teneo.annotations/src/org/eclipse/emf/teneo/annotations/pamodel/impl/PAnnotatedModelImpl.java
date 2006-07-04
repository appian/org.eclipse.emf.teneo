/**
 * <copyright>
 * </copyright>
 *
 * $Id: PAnnotatedModelImpl.java,v 1.2 2006/07/04 21:56:30 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pamodel.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEModelElement;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;
import org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage;
import org.eclipse.emf.teneo.annotations.pannotation.SequenceGenerator;
import org.eclipse.emf.teneo.annotations.processing.ProcessingException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PAnnotated Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedModelImpl#getPaEPackages <em>Pa EPackages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PAnnotatedModelImpl extends EObjectImpl implements PAnnotatedModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Davide Marchignoli\n";
	
	class MapTrackingAdapter extends AdapterImpl {
		public void notifyChanged(Notification msg) {
			// TODO handle resolve?
			Object msgFeature = msg.getFeature();
			if (!msg.isTouch() && msgFeature == PamodelPackage.eINSTANCE.getPAnnotatedEModelElement_AnnotatedElement()) {
				switch (msg.getEventType()) {
	        	case Notification.SET:
	        	case Notification.UNSET:
        			removeMapping((EModelElement) msg.getOldValue());
        			addMapping((PAnnotatedEModelElement) msg.getNotifier());
	        		break;
		        }
		    } else if (msgFeature instanceof EReference && !msg.isTouch() ) {
		    	EReference r = (EReference) msgFeature;
		    	if (PamodelPackage.eINSTANCE.getPAnnotatedEModelElement().isSuperTypeOf(r.getEReferenceType()) && r.isContainment()) {
					switch (msg.getEventType()) {
					case Notification.UNSET:
		        	case Notification.SET:
		        		if (msg.getOldValue() != null)
		        			detach((PAnnotatedEModelElement) msg.getOldValue());
		        		if (msg.getNewValue() != null)
		        			attach((PAnnotatedEModelElement) msg.getNewValue());
		        		break;
		        	case Notification.ADD:
		        		if (msg.getNewValue() != null)
		        			attach((PAnnotatedEModelElement) msg.getNewValue());
		        		break;
		        	case Notification.ADD_MANY:
	        			attach((List) msg.getNewValue());
		        		break;
		        	case Notification.REMOVE:
		        		if (msg.getOldValue() != null)
		        			detach((PAnnotatedEModelElement) msg.getOldValue());
		        		break;
		        	case Notification.REMOVE_MANY:
	        			detach((List) msg.getNewValue());
		        		break;
			        }
		    	}
			}
		    super.notifyChanged(msg);
		}
	};
	
	final MapTrackingAdapter itsMapTrackingAdapter;

	/**
	 * The cached value of the '{@link #getPaEPackages() <em>Pa EPackages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaEPackages()
	 * @generated
	 * @ordered
	 */
	protected EList paEPackages = null;

	/**
	 * Record the association between the EModelElement and the PAnnotatedEModelElement
	 * that are contained in this PAnnotatedModel content.
	 */
	protected final Map eElement_to_pElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected PAnnotatedModelImpl() {
		eElement_to_pElement = new HashMap();
		itsMapTrackingAdapter = new MapTrackingAdapter();
		this.eAdapters().add(itsMapTrackingAdapter);
	}

	/**
	 * Register the association among a PAnnotatedEModelElement and its
	 * annotated EModelElement. If another PAnnotatedEModelElement 
	 * was associatied to the same EModelElement, such association will be broken.
	 * 
	 * <p>In order to mantain the consistency of the model, whenever an 
	 * association among a PAnnotatedEModelElement <code>pa</code> and 
	 * an EModelElement <code>e</code> is broken, the annotatedElement feature
	 * of <code>pa</code> is unset. 
	 */
	protected void addMapping(PAnnotatedEModelElement target) {
		final EModelElement eModelElement  = target.getAnnotatedElement();
		if (eModelElement != null) {
			PAnnotatedEModelElement prevAssoc = (PAnnotatedEModelElement) eElement_to_pElement.get(eModelElement);
			if (prevAssoc != null) {
				removeMapping(eModelElement);
				prevAssoc.setAnnotatedElement(null);
			}
			eElement_to_pElement.put(eModelElement, target);
		}
	}

	/**
	 * Unregister the association between an <code>EModelElement</code> and
	 * the <code>PAnnotatedEModelElement</code> that references it via the
	 * <code>annotatedElement</code> feature.
	 */
	protected void removeMapping(EModelElement eModelElement) {
		final Object prevAssoc = eElement_to_pElement.remove(eModelElement); 
		assert prevAssoc != null;
	}

	/**
	 * Invoked whenever a new PAnnotatedEModelElement is added to the
	 * PAnnotatedModel.
	 */
	protected void attach(PAnnotatedEModelElement aElement) {
		aElement.eAdapters().add(0, itsMapTrackingAdapter);
		addMapping(aElement);
		attach(aElement.eContents());
	}

	/**
	 * Invoked whenever a set of new PAnnotatedEModelElement is added to the
	 * PAnnotatedModel.
	 */
	protected void attach(List aElements) {
		for (Iterator i = aElements.iterator(); i.hasNext(); ) {
			Object x = i.next();
			if (x instanceof PAnnotatedEModelElement)
				attach((PAnnotatedEModelElement) x);
		}
	}
	
	/**
	 * Invoked whenever a PAnnotatedEModelElement is removed from the
	 * PAnnotatedModel.
	 */
	protected void detach(PAnnotatedEModelElement aElement) {
		aElement.eAdapters().remove(itsMapTrackingAdapter);
		ENamedElement annotatedElement = aElement.getAnnotatedElement();
		if (annotatedElement != null)
			removeMapping(annotatedElement);
		detach(aElement.eContents());
	}

	/**
	 * Invoked whenever a set of PAnnotatedEModelElement is removed from the
	 * PAnnotatedModel.
	 */
	protected void detach(List aElements) {
		for (Iterator i = aElements.iterator(); i.hasNext(); ) {
			Object x = i.next();
			if (x instanceof PAnnotatedEModelElement)
				detach((PAnnotatedEModelElement) x);
		}
	}
	
	/**
	 * Invariant: the eElement_to_pElement map agree with the PAnnotatedModel
	 * content.
	 * <p>This method should be used only for debugging.
	 * TODO use in validation.
	 */
	public void invMapIsWellFormed() {
		Set definedUnused = new HashSet(eElement_to_pElement.keySet()); 
		for (TreeIterator i = EcoreUtil.getAllContents(eContents()); i.hasNext(); ) {
			Object x = i.next();
			if (x instanceof PAnnotatedEModelElement) {
				PAnnotatedEModelElement paElement = (PAnnotatedEModelElement) x;
				ENamedElement annotatedElement = paElement.getAnnotatedElement();
				if (annotatedElement != null) {
					assert getPAnnotated(annotatedElement) == paElement;
					definedUnused.remove(annotatedElement);
				}
			} else
				i.prune();
		}
		assert definedUnused.isEmpty();
	}
	
	/**
	 * @return Returns the unique <code>PAnnotatedEModelElement</code>
	 * associated (via the <code>annotatedElement</code> feature) to the
	 * given <code>EModelElement</code>.
	 */
	public PAnnotatedEModelElement getPAnnotated(EModelElement e) {
		return (PAnnotatedEModelElement) eElement_to_pElement.get(e);
	}

	/**
	 * @return Returns the unique <code>PAnnotatedEPackage</code>
	 * associated (via the <code>annotatedElement</code> feature) to the
	 * given <code>EPackage</code>.
	 */
	public PAnnotatedEPackage getPAnnotated(EPackage e) {
		return (PAnnotatedEPackage) eElement_to_pElement.get(e);
	}

	/**
	 * @return Returns the unique <code>PAnnotatedEClass</code>
	 * associated (via the <code>annotatedElement</code> feature) to the
	 * given <code>EClass</code>.
	 */
	public PAnnotatedEClass getPAnnotated(EClass e) {
		return (PAnnotatedEClass) eElement_to_pElement.get(e);
	}

	/**
	 * @return Returns the unique <code>PAnnotatedEStructuralFeature</code>
	 * associated (via the <code>annotatedElement</code> feature) to the
	 * given <code>EStructuralFeature</code>.
	 */
	public PAnnotatedEStructuralFeature getPAnnotated(EStructuralFeature e) {
		return (PAnnotatedEStructuralFeature) eElement_to_pElement.get(e);
	}

	/**
	 * @return Returns the unique <code>PAnnotatedEAttribute</code>
	 * associated (via the <code>annotatedElement</code> feature) to the
	 * given <code>EAttribute</code>.
	 */
	public PAnnotatedEAttribute getPAnnotated(EAttribute e) {
		return (PAnnotatedEAttribute) eElement_to_pElement.get(e);
	}

	/**
	 * @return Returns the unique <code>PAnnotatedEReference</code>
	 * associated (via the <code>annotatedElement</code> feature) to the
	 * given <code>EReference</code>.
	 */
	public PAnnotatedEReference getPAnnotated(EReference e) {
		return (PAnnotatedEReference) eElement_to_pElement.get(e);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PamodelPackage.eINSTANCE.getPAnnotatedModel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPaEPackages() {
		if (paEPackages == null) {
			paEPackages = new EObjectContainmentWithInverseEList(PAnnotatedEPackage.class, this, PamodelPackage.PANNOTATED_MODEL__PA_EPACKAGES, PamodelPackage.PANNOTATED_EPACKAGE__PA_MODEL);
		}
		return paEPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case PamodelPackage.PANNOTATED_MODEL__PA_EPACKAGES:
					return ((InternalEList)getPaEPackages()).basicAdd(otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case PamodelPackage.PANNOTATED_MODEL__PA_EPACKAGES:
					return ((InternalEList)getPaEPackages()).basicRemove(otherEnd, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case PamodelPackage.PANNOTATED_MODEL__PA_EPACKAGES:
				return getPaEPackages();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case PamodelPackage.PANNOTATED_MODEL__PA_EPACKAGES:
				getPaEPackages().clear();
				getPaEPackages().addAll((Collection)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case PamodelPackage.PANNOTATED_MODEL__PA_EPACKAGES:
				getPaEPackages().clear();
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case PamodelPackage.PANNOTATED_MODEL__PA_EPACKAGES:
				return paEPackages != null && !paEPackages.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

	/** Returns a sequence generator on the basis of its name, if not found then an exception is thrown.
	 * efeature is passed for debugging purposes. */
	public SequenceGenerator getSequenceGenerator(EStructuralFeature efeature, String name) {
		for (Iterator it = getPaEPackages().iterator(); it.hasNext();) {
			final PAnnotatedEPackage pae = (PAnnotatedEPackage)it.next();
			if (pae.getSequenceGenerator() != null && pae.getSequenceGenerator().getName() != null &&
					pae.getSequenceGenerator().getName().compareTo(name) == 0) {
				return pae.getSequenceGenerator();
			}
		}
		throw new ProcessingException("No sequence generator found with the name: " + name + ", name is used in " +
				"annotation of element " + efeature.getEContainingClass().getName() + "/" + efeature.getName());
	}
	
} //PAnnotatedModelImpl
