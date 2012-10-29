/**
 * <copyright>
 * </copyright>
 *
 * $Id: MindmapFactory.java,v 1.1 2006/11/23 06:12:14 mtaal Exp $
 */
package org.example.mindmap;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each
 * non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see org.example.mindmap.MindmapPackage
 * @generated
 */
public interface MindmapFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	MindmapFactory eINSTANCE = org.example.mindmap.impl.MindmapFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Document Root</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Map</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Map</em>'.
	 * @generated
	 */
	Map createMap();

	/**
	 * Returns a new object of class '<em>Relationship</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return a new object of class '<em>Relationship</em>'.
	 * @generated
	 */
	Relationship createRelationship();

	/**
	 * Returns a new object of class '<em>Resource</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return a new object of class '<em>Resource</em>'.
	 * @generated
	 */
	Resource createResource();

	/**
	 * Returns a new object of class '<em>Thread</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Thread</em>'.
	 * @generated
	 */
	org.example.mindmap.Thread createThread();

	/**
	 * Returns a new object of class '<em>Thread Item</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return a new object of class '<em>Thread Item</em>'.
	 * @generated
	 */
	ThreadItem createThreadItem();

	/**
	 * Returns a new object of class '<em>Topic</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Topic</em>'.
	 * @generated
	 */
	Topic createTopic();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	MindmapPackage getMindmapPackage();

} // MindmapFactory
