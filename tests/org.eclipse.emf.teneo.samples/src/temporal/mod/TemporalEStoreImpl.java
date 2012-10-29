package temporal.mod;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.InternalEObject.EStore;

/**
 * This class is a memory EStore. It is used to test temporality hooks. To turn on the temporality
 * hooks on setters and getters use the flags bellow.
 */
public class TemporalEStoreImpl implements EStore {

	private final EStore next;

	/**
	 * Specify if this TemporalEStoreImpl should be enabled or not.
	 */
	private boolean bypass = false;

	public static boolean trace = false;

	public boolean isBypass() {
		return bypass;
	}

	public void setBypass(boolean b) {
		bypass = b;
	}

	public EStore getNext() {
		return next;
	}

	public TemporalEStoreImpl(EStore nextStore) {
		next = nextStore;
	}

	public Object get(InternalEObject eObject, EStructuralFeature feature, int index) {
		if (isBypass() == false) {
			// Hook in temporality.
			// Try getting the value from a historical version.
			Object[] retValue = new Object[1];
			boolean handled = TemporalEStoreHandler.get(eObject, feature, index, retValue);
			// If it is a temporal request and we get a value back return it.
			if (handled) {
				if (trace) {
					System.out.println("Handled " + eObject + " feature " + feature.getName());
				}
				return retValue[0];
			}
		}
		return next.get(eObject, feature, index);
	}

	public Object set(InternalEObject eObject, EStructuralFeature feature, int index, Object value) {
		if (isBypass() == false) {
			// Hook in temporality
			Object[] retOldValue = new Object[1];
			boolean handled = TemporalEStoreHandler.set(eObject, feature, index, value, retOldValue);
			// If this was a temporal request and we set the value in a version
			// object return the previous value.
			if (handled) {
				return retOldValue[0];
			}
		}

		return next.set(eObject, feature, index, value);
	}

	public void add(InternalEObject eObject, EStructuralFeature feature, int index, Object value) {
		if (isBypass() == false) {
			boolean handled = TemporalEStoreHandler.add(eObject, feature, index, value);
			if (handled) {
				return;
			}
		}
		next.add(eObject, feature, index, value);
	}

	public Object remove(InternalEObject eObject, EStructuralFeature feature, int index) {
		if (isBypass() == false) {
			// Hook in temporality
			Object[] retOldValue = new Object[1];
			boolean handled = TemporalEStoreHandler.remove(eObject, feature, index, retOldValue);
			if (handled) {
				return retOldValue[0];
			}
		}
		return next.remove(eObject, feature, index);
	}

	public Object move(InternalEObject eObject, EStructuralFeature feature, int targetIndex,
			int sourceIndex) {
		if (isBypass() == false) {
			// Hook in temporality
			Object[] retValue = new Object[1];
			boolean handled = TemporalEStoreHandler.move(eObject, feature, targetIndex, sourceIndex,
					retValue);
			if (handled) {
				if (trace) {
					System.out.println("Handled " + eObject + " feature " + feature.getName());
				}
				return retValue[0];
			}
		}
		return next.move(eObject, feature, targetIndex, sourceIndex);
	}

	public void clear(InternalEObject eObject, EStructuralFeature feature) {
		if (isBypass() == false) {
			// Hook in temporality
			boolean handled = TemporalEStoreHandler.clear(eObject, feature);
			if (handled) {
				return;
			}
		}
		next.clear(eObject, feature);
	}

	public boolean isSet(InternalEObject eObject, EStructuralFeature feature) {
		return next.isSet(eObject, feature);
	}

	public void unset(InternalEObject eObject, EStructuralFeature feature) {
		next.unset(eObject, feature);
	}

	public int size(InternalEObject eObject, EStructuralFeature feature) {
		if (isBypass() == false) {
			// Hook in temporality
			int[] retValue = new int[1];
			boolean handled = TemporalEStoreHandler.size(eObject, feature, retValue);
			if (handled) {
				if (trace) {
					System.out.println("Handled " + eObject + " feature " + feature.getName());
				}
				return retValue[0];
			}
		}
		return next.size(eObject, feature);
	}

