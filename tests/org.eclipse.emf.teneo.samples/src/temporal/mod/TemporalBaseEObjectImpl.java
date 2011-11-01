package temporal.mod;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.DynamicEStoreEObjectImpl;
import org.eclipse.emf.ecore.impl.EStoreEObjectImpl;

import temporal.Temporal;
import temporal.VersionHolder;


/**
 * This is the baseclass for all generated class.
 * It is used to hook in a TemporalEStoreImpl.
 * 
 * 
 * @author jcmcote
 *
 */
public class TemporalBaseEObjectImpl extends DynamicEStoreEObjectImpl { 

	public TemporalBaseEObjectImpl() {
		super(new TemporalEStoreImpl(new EStoreEObjectImpl.EStoreImpl()));
		eSetClass(eStaticClass());
		TemporalUtil.initTemporal(this);
	}

	public TemporalBaseEObjectImpl(EStore eStore) {
		super(eStore);
	}

	public TemporalBaseEObjectImpl(EClass eClass) {
		super(eClass, new TemporalEStoreImpl(new EStoreEObjectImpl.EStoreImpl()));
		TemporalUtil.initTemporal(this);
	}

	public TemporalBaseEObjectImpl(EClass eClass, EStore eStore) {
		super(eClass, eStore);
	}
	
	/**
	 * Overriden to prevent base class from caching the values returned from the EStore.
	 * We want to be able to control the retrieval of data through the getters.
	 */
	protected boolean eIsCaching(){
		return false;
	}

	/**
	 * JCC: added this to support versioning of containment features.
	 * To version the containment reference we need to hook into the setter for it.
	 * This method is overriden to give us access to the setting of the containment reference.
	 * What this method does is try to find a version to delegate this setter to. If a version
	 * is found it delegates the setter to it. If this is the version on which it should be
	 * performed it does not delegate (it passes the request to its base class).
	 */
	public NotificationChain eBasicSetContainer(InternalEObject newContainer, int newContainerFeatureID,
			NotificationChain msgs) {
		
		if (((TemporalEStoreImpl) this.eStore()).isBypass() == false) {
			InternalEObject version = TemporalEStoreHandler.findVersionToDelegateMutatorTo(this, null);
			if (version != null) {
				return version.eBasicSetContainer(newContainer, newContainerFeatureID, msgs);
			}
		}
		return super.eBasicSetContainer(newContainer, newContainerFeatureID, msgs);
	}

	/**
	 * JCC: added this to support versioning of containment features.
	 * To version the containment reference we need to hook into the getter for it.
	 * This method is overriden to give us access to the getter of the containment reference.
	 * What this method does is try to find a version to delegate this getter to. If a version
	 * is found it delegates the getter to it. If this is the version on which it should be
	 * performed it does not delegate (it passes the request to its base class).
	 */
	public InternalEObject eInternalContainer() {
		if (((TemporalEStoreImpl) this.eStore()).isBypass() == false) {
			InternalEObject version = TemporalEStoreHandler.findVersionToDelegateAccessorTo(this, null);
			if (version != null) {
				return version.eInternalContainer();
			}
		}
		return super.eInternalContainer();
	}
	
	/**
	 * JCC: added this to support versioning of containment features.
	 * Does it really need to be overrided?
	 */
	  @Override
	  public int eContainerFeatureID()
	  {
		if (((TemporalEStoreImpl) this.eStore()).isBypass() == false) {
			InternalEObject version = TemporalEStoreHandler.findVersionToDelegateAccessorTo(this, null);
			if (version != null) {
				return version.eContainerFeatureID();
			}
		}
	    int id = super.eContainerFeatureID();
	    return id;
	  }

}

