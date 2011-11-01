/**
 * <copyright>
 * </copyright>
 *
 * $Id: OpsValidator.java,v 1.3 2009/02/03 08:51:15 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Block;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DWHCluster;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DWHInstance;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DataCenter;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Domain;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DomainSystem;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.FailoverType;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.HostBlock;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IPName;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Interface;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IpType;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.MuninInfo;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsSystem;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Parameter;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Role;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.VServer;

/**
 * <!-- begin-user-doc --> The <b>Validator</b> for the model. <!-- end-user-doc
 * -->
 * 
 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage
 * @generated
 */
public class OpsValidator extends EObjectValidator {
	/**
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final OpsValidator INSTANCE = new OpsValidator();

	/**
	 * A constant for the
	 * {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of
	 * diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes}
	 * from this package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.emf.teneo.samples.issues.bz225296_2.ops";

	/**
	 * A constant with a fixed name that can be used as the base value for
	 * additional hand written constants. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for
	 * additional hand written constants in a derived class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public OpsValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return OpsPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the
	 * model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
		case OpsPackage.BLOCK:
			return validateBlock((Block) value, diagnostics, context);
		case OpsPackage.DATA_CENTER:
			return validateDataCenter((DataCenter) value, diagnostics, context);
		case OpsPackage.DOMAIN:
			return validateDomain((Domain) value, diagnostics, context);
		case OpsPackage.DOMAIN_SYSTEM:
			return validateDomainSystem((DomainSystem) value, diagnostics,
					context);
		case OpsPackage.FAILOVER_TYPE:
			return validateFailoverType((FailoverType) value, diagnostics,
					context);
		case OpsPackage.HOST:
			return validateHost((Host) value, diagnostics, context);
		case OpsPackage.HOST_BLOCK:
			return validateHostBlock((HostBlock) value, diagnostics, context);
		case OpsPackage.INTERFACE:
			return validateInterface((Interface) value, diagnostics, context);
		case OpsPackage.IP:
			return validateIP((IP) value, diagnostics, context);
		case OpsPackage.MUNIN_INFO:
			return validateMuninInfo((MuninInfo) value, diagnostics, context);
		case OpsPackage.IP_NAME:
			return validateIPName((IPName) value, diagnostics, context);
		case OpsPackage.PARAMETER:
			return validateParameter((Parameter) value, diagnostics, context);
		case OpsPackage.ROLE:
			return validateRole((Role) value, diagnostics, context);
		case OpsPackage.OPS_SYSTEM:
			return validateOpsSystem((OpsSystem) value, diagnostics, context);
		case OpsPackage.VSERVER:
			return validateVServer((VServer) value, diagnostics, context);
		case OpsPackage.DWH_CLUSTER:
			return validateDWHCluster((DWHCluster) value, diagnostics, context);
		case OpsPackage.DWH_INSTANCE:
			return validateDWHInstance((DWHInstance) value, diagnostics,
					context);
		case OpsPackage.IP_TYPE:
			return validateIpType((IpType) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBlock(Block block, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(block, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateDataCenter(DataCenter dataCenter,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(dataCenter,
				diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(dataCenter, diagnostics,
					context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(dataCenter,
					diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(dataCenter, diagnostics,
					context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(dataCenter, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(dataCenter, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(dataCenter, diagnostics,
					context);
		}
		if (result || diagnostics != null) {
			result &= validateDataCenter_Default(dataCenter, diagnostics,
					context);
		}
		return result;
	}

	/**
	 * Validates the Default constraint of '<em>Data Center</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateDataCenter_Default(DataCenter dataCenter,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and
		// message
		// Ensure that you remove @generated or mark it @generated NOT
		// if (false) {
		// if (diagnostics != null) {
		// diagnostics.add
		// (new BasicDiagnostic
		// (Diagnostic.ERROR,
		// DIAGNOSTIC_SOURCE,
		// 0,
		// EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic",
		// new Object[] { "Default", getObjectLabel(dataCenter, context) }),
		// new Object[] { dataCenter }));
		// }
		// return false;
		// }
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateDomain(Domain domain, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domain, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateDomainSystem(DomainSystem domainSystem,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domainSystem, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateFailoverType(FailoverType failoverType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(failoverType, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateHost(Host host, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(host, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateHostBlock(HostBlock hostBlock,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hostBlock, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateInterface(Interface interface_,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interface_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateIP(IP ip, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ip, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMuninInfo(MuninInfo muninInfo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(muninInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateIPName(IPName ipName, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ipName, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateRole(Role role, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(role, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateOpsSystem(OpsSystem opsSystem,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(opsSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateVServer(VServer vServer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vServer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateDWHCluster(DWHCluster dwhCluster,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(dwhCluster,
				diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(dwhCluster, diagnostics,
					context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(dwhCluster,
					diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(dwhCluster, diagnostics,
					context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(dwhCluster, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(dwhCluster, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(dwhCluster, diagnostics,
					context);
		}
		if (result || diagnostics != null) {
			result &= validateDWHCluster_Default(dwhCluster, diagnostics,
					context);
		}
		return result;
	}

	/**
	 * Validates the Default constraint of '<em>DWH Cluster</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateDWHCluster_Default(DWHCluster dwhCluster,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and
		// message
		// Ensure that you remove @generated or mark it @generated NOT
		// if (false) {
		// if (diagnostics != null) {
		// diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
		// DIAGNOSTIC_SOURCE, 0, EcorePlugin.INSTANCE.getString(
		// "_UI_GenericConstraint_diagnostic",
		// new Object[] { "Default",
		// getObjectLabel(dwhCluster, context) }),
		// new Object[] { dwhCluster }));
		// }
		// return false;
		// }
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateDWHInstance(DWHInstance dwhInstance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(dwhInstance,
				diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(dwhInstance, diagnostics,
					context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(dwhInstance,
					diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(dwhInstance, diagnostics,
					context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(dwhInstance, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(dwhInstance, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(dwhInstance, diagnostics,
					context);
		}
		if (result || diagnostics != null) {
			result &= validateDWHInstance_Default(dwhInstance, diagnostics,
					context);
		}
		return result;
	}

	/**
	 * Validates the Default constraint of '<em>DWH Instance</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateDWHInstance_Default(DWHInstance dwhInstance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and
		// message
		// Ensure that you remove @generated or mark it @generated NOT
		// if (false) {
		// if (diagnostics != null) {
		// diagnostics
		// .add(new BasicDiagnostic(Diagnostic.ERROR,
		// DIAGNOSTIC_SOURCE, 0,
		// EcorePlugin.INSTANCE.getString(
		// "_UI_GenericConstraint_diagnostic",
		// new Object[] {
		// "Default",
		// getObjectLabel(dwhInstance,
		// context) }),
		// new Object[] { dwhInstance }));
		// }
		// return false;
		// }
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateIpType(IpType ipType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

} // OpsValidator
