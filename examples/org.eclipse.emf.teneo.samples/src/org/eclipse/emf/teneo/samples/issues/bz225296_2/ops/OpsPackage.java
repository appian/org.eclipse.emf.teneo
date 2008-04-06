/**
 * <copyright>
 * </copyright>
 *
 * $Id: OpsPackage.java,v 1.1 2008/04/06 13:45:43 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz225296_2.ops;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsFactory
 * @model kind="package"
 * @generated
 */
public interface OpsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ops";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/issues/bz225296_2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ops";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpsPackage eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.BlockImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 0;

	/**
	 * The feature id for the '<em><b>Vserver</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__VSERVER = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ID = 2;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__MODIFIED = 3;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__REVISION = 4;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__AGENT = 5;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__SERVICE = 6;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.DataCenterImpl <em>Data Center</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.DataCenterImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsPackageImpl#getDataCenter()
	 * @generated
	 */
	int DATA_CENTER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER__HOST = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER__ID = 2;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER__MODIFIED = 3;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER__REVISION = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER__DESCRIPTION = 5;

	/**
	 * The number of structural features of the '<em>Data Center</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.DomainImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Systems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__SYSTEMS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__ID = 2;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__MODIFIED = 3;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__REVISION = 4;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.DomainSystemImpl <em>Domain System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.DomainSystemImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsPackageImpl#getDomainSystem()
	 * @generated
	 */
	int DOMAIN_SYSTEM = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SYSTEM__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Domains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SYSTEM__DOMAINS = 2;

	/**
	 * The feature id for the '<em><b>Ops System</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SYSTEM__OPS_SYSTEM = 3;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SYSTEM__INTERFACE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SYSTEM__ID = 5;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SYSTEM__MODIFIED = 6;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SYSTEM__REVISION = 7;

	/**
	 * The feature id for the '<em><b>Forward Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SYSTEM__FORWARD_EMAIL = 8;

	/**
	 * The number of structural features of the '<em>Domain System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SYSTEM_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.FailoverTypeImpl <em>Failover Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.FailoverTypeImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsPackageImpl#getFailoverType()
	 * @generated
	 */
	int FAILOVER_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_TYPE__MODIFIED = 2;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_TYPE__REVISION = 3;

	/**
	 * The number of structural features of the '<em>Failover Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.HostImpl <em>Host</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.HostImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsPackageImpl#getHost()
	 * @generated
	 */
	int HOST = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__NAME = 0;

	/**
	 * The feature id for the '<em><b>Data Center</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__DATA_CENTER = 1;

	/**
	 * The feature id for the '<em><b>Vserver</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__VSERVER = 2;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__IP = 3;

	/**
	 * The feature id for the '<em><b>Own Ip</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__OWN_IP = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__ID = 5;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__MODIFIED = 6;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__REVISION = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__DESCRIPTION = 8;

	/**
	 * The feature id for the '<em><b>Network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__NETWORK = 9;

	/**
	 * The feature id for the '<em><b>Provider Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__PROVIDER_ID = 10;

	/**
	 * The feature id for the '<em><b>Gateway</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__GATEWAY = 11;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__BLOCK = 12;

	/**
	 * The number of structural features of the '<em>Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.HostBlockImpl <em>Host Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.HostBlockImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsPackageImpl#getHostBlock()
	 * @generated
	 */
	int HOST_BLOCK = 6;

	/**
	 * The feature id for the '<em><b>Host</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_BLOCK__HOST = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_BLOCK__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_BLOCK__ID = 2;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_BLOCK__MODIFIED = 3;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_BLOCK__REVISION = 4;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_BLOCK__AGENT = 5;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_BLOCK__SERVICE = 6;

	/**
	 * The number of structural features of the '<em>Host Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_BLOCK_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.InterfaceImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ROLE = 1;

	/**
	 * The feature id for the '<em><b>Domain System</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__DOMAIN_SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Failover Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__FAILOVER_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ID = 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__MODIFIED = 5;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__REVISION = 6;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__PORT = 7;

	/**
	 * The feature id for the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__EXTERNAL = 8;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.IPImpl <em>IP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.IPImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsPackageImpl#getIP()
	 * @generated
	 */
	int IP = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP__IP = 1;

	/**
	 * The feature id for the '<em><b>Host</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP__HOST = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP__ID = 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP__MODIFIED = 5;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP__REVISION = 6;

	/**
	 * The feature id for the '<em><b>Shared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP__SHARED = 7;

	/**
	 * The feature id for the '<em><b>Ip Name</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP__IP_NAME = 8;

	/**
	 * The feature id for the '<em><b>Vserver</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP__VSERVER = 9;

	/**
	 * The number of structural features of the '<em>IP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.MuninInfoImpl <em>Munin Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.MuninInfoImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsPackageImpl#getMuninInfo()
	 * @generated
	 */
	int MUNIN_INFO = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUNIN_INFO__ID = 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUNIN_INFO__MODIFIED = 1;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUNIN_INFO__REVISION = 2;

	/**
	 * The feature id for the '<em><b>Plugin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUNIN_INFO__PLUGIN_NAME = 3;

	/**
	 * The feature id for the '<em><b>Warning Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUNIN_INFO__WARNING_LEVEL = 4;

	/**
	 * The feature id for the '<em><b>Critical Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUNIN_INFO__CRITICAL_LEVEL = 5;

	/**
	 * The feature id for the '<em><b>Monitorable By Nagios</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUNIN_INFO__MONITORABLE_BY_NAGIOS = 6;

	/**
	 * The feature id for the '<em><b>Display Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUNIN_INFO__DISPLAY_SUMMARY = 7;

	/**
	 * The feature id for the '<em><b>Role</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUNIN_INFO__ROLE = 8;

	/**
	 * The number of structural features of the '<em>Munin Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUNIN_INFO_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.IPNameImpl <em>IP Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.IPNameImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsPackageImpl#getIPName()
	 * @generated
	 */
	int IP_NAME = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_NAME__ID = 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_NAME__MODIFIED = 1;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_NAME__REVISION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_NAME__NAME = 3;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_NAME__IP = 4;

	/**
	 * The number of structural features of the '<em>IP Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_NAME_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.ParameterImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ID = 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MODIFIED = 1;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__REVISION = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__KEY = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 4;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.RoleImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Vserver</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__VSERVER = 2;

	/**
	 * The feature id for the '<em><b>Required Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__REQUIRED_INTERFACE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ID = 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__MODIFIED = 5;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__REVISION = 6;

	/**
	 * The feature id for the '<em><b>Munin Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__MUNIN_INFO = 7;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsSystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsSystemImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsPackageImpl#getOpsSystem()
	 * @generated
	 */
	int OPS_SYSTEM = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPS_SYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Own Vserver</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPS_SYSTEM__OWN_VSERVER = 1;

	/**
	 * The feature id for the '<em><b>Serving Vserver</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPS_SYSTEM__SERVING_VSERVER = 2;

	/**
	 * The feature id for the '<em><b>Domain System</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPS_SYSTEM__DOMAIN_SYSTEM = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPS_SYSTEM__ID = 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPS_SYSTEM__MODIFIED = 5;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPS_SYSTEM__REVISION = 6;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPS_SYSTEM_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.VServerImpl <em>VServer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.VServerImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsPackageImpl#getVServer()
	 * @generated
	 */
	int VSERVER = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSERVER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSERVER__BLOCK = 1;

	/**
	 * The feature id for the '<em><b>Own System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSERVER__OWN_SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Served System</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSERVER__SERVED_SYSTEM = 3;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSERVER__IP = 4;

	/**
	 * The feature id for the '<em><b>Host</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSERVER__HOST = 5;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSERVER__ROLE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSERVER__ID = 7;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSERVER__MODIFIED = 8;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSERVER__REVISION = 9;

	/**
	 * The number of structural features of the '<em>VServer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSERVER_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.DWHClusterImpl <em>DWH Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.DWHClusterImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsPackageImpl#getDWHCluster()
	 * @generated
	 */
	int DWH_CLUSTER = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWH_CLUSTER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWH_CLUSTER__INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWH_CLUSTER__ID = 2;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWH_CLUSTER__MODIFIED = 3;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWH_CLUSTER__REVISION = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWH_CLUSTER__DESCRIPTION = 5;

	/**
	 * The number of structural features of the '<em>DWH Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWH_CLUSTER_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.DWHInstanceImpl <em>DWH Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.DWHInstanceImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsPackageImpl#getDWHInstance()
	 * @generated
	 */
	int DWH_INSTANCE = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWH_INSTANCE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWH_INSTANCE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Etl</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWH_INSTANCE__ETL = 2;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWH_INSTANCE__MODIFIED = 3;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWH_INSTANCE__REVISION = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWH_INSTANCE__DESCRIPTION = 5;

	/**
	 * The number of structural features of the '<em>DWH Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWH_INSTANCE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IpType <em>Ip Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IpType
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsPackageImpl#getIpType()
	 * @generated
	 */
	int IP_TYPE = 17;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Block#getVserver <em>Vserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Vserver</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Block#getVserver()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Vserver();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Block#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Block#getDescription()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Block#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Block#getId()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Block#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Block#getModified()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Modified();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Block#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Block#getRevision()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Revision();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Block#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agent</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Block#getAgent()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Agent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Block#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Block#getService()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Service();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DataCenter <em>Data Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Center</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DataCenter
	 * @generated
	 */
	EClass getDataCenter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DataCenter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DataCenter#getName()
	 * @see #getDataCenter()
	 * @generated
	 */
	EAttribute getDataCenter_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DataCenter#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Host</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DataCenter#getHost()
	 * @see #getDataCenter()
	 * @generated
	 */
	EReference getDataCenter_Host();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DataCenter#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DataCenter#getId()
	 * @see #getDataCenter()
	 * @generated
	 */
	EAttribute getDataCenter_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DataCenter#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DataCenter#getModified()
	 * @see #getDataCenter()
	 * @generated
	 */
	EAttribute getDataCenter_Modified();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DataCenter#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DataCenter#getRevision()
	 * @see #getDataCenter()
	 * @generated
	 */
	EAttribute getDataCenter_Revision();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DataCenter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DataCenter#getDescription()
	 * @see #getDataCenter()
	 * @generated
	 */
	EAttribute getDataCenter_Description();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Domain#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Domain#getName()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Domain#getSystems <em>Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Systems</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Domain#getSystems()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Systems();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Domain#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Domain#getId()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Domain#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Domain#getModified()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Modified();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Domain#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Domain#getRevision()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Revision();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DomainSystem <em>Domain System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain System</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DomainSystem
	 * @generated
	 */
	EClass getDomainSystem();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DomainSystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DomainSystem#getName()
	 * @see #getDomainSystem()
	 * @generated
	 */
	EAttribute getDomainSystem_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DomainSystem#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DomainSystem#getDescription()
	 * @see #getDomainSystem()
	 * @generated
	 */
	EAttribute getDomainSystem_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DomainSystem#getDomains <em>Domains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domains</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DomainSystem#getDomains()
	 * @see #getDomainSystem()
	 * @generated
	 */
	EReference getDomainSystem_Domains();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DomainSystem#getOpsSystem <em>Ops System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ops System</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DomainSystem#getOpsSystem()
	 * @see #getDomainSystem()
	 * @generated
	 */
	EReference getDomainSystem_OpsSystem();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DomainSystem#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DomainSystem#getInterface()
	 * @see #getDomainSystem()
	 * @generated
	 */
	EReference getDomainSystem_Interface();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DomainSystem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DomainSystem#getId()
	 * @see #getDomainSystem()
	 * @generated
	 */
	EAttribute getDomainSystem_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DomainSystem#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DomainSystem#getModified()
	 * @see #getDomainSystem()
	 * @generated
	 */
	EAttribute getDomainSystem_Modified();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DomainSystem#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DomainSystem#getRevision()
	 * @see #getDomainSystem()
	 * @generated
	 */
	EAttribute getDomainSystem_Revision();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DomainSystem#getForwardEmail <em>Forward Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Forward Email</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DomainSystem#getForwardEmail()
	 * @see #getDomainSystem()
	 * @generated
	 */
	EAttribute getDomainSystem_ForwardEmail();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.FailoverType <em>Failover Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failover Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.FailoverType
	 * @generated
	 */
	EClass getFailoverType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.FailoverType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.FailoverType#getName()
	 * @see #getFailoverType()
	 * @generated
	 */
	EAttribute getFailoverType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.FailoverType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.FailoverType#getId()
	 * @see #getFailoverType()
	 * @generated
	 */
	EAttribute getFailoverType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.FailoverType#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.FailoverType#getModified()
	 * @see #getFailoverType()
	 * @generated
	 */
	EAttribute getFailoverType_Modified();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.FailoverType#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.FailoverType#getRevision()
	 * @see #getFailoverType()
	 * @generated
	 */
	EAttribute getFailoverType_Revision();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host
	 * @generated
	 */
	EClass getHost();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getName()
	 * @see #getHost()
	 * @generated
	 */
	EAttribute getHost_Name();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getDataCenter <em>Data Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Center</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getDataCenter()
	 * @see #getHost()
	 * @generated
	 */
	EReference getHost_DataCenter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getVserver <em>Vserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vserver</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getVserver()
	 * @see #getHost()
	 * @generated
	 */
	EReference getHost_Vserver();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getIp <em>Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ip</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getIp()
	 * @see #getHost()
	 * @generated
	 */
	EReference getHost_Ip();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getOwnIp <em>Own Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Own Ip</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getOwnIp()
	 * @see #getHost()
	 * @generated
	 */
	EReference getHost_OwnIp();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getId()
	 * @see #getHost()
	 * @generated
	 */
	EAttribute getHost_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getModified()
	 * @see #getHost()
	 * @generated
	 */
	EAttribute getHost_Modified();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getRevision()
	 * @see #getHost()
	 * @generated
	 */
	EAttribute getHost_Revision();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getDescription()
	 * @see #getHost()
	 * @generated
	 */
	EAttribute getHost_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getNetwork()
	 * @see #getHost()
	 * @generated
	 */
	EAttribute getHost_Network();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getProviderId <em>Provider Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getProviderId()
	 * @see #getHost()
	 * @generated
	 */
	EAttribute getHost_ProviderId();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getGateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gateway</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getGateway()
	 * @see #getHost()
	 * @generated
	 */
	EReference getHost_Gateway();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Block</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getBlock()
	 * @see #getHost()
	 * @generated
	 */
	EReference getHost_Block();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.HostBlock <em>Host Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host Block</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.HostBlock
	 * @generated
	 */
	EClass getHostBlock();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.HostBlock#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Host</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.HostBlock#getHost()
	 * @see #getHostBlock()
	 * @generated
	 */
	EReference getHostBlock_Host();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.HostBlock#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.HostBlock#getDescription()
	 * @see #getHostBlock()
	 * @generated
	 */
	EAttribute getHostBlock_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.HostBlock#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.HostBlock#getId()
	 * @see #getHostBlock()
	 * @generated
	 */
	EAttribute getHostBlock_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.HostBlock#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.HostBlock#getModified()
	 * @see #getHostBlock()
	 * @generated
	 */
	EAttribute getHostBlock_Modified();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.HostBlock#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.HostBlock#getRevision()
	 * @see #getHostBlock()
	 * @generated
	 */
	EAttribute getHostBlock_Revision();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.HostBlock#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agent</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.HostBlock#getAgent()
	 * @see #getHostBlock()
	 * @generated
	 */
	EAttribute getHostBlock_Agent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.HostBlock#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.HostBlock#getService()
	 * @see #getHostBlock()
	 * @generated
	 */
	EAttribute getHostBlock_Service();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Interface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Interface#getName()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Interface#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Role</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Interface#getRole()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Role();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Interface#getDomainSystem <em>Domain System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain System</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Interface#getDomainSystem()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_DomainSystem();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Interface#getFailoverType <em>Failover Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Failover Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Interface#getFailoverType()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_FailoverType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Interface#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Interface#getId()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Interface#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Interface#getModified()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Modified();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Interface#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Interface#getRevision()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Revision();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Interface#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Interface#getPort()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Port();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Interface#isExternal <em>External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Interface#isExternal()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_External();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP <em>IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IP</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP
	 * @generated
	 */
	EClass getIP();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#getName()
	 * @see #getIP()
	 * @generated
	 */
	EAttribute getIP_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#getIp <em>Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#getIp()
	 * @see #getIP()
	 * @generated
	 */
	EAttribute getIP_Ip();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Host</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#getHost()
	 * @see #getIP()
	 * @generated
	 */
	EReference getIP_Host();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#getType()
	 * @see #getIP()
	 * @generated
	 */
	EAttribute getIP_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#getId()
	 * @see #getIP()
	 * @generated
	 */
	EAttribute getIP_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#getModified()
	 * @see #getIP()
	 * @generated
	 */
	EAttribute getIP_Modified();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#getRevision()
	 * @see #getIP()
	 * @generated
	 */
	EAttribute getIP_Revision();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#isShared <em>Shared</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shared</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#isShared()
	 * @see #getIP()
	 * @generated
	 */
	EAttribute getIP_Shared();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#getIpName <em>Ip Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ip Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#getIpName()
	 * @see #getIP()
	 * @generated
	 */
	EReference getIP_IpName();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#getVserver <em>Vserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vserver</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#getVserver()
	 * @see #getIP()
	 * @generated
	 */
	EReference getIP_Vserver();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.MuninInfo <em>Munin Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Munin Info</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.MuninInfo
	 * @generated
	 */
	EClass getMuninInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.MuninInfo#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.MuninInfo#getId()
	 * @see #getMuninInfo()
	 * @generated
	 */
	EAttribute getMuninInfo_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.MuninInfo#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.MuninInfo#getModified()
	 * @see #getMuninInfo()
	 * @generated
	 */
	EAttribute getMuninInfo_Modified();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.MuninInfo#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.MuninInfo#getRevision()
	 * @see #getMuninInfo()
	 * @generated
	 */
	EAttribute getMuninInfo_Revision();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.MuninInfo#getPluginName <em>Plugin Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plugin Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.MuninInfo#getPluginName()
	 * @see #getMuninInfo()
	 * @generated
	 */
	EAttribute getMuninInfo_PluginName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.MuninInfo#getWarningLevel <em>Warning Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Warning Level</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.MuninInfo#getWarningLevel()
	 * @see #getMuninInfo()
	 * @generated
	 */
	EAttribute getMuninInfo_WarningLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.MuninInfo#getCriticalLevel <em>Critical Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Critical Level</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.MuninInfo#getCriticalLevel()
	 * @see #getMuninInfo()
	 * @generated
	 */
	EAttribute getMuninInfo_CriticalLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.MuninInfo#isMonitorableByNagios <em>Monitorable By Nagios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitorable By Nagios</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.MuninInfo#isMonitorableByNagios()
	 * @see #getMuninInfo()
	 * @generated
	 */
	EAttribute getMuninInfo_MonitorableByNagios();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.MuninInfo#isDisplaySummary <em>Display Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Summary</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.MuninInfo#isDisplaySummary()
	 * @see #getMuninInfo()
	 * @generated
	 */
	EAttribute getMuninInfo_DisplaySummary();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.MuninInfo#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Role</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.MuninInfo#getRole()
	 * @see #getMuninInfo()
	 * @generated
	 */
	EReference getMuninInfo_Role();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IPName <em>IP Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IP Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IPName
	 * @generated
	 */
	EClass getIPName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IPName#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IPName#getId()
	 * @see #getIPName()
	 * @generated
	 */
	EAttribute getIPName_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IPName#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IPName#getModified()
	 * @see #getIPName()
	 * @generated
	 */
	EAttribute getIPName_Modified();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IPName#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IPName#getRevision()
	 * @see #getIPName()
	 * @generated
	 */
	EAttribute getIPName_Revision();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IPName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IPName#getName()
	 * @see #getIPName()
	 * @generated
	 */
	EAttribute getIPName_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IPName#getIp <em>Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ip</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IPName#getIp()
	 * @see #getIPName()
	 * @generated
	 */
	EReference getIPName_Ip();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Parameter#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Parameter#getId()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Parameter#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Parameter#getModified()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Modified();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Parameter#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Parameter#getRevision()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Revision();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Parameter#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Parameter#getKey()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Role#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interface</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Role#getInterface()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Interface();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Role#getVserver <em>Vserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vserver</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Role#getVserver()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Vserver();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Role#getRequiredInterface <em>Required Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Interface</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Role#getRequiredInterface()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_RequiredInterface();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Role#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Role#getId()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Role#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Role#getModified()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Modified();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Role#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Role#getRevision()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Revision();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Role#getMuninInfo <em>Munin Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Munin Info</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Role#getMuninInfo()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_MuninInfo();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsSystem
	 * @generated
	 */
	EClass getOpsSystem();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsSystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsSystem#getName()
	 * @see #getOpsSystem()
	 * @generated
	 */
	EAttribute getOpsSystem_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsSystem#getOwnVserver <em>Own Vserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Own Vserver</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsSystem#getOwnVserver()
	 * @see #getOpsSystem()
	 * @generated
	 */
	EReference getOpsSystem_OwnVserver();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsSystem#getServingVserver <em>Serving Vserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Serving Vserver</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsSystem#getServingVserver()
	 * @see #getOpsSystem()
	 * @generated
	 */
	EReference getOpsSystem_ServingVserver();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsSystem#getDomainSystem <em>Domain System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain System</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsSystem#getDomainSystem()
	 * @see #getOpsSystem()
	 * @generated
	 */
	EReference getOpsSystem_DomainSystem();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsSystem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsSystem#getId()
	 * @see #getOpsSystem()
	 * @generated
	 */
	EAttribute getOpsSystem_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsSystem#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsSystem#getModified()
	 * @see #getOpsSystem()
	 * @generated
	 */
	EAttribute getOpsSystem_Modified();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsSystem#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsSystem#getRevision()
	 * @see #getOpsSystem()
	 * @generated
	 */
	EAttribute getOpsSystem_Revision();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.VServer <em>VServer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VServer</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.VServer
	 * @generated
	 */
	EClass getVServer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.VServer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.VServer#getName()
	 * @see #getVServer()
	 * @generated
	 */
	EAttribute getVServer_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.VServer#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Block</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.VServer#getBlock()
	 * @see #getVServer()
	 * @generated
	 */
	EReference getVServer_Block();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.VServer#getOwnSystem <em>Own System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Own System</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.VServer#getOwnSystem()
	 * @see #getVServer()
	 * @generated
	 */
	EReference getVServer_OwnSystem();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.VServer#getServedSystem <em>Served System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Served System</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.VServer#getServedSystem()
	 * @see #getVServer()
	 * @generated
	 */
	EReference getVServer_ServedSystem();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.VServer#getIp <em>Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ip</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.VServer#getIp()
	 * @see #getVServer()
	 * @generated
	 */
	EReference getVServer_Ip();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.VServer#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Host</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.VServer#getHost()
	 * @see #getVServer()
	 * @generated
	 */
	EReference getVServer_Host();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.VServer#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.VServer#getRole()
	 * @see #getVServer()
	 * @generated
	 */
	EReference getVServer_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.VServer#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.VServer#getId()
	 * @see #getVServer()
	 * @generated
	 */
	EAttribute getVServer_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.VServer#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.VServer#getModified()
	 * @see #getVServer()
	 * @generated
	 */
	EAttribute getVServer_Modified();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.VServer#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.VServer#getRevision()
	 * @see #getVServer()
	 * @generated
	 */
	EAttribute getVServer_Revision();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DWHCluster <em>DWH Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DWH Cluster</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DWHCluster
	 * @generated
	 */
	EClass getDWHCluster();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DWHCluster#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DWHCluster#getName()
	 * @see #getDWHCluster()
	 * @generated
	 */
	EAttribute getDWHCluster_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DWHCluster#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DWHCluster#getInstance()
	 * @see #getDWHCluster()
	 * @generated
	 */
	EReference getDWHCluster_Instance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DWHCluster#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DWHCluster#getId()
	 * @see #getDWHCluster()
	 * @generated
	 */
	EAttribute getDWHCluster_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DWHCluster#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DWHCluster#getModified()
	 * @see #getDWHCluster()
	 * @generated
	 */
	EAttribute getDWHCluster_Modified();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DWHCluster#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DWHCluster#getRevision()
	 * @see #getDWHCluster()
	 * @generated
	 */
	EAttribute getDWHCluster_Revision();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DWHCluster#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DWHCluster#getDescription()
	 * @see #getDWHCluster()
	 * @generated
	 */
	EAttribute getDWHCluster_Description();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DWHInstance <em>DWH Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DWH Instance</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DWHInstance
	 * @generated
	 */
	EClass getDWHInstance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DWHInstance#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DWHInstance#getId()
	 * @see #getDWHInstance()
	 * @generated
	 */
	EAttribute getDWHInstance_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DWHInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DWHInstance#getName()
	 * @see #getDWHInstance()
	 * @generated
	 */
	EAttribute getDWHInstance_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DWHInstance#getEtl <em>Etl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Etl</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DWHInstance#getEtl()
	 * @see #getDWHInstance()
	 * @generated
	 */
	EReference getDWHInstance_Etl();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DWHInstance#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DWHInstance#getModified()
	 * @see #getDWHInstance()
	 * @generated
	 */
	EAttribute getDWHInstance_Modified();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DWHInstance#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DWHInstance#getRevision()
	 * @see #getDWHInstance()
	 * @generated
	 */
	EAttribute getDWHInstance_Revision();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DWHInstance#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DWHInstance#getDescription()
	 * @see #getDWHInstance()
	 * @generated
	 */
	EAttribute getDWHInstance_Description();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IpType <em>Ip Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ip Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IpType
	 * @generated
	 */
	EEnum getIpType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OpsFactory getOpsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.BlockImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Vserver</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__VSERVER = eINSTANCE.getBlock_Vserver();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__DESCRIPTION = eINSTANCE.getBlock_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__ID = eINSTANCE.getBlock_Id();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__MODIFIED = eINSTANCE.getBlock_Modified();

		/**
		 * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__REVISION = eINSTANCE.getBlock_Revision();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__AGENT = eINSTANCE.getBlock_Agent();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__SERVICE = eINSTANCE.getBlock_Service();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.DataCenterImpl <em>Data Center</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.DataCenterImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsPackageImpl#getDataCenter()
		 * @generated
		 */
		EClass DATA_CENTER = eINSTANCE.getDataCenter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CENTER__NAME = eINSTANCE.getDataCenter_Name();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CENTER__HOST = eINSTANCE.getDataCenter_Host();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CENTER__ID = eINSTANCE.getDataCenter_Id();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CENTER__MODIFIED = eINSTANCE.getDataCenter_Modified();

		/**
		 * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CENTER__REVISION = eINSTANCE.getDataCenter_Revision();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CENTER__DESCRIPTION = eINSTANCE.getDataCenter_Description();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.DomainImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__NAME = eINSTANCE.getDomain_Name();

		/**
		 * The meta object literal for the '<em><b>Systems</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__SYSTEMS = eINSTANCE.getDomain_Systems();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__ID = eINSTANCE.getDomain_Id();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__MODIFIED = eINSTANCE.getDomain_Modified();

		/**
		 * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__REVISION = eINSTANCE.getDomain_Revision();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.DomainSystemImpl <em>Domain System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.DomainSystemImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsPackageImpl#getDomainSystem()
		 * @generated
		 */
		EClass DOMAIN_SYSTEM = eINSTANCE.getDomainSystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_SYSTEM__NAME = eINSTANCE.getDomainSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_SYSTEM__DESCRIPTION = eINSTANCE.getDomainSystem_Description();

		/**
		 * The meta object literal for the '<em><b>Domains</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SYSTEM__DOMAINS = eINSTANCE.getDomainSystem_Domains();

		/**
		 * The meta object literal for the '<em><b>Ops System</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SYSTEM__OPS_SYSTEM = eINSTANCE.getDomainSystem_OpsSystem();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SYSTEM__INTERFACE = eINSTANCE.getDomainSystem_Interface();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_SYSTEM__ID = eINSTANCE.getDomainSystem_Id();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_SYSTEM__MODIFIED = eINSTANCE.getDomainSystem_Modified();

		/**
		 * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_SYSTEM__REVISION = eINSTANCE.getDomainSystem_Revision();

		/**
		 * The meta object literal for the '<em><b>Forward Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_SYSTEM__FORWARD_EMAIL = eINSTANCE.getDomainSystem_ForwardEmail();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.FailoverTypeImpl <em>Failover Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.FailoverTypeImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsPackageImpl#getFailoverType()
		 * @generated
		 */
		EClass FAILOVER_TYPE = eINSTANCE.getFailoverType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILOVER_TYPE__NAME = eINSTANCE.getFailoverType_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILOVER_TYPE__ID = eINSTANCE.getFailoverType_Id();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILOVER_TYPE__MODIFIED = eINSTANCE.getFailoverType_Modified();

		/**
		 * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILOVER_TYPE__REVISION = eINSTANCE.getFailoverType_Revision();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.HostImpl <em>Host</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.HostImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsPackageImpl#getHost()
		 * @generated
		 */
		EClass HOST = eINSTANCE.getHost();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__NAME = eINSTANCE.getHost_Name();

		/**
		 * The meta object literal for the '<em><b>Data Center</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST__DATA_CENTER = eINSTANCE.getHost_DataCenter();

		/**
		 * The meta object literal for the '<em><b>Vserver</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST__VSERVER = eINSTANCE.getHost_Vserver();

		/**
		 * The meta object literal for the '<em><b>Ip</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST__IP = eINSTANCE.getHost_Ip();

		/**
		 * The meta object literal for the '<em><b>Own Ip</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST__OWN_IP = eINSTANCE.getHost_OwnIp();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__ID = eINSTANCE.getHost_Id();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__MODIFIED = eINSTANCE.getHost_Modified();

		/**
		 * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__REVISION = eINSTANCE.getHost_Revision();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__DESCRIPTION = eINSTANCE.getHost_Description();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__NETWORK = eINSTANCE.getHost_Network();

		/**
		 * The meta object literal for the '<em><b>Provider Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__PROVIDER_ID = eINSTANCE.getHost_ProviderId();

		/**
		 * The meta object literal for the '<em><b>Gateway</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST__GATEWAY = eINSTANCE.getHost_Gateway();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST__BLOCK = eINSTANCE.getHost_Block();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.HostBlockImpl <em>Host Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.HostBlockImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsPackageImpl#getHostBlock()
		 * @generated
		 */
		EClass HOST_BLOCK = eINSTANCE.getHostBlock();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST_BLOCK__HOST = eINSTANCE.getHostBlock_Host();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_BLOCK__DESCRIPTION = eINSTANCE.getHostBlock_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_BLOCK__ID = eINSTANCE.getHostBlock_Id();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_BLOCK__MODIFIED = eINSTANCE.getHostBlock_Modified();

		/**
		 * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_BLOCK__REVISION = eINSTANCE.getHostBlock_Revision();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_BLOCK__AGENT = eINSTANCE.getHostBlock_Agent();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_BLOCK__SERVICE = eINSTANCE.getHostBlock_Service();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.InterfaceImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__NAME = eINSTANCE.getInterface_Name();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__ROLE = eINSTANCE.getInterface_Role();

		/**
		 * The meta object literal for the '<em><b>Domain System</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__DOMAIN_SYSTEM = eINSTANCE.getInterface_DomainSystem();

		/**
		 * The meta object literal for the '<em><b>Failover Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__FAILOVER_TYPE = eINSTANCE.getInterface_FailoverType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__ID = eINSTANCE.getInterface_Id();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__MODIFIED = eINSTANCE.getInterface_Modified();

		/**
		 * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__REVISION = eINSTANCE.getInterface_Revision();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__PORT = eINSTANCE.getInterface_Port();

		/**
		 * The meta object literal for the '<em><b>External</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__EXTERNAL = eINSTANCE.getInterface_External();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.IPImpl <em>IP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.IPImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsPackageImpl#getIP()
		 * @generated
		 */
		EClass IP = eINSTANCE.getIP();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IP__NAME = eINSTANCE.getIP_Name();

		/**
		 * The meta object literal for the '<em><b>Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IP__IP = eINSTANCE.getIP_Ip();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IP__HOST = eINSTANCE.getIP_Host();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IP__TYPE = eINSTANCE.getIP_Type();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IP__ID = eINSTANCE.getIP_Id();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IP__MODIFIED = eINSTANCE.getIP_Modified();

		/**
		 * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IP__REVISION = eINSTANCE.getIP_Revision();

		/**
		 * The meta object literal for the '<em><b>Shared</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IP__SHARED = eINSTANCE.getIP_Shared();

		/**
		 * The meta object literal for the '<em><b>Ip Name</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IP__IP_NAME = eINSTANCE.getIP_IpName();

		/**
		 * The meta object literal for the '<em><b>Vserver</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IP__VSERVER = eINSTANCE.getIP_Vserver();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.MuninInfoImpl <em>Munin Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.MuninInfoImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsPackageImpl#getMuninInfo()
		 * @generated
		 */
		EClass MUNIN_INFO = eINSTANCE.getMuninInfo();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUNIN_INFO__ID = eINSTANCE.getMuninInfo_Id();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUNIN_INFO__MODIFIED = eINSTANCE.getMuninInfo_Modified();

		/**
		 * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUNIN_INFO__REVISION = eINSTANCE.getMuninInfo_Revision();

		/**
		 * The meta object literal for the '<em><b>Plugin Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUNIN_INFO__PLUGIN_NAME = eINSTANCE.getMuninInfo_PluginName();

		/**
		 * The meta object literal for the '<em><b>Warning Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUNIN_INFO__WARNING_LEVEL = eINSTANCE.getMuninInfo_WarningLevel();

		/**
		 * The meta object literal for the '<em><b>Critical Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUNIN_INFO__CRITICAL_LEVEL = eINSTANCE.getMuninInfo_CriticalLevel();

		/**
		 * The meta object literal for the '<em><b>Monitorable By Nagios</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUNIN_INFO__MONITORABLE_BY_NAGIOS = eINSTANCE.getMuninInfo_MonitorableByNagios();

		/**
		 * The meta object literal for the '<em><b>Display Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUNIN_INFO__DISPLAY_SUMMARY = eINSTANCE.getMuninInfo_DisplaySummary();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUNIN_INFO__ROLE = eINSTANCE.getMuninInfo_Role();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.IPNameImpl <em>IP Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.IPNameImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsPackageImpl#getIPName()
		 * @generated
		 */
		EClass IP_NAME = eINSTANCE.getIPName();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IP_NAME__ID = eINSTANCE.getIPName_Id();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IP_NAME__MODIFIED = eINSTANCE.getIPName_Modified();

		/**
		 * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IP_NAME__REVISION = eINSTANCE.getIPName_Revision();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IP_NAME__NAME = eINSTANCE.getIPName_Name();

		/**
		 * The meta object literal for the '<em><b>Ip</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IP_NAME__IP = eINSTANCE.getIPName_Ip();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.ParameterImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__ID = eINSTANCE.getParameter_Id();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__MODIFIED = eINSTANCE.getParameter_Modified();

		/**
		 * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__REVISION = eINSTANCE.getParameter_Revision();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__KEY = eINSTANCE.getParameter_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.RoleImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__INTERFACE = eINSTANCE.getRole_Interface();

		/**
		 * The meta object literal for the '<em><b>Vserver</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__VSERVER = eINSTANCE.getRole_Vserver();

		/**
		 * The meta object literal for the '<em><b>Required Interface</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__REQUIRED_INTERFACE = eINSTANCE.getRole_RequiredInterface();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__ID = eINSTANCE.getRole_Id();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__MODIFIED = eINSTANCE.getRole_Modified();

		/**
		 * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__REVISION = eINSTANCE.getRole_Revision();

		/**
		 * The meta object literal for the '<em><b>Munin Info</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__MUNIN_INFO = eINSTANCE.getRole_MuninInfo();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsSystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsSystemImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsPackageImpl#getOpsSystem()
		 * @generated
		 */
		EClass OPS_SYSTEM = eINSTANCE.getOpsSystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPS_SYSTEM__NAME = eINSTANCE.getOpsSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Own Vserver</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPS_SYSTEM__OWN_VSERVER = eINSTANCE.getOpsSystem_OwnVserver();

		/**
		 * The meta object literal for the '<em><b>Serving Vserver</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPS_SYSTEM__SERVING_VSERVER = eINSTANCE.getOpsSystem_ServingVserver();

		/**
		 * The meta object literal for the '<em><b>Domain System</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPS_SYSTEM__DOMAIN_SYSTEM = eINSTANCE.getOpsSystem_DomainSystem();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPS_SYSTEM__ID = eINSTANCE.getOpsSystem_Id();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPS_SYSTEM__MODIFIED = eINSTANCE.getOpsSystem_Modified();

		/**
		 * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPS_SYSTEM__REVISION = eINSTANCE.getOpsSystem_Revision();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.VServerImpl <em>VServer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.VServerImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsPackageImpl#getVServer()
		 * @generated
		 */
		EClass VSERVER = eINSTANCE.getVServer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSERVER__NAME = eINSTANCE.getVServer_Name();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSERVER__BLOCK = eINSTANCE.getVServer_Block();

		/**
		 * The meta object literal for the '<em><b>Own System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSERVER__OWN_SYSTEM = eINSTANCE.getVServer_OwnSystem();

		/**
		 * The meta object literal for the '<em><b>Served System</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSERVER__SERVED_SYSTEM = eINSTANCE.getVServer_ServedSystem();

		/**
		 * The meta object literal for the '<em><b>Ip</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSERVER__IP = eINSTANCE.getVServer_Ip();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSERVER__HOST = eINSTANCE.getVServer_Host();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSERVER__ROLE = eINSTANCE.getVServer_Role();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSERVER__ID = eINSTANCE.getVServer_Id();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSERVER__MODIFIED = eINSTANCE.getVServer_Modified();

		/**
		 * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSERVER__REVISION = eINSTANCE.getVServer_Revision();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.DWHClusterImpl <em>DWH Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.DWHClusterImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsPackageImpl#getDWHCluster()
		 * @generated
		 */
		EClass DWH_CLUSTER = eINSTANCE.getDWHCluster();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DWH_CLUSTER__NAME = eINSTANCE.getDWHCluster_Name();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DWH_CLUSTER__INSTANCE = eINSTANCE.getDWHCluster_Instance();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DWH_CLUSTER__ID = eINSTANCE.getDWHCluster_Id();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DWH_CLUSTER__MODIFIED = eINSTANCE.getDWHCluster_Modified();

		/**
		 * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DWH_CLUSTER__REVISION = eINSTANCE.getDWHCluster_Revision();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DWH_CLUSTER__DESCRIPTION = eINSTANCE.getDWHCluster_Description();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.DWHInstanceImpl <em>DWH Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.DWHInstanceImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsPackageImpl#getDWHInstance()
		 * @generated
		 */
		EClass DWH_INSTANCE = eINSTANCE.getDWHInstance();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DWH_INSTANCE__ID = eINSTANCE.getDWHInstance_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DWH_INSTANCE__NAME = eINSTANCE.getDWHInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Etl</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DWH_INSTANCE__ETL = eINSTANCE.getDWHInstance_Etl();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DWH_INSTANCE__MODIFIED = eINSTANCE.getDWHInstance_Modified();

		/**
		 * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DWH_INSTANCE__REVISION = eINSTANCE.getDWHInstance_Revision();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DWH_INSTANCE__DESCRIPTION = eINSTANCE.getDWHInstance_Description();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IpType <em>Ip Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IpType
		 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsPackageImpl#getIpType()
		 * @generated
		 */
		EEnum IP_TYPE = eINSTANCE.getIpType();

	}

} //OpsPackage