	public int indexOf(InternalEObject eObject, EStructuralFeature feature, Object value) {
		if (isBypass() == false) {
			// Hook in temporality
			int[] retValue = new int[1];
			boolean handled = TemporalEStoreHandler.indexOf(eObject, feature, value, retValue);
			if (handled) {
				if (trace) {
					System.out.println("Handled " + eObject + " feature " + feature.getName());
				}
				return retValue[0];
			}
		}
		return next.indexOf(eObject, feature, value);
	}

	public int lastIndexOf(InternalEObject eObject, EStructuralFeature feature, Object value) {
		if (isBypass() == false) {
			// Hook in temporality
			int[] retValue = new int[1];
			boolean handled = TemporalEStoreHandler.lastIndexOf(eObject, feature, value, retValue);
			if (handled) {
				if (trace) {
					System.out.println("Handled " + eObject + " feature " + feature.getName());
				}
				return retValue[0];
			}
		}
		return next.lastIndexOf(eObject, feature, value);
	}

	public Object[] toArray(InternalEObject eObject, EStructuralFeature feature) {
		if (isBypass() == false) {
			// Hook in temporality
			Object[][] retValue = new Object[1][];
			boolean handled = TemporalEStoreHandler.toArray(eObject, feature, retValue);
			if (handled) {
				if (trace) {
					System.out.println("Handled " + eObject + " feature " + feature.getName());
				}
				return retValue[0];
			}
		}
		return next.toArray(eObject, feature);
	}

	public Object[] toArray(InternalEObject eObject, EStructuralFeature feature, Object[] array) {
		if (isBypass() == false) {
			// Hook in temporality
			Object[][] retValue = new Object[1][];
			boolean handled = TemporalEStoreHandler.toArray(eObject, feature, array, retValue);
			if (handled) {
				if (trace) {
					System.out.println("Handled " + eObject + " feature " + feature.getName());
				}
				return retValue[0];
			}
		}
		return next.toArray(eObject, feature, array);
	}

	public boolean isEmpty(InternalEObject eObject, EStructuralFeature feature) {
		if (isBypass() == false) {
			// Hook in temporality
			boolean[] retValue = new boolean[1];
			boolean handled = TemporalEStoreHandler.isEmpty(eObject, feature, retValue);
			if (handled) {
				if (trace) {
					System.out.println("Handled " + eObject + " feature " + feature.getName());
				}
				return retValue[0];
			}
		}
		return next.isEmpty(eObject, feature);
	}

	public boolean contains(InternalEObject eObject, EStructuralFeature feature, Object value) {
		if (isBypass() == false) {
			// Hook in temporality
			boolean[] retValue = new boolean[1];
			boolean handled = TemporalEStoreHandler.contains(eObject, feature, value, retValue);
			if (handled) {
				if (trace) {
					System.out.println("Handled " + eObject + " feature " + feature.getName());
				}
				return retValue[0];
			}
		}
		return next.contains(eObject, feature, value);
	}

	public int hashCode(InternalEObject eObject, EStructuralFeature feature) {
		if (isBypass() == false) {
			// Hook in temporality
			int[] retValue = new int[1];
			boolean handled = TemporalEStoreHandler.hashCode(eObject, feature, retValue);
			if (handled) {
				if (trace) {
					System.out.println("Handled " + eObject + " feature " + feature.getName());
				}
				return retValue[0];
			}
		}
		return next.hashCode(eObject, feature);
	}

	public InternalEObject getContainer(InternalEObject eObject) {
		return next.getContainer(eObject);
	}

	public EStructuralFeature getContainingFeature(InternalEObject eObject) {
		return next.getContainingFeature(eObject);
	}

	public EObject create(EClass eClass) {
		return next.create(eClass);
	}
}
