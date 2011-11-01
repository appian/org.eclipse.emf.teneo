/**
 * <copyright>
 * </copyright>
 *
 * $Id: OpsPackageImpl.java,v 1.1 2008/04/06 13:45:43 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Block;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DWHCluster;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DWHInstance;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DataCenter;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Domain;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DomainSystem;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.FailoverType;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.HostBlock;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IPName;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Interface;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IpType;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.MuninInfo;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsFactory;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsSystem;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Parameter;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Role;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.VServer;

import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.util.OpsValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpsPackageImpl extends EPackageImpl implements OpsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataCenterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failoverTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass muninInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ipNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opsSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dwhClusterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dwhInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ipTypeEEnum = null;

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
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OpsPackageImpl() {
		super(eNS_URI, OpsFactory.eINSTANCE);
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
	public static OpsPackage init() {
		if (isInited) return (OpsPackage)EPackage.Registry.INSTANCE.getEPackage(OpsPackage.eNS_URI);

		// Obtain or create and register package
		OpsPackageImpl theOpsPackage = (OpsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof OpsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new OpsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theOpsPackage.createPackageContents();

		// Initialize created meta-data
		theOpsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theOpsPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return OpsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theOpsPackage.freeze();

		return theOpsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Vserver() {
		return (EReference)blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_Description() {
		return (EAttribute)blockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_Id() {
		return (EAttribute)blockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_Modified() {
		return (EAttribute)blockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_Revision() {
		return (EAttribute)blockEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_Agent() {
		return (EAttribute)blockEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_Service() {
		return (EAttribute)blockEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataCenter() {
		return dataCenterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataCenter_Name() {
		return (EAttribute)dataCenterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataCenter_Host() {
		return (EReference)dataCenterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataCenter_Id() {
		return (EAttribute)dataCenterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataCenter_Modified() {
		return (EAttribute)dataCenterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataCenter_Revision() {
		return (EAttribute)dataCenterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataCenter_Description() {
		return (EAttribute)dataCenterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_Name() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Systems() {
		return (EReference)domainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_Id() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_Modified() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_Revision() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainSystem() {
		return domainSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainSystem_Name() {
		return (EAttribute)domainSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainSystem_Description() {
		return (EAttribute)domainSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainSystem_Domains() {
		return (EReference)domainSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainSystem_OpsSystem() {
		return (EReference)domainSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainSystem_Interface() {
		return (EReference)domainSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainSystem_Id() {
		return (EAttribute)domainSystemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainSystem_Modified() {
		return (EAttribute)domainSystemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainSystem_Revision() {
		return (EAttribute)domainSystemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainSystem_ForwardEmail() {
		return (EAttribute)domainSystemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailoverType() {
		return failoverTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFailoverType_Name() {
		return (EAttribute)failoverTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFailoverType_Id() {
		return (EAttribute)failoverTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFailoverType_Modified() {
		return (EAttribute)failoverTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFailoverType_Revision() {
		return (EAttribute)failoverTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHost() {
		return hostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHost_Name() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHost_DataCenter() {
		return (EReference)hostEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHost_Vserver() {
		return (EReference)hostEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHost_Ip() {
		return (EReference)hostEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHost_OwnIp() {
		return (EReference)hostEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHost_Id() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHost_Modified() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHost_Revision() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHost_Description() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHost_Network() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHost_ProviderId() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHost_Gateway() {
		return (EReference)hostEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHost_Block() {
		return (EReference)hostEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostBlock() {
		return hostBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHostBlock_Host() {
		return (EReference)hostBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostBlock_Description() {
		return (EAttribute)hostBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostBlock_Id() {
		return (EAttribute)hostBlockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostBlock_Modified() {
		return (EAttribute)hostBlockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostBlock_Revision() {
		return (EAttribute)hostBlockEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostBlock_Agent() {
		return (EAttribute)hostBlockEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostBlock_Service() {
		return (EAttribute)hostBlockEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_Name() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Role() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_DomainSystem() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_FailoverType() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_Id() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_Modified() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_Revision() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_Port() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_External() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIP() {
		return ipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIP_Name() {
		return (EAttribute)ipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIP_Ip() {
		return (EAttribute)ipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIP_Host() {
		return (EReference)ipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIP_Type() {
		return (EAttribute)ipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIP_Id() {
		return (EAttribute)ipEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIP_Modified() {
		return (EAttribute)ipEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIP_Revision() {
		return (EAttribute)ipEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIP_Shared() {
		return (EAttribute)ipEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIP_IpName() {
		return (EReference)ipEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIP_Vserver() {
		return (EReference)ipEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMuninInfo() {
		return muninInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuninInfo_Id() {
		return (EAttribute)muninInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuninInfo_Modified() {
		return (EAttribute)muninInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuninInfo_Revision() {
		return (EAttribute)muninInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuninInfo_PluginName() {
		return (EAttribute)muninInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuninInfo_WarningLevel() {
		return (EAttribute)muninInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuninInfo_CriticalLevel() {
		return (EAttribute)muninInfoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuninInfo_MonitorableByNagios() {
		return (EAttribute)muninInfoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuninInfo_DisplaySummary() {
		return (EAttribute)muninInfoEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuninInfo_Role() {
		return (EReference)muninInfoEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPName() {
		return ipNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPName_Id() {
		return (EAttribute)ipNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPName_Modified() {
		return (EAttribute)ipNameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPName_Revision() {
		return (EAttribute)ipNameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPName_Name() {
		return (EAttribute)ipNameEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIPName_Ip() {
		return (EReference)ipNameEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Id() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Modified() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Revision() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Key() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Value() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_Name() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Interface() {
		return (EReference)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Vserver() {
		return (EReference)roleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_RequiredInterface() {
		return (EReference)roleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_Id() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_Modified() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_Revision() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_MuninInfo() {
		return (EReference)roleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpsSystem() {
		return opsSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpsSystem_Name() {
		return (EAttribute)opsSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpsSystem_OwnVserver() {
		return (EReference)opsSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpsSystem_ServingVserver() {
		return (EReference)opsSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpsSystem_DomainSystem() {
		return (EReference)opsSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpsSystem_Id() {
		return (EAttribute)opsSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpsSystem_Modified() {
		return (EAttribute)opsSystemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpsSystem_Revision() {
		return (EAttribute)opsSystemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVServer() {
		return vServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVServer_Name() {
		return (EAttribute)vServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVServer_Block() {
		return (EReference)vServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVServer_OwnSystem() {
		return (EReference)vServerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVServer_ServedSystem() {
		return (EReference)vServerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVServer_Ip() {
		return (EReference)vServerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVServer_Host() {
		return (EReference)vServerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVServer_Role() {
		return (EReference)vServerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVServer_Id() {
		return (EAttribute)vServerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVServer_Modified() {
		return (EAttribute)vServerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVServer_Revision() {
		return (EAttribute)vServerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDWHCluster() {
		return dwhClusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDWHCluster_Name() {
		return (EAttribute)dwhClusterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDWHCluster_Instance() {
		return (EReference)dwhClusterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDWHCluster_Id() {
		return (EAttribute)dwhClusterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDWHCluster_Modified() {
		return (EAttribute)dwhClusterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDWHCluster_Revision() {
		return (EAttribute)dwhClusterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDWHCluster_Description() {
		return (EAttribute)dwhClusterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDWHInstance() {
		return dwhInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDWHInstance_Id() {
		return (EAttribute)dwhInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDWHInstance_Name() {
		return (EAttribute)dwhInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDWHInstance_Etl() {
		return (EReference)dwhInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDWHInstance_Modified() {
		return (EAttribute)dwhInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDWHInstance_Revision() {
		return (EAttribute)dwhInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDWHInstance_Description() {
		return (EAttribute)dwhInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIpType() {
		return ipTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpsFactory getOpsFactory() {
		return (OpsFactory)getEFactoryInstance();
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
		blockEClass = createEClass(BLOCK);
		createEReference(blockEClass, BLOCK__VSERVER);
		createEAttribute(blockEClass, BLOCK__DESCRIPTION);
		createEAttribute(blockEClass, BLOCK__ID);
		createEAttribute(blockEClass, BLOCK__MODIFIED);
		createEAttribute(blockEClass, BLOCK__REVISION);
		createEAttribute(blockEClass, BLOCK__AGENT);
		createEAttribute(blockEClass, BLOCK__SERVICE);

		dataCenterEClass = createEClass(DATA_CENTER);
		createEAttribute(dataCenterEClass, DATA_CENTER__NAME);
		createEReference(dataCenterEClass, DATA_CENTER__HOST);
		createEAttribute(dataCenterEClass, DATA_CENTER__ID);
		createEAttribute(dataCenterEClass, DATA_CENTER__MODIFIED);
		createEAttribute(dataCenterEClass, DATA_CENTER__REVISION);
		createEAttribute(dataCenterEClass, DATA_CENTER__DESCRIPTION);

		domainEClass = createEClass(DOMAIN);
		createEAttribute(domainEClass, DOMAIN__NAME);
		createEReference(domainEClass, DOMAIN__SYSTEMS);
		createEAttribute(domainEClass, DOMAIN__ID);
		createEAttribute(domainEClass, DOMAIN__MODIFIED);
		createEAttribute(domainEClass, DOMAIN__REVISION);

		domainSystemEClass = createEClass(DOMAIN_SYSTEM);
		createEAttribute(domainSystemEClass, DOMAIN_SYSTEM__NAME);
		createEAttribute(domainSystemEClass, DOMAIN_SYSTEM__DESCRIPTION);
		createEReference(domainSystemEClass, DOMAIN_SYSTEM__DOMAINS);
		createEReference(domainSystemEClass, DOMAIN_SYSTEM__OPS_SYSTEM);
		createEReference(domainSystemEClass, DOMAIN_SYSTEM__INTERFACE);
		createEAttribute(domainSystemEClass, DOMAIN_SYSTEM__ID);
		createEAttribute(domainSystemEClass, DOMAIN_SYSTEM__MODIFIED);
		createEAttribute(domainSystemEClass, DOMAIN_SYSTEM__REVISION);
		createEAttribute(domainSystemEClass, DOMAIN_SYSTEM__FORWARD_EMAIL);

		failoverTypeEClass = createEClass(FAILOVER_TYPE);
		createEAttribute(failoverTypeEClass, FAILOVER_TYPE__NAME);
		createEAttribute(failoverTypeEClass, FAILOVER_TYPE__ID);
		createEAttribute(failoverTypeEClass, FAILOVER_TYPE__MODIFIED);
		createEAttribute(failoverTypeEClass, FAILOVER_TYPE__REVISION);

		hostEClass = createEClass(HOST);
		createEAttribute(hostEClass, HOST__NAME);
		createEReference(hostEClass, HOST__DATA_CENTER);
		createEReference(hostEClass, HOST__VSERVER);
		createEReference(hostEClass, HOST__IP);
		createEReference(hostEClass, HOST__OWN_IP);
		createEAttribute(hostEClass, HOST__ID);
		createEAttribute(hostEClass, HOST__MODIFIED);
		createEAttribute(hostEClass, HOST__REVISION);
		createEAttribute(hostEClass, HOST__DESCRIPTION);
		createEAttribute(hostEClass, HOST__NETWORK);
		createEAttribute(hostEClass, HOST__PROVIDER_ID);
		createEReference(hostEClass, HOST__GATEWAY);
		createEReference(hostEClass, HOST__BLOCK);

		hostBlockEClass = createEClass(HOST_BLOCK);
		createEReference(hostBlockEClass, HOST_BLOCK__HOST);
		createEAttribute(hostBlockEClass, HOST_BLOCK__DESCRIPTION);
		createEAttribute(hostBlockEClass, HOST_BLOCK__ID);
		createEAttribute(hostBlockEClass, HOST_BLOCK__MODIFIED);
		createEAttribute(hostBlockEClass, HOST_BLOCK__REVISION);
		createEAttribute(hostBlockEClass, HOST_BLOCK__AGENT);
		createEAttribute(hostBlockEClass, HOST_BLOCK__SERVICE);

		interfaceEClass = createEClass(INTERFACE);
		createEAttribute(interfaceEClass, INTERFACE__NAME);
		createEReference(interfaceEClass, INTERFACE__ROLE);
		createEReference(interfaceEClass, INTERFACE__DOMAIN_SYSTEM);
		createEReference(interfaceEClass, INTERFACE__FAILOVER_TYPE);
		createEAttribute(interfaceEClass, INTERFACE__ID);
		createEAttribute(interfaceEClass, INTERFACE__MODIFIED);
		createEAttribute(interfaceEClass, INTERFACE__REVISION);
		createEAttribute(interfaceEClass, INTERFACE__PORT);
		createEAttribute(interfaceEClass, INTERFACE__EXTERNAL);

		ipEClass = createEClass(IP);
		createEAttribute(ipEClass, IP__NAME);
		createEAttribute(ipEClass, IP__IP);
		createEReference(ipEClass, IP__HOST);
		createEAttribute(ipEClass, IP__TYPE);
		createEAttribute(ipEClass, IP__ID);
		createEAttribute(ipEClass, IP__MODIFIED);
		createEAttribute(ipEClass, IP__REVISION);
		createEAttribute(ipEClass, IP__SHARED);
		createEReference(ipEClass, IP__IP_NAME);
		createEReference(ipEClass, IP__VSERVER);

		muninInfoEClass = createEClass(MUNIN_INFO);
		createEAttribute(muninInfoEClass, MUNIN_INFO__ID);
		createEAttribute(muninInfoEClass, MUNIN_INFO__MODIFIED);
		createEAttribute(muninInfoEClass, MUNIN_INFO__REVISION);
		createEAttribute(muninInfoEClass, MUNIN_INFO__PLUGIN_NAME);
		createEAttribute(muninInfoEClass, MUNIN_INFO__WARNING_LEVEL);
		createEAttribute(muninInfoEClass, MUNIN_INFO__CRITICAL_LEVEL);
		createEAttribute(muninInfoEClass, MUNIN_INFO__MONITORABLE_BY_NAGIOS);
		createEAttribute(muninInfoEClass, MUNIN_INFO__DISPLAY_SUMMARY);
		createEReference(muninInfoEClass, MUNIN_INFO__ROLE);

		ipNameEClass = createEClass(IP_NAME);
		createEAttribute(ipNameEClass, IP_NAME__ID);
		createEAttribute(ipNameEClass, IP_NAME__MODIFIED);
		createEAttribute(ipNameEClass, IP_NAME__REVISION);
		createEAttribute(ipNameEClass, IP_NAME__NAME);
		createEReference(ipNameEClass, IP_NAME__IP);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__ID);
		createEAttribute(parameterEClass, PARAMETER__MODIFIED);
		createEAttribute(parameterEClass, PARAMETER__REVISION);
		createEAttribute(parameterEClass, PARAMETER__KEY);
		createEAttribute(parameterEClass, PARAMETER__VALUE);

		roleEClass = createEClass(ROLE);
		createEAttribute(roleEClass, ROLE__NAME);
		createEReference(roleEClass, ROLE__INTERFACE);
		createEReference(roleEClass, ROLE__VSERVER);
		createEReference(roleEClass, ROLE__REQUIRED_INTERFACE);
		createEAttribute(roleEClass, ROLE__ID);
		createEAttribute(roleEClass, ROLE__MODIFIED);
		createEAttribute(roleEClass, ROLE__REVISION);
		createEReference(roleEClass, ROLE__MUNIN_INFO);

		opsSystemEClass = createEClass(OPS_SYSTEM);
		createEAttribute(opsSystemEClass, OPS_SYSTEM__NAME);
		createEReference(opsSystemEClass, OPS_SYSTEM__OWN_VSERVER);
		createEReference(opsSystemEClass, OPS_SYSTEM__SERVING_VSERVER);
		createEReference(opsSystemEClass, OPS_SYSTEM__DOMAIN_SYSTEM);
		createEAttribute(opsSystemEClass, OPS_SYSTEM__ID);
		createEAttribute(opsSystemEClass, OPS_SYSTEM__MODIFIED);
		createEAttribute(opsSystemEClass, OPS_SYSTEM__REVISION);

		vServerEClass = createEClass(VSERVER);
		createEAttribute(vServerEClass, VSERVER__NAME);
		createEReference(vServerEClass, VSERVER__BLOCK);
		createEReference(vServerEClass, VSERVER__OWN_SYSTEM);
		createEReference(vServerEClass, VSERVER__SERVED_SYSTEM);
		createEReference(vServerEClass, VSERVER__IP);
		createEReference(vServerEClass, VSERVER__HOST);
		createEReference(vServerEClass, VSERVER__ROLE);
		createEAttribute(vServerEClass, VSERVER__ID);
		createEAttribute(vServerEClass, VSERVER__MODIFIED);
		createEAttribute(vServerEClass, VSERVER__REVISION);

		dwhClusterEClass = createEClass(DWH_CLUSTER);
		createEAttribute(dwhClusterEClass, DWH_CLUSTER__NAME);
		createEReference(dwhClusterEClass, DWH_CLUSTER__INSTANCE);
		createEAttribute(dwhClusterEClass, DWH_CLUSTER__ID);
		createEAttribute(dwhClusterEClass, DWH_CLUSTER__MODIFIED);
		createEAttribute(dwhClusterEClass, DWH_CLUSTER__REVISION);
		createEAttribute(dwhClusterEClass, DWH_CLUSTER__DESCRIPTION);

		dwhInstanceEClass = createEClass(DWH_INSTANCE);
		createEAttribute(dwhInstanceEClass, DWH_INSTANCE__ID);
		createEAttribute(dwhInstanceEClass, DWH_INSTANCE__NAME);
		createEReference(dwhInstanceEClass, DWH_INSTANCE__ETL);
		createEAttribute(dwhInstanceEClass, DWH_INSTANCE__MODIFIED);
		createEAttribute(dwhInstanceEClass, DWH_INSTANCE__REVISION);
		createEAttribute(dwhInstanceEClass, DWH_INSTANCE__DESCRIPTION);

		// Create enums
		ipTypeEEnum = createEEnum(IP_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_Vserver(), this.getVServer(), this.getVServer_Block(), "vserver", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlock_Description(), ecorePackage.getEString(), "description", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlock_Id(), ecorePackage.getELong(), "id", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlock_Modified(), ecorePackage.getEDate(), "modified", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlock_Revision(), ecorePackage.getEInt(), "revision", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlock_Agent(), ecorePackage.getEString(), "agent", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlock_Service(), ecorePackage.getEString(), "service", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataCenterEClass, DataCenter.class, "DataCenter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataCenter_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataCenter_Host(), this.getHost(), this.getHost_DataCenter(), "host", null, 0, -1, DataCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataCenter_Id(), ecorePackage.getELong(), "id", null, 0, 1, DataCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataCenter_Modified(), ecorePackage.getEDate(), "modified", null, 0, 1, DataCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataCenter_Revision(), ecorePackage.getEInt(), "revision", null, 0, 1, DataCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataCenter_Description(), ecorePackage.getEString(), "description", null, 0, 1, DataCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomain_Name(), ecorePackage.getEString(), "name", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Systems(), this.getDomainSystem(), this.getDomainSystem_Domains(), "systems", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomain_Id(), ecorePackage.getELong(), "id", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomain_Modified(), ecorePackage.getEDate(), "modified", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomain_Revision(), ecorePackage.getEInt(), "revision", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainSystemEClass, DomainSystem.class, "DomainSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainSystem_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainSystem_Description(), ecorePackage.getEString(), "description", null, 0, 1, DomainSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSystem_Domains(), this.getDomain(), this.getDomain_Systems(), "domains", null, 0, -1, DomainSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSystem_OpsSystem(), this.getOpsSystem(), this.getOpsSystem_DomainSystem(), "opsSystem", null, 0, -1, DomainSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSystem_Interface(), this.getInterface(), this.getInterface_DomainSystem(), "interface", null, 0, 1, DomainSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainSystem_Id(), ecorePackage.getELong(), "id", null, 0, 1, DomainSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainSystem_Modified(), ecorePackage.getEDate(), "modified", null, 0, 1, DomainSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainSystem_Revision(), ecorePackage.getEInt(), "revision", null, 0, 1, DomainSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainSystem_ForwardEmail(), ecorePackage.getEString(), "forwardEmail", null, 0, 1, DomainSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(failoverTypeEClass, FailoverType.class, "FailoverType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFailoverType_Name(), ecorePackage.getEString(), "name", null, 0, 1, FailoverType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFailoverType_Id(), ecorePackage.getELong(), "id", null, 0, 1, FailoverType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFailoverType_Modified(), ecorePackage.getEDate(), "modified", null, 0, 1, FailoverType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFailoverType_Revision(), ecorePackage.getEInt(), "revision", null, 0, 1, FailoverType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hostEClass, Host.class, "Host", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHost_Name(), ecorePackage.getEString(), "name", null, 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHost_DataCenter(), this.getDataCenter(), this.getDataCenter_Host(), "dataCenter", null, 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHost_Vserver(), this.getVServer(), this.getVServer_Host(), "vserver", null, 0, -1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHost_Ip(), this.getIP(), this.getIP_Host(), "ip", null, 0, -1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHost_OwnIp(), this.getIP(), null, "ownIp", null, 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHost_Id(), ecorePackage.getELong(), "id", null, 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHost_Modified(), ecorePackage.getEDate(), "modified", null, 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHost_Revision(), ecorePackage.getEInt(), "revision", null, 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHost_Description(), ecorePackage.getEString(), "description", null, 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHost_Network(), ecorePackage.getEString(), "network", null, 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHost_ProviderId(), ecorePackage.getEString(), "providerId", null, 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHost_Gateway(), this.getIP(), null, "gateway", null, 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHost_Block(), this.getHostBlock(), this.getHostBlock_Host(), "block", null, 0, -1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hostBlockEClass, HostBlock.class, "HostBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHostBlock_Host(), this.getHost(), this.getHost_Block(), "host", null, 0, 1, HostBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostBlock_Description(), ecorePackage.getEString(), "description", null, 0, 1, HostBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostBlock_Id(), ecorePackage.getELong(), "id", null, 0, 1, HostBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostBlock_Modified(), ecorePackage.getEDate(), "modified", null, 0, 1, HostBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostBlock_Revision(), ecorePackage.getEInt(), "revision", null, 0, 1, HostBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostBlock_Agent(), ecorePackage.getEString(), "agent", null, 0, 1, HostBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostBlock_Service(), ecorePackage.getEString(), "service", null, 0, 1, HostBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterface_Name(), ecorePackage.getEString(), "name", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Role(), this.getRole(), this.getRole_Interface(), "role", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_DomainSystem(), this.getDomainSystem(), this.getDomainSystem_Interface(), "domainSystem", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_FailoverType(), this.getFailoverType(), null, "failoverType", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterface_Id(), ecorePackage.getELong(), "id", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterface_Modified(), ecorePackage.getEDate(), "modified", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterface_Revision(), ecorePackage.getEInt(), "revision", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterface_Port(), ecorePackage.getEInt(), "port", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterface_External(), ecorePackage.getEBoolean(), "external", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ipEClass, org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP.class, "IP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIP_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIP_Ip(), ecorePackage.getEString(), "ip", null, 0, 1, org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIP_Host(), this.getHost(), this.getHost_Ip(), "host", null, 0, 1, org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIP_Type(), this.getIpType(), "type", null, 0, 1, org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIP_Id(), ecorePackage.getELong(), "id", null, 0, 1, org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIP_Modified(), ecorePackage.getEDate(), "modified", null, 0, 1, org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIP_Revision(), ecorePackage.getEInt(), "revision", null, 0, 1, org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIP_Shared(), ecorePackage.getEBoolean(), "shared", null, 0, 1, org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIP_IpName(), this.getIPName(), this.getIPName_Ip(), "ipName", null, 0, -1, org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIP_Vserver(), this.getVServer(), this.getVServer_Ip(), "vserver", null, 0, -1, org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(muninInfoEClass, MuninInfo.class, "MuninInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMuninInfo_Id(), ecorePackage.getELong(), "id", null, 0, 1, MuninInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMuninInfo_Modified(), ecorePackage.getEDate(), "modified", null, 0, 1, MuninInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMuninInfo_Revision(), ecorePackage.getEInt(), "revision", null, 0, 1, MuninInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMuninInfo_PluginName(), ecorePackage.getEString(), "pluginName", null, 0, 1, MuninInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMuninInfo_WarningLevel(), ecorePackage.getEString(), "warningLevel", null, 0, 1, MuninInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMuninInfo_CriticalLevel(), ecorePackage.getEString(), "criticalLevel", null, 0, 1, MuninInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMuninInfo_MonitorableByNagios(), ecorePackage.getEBoolean(), "monitorableByNagios", null, 0, 1, MuninInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMuninInfo_DisplaySummary(), ecorePackage.getEBoolean(), "displaySummary", null, 0, 1, MuninInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMuninInfo_Role(), this.getRole(), this.getRole_MuninInfo(), "role", null, 0, 1, MuninInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ipNameEClass, IPName.class, "IPName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIPName_Id(), ecorePackage.getELong(), "id", null, 0, 1, IPName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIPName_Modified(), ecorePackage.getEDate(), "modified", null, 0, 1, IPName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIPName_Revision(), ecorePackage.getEInt(), "revision", null, 0, 1, IPName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIPName_Name(), ecorePackage.getEString(), "name", null, 0, 1, IPName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIPName_Ip(), this.getIP(), this.getIP_IpName(), "ip", null, 0, -1, IPName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Id(), ecorePackage.getELong(), "id", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Modified(), ecorePackage.getEDate(), "modified", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Revision(), ecorePackage.getEInt(), "revision", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Key(), ecorePackage.getEString(), "key", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRole_Name(), ecorePackage.getEString(), "name", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Interface(), this.getInterface(), this.getInterface_Role(), "interface", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Vserver(), this.getVServer(), this.getVServer_Role(), "vserver", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_RequiredInterface(), this.getInterface(), null, "requiredInterface", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_Id(), ecorePackage.getELong(), "id", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_Modified(), ecorePackage.getEDate(), "modified", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_Revision(), ecorePackage.getEInt(), "revision", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_MuninInfo(), this.getMuninInfo(), this.getMuninInfo_Role(), "muninInfo", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opsSystemEClass, OpsSystem.class, "OpsSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpsSystem_Name(), ecorePackage.getEString(), "name", null, 0, 1, OpsSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOpsSystem_OwnVserver(), this.getVServer(), this.getVServer_OwnSystem(), "ownVserver", null, 0, -1, OpsSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOpsSystem_ServingVserver(), this.getVServer(), this.getVServer_ServedSystem(), "servingVserver", null, 0, -1, OpsSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOpsSystem_DomainSystem(), this.getDomainSystem(), this.getDomainSystem_OpsSystem(), "domainSystem", null, 0, -1, OpsSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpsSystem_Id(), ecorePackage.getELong(), "id", null, 0, 1, OpsSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpsSystem_Modified(), ecorePackage.getEDate(), "modified", null, 0, 1, OpsSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpsSystem_Revision(), ecorePackage.getEInt(), "revision", null, 0, 1, OpsSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vServerEClass, VServer.class, "VServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVServer_Name(), ecorePackage.getEString(), "name", null, 0, 1, VServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVServer_Block(), this.getBlock(), this.getBlock_Vserver(), "block", null, 0, -1, VServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVServer_OwnSystem(), this.getOpsSystem(), this.getOpsSystem_OwnVserver(), "ownSystem", null, 0, 1, VServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVServer_ServedSystem(), this.getOpsSystem(), this.getOpsSystem_ServingVserver(), "servedSystem", null, 0, -1, VServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVServer_Ip(), this.getIP(), this.getIP_Vserver(), "ip", null, 0, -1, VServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVServer_Host(), this.getHost(), this.getHost_Vserver(), "host", null, 0, 1, VServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVServer_Role(), this.getRole(), this.getRole_Vserver(), "role", null, 0, 1, VServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVServer_Id(), ecorePackage.getELong(), "id", null, 0, 1, VServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVServer_Modified(), ecorePackage.getEDate(), "modified", null, 0, 1, VServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVServer_Revision(), ecorePackage.getEInt(), "revision", null, 0, 1, VServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dwhClusterEClass, DWHCluster.class, "DWHCluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDWHCluster_Name(), ecorePackage.getEString(), "name", null, 0, 1, DWHCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDWHCluster_Instance(), this.getDWHInstance(), null, "instance", null, 0, -1, DWHCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDWHCluster_Id(), ecorePackage.getELong(), "id", null, 0, 1, DWHCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDWHCluster_Modified(), ecorePackage.getEDate(), "modified", null, 0, 1, DWHCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDWHCluster_Revision(), ecorePackage.getEInt(), "revision", null, 0, 1, DWHCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDWHCluster_Description(), ecorePackage.getEString(), "description", null, 0, 1, DWHCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dwhInstanceEClass, DWHInstance.class, "DWHInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDWHInstance_Id(), ecorePackage.getELong(), "id", null, 0, 1, DWHInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDWHInstance_Name(), ecorePackage.getEString(), "name", null, 0, 1, DWHInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDWHInstance_Etl(), this.getVServer(), null, "etl", null, 0, -1, DWHInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDWHInstance_Modified(), ecorePackage.getEDate(), "modified", null, 0, 1, DWHInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDWHInstance_Revision(), ecorePackage.getEInt(), "revision", null, 0, 1, DWHInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDWHInstance_Description(), ecorePackage.getEString(), "description", null, 0, 1, DWHInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(ipTypeEEnum, IpType.class, "IpType");
		addEEnumLiteral(ipTypeEEnum, IpType.EXTERNAL);
		addEEnumLiteral(ipTypeEEnum, IpType.INTERNAL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// teneo.jpa
		createTeneoAnnotations();
		// webamg.emf
		createWebamgAnnotations();
		// teneo.hibernate
		createTeneo_1Annotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>teneo.jpa</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTeneoAnnotations() {
		String source = "teneo.jpa";		
		addAnnotation
		  (blockEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Table(name=\"ops_block\")"
		   });			
		addAnnotation
		  (getBlock_Vserver(), 
		   source, 
		   new String[] {
			 "appinfo", "@JoinColumn(name=\"vserver_id\")"
		   });		
		addAnnotation
		  (getBlock_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@GeneratedValue"
		   });		
		addAnnotation
		  (getBlock_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@Id"
		   });		
		addAnnotation
		  (getBlock_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Temporal(TIMESTAMP)"
		   });		
		addAnnotation
		  (getBlock_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(columnDefinition=\"timestamp\" insertable=\"false\" updatable=\"false\")"
		   });			
		addAnnotation
		  (getBlock_Revision(), 
		   source, 
		   new String[] {
			 "appinfo", "@Version"
		   });		
		addAnnotation
		  (getBlock_Revision(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(name=\"e_version\")"
		   });		
		addAnnotation
		  (dataCenterEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Table(name=\"ops_datacenter\")"
		   });				
		addAnnotation
		  (getDataCenter_Name(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(unique=\"true\")"
		   });		
		addAnnotation
		  (getDataCenter_Host(), 
		   source, 
		   new String[] {
			 "appinfo", "@JoinColumn(name=\"datacenter_id\")"
		   });		
		addAnnotation
		  (getDataCenter_Host(), 
		   source, 
		   new String[] {
			 "appinfo", "@OneToMany(indexed=\"false\" )"
		   });			
		addAnnotation
		  (getDataCenter_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@GeneratedValue"
		   });		
		addAnnotation
		  (getDataCenter_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@Id"
		   });		
		addAnnotation
		  (getDataCenter_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Temporal(TIMESTAMP)"
		   });		
		addAnnotation
		  (getDataCenter_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(columnDefinition=\"timestamp\" insertable=\"false\" updatable=\"false\")"
		   });			
		addAnnotation
		  (getDataCenter_Revision(), 
		   source, 
		   new String[] {
			 "appinfo", "@Version"
		   });		
		addAnnotation
		  (getDataCenter_Revision(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(name=\"e_version\")"
		   });		
		addAnnotation
		  (getDataCenter_Description(), 
		   source, 
		   new String[] {
			 "appinfo", "@Lob"
		   });		
		addAnnotation
		  (getDataCenter_Description(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(length=64000)"
		   });			
		addAnnotation
		  (getDomain_Name(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(unique=\"true\")"
		   });		
		addAnnotation
		  (getDomain_Systems(), 
		   source, 
		   new String[] {
			 "appinfo", "@JoinTable(name=\"domain_system\" joinColumns=@JoinColumn(name=\"domain_id\" nullable=\"false\") inverseJoinColumns=@JoinColumn(name=\"system_id\" nullable=\"false\"))"
		   });		
		addAnnotation
		  (getDomain_Systems(), 
		   source, 
		   new String[] {
			 "appinfo", "@ManyToMany(indexed=\"false\" )"
		   });			
		addAnnotation
		  (getDomain_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@GeneratedValue"
		   });		
		addAnnotation
		  (getDomain_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@Id"
		   });		
		addAnnotation
		  (getDomain_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Temporal(TIMESTAMP)"
		   });		
		addAnnotation
		  (getDomain_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(columnDefinition=\"timestamp\" insertable=\"false\" updatable=\"false\")"
		   });			
		addAnnotation
		  (getDomain_Revision(), 
		   source, 
		   new String[] {
			 "appinfo", "@Version"
		   });		
		addAnnotation
		  (getDomain_Revision(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(name=\"e_version\")"
		   });			
		addAnnotation
		  (getDomainSystem_Name(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(unique=\"true\")"
		   });		
		addAnnotation
		  (getDomainSystem_Domains(), 
		   source, 
		   new String[] {
			 "appinfo", "@ManyToMany(indexed=\"false\" mappedBy=\"systems\" )"
		   });		
		addAnnotation
		  (getDomainSystem_Domains(), 
		   source, 
		   new String[] {
			 "appinfo", "@JoinTable(name=\"domain_system\" joinColumns=@JoinColumn(name=\"system_id\" nullable=\"false\") inverseJoinColumns=@JoinColumn(name=\"domain_id\" nullable=\"false\"))"
		   });			
		addAnnotation
		  (getDomainSystem_OpsSystem(), 
		   source, 
		   new String[] {
			 "appinfo", "@ManyToMany(indexed=\"false\" )"
		   });		
		addAnnotation
		  (getDomainSystem_OpsSystem(), 
		   source, 
		   new String[] {
			 "appinfo", "@JoinTable(name=\"ops_domainsystem_opssystem\" joinColumns=@JoinColumn(name=\"domainsystem_id\" nullable=\"false\") inverseJoinColumns=@JoinColumn(name=\"opssystem_id\" nullable=\"false\"))"
		   });			
		addAnnotation
		  (getDomainSystem_Interface(), 
		   source, 
		   new String[] {
			 "appinfo", "@JoinColumn(name=\"interface_id\")"
		   });		
		addAnnotation
		  (getDomainSystem_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@GeneratedValue"
		   });		
		addAnnotation
		  (getDomainSystem_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@Id"
		   });		
		addAnnotation
		  (getDomainSystem_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Temporal(TIMESTAMP)"
		   });		
		addAnnotation
		  (getDomainSystem_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(columnDefinition=\"timestamp\" insertable=\"false\" updatable=\"false\")"
		   });			
		addAnnotation
		  (getDomainSystem_Revision(), 
		   source, 
		   new String[] {
			 "appinfo", "@Version"
		   });		
		addAnnotation
		  (getDomainSystem_Revision(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(name=\"e_version\")"
		   });		
		addAnnotation
		  (failoverTypeEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Table(name=\"ops_failovertype\")"
		   });			
		addAnnotation
		  (getFailoverType_Name(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(unique=\"true\")"
		   });		
		addAnnotation
		  (getFailoverType_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@GeneratedValue"
		   });		
		addAnnotation
		  (getFailoverType_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@Id"
		   });		
		addAnnotation
		  (getFailoverType_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Temporal(TIMESTAMP)"
		   });		
		addAnnotation
		  (getFailoverType_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(columnDefinition=\"timestamp\" insertable=\"false\" updatable=\"false\")"
		   });			
		addAnnotation
		  (getFailoverType_Revision(), 
		   source, 
		   new String[] {
			 "appinfo", "@Version"
		   });		
		addAnnotation
		  (getFailoverType_Revision(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(name=\"e_version\")"
		   });		
		addAnnotation
		  (hostEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Table(name=\"ops_host\")"
		   });			
		addAnnotation
		  (getHost_Name(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(unique=\"true\")"
		   });		
		addAnnotation
		  (getHost_DataCenter(), 
		   source, 
		   new String[] {
			 "appinfo", "@JoinColumn(name=\"datacenter_id\")"
		   });		
		addAnnotation
		  (getHost_Vserver(), 
		   source, 
		   new String[] {
			 "appinfo", "@JoinColumn(name=\"host_id\")"
		   });		
		addAnnotation
		  (getHost_Vserver(), 
		   source, 
		   new String[] {
			 "appinfo", "@OneToMany(indexed=\"false\" )"
		   });			
		addAnnotation
		  (getHost_Ip(), 
		   source, 
		   new String[] {
			 "appinfo", "@JoinColumn(name=\"host_id\")"
		   });		
		addAnnotation
		  (getHost_Ip(), 
		   source, 
		   new String[] {
			 "appinfo", "@OneToMany(indexed=\"false\" )"
		   });			
		addAnnotation
		  (getHost_OwnIp(), 
		   source, 
		   new String[] {
			 "appinfo", "@JoinColumn(name=\"ownip_id\")"
		   });		
		addAnnotation
		  (getHost_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@GeneratedValue"
		   });		
		addAnnotation
		  (getHost_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@Id"
		   });		
		addAnnotation
		  (getHost_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Temporal(TIMESTAMP)"
		   });		
		addAnnotation
		  (getHost_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(columnDefinition=\"timestamp\" insertable=\"false\" updatable=\"false\")"
		   });			
		addAnnotation
		  (getHost_Revision(), 
		   source, 
		   new String[] {
			 "appinfo", "@Version"
		   });		
		addAnnotation
		  (getHost_Revision(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(name=\"e_version\")"
		   });		
		addAnnotation
		  (getHost_Description(), 
		   source, 
		   new String[] {
			 "appinfo", "@Lob"
		   });		
		addAnnotation
		  (getHost_Description(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(length=64000)"
		   });		
		addAnnotation
		  (getHost_Network(), 
		   source, 
		   new String[] {
			 "appinfo", "@Lob"
		   });		
		addAnnotation
		  (getHost_Network(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(length=64000)"
		   });		
		addAnnotation
		  (getHost_ProviderId(), 
		   source, 
		   new String[] {
			 "appinfo", "@Lob"
		   });		
		addAnnotation
		  (getHost_ProviderId(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(length=64000)"
		   });		
		addAnnotation
		  (getHost_Block(), 
		   source, 
		   new String[] {
			 "appinfo", "@JoinColumn(name=\"host_id\")"
		   });		
		addAnnotation
		  (getHost_Block(), 
		   source, 
		   new String[] {
			 "appinfo", "@OneToMany(indexed=\"false\" )"
		   });			
		addAnnotation
		  (hostBlockEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Table(name=\"ops_hostblock\")"
		   });			
		addAnnotation
		  (getHostBlock_Host(), 
		   source, 
		   new String[] {
			 "appinfo", "@JoinColumn(name=\"host_id\")"
		   });		
		addAnnotation
		  (getHostBlock_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@GeneratedValue"
		   });		
		addAnnotation
		  (getHostBlock_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@Id"
		   });		
		addAnnotation
		  (getHostBlock_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Temporal(TIMESTAMP)"
		   });		
		addAnnotation
		  (getHostBlock_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(columnDefinition=\"timestamp\" insertable=\"false\" updatable=\"false\")"
		   });			
		addAnnotation
		  (getHostBlock_Revision(), 
		   source, 
		   new String[] {
			 "appinfo", "@Version"
		   });		
		addAnnotation
		  (getHostBlock_Revision(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(name=\"e_version\")"
		   });		
		addAnnotation
		  (interfaceEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Table(name=\"ops_interface\")"
		   });			
		addAnnotation
		  (getInterface_Name(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(unique=\"true\")"
		   });		
		addAnnotation
		  (getInterface_Role(), 
		   source, 
		   new String[] {
			 "appinfo", "@ManyToMany(indexed=\"false\" mappedBy=\"interface\" )"
		   });		
		addAnnotation
		  (getInterface_Role(), 
		   source, 
		   new String[] {
			 "appinfo", "@JoinTable(name=\"ops_role_interface\" joinColumns=@JoinColumn(name=\"interface_id\" nullable=\"false\") inverseJoinColumns=@JoinColumn(name=\"role_id\" nullable=\"false\"))"
		   });			
		addAnnotation
		  (getInterface_DomainSystem(), 
		   source, 
		   new String[] {
			 "appinfo", "@JoinColumn(name=\"interface_id\")"
		   });		
		addAnnotation
		  (getInterface_DomainSystem(), 
		   source, 
		   new String[] {
			 "appinfo", "@OneToMany(indexed=\"false\" )"
		   });			
		addAnnotation
		  (getInterface_FailoverType(), 
		   source, 
		   new String[] {
			 "appinfo", "@JoinColumn(name=\"failovertype_id\")"
		   });		
		addAnnotation
		  (getInterface_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@GeneratedValue"
		   });		
		addAnnotation
		  (getInterface_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@Id"
		   });		
		addAnnotation
		  (getInterface_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Temporal(TIMESTAMP)"
		   });		
		addAnnotation
		  (getInterface_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(columnDefinition=\"timestamp\" insertable=\"false\" updatable=\"false\")"
		   });			
		addAnnotation
		  (getInterface_Revision(), 
		   source, 
		   new String[] {
			 "appinfo", "@Version"
		   });		
		addAnnotation
		  (getInterface_Revision(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(name=\"e_version\")"
		   });		
		addAnnotation
		  (ipEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Table(name=\"ops_ip\")"
		   });			
		addAnnotation
		  (getIP_Name(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(unique=\"true\")"
		   });		
		addAnnotation
		  (getIP_Ip(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(unique=\"true\")"
		   });		
		addAnnotation
		  (getIP_Host(), 
		   source, 
		   new String[] {
			 "appinfo", "@JoinColumn(name=\"host_id\")"
		   });		
		addAnnotation
		  (getIP_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@GeneratedValue"
		   });		
		addAnnotation
		  (getIP_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@Id"
		   });		
		addAnnotation
		  (getIP_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Temporal(TIMESTAMP)"
		   });		
		addAnnotation
		  (getIP_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(columnDefinition=\"timestamp\" insertable=\"false\" updatable=\"false\")"
		   });			
		addAnnotation
		  (getIP_Revision(), 
		   source, 
		   new String[] {
			 "appinfo", "@Version"
		   });		
		addAnnotation
		  (getIP_Revision(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(name=\"e_version\")"
		   });		
		addAnnotation
		  (getIP_IpName(), 
		   source, 
		   new String[] {
			 "appinfo", "@ManyToMany(indexed=\"false\" mappedBy=\"ip\" )"
		   });		
		addAnnotation
		  (getIP_IpName(), 
		   source, 
		   new String[] {
			 "appinfo", "@JoinTable(name=\"ops_ip_ipname\" joinColumns=@JoinColumn(name=\"ip_id\" nullable=\"false\") inverseJoinColumns=@JoinColumn(name=\"ipname_id\" nullable=\"false\"))"
		   });			
		addAnnotation
		  (getIP_Vserver(), 
		   source, 
		   new String[] {
			 "appinfo", "@ManyToMany(indexed=\"false\" mappedBy=\"ip\" )"
		   });		
		addAnnotation
		  (getIP_Vserver(), 
		   source, 
		   new String[] {
			 "appinfo", "@JoinTable(name=\"ops_vserver_ip\" joinColumns=@JoinColumn(name=\"ip_id\" nullable=\"false\") inverseJoinColumns=@JoinColumn(name=\"vserver_id\" nullable=\"false\"))"
		   });			
		addAnnotation
		  (muninInfoEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Table(name=\"ops_munininfo\")"
		   });			
		addAnnotation
		  (getMuninInfo_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@GeneratedValue"
		   });		
		addAnnotation
		  (getMuninInfo_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@Id"
		   });		
		addAnnotation
		  (getMuninInfo_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Temporal(TIMESTAMP)"
		   });		
		addAnnotation
		  (getMuninInfo_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(columnDefinition=\"timestamp\" insertable=\"false\" updatable=\"false\")"
		   });			
		addAnnotation
		  (getMuninInfo_Revision(), 
		   source, 
		   new String[] {
			 "appinfo", "@Version"
		   });		
		addAnnotation
		  (getMuninInfo_Revision(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(name=\"e_version\")"
		   });		
		addAnnotation
		  (getMuninInfo_PluginName(), 
		   source, 
		   new String[] {
			 "appinfo", "@Lob"
		   });		
		addAnnotation
		  (getMuninInfo_PluginName(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(length=64000)"
		   });		
		addAnnotation
		  (getMuninInfo_Role(), 
		   source, 
		   new String[] {
			 "appinfo", "@JoinColumn(name=\"role_id\")"
		   });		
		addAnnotation
		  (ipNameEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Table(name=\"ops_ipname\")"
		   });			
		addAnnotation
		  (getIPName_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@GeneratedValue"
		   });		
		addAnnotation
		  (getIPName_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@Id"
		   });		
		addAnnotation
		  (getIPName_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Temporal(TIMESTAMP)"
		   });		
		addAnnotation
		  (getIPName_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(columnDefinition=\"timestamp\" insertable=\"false\" updatable=\"false\")"
		   });			
		addAnnotation
		  (getIPName_Revision(), 
		   source, 
		   new String[] {
			 "appinfo", "@Version"
		   });		
		addAnnotation
		  (getIPName_Revision(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(name=\"e_version\")"
		   });		
		addAnnotation
		  (getIPName_Name(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(unique=\"true\")"
		   });		
		addAnnotation
		  (getIPName_Ip(), 
		   source, 
		   new String[] {
			 "appinfo", "@ManyToMany(indexed=\"false\" )"
		   });		
		addAnnotation
		  (getIPName_Ip(), 
		   source, 
		   new String[] {
			 "appinfo", "@JoinTable(name=\"ops_ip_ipname\" joinColumns=@JoinColumn(name=\"ipname_id\" nullable=\"false\") inverseJoinColumns=@JoinColumn(name=\"ip_id\" nullable=\"false\"))"
		   });			
		addAnnotation
		  (parameterEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Table(name=\"ops_parameter\")"
		   });			
		addAnnotation
		  (getParameter_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@GeneratedValue"
		   });		
		addAnnotation
		  (getParameter_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@Id"
		   });		
		addAnnotation
		  (getParameter_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Temporal(TIMESTAMP)"
		   });		
		addAnnotation
		  (getParameter_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(columnDefinition=\"timestamp\" insertable=\"false\" updatable=\"false\")"
		   });			
		addAnnotation
		  (getParameter_Revision(), 
		   source, 
		   new String[] {
			 "appinfo", "@Version"
		   });		
		addAnnotation
		  (getParameter_Revision(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(name=\"e_version\")"
		   });		
		addAnnotation
		  (getParameter_Key(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(unique=\"true\")"
		   });		
		addAnnotation
		  (getParameter_Value(), 
		   source, 
		   new String[] {
			 "appinfo", "@Lob"
		   });		
		addAnnotation
		  (getParameter_Value(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(length=64000)"
		   });		
		addAnnotation
		  (roleEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Table(name=\"ops_role\")"
		   });			
		addAnnotation
		  (getRole_Name(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(unique=\"true\")"
		   });		
		addAnnotation
		  (getRole_Interface(), 
		   source, 
		   new String[] {
			 "appinfo", "@ManyToMany(indexed=\"false\" )"
		   });		
		addAnnotation
		  (getRole_Interface(), 
		   source, 
		   new String[] {
			 "appinfo", "@JoinTable(name=\"ops_role_interface\" joinColumns=@JoinColumn(name=\"role_id\" nullable=\"false\") inverseJoinColumns=@JoinColumn(name=\"interface_id\" nullable=\"false\"))"
		   });			
		addAnnotation
		  (getRole_Vserver(), 
		   source, 
		   new String[] {
			 "appinfo", "@JoinColumn(name=\"role_id\")"
		   });		
		addAnnotation
		  (getRole_Vserver(), 
		   source, 
		   new String[] {
			 "appinfo", "@OneToMany(indexed=\"false\" )"
		   });			
		addAnnotation
		  (getRole_RequiredInterface(), 
		   source, 
		   new String[] {
			 "appinfo", "@ManyToMany(indexed=\"false\" )"
		   });		
		addAnnotation
		  (getRole_RequiredInterface(), 
		   source, 
		   new String[] {
			 "appinfo", "@JoinTable(name=\"ops_role_requredinterface\" joinColumns=@JoinColumn(name=\"role_id\" nullable=\"false\") inverseJoinColumns=@JoinColumn(name=\"interface_id\" nullable=\"false\"))"
		   });			
		addAnnotation
		  (getRole_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@GeneratedValue"
		   });		
		addAnnotation
		  (getRole_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@Id"
		   });		
		addAnnotation
		  (getRole_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Temporal(TIMESTAMP)"
		   });		
		addAnnotation
		  (getRole_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(columnDefinition=\"timestamp\" insertable=\"false\" updatable=\"false\")"
		   });			
		addAnnotation
		  (getRole_Revision(), 
		   source, 
		   new String[] {
			 "appinfo", "@Version"
		   });		
		addAnnotation
		  (getRole_Revision(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(name=\"e_version\")"
		   });		
		addAnnotation
		  (getRole_MuninInfo(), 
		   source, 
		   new String[] {
			 "appinfo", "@JoinColumn(name=\"role_id\")"
		   });		
		addAnnotation
		  (getRole_MuninInfo(), 
		   source, 
		   new String[] {
			 "appinfo", "@OneToMany(indexed=\"false\" )"
		   });			
		addAnnotation
		  (opsSystemEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Table(name=\"ops_opssystem\")"
		   });			
		addAnnotation
		  (getOpsSystem_Name(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(unique=\"true\")"
		   });		
		addAnnotation
		  (getOpsSystem_OwnVserver(), 
		   source, 
		   new String[] {
			 "appinfo", "@JoinColumn(name=\"own_opssystem_id\")"
		   });		
		addAnnotation
		  (getOpsSystem_OwnVserver(), 
		   source, 
		   new String[] {
			 "appinfo", "@OneToMany(indexed=\"false\" )"
		   });			
		addAnnotation
		  (getOpsSystem_ServingVserver(), 
		   source, 
		   new String[] {
			 "appinfo", "@ManyToMany(indexed=\"false\" mappedBy=\"servedSystem\" )"
		   });		
		addAnnotation
		  (getOpsSystem_ServingVserver(), 
		   source, 
		   new String[] {
			 "appinfo", "@JoinTable(name=\"ops_vserver_opssystem\" joinColumns=@JoinColumn(name=\"opssystem_id\" nullable=\"false\") inverseJoinColumns=@JoinColumn(name=\"vserver_id\" nullable=\"false\"))"
		   });			
		addAnnotation
		  (getOpsSystem_DomainSystem(), 
		   source, 
		   new String[] {
			 "appinfo", "@ManyToMany(indexed=\"false\" mappedBy=\"opsSystem\" )"
		   });		
		addAnnotation
		  (getOpsSystem_DomainSystem(), 
		   source, 
		   new String[] {
			 "appinfo", "@JoinTable(name=\"ops_domainsystem_opssystem\" joinColumns=@JoinColumn(name=\"opssystem_id\" nullable=\"false\") inverseJoinColumns=@JoinColumn(name=\"domainsystem_id\" nullable=\"false\"))"
		   });			
		addAnnotation
		  (getOpsSystem_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@GeneratedValue"
		   });		
		addAnnotation
		  (getOpsSystem_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@Id"
		   });		
		addAnnotation
		  (getOpsSystem_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Temporal(TIMESTAMP)"
		   });		
		addAnnotation
		  (getOpsSystem_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(columnDefinition=\"timestamp\" insertable=\"false\" updatable=\"false\")"
		   });			
		addAnnotation
		  (getOpsSystem_Revision(), 
		   source, 
		   new String[] {
			 "appinfo", "@Version"
		   });		
		addAnnotation
		  (getOpsSystem_Revision(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(name=\"e_version\")"
		   });		
		addAnnotation
		  (vServerEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Table(name=\"ops_vserver\")"
		   });			
		addAnnotation
		  (getVServer_Name(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(unique=\"true\")"
		   });		
		addAnnotation
		  (getVServer_Block(), 
		   source, 
		   new String[] {
			 "appinfo", "@JoinColumn(name=\"vserver_id\")"
		   });		
		addAnnotation
		  (getVServer_Block(), 
		   source, 
		   new String[] {
			 "appinfo", "@OneToMany(indexed=\"false\" )"
		   });			
		addAnnotation
		  (getVServer_OwnSystem(), 
		   source, 
		   new String[] {
			 "appinfo", "@JoinColumn(name=\"own_opssystem_id\")"
		   });		
		addAnnotation
		  (getVServer_ServedSystem(), 
		   source, 
		   new String[] {
			 "appinfo", "@ManyToMany(indexed=\"false\" )"
		   });		
		addAnnotation
		  (getVServer_ServedSystem(), 
		   source, 
		   new String[] {
			 "appinfo", "@JoinTable(name=\"ops_vserver_opssystem\" joinColumns=@JoinColumn(name=\"vserver_id\" nullable=\"false\") inverseJoinColumns=@JoinColumn(name=\"opssystem_id\" nullable=\"false\"))"
		   });			
		addAnnotation
		  (getVServer_Ip(), 
		   source, 
		   new String[] {
			 "appinfo", "@ManyToMany(indexed=\"false\" )"
		   });		
		addAnnotation
		  (getVServer_Ip(), 
		   source, 
		   new String[] {
			 "appinfo", "@JoinTable(name=\"ops_vserver_ip\" joinColumns=@JoinColumn(name=\"vserver_id\" nullable=\"false\") inverseJoinColumns=@JoinColumn(name=\"ip_id\" nullable=\"false\"))"
		   });			
		addAnnotation
		  (getVServer_Host(), 
		   source, 
		   new String[] {
			 "appinfo", "@JoinColumn(name=\"host_id\")"
		   });		
		addAnnotation
		  (getVServer_Role(), 
		   source, 
		   new String[] {
			 "appinfo", "@JoinColumn(name=\"role_id\")"
		   });		
		addAnnotation
		  (getVServer_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@GeneratedValue"
		   });		
		addAnnotation
		  (getVServer_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@Id"
		   });		
		addAnnotation
		  (getVServer_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Temporal(TIMESTAMP)"
		   });		
		addAnnotation
		  (getVServer_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(columnDefinition=\"timestamp\" insertable=\"false\" updatable=\"false\")"
		   });			
		addAnnotation
		  (getVServer_Revision(), 
		   source, 
		   new String[] {
			 "appinfo", "@Version"
		   });		
		addAnnotation
		  (getVServer_Revision(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(name=\"e_version\")"
		   });		
		addAnnotation
		  (dwhClusterEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Table(name=\"ops_dwhcluster\")"
		   });				
		addAnnotation
		  (getDWHCluster_Name(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(unique=\"true\")"
		   });		
		addAnnotation
		  (getDWHCluster_Instance(), 
		   source, 
		   new String[] {
			 "appinfo", "@JoinColumn(name=\"dwhcluster_id\")"
		   });		
		addAnnotation
		  (getDWHCluster_Instance(), 
		   source, 
		   new String[] {
			 "appinfo", "@OneToMany(indexed=\"false\" )"
		   });			
		addAnnotation
		  (getDWHCluster_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@GeneratedValue"
		   });		
		addAnnotation
		  (getDWHCluster_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@Id"
		   });		
		addAnnotation
		  (getDWHCluster_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Temporal(TIMESTAMP)"
		   });		
		addAnnotation
		  (getDWHCluster_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(columnDefinition=\"timestamp\" insertable=\"false\" updatable=\"false\")"
		   });			
		addAnnotation
		  (getDWHCluster_Revision(), 
		   source, 
		   new String[] {
			 "appinfo", "@Version"
		   });		
		addAnnotation
		  (getDWHCluster_Revision(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(name=\"e_version\")"
		   });		
		addAnnotation
		  (getDWHCluster_Description(), 
		   source, 
		   new String[] {
			 "appinfo", "@Lob"
		   });		
		addAnnotation
		  (getDWHCluster_Description(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(length=64000)"
		   });		
		addAnnotation
		  (dwhInstanceEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Table(name=\"ops_dwhinstance\")"
		   });				
		addAnnotation
		  (getDWHInstance_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@GeneratedValue"
		   });		
		addAnnotation
		  (getDWHInstance_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@Id"
		   });		
		addAnnotation
		  (getDWHInstance_Etl(), 
		   source, 
		   new String[] {
			 "appinfo", "@JoinColumn(name=\"dwhinstance_id\")"
		   });		
		addAnnotation
		  (getDWHInstance_Etl(), 
		   source, 
		   new String[] {
			 "appinfo", "@OneToMany(indexed=\"false\" )"
		   });			
		addAnnotation
		  (getDWHInstance_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Temporal(TIMESTAMP)"
		   });		
		addAnnotation
		  (getDWHInstance_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(columnDefinition=\"timestamp\" insertable=\"false\" updatable=\"false\")"
		   });			
		addAnnotation
		  (getDWHInstance_Revision(), 
		   source, 
		   new String[] {
			 "appinfo", "@Version"
		   });		
		addAnnotation
		  (getDWHInstance_Revision(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(name=\"e_version\")"
		   });		
		addAnnotation
		  (getDWHInstance_Description(), 
		   source, 
		   new String[] {
			 "appinfo", "@Lob"
		   });		
		addAnnotation
		  (getDWHInstance_Description(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(length=64000)"
		   });
	}

	/**
	 * Initializes the annotations for <b>webamg.emf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createWebamgAnnotations() {
		String source = "webamg.emf";			
		addAnnotation
		  (blockEClass, 
		   source, 
		   new String[] {
			 "user.key", "id"
		   });												
		addAnnotation
		  (dataCenterEClass, 
		   source, 
		   new String[] {
			 "user.key", "name"
		   });															
		addAnnotation
		  (domainEClass, 
		   source, 
		   new String[] {
			 "managed", "false",
			 "user.key", "name"
		   });													
		addAnnotation
		  (domainSystemEClass, 
		   source, 
		   new String[] {
			 "user.key", "name"
		   });																		
		addAnnotation
		  (failoverTypeEClass, 
		   source, 
		   new String[] {
			 "managed", "false",
			 "user.key", "name"
		   });											
		addAnnotation
		  (hostEClass, 
		   source, 
		   new String[] {
			 "user.key", "name"
		   });																												
		addAnnotation
		  (hostBlockEClass, 
		   source, 
		   new String[] {
			 "user.key", "id"
		   });											
		addAnnotation
		  (interfaceEClass, 
		   source, 
		   new String[] {
			 "user.key", "name"
		   });																		
		addAnnotation
		  (ipEClass, 
		   source, 
		   new String[] {
			 "user.key", "ip"
		   });																			
		addAnnotation
		  (muninInfoEClass, 
		   source, 
		   new String[] {
			 "user.key", "pluginName"
		   });													
		addAnnotation
		  (ipNameEClass, 
		   source, 
		   new String[] {
			 "user.key", "name"
		   });														
		addAnnotation
		  (parameterEClass, 
		   source, 
		   new String[] {
			 "user.key", "key"
		   });													
		addAnnotation
		  (roleEClass, 
		   source, 
		   new String[] {
			 "user.key", "name"
		   });																							
		addAnnotation
		  (opsSystemEClass, 
		   source, 
		   new String[] {
			 "user.key", "name"
		   });																				
		addAnnotation
		  (vServerEClass, 
		   source, 
		   new String[] {
			 "user.key", "name"
		   });																								
		addAnnotation
		  (dwhClusterEClass, 
		   source, 
		   new String[] {
			 "user.key", "name"
		   });																	
		addAnnotation
		  (dwhInstanceEClass, 
		   source, 
		   new String[] {
			 "user.key", "name"
		   });												
	}

	/**
	 * Initializes the annotations for <b>teneo.hibernate</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTeneo_1Annotations() {
		String source = "teneo.hibernate";									
		addAnnotation
		  (getBlock_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Generated(ALWAYS)"
		   });										
		addAnnotation
		  (getDataCenter_Host(), 
		   source, 
		   new String[] {
			 "appinfo", "@Fetch(SUBSELECT)"
		   });						
		addAnnotation
		  (getDataCenter_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Generated(ALWAYS)"
		   });										
		addAnnotation
		  (getDomain_Systems(), 
		   source, 
		   new String[] {
			 "appinfo", "@Fetch(SUBSELECT)"
		   });						
		addAnnotation
		  (getDomain_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Generated(ALWAYS)"
		   });								
		addAnnotation
		  (getDomainSystem_Domains(), 
		   source, 
		   new String[] {
			 "appinfo", "@Fetch(SUBSELECT)"
		   });				
		addAnnotation
		  (getDomainSystem_OpsSystem(), 
		   source, 
		   new String[] {
			 "appinfo", "@Fetch(SUBSELECT)"
		   });							
		addAnnotation
		  (getDomainSystem_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Generated(ALWAYS)"
		   });											
		addAnnotation
		  (getFailoverType_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Generated(ALWAYS)"
		   });										
		addAnnotation
		  (getHost_Vserver(), 
		   source, 
		   new String[] {
			 "appinfo", "@Fetch(SUBSELECT)"
		   });				
		addAnnotation
		  (getHost_Ip(), 
		   source, 
		   new String[] {
			 "appinfo", "@Fetch(SUBSELECT)"
		   });							
		addAnnotation
		  (getHost_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Generated(ALWAYS)"
		   });												
		addAnnotation
		  (getHost_Block(), 
		   source, 
		   new String[] {
			 "appinfo", "@Fetch(SUBSELECT)"
		   });									
		addAnnotation
		  (getHostBlock_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Generated(ALWAYS)"
		   });									
		addAnnotation
		  (getInterface_Role(), 
		   source, 
		   new String[] {
			 "appinfo", "@Fetch(SUBSELECT)"
		   });				
		addAnnotation
		  (getInterface_DomainSystem(), 
		   source, 
		   new String[] {
			 "appinfo", "@Fetch(SUBSELECT)"
		   });							
		addAnnotation
		  (getInterface_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Generated(ALWAYS)"
		   });													
		addAnnotation
		  (getIP_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Generated(ALWAYS)"
		   });						
		addAnnotation
		  (getIP_IpName(), 
		   source, 
		   new String[] {
			 "appinfo", "@Fetch(SUBSELECT)"
		   });				
		addAnnotation
		  (getIP_Vserver(), 
		   source, 
		   new String[] {
			 "appinfo", "@Fetch(SUBSELECT)"
		   });								
		addAnnotation
		  (getMuninInfo_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Generated(ALWAYS)"
		   });													
		addAnnotation
		  (getIPName_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Generated(ALWAYS)"
		   });							
		addAnnotation
		  (getIPName_Ip(), 
		   source, 
		   new String[] {
			 "appinfo", "@Fetch(SUBSELECT)"
		   });								
		addAnnotation
		  (getParameter_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Generated(ALWAYS)"
		   });												
		addAnnotation
		  (getRole_Interface(), 
		   source, 
		   new String[] {
			 "appinfo", "@Fetch(SUBSELECT)"
		   });				
		addAnnotation
		  (getRole_Vserver(), 
		   source, 
		   new String[] {
			 "appinfo", "@Fetch(SUBSELECT)"
		   });				
		addAnnotation
		  (getRole_RequiredInterface(), 
		   source, 
		   new String[] {
			 "appinfo", "@Fetch(SUBSELECT)"
		   });						
		addAnnotation
		  (getRole_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Generated(ALWAYS)"
		   });						
		addAnnotation
		  (getRole_MuninInfo(), 
		   source, 
		   new String[] {
			 "appinfo", "@Fetch(SUBSELECT)"
		   });							
		addAnnotation
		  (getOpsSystem_OwnVserver(), 
		   source, 
		   new String[] {
			 "appinfo", "@Fetch(SUBSELECT)"
		   });				
		addAnnotation
		  (getOpsSystem_ServingVserver(), 
		   source, 
		   new String[] {
			 "appinfo", "@Fetch(SUBSELECT)"
		   });				
		addAnnotation
		  (getOpsSystem_DomainSystem(), 
		   source, 
		   new String[] {
			 "appinfo", "@Fetch(SUBSELECT)"
		   });						
		addAnnotation
		  (getOpsSystem_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Generated(ALWAYS)"
		   });									
		addAnnotation
		  (getVServer_Block(), 
		   source, 
		   new String[] {
			 "appinfo", "@Fetch(SUBSELECT)"
		   });					
		addAnnotation
		  (getVServer_ServedSystem(), 
		   source, 
		   new String[] {
			 "appinfo", "@Fetch(SUBSELECT)"
		   });				
		addAnnotation
		  (getVServer_Ip(), 
		   source, 
		   new String[] {
			 "appinfo", "@Fetch(SUBSELECT)"
		   });								
		addAnnotation
		  (getVServer_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Generated(ALWAYS)"
		   });										
		addAnnotation
		  (getDWHCluster_Instance(), 
		   source, 
		   new String[] {
			 "appinfo", "@Fetch(SUBSELECT)"
		   });						
		addAnnotation
		  (getDWHCluster_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Generated(ALWAYS)"
		   });													
		addAnnotation
		  (getDWHInstance_Etl(), 
		   source, 
		   new String[] {
			 "appinfo", "@Fetch(SUBSELECT)"
		   });				
		addAnnotation
		  (getDWHInstance_Modified(), 
		   source, 
		   new String[] {
			 "appinfo", "@Generated(ALWAYS)"
		   });				
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";													
		addAnnotation
		  (dataCenterEClass, 
		   source, 
		   new String[] {
			 "constraints", "Default"
		   });																																																																																																																																																																																																																																			
		addAnnotation
		  (dwhClusterEClass, 
		   source, 
		   new String[] {
			 "constraints", "Default"
		   });																	
		addAnnotation
		  (dwhInstanceEClass, 
		   source, 
		   new String[] {
			 "constraints", "Default"
		   });													
	}

} //OpsPackageImpl
