package org.eclipse.gmf.examples.mindmap.diagram.view.factories;


import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.hibernate.mapping.property.EReferencePropertyHandler;
import org.eclipse.emf.teneo.hibernate.resource.HibernateResource;
import org.hibernate.HibernateException;
import org.hibernate.engine.SessionFactoryImplementor;

/**
 * Implements the getter for an EReference field. Normally uses the eget/eset
 * methods with bidirectional relations the handling is a bit different using
 * eInverseRemove and eInverseAdd. This class implements both the getter, setter
 * and propertyaccessor interfaces. When the getGetter and getSetter methods are
 * called it returns itself.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
@SuppressWarnings("unchecked")
public class OtherEReferencePropertyHandler extends EReferencePropertyHandler {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.Setter#set(java.lang.Object,
	 *      java.lang.Object, org.hibernate.engine.SessionFactoryImplementor)
	 */
	@Override
	public void set(Object target, Object value,
			SessionFactoryImplementor factory) throws HibernateException {
		final Object curValue = get(target);
		if (isBidirectional) {// these are handled a bit differently because
			// the opposite should not be set, this is
			// done by hb
			if (curValue != value) { // note that == works fine if the
				// curValue and value have been read in
				// the same
				// pm.
				if (value == null) { // remove
					final NotificationChain nots = ((InternalEObject) target)
							.eInverseRemove((InternalEObject) curValue,
									eReference.getFeatureID(), eReference
											.getEType().getInstanceClass(),
									null);
					if (nots != null) {
						nots.dispatch();
					}
				} else {
					final NotificationChain nots = ((InternalEObject) target)
							.eInverseAdd((InternalEObject) value, eReference
									.getFeatureID(), eReference.getEType()
									.getInstanceClass(), null);
					if (nots != null) {
						nots.dispatch();
					}
				}
			}
		} else {
			if (curValue == null && value == null) {
				return; // do nothing in this case
			}
			final EObject eobj = (EObject) target;
			eobj.eSet(eReference, value);
			Resource res = eobj.eResource();
			if (value != null && res instanceof HibernateResource
					&& ((EObject) value).eResource() == null) {
				final boolean loading = ((HibernateResource) res).isLoading();
				try {
					((HibernateResource) res).setIsLoading(true);
					((HibernateResource) res).addToContentOrAttach(
							(InternalEObject) value, false);
				} finally {
					((HibernateResource) res).setIsLoading(loading);
				}
			}
		}
	}
}