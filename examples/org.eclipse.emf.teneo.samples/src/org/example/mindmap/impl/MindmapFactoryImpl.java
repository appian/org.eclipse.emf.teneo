/**
 * <copyright>
 * </copyright>
 *
 * $Id: MindmapFactoryImpl.java,v 1.1 2006/11/23 06:12:10 mtaal Exp $
 */
package org.example.mindmap.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.example.mindmap.DocumentRoot;
import org.example.mindmap.Map;
import org.example.mindmap.MindmapFactory;
import org.example.mindmap.MindmapPackage;
import org.example.mindmap.Priority;
import org.example.mindmap.Relationship;
import org.example.mindmap.RelationshipType;
import org.example.mindmap.Resource;
import org.example.mindmap.ThreadItem;
import org.example.mindmap.Topic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MindmapFactoryImpl extends EFactoryImpl implements MindmapFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MindmapFactory init() {
		try {
			MindmapFactory theMindmapFactory = (MindmapFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.example.org/mindmap"); 
			if (theMindmapFactory != null) {
				return theMindmapFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MindmapFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindmapFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MindmapPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case MindmapPackage.MAP: return createMap();
			case MindmapPackage.RELATIONSHIP: return createRelationship();
			case MindmapPackage.RESOURCE: return createResource();
			case MindmapPackage.THREAD: return createThread();
			case MindmapPackage.THREAD_ITEM: return createThreadItem();
			case MindmapPackage.TOPIC: return createTopic();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MindmapPackage.PRIORITY:
				return createPriorityFromString(eDataType, initialValue);
			case MindmapPackage.RELATIONSHIP_TYPE:
				return createRelationshipTypeFromString(eDataType, initialValue);
			case MindmapPackage.PRIORITY_OBJECT:
				return createPriorityObjectFromString(eDataType, initialValue);
			case MindmapPackage.RELATIONSHIP_TYPE_OBJECT:
				return createRelationshipTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MindmapPackage.PRIORITY:
				return convertPriorityToString(eDataType, instanceValue);
			case MindmapPackage.RELATIONSHIP_TYPE:
				return convertRelationshipTypeToString(eDataType, instanceValue);
			case MindmapPackage.PRIORITY_OBJECT:
				return convertPriorityObjectToString(eDataType, instanceValue);
			case MindmapPackage.RELATIONSHIP_TYPE_OBJECT:
				return convertRelationshipTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map createMap() {
		MapImpl map = new MapImpl();
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship createRelationship() {
		RelationshipImpl relationship = new RelationshipImpl();
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.example.mindmap.Thread createThread() {
		ThreadImpl thread = new ThreadImpl();
		return thread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadItem createThreadItem() {
		ThreadItemImpl threadItem = new ThreadItemImpl();
		return threadItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Topic createTopic() {
		TopicImpl topic = new TopicImpl();
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Priority createPriorityFromString(EDataType eDataType, String initialValue) {
		Priority result = Priority.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPriorityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipType createRelationshipTypeFromString(EDataType eDataType, String initialValue) {
		RelationshipType result = RelationshipType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationshipTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Priority createPriorityObjectFromString(EDataType eDataType, String initialValue) {
		return (Priority)createPriorityFromString(MindmapPackage.Literals.PRIORITY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPriorityObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPriorityToString(MindmapPackage.Literals.PRIORITY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipType createRelationshipTypeObjectFromString(EDataType eDataType, String initialValue) {
		return (RelationshipType)createRelationshipTypeFromString(MindmapPackage.Literals.RELATIONSHIP_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationshipTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRelationshipTypeToString(MindmapPackage.Literals.RELATIONSHIP_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindmapPackage getMindmapPackage() {
		return (MindmapPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static MindmapPackage getPackage() {
		return MindmapPackage.eINSTANCE;
	}

} //MindmapFactoryImpl
