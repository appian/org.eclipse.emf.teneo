package org.eclipse.emf.teneo.hibernate.mapping.internal;


import org.eclipse.emf.ecore.InternalEObject;

/**
 * This interface ensures that the cglib proxyfactory does not encounter a security exception
 * because the EMF InternalEObject is signed with a different signature.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public interface TeneoInternalEObject extends InternalEObject {
}