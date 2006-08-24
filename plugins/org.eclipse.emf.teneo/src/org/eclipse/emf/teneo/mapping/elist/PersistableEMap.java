package org.eclipse.emf.teneo.mapping.elist;

import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreEMap;

public class PersistableEMap extends EcoreEMap {

        private Map delegateMap;
        private boolean initializing;

        public PersistableEMap(EClass entryEClass, Class entryClass,
                        InternalEObject owner, int featureID, Map delegateMap) {
                super(entryEClass, entryClass, owner, featureID);
                this.delegateMap = delegateMap;
                this.initializing = true;
                try {
                        this.set(delegateMap);
                } finally {
                        this.initializing = false;
                }
        }

        protected void didAdd(Entry entry) {
                if (initializing) {
                        return;
                }
                delegateMap.put(entry.getKey(), entry.getValue());
                super.didAdd(entry);
        }

        protected void didClear(BasicEList[] oldEntryData) {
                if (initializing) {
                        return;
                }
                delegateMap.clear();
                super.didClear(oldEntryData);
        }

        protected void didModify(Entry entry, Object oldValue) {
                if (initializing) {
                        return;
                }
                delegateMap.put(entry.getKey(), entry.getValue());
                super.didModify(entry, oldValue);
        }

        protected void didRemove(Entry entry) {
                if (initializing) {
                        return;
                }
                delegateMap.remove(entry.getKey());
                super.didRemove(entry);
        }

        public Map getPersistableMap() {
                return this.delegateMap;
        }

}
