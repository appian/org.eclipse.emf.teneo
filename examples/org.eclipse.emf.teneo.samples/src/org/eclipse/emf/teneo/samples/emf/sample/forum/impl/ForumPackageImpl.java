/**
 * <copyright>
 * </copyright>
 *
 * $Id: ForumPackageImpl.java,v 1.1 2006/07/11 16:57:11 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.forum.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl;

import org.eclipse.emf.teneo.samples.emf.sample.forum.Forum;
import org.eclipse.emf.teneo.samples.emf.sample.forum.ForumFactory;
import org.eclipse.emf.teneo.samples.emf.sample.forum.ForumPackage;
import org.eclipse.emf.teneo.samples.emf.sample.forum.Member;
import org.eclipse.emf.teneo.samples.emf.sample.forum.Post;
import org.eclipse.emf.teneo.samples.emf.sample.forum.Topic;
import org.eclipse.emf.teneo.samples.emf.sample.forum.TopicCategory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ForumPackageImpl extends EPackageImpl implements ForumPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum topicCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType topicCategoryObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.emf.teneo.samples.emf.sample.forum.ForumPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ForumPackageImpl() {
		super(eNS_URI, ForumFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ForumPackage init() {
		if (isInited) return (ForumPackage)EPackage.Registry.INSTANCE.getEPackage(ForumPackage.eNS_URI);

		// Obtain or create and register package
		ForumPackageImpl theForumPackage = (ForumPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof ForumPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new ForumPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackageImpl.init();

		// Create package meta-data objects
		theForumPackage.createPackageContents();

		// Initialize created meta-data
		theForumPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theForumPackage.freeze();

		return theForumPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForum() {
		return forumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForum_Title() {
		return (EAttribute)forumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForum_Members() {
		return (EReference)forumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForum_Topics() {
		return (EReference)forumEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMember() {
		return memberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMember_Nickname() {
		return (EAttribute)memberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMember_Posts() {
		return (EReference)memberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMember_Created() {
		return (EReference)memberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPost() {
		return postEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPost_Comment() {
		return (EAttribute)postEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPost_Author() {
		return (EReference)postEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPost_Topic() {
		return (EReference)postEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopic() {
		return topicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopic_Title() {
		return (EAttribute)topicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopic_Category() {
		return (EAttribute)topicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopic_Creator() {
		return (EReference)topicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopic_Posts() {
		return (EReference)topicEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTopicCategory() {
		return topicCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTopicCategoryObject() {
		return topicCategoryObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForumFactory getForumFactory() {
		return (ForumFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		forumEClass = createEClass(FORUM);
		createEAttribute(forumEClass, FORUM__TITLE);
		createEReference(forumEClass, FORUM__MEMBERS);
		createEReference(forumEClass, FORUM__TOPICS);

		memberEClass = createEClass(MEMBER);
		createEAttribute(memberEClass, MEMBER__NICKNAME);
		createEReference(memberEClass, MEMBER__POSTS);
		createEReference(memberEClass, MEMBER__CREATED);

		postEClass = createEClass(POST);
		createEAttribute(postEClass, POST__COMMENT);
		createEReference(postEClass, POST__AUTHOR);
		createEReference(postEClass, POST__TOPIC);

		topicEClass = createEClass(TOPIC);
		createEAttribute(topicEClass, TOPIC__TITLE);
		createEAttribute(topicEClass, TOPIC__CATEGORY);
		createEReference(topicEClass, TOPIC__CREATOR);
		createEReference(topicEClass, TOPIC__POSTS);

		// Create enums
		topicCategoryEEnum = createEEnum(TOPIC_CATEGORY);

		// Create data types
		topicCategoryObjectEDataType = createEDataType(TOPIC_CATEGORY_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackageImpl theXMLTypePackage = (XMLTypePackageImpl)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(forumEClass, Forum.class, "Forum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForum_Title(), theXMLTypePackage.getString(), "title", null, 1, 1, Forum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForum_Members(), this.getMember(), null, "members", null, 0, -1, Forum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForum_Topics(), this.getTopic(), null, "topics", null, 0, -1, Forum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memberEClass, Member.class, "Member", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMember_Nickname(), theXMLTypePackage.getString(), "nickname", null, 1, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMember_Posts(), this.getPost(), this.getPost_Author(), "posts", null, 0, -1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMember_Created(), this.getTopic(), this.getTopic_Creator(), "created", null, 0, -1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postEClass, Post.class, "Post", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPost_Comment(), theXMLTypePackage.getString(), "comment", null, 1, 1, Post.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPost_Author(), this.getMember(), this.getMember_Posts(), "author", null, 1, 1, Post.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPost_Topic(), this.getTopic(), this.getTopic_Posts(), "topic", null, 1, 1, Post.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topicEClass, Topic.class, "Topic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTopic_Title(), theXMLTypePackage.getString(), "title", null, 1, 1, Topic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTopic_Category(), this.getTopicCategory(), "category", "Announcement", 1, 1, Topic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTopic_Creator(), this.getMember(), this.getMember_Created(), "creator", null, 1, 1, Topic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTopic_Posts(), this.getPost(), this.getPost_Topic(), "posts", null, 0, -1, Topic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(topicCategoryEEnum, TopicCategory.class, "TopicCategory");
		addEEnumLiteral(topicCategoryEEnum, TopicCategory.ANNOUNCEMENT_LITERAL);
		addEEnumLiteral(topicCategoryEEnum, TopicCategory.GUEST_BOOK_LITERAL);
		addEEnumLiteral(topicCategoryEEnum, TopicCategory.DISCUSSION_LITERAL);

		// Initialize data types
		initEDataType(topicCategoryObjectEDataType, TopicCategory.class, "TopicCategoryObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (forumEClass, 
		   source, 
		   new String[] {
			 "name", "Forum",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getForum_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title"
		   });		
		addAnnotation
		  (getForum_Members(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "members"
		   });		
		addAnnotation
		  (getForum_Topics(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "topics"
		   });		
		addAnnotation
		  (memberEClass, 
		   source, 
		   new String[] {
			 "name", "Member",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMember_Nickname(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "nickname"
		   });		
		addAnnotation
		  (getMember_Posts(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "posts"
		   });		
		addAnnotation
		  (getMember_Created(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "created"
		   });		
		addAnnotation
		  (postEClass, 
		   source, 
		   new String[] {
			 "name", "Post",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPost_Comment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "comment"
		   });		
		addAnnotation
		  (getPost_Author(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "author"
		   });		
		addAnnotation
		  (getPost_Topic(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "topic"
		   });		
		addAnnotation
		  (topicEClass, 
		   source, 
		   new String[] {
			 "name", "Topic",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTopic_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title"
		   });		
		addAnnotation
		  (getTopic_Category(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "category"
		   });		
		addAnnotation
		  (getTopic_Creator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "creator"
		   });		
		addAnnotation
		  (getTopic_Posts(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "posts"
		   });		
		addAnnotation
		  (topicCategoryEEnum, 
		   source, 
		   new String[] {
			 "name", "TopicCategory"
		   });		
		addAnnotation
		  (topicCategoryObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "TopicCategory:Object",
			 "baseType", "TopicCategory"
		   });
	}

} //ForumPackageImpl
