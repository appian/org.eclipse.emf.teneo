/**
 */
package org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta
 * objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingFactory
 * @model kind="package"
 * @generated
 */
public interface TeneoauditingPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "teneoauditing";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/hibernate/auditing";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "teneoauditing";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	TeneoauditingPackage eINSTANCE = org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.impl.TeneoauditingPackageImpl
			.init();

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.impl.TeneoAuditObjectImpl
	 * <em>Teneo Audit Object</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.impl.TeneoAuditObjectImpl
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.impl.TeneoauditingPackageImpl#getTeneoAuditObject()
	 * @generated
	 */
	int TENEO_AUDIT_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Teneo audit id</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TENEO_AUDIT_OBJECT__TENEO_AUDIT_ID = 0;

	/**
	 * The feature id for the '<em><b>Teneo version</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TENEO_AUDIT_OBJECT__TENEO_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Teneo object id</b></em>' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TENEO_AUDIT_OBJECT__TENEO_OBJECT_ID = 2;

	/**
	 * The feature id for the '<em><b>Teneo start</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TENEO_AUDIT_OBJECT__TENEO_START = 3;

	/**
	 * The feature id for the '<em><b>Teneo end</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TENEO_AUDIT_OBJECT__TENEO_END = 4;

	/**
	 * The feature id for the '<em><b>Teneo commit info</b></em>' reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TENEO_AUDIT_OBJECT__TENEO_COMMIT_INFO = 5;

	/**
	 * The feature id for the '<em><b>Teneo audit kind</b></em>' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TENEO_AUDIT_OBJECT__TENEO_AUDIT_KIND = 6;

	/**
	 * The number of structural features of the '<em>Teneo Audit Object</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TENEO_AUDIT_OBJECT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.impl.TeneoAuditCommitInfoImpl
	 * <em>Teneo Audit Commit Info</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.impl.TeneoAuditCommitInfoImpl
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.impl.TeneoauditingPackageImpl#getTeneoAuditCommitInfo()
	 * @generated
	 */
	int TENEO_AUDIT_COMMIT_INFO = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TENEO_AUDIT_COMMIT_INFO__ID = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TENEO_AUDIT_COMMIT_INFO__VERSION = 1;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TENEO_AUDIT_COMMIT_INFO__USER = 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TENEO_AUDIT_COMMIT_INFO__COMMENT = 3;

	/**
	 * The number of structural features of the '<em>Teneo Audit Commit Info</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TENEO_AUDIT_COMMIT_INFO_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditKind
	 * <em>Teneo Audit Kind</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditKind
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.impl.TeneoauditingPackageImpl#getTeneoAuditKind()
	 * @generated
	 */
	int TENEO_AUDIT_KIND = 2;

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditObject
	 * <em>Teneo Audit Object</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Teneo Audit Object</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditObject
	 * @generated
	 */
	EClass getTeneoAuditObject();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditObject#getTeneo_audit_id
	 * <em>Teneo audit id</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Teneo audit id</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditObject#getTeneo_audit_id()
	 * @see #getTeneoAuditObject()
	 * @generated
	 */
	EAttribute getTeneoAuditObject_Teneo_audit_id();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditObject#getTeneo_version
	 * <em>Teneo version</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Teneo version</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditObject#getTeneo_version()
	 * @see #getTeneoAuditObject()
	 * @generated
	 */
	EAttribute getTeneoAuditObject_Teneo_version();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditObject#getTeneo_object_id
	 * <em>Teneo object id</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Teneo object id</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditObject#getTeneo_object_id()
	 * @see #getTeneoAuditObject()
	 * @generated
	 */
	EAttribute getTeneoAuditObject_Teneo_object_id();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditObject#getTeneo_start
	 * <em>Teneo start</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Teneo start</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditObject#getTeneo_start()
	 * @see #getTeneoAuditObject()
	 * @generated
	 */
	EAttribute getTeneoAuditObject_Teneo_start();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditObject#getTeneo_end
	 * <em>Teneo end</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Teneo end</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditObject#getTeneo_end()
	 * @see #getTeneoAuditObject()
	 * @generated
	 */
	EAttribute getTeneoAuditObject_Teneo_end();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditObject#getTeneo_commit_info
	 * <em>Teneo commit info</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Teneo commit info</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditObject#getTeneo_commit_info()
	 * @see #getTeneoAuditObject()
	 * @generated
	 */
	EReference getTeneoAuditObject_Teneo_commit_info();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditObject#getTeneo_audit_kind
	 * <em>Teneo audit kind</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Teneo audit kind</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditObject#getTeneo_audit_kind()
	 * @see #getTeneoAuditObject()
	 * @generated
	 */
	EAttribute getTeneoAuditObject_Teneo_audit_kind();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditCommitInfo
	 * <em>Teneo Audit Commit Info</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Teneo Audit Commit Info</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditCommitInfo
	 * @generated
	 */
	EClass getTeneoAuditCommitInfo();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditCommitInfo#getId
	 * <em>Id</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditCommitInfo#getId()
	 * @see #getTeneoAuditCommitInfo()
	 * @generated
	 */
	EAttribute getTeneoAuditCommitInfo_Id();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditCommitInfo#getVersion
	 * <em>Version</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditCommitInfo#getVersion()
	 * @see #getTeneoAuditCommitInfo()
	 * @generated
	 */
	EAttribute getTeneoAuditCommitInfo_Version();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditCommitInfo#getUser
	 * <em>User</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditCommitInfo#getUser()
	 * @see #getTeneoAuditCommitInfo()
	 * @generated
	 */
	EAttribute getTeneoAuditCommitInfo_User();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditCommitInfo#getComment
	 * <em>Comment</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditCommitInfo#getComment()
	 * @see #getTeneoAuditCommitInfo()
	 * @generated
	 */
	EAttribute getTeneoAuditCommitInfo_Comment();

	/**
	 * Returns the meta object for enum '
	 * {@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditKind
	 * <em>Teneo Audit Kind</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Teneo Audit Kind</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditKind
	 * @generated
	 */
	EEnum getTeneoAuditKind();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TeneoauditingFactory getTeneoauditingFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.impl.TeneoAuditObjectImpl
		 * <em>Teneo Audit Object</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.impl.TeneoAuditObjectImpl
		 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.impl.TeneoauditingPackageImpl#getTeneoAuditObject()
		 * @generated
		 */
		EClass TENEO_AUDIT_OBJECT = eINSTANCE.getTeneoAuditObject();

		/**
		 * The meta object literal for the '<em><b>Teneo audit id</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TENEO_AUDIT_OBJECT__TENEO_AUDIT_ID = eINSTANCE.getTeneoAuditObject_Teneo_audit_id();

		/**
		 * The meta object literal for the '<em><b>Teneo version</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TENEO_AUDIT_OBJECT__TENEO_VERSION = eINSTANCE.getTeneoAuditObject_Teneo_version();

		/**
		 * The meta object literal for the '<em><b>Teneo object id</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TENEO_AUDIT_OBJECT__TENEO_OBJECT_ID = eINSTANCE
				.getTeneoAuditObject_Teneo_object_id();

		/**
		 * The meta object literal for the '<em><b>Teneo start</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TENEO_AUDIT_OBJECT__TENEO_START = eINSTANCE.getTeneoAuditObject_Teneo_start();

		/**
		 * The meta object literal for the '<em><b>Teneo end</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TENEO_AUDIT_OBJECT__TENEO_END = eINSTANCE.getTeneoAuditObject_Teneo_end();

		/**
		 * The meta object literal for the '<em><b>Teneo commit info</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TENEO_AUDIT_OBJECT__TENEO_COMMIT_INFO = eINSTANCE
				.getTeneoAuditObject_Teneo_commit_info();

		/**
		 * The meta object literal for the '<em><b>Teneo audit kind</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TENEO_AUDIT_OBJECT__TENEO_AUDIT_KIND = eINSTANCE
				.getTeneoAuditObject_Teneo_audit_kind();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.impl.TeneoAuditCommitInfoImpl
		 * <em>Teneo Audit Commit Info</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.impl.TeneoAuditCommitInfoImpl
		 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.impl.TeneoauditingPackageImpl#getTeneoAuditCommitInfo()
		 * @generated
		 */
		EClass TENEO_AUDIT_COMMIT_INFO = eINSTANCE.getTeneoAuditCommitInfo();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TENEO_AUDIT_COMMIT_INFO__ID = eINSTANCE.getTeneoAuditCommitInfo_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TENEO_AUDIT_COMMIT_INFO__VERSION = eINSTANCE.getTeneoAuditCommitInfo_Version();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TENEO_AUDIT_COMMIT_INFO__USER = eINSTANCE.getTeneoAuditCommitInfo_User();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TENEO_AUDIT_COMMIT_INFO__COMMENT = eINSTANCE.getTeneoAuditCommitInfo_Comment();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditKind
		 * <em>Teneo Audit Kind</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditKind
		 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.impl.TeneoauditingPackageImpl#getTeneoAuditKind()
		 * @generated
		 */
		EEnum TENEO_AUDIT_KIND = eINSTANCE.getTeneoAuditKind();

	}

} // TeneoauditingPackage
