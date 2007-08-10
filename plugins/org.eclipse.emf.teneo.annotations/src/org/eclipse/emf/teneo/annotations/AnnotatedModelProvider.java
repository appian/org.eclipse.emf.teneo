package org.eclipse.emf.teneo.annotations;

import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;

/**
 * Interface for class which holds and provides a PAnnotatedModel.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public interface AnnotatedModelProvider {

	/** @return the PAnnotatedModel */
	PAnnotatedModel getAnnotatedModel();
}
