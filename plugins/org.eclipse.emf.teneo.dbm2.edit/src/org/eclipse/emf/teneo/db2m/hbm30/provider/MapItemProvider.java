/**
 * <copyright>
 * </copyright>
 *
 * $Id: MapItemProvider.java,v 1.1 2010/08/18 09:29:33 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Factory;
import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;
import org.eclipse.emf.teneo.db2m.hbm30.Map;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.teneo.db2m.hbm30.Map} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MapItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addSubselectPropertyDescriptor(object);
			addCommentPropertyDescriptor(object);
			addAccessPropertyDescriptor(object);
			addBatchSizePropertyDescriptor(object);
			addCascadePropertyDescriptor(object);
			addCatalogPropertyDescriptor(object);
			addCheckPropertyDescriptor(object);
			addCollectionTypePropertyDescriptor(object);
			addEmbedXmlPropertyDescriptor(object);
			addFetchPropertyDescriptor(object);
			addInversePropertyDescriptor(object);
			addLazyPropertyDescriptor(object);
			addMutablePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addNodePropertyDescriptor(object);
			addOptimisticLockPropertyDescriptor(object);
			addOrderByPropertyDescriptor(object);
			addOuterJoinPropertyDescriptor(object);
			addPersisterPropertyDescriptor(object);
			addSchemaPropertyDescriptor(object);
			addSortPropertyDescriptor(object);
			addSubselect1PropertyDescriptor(object);
			addTablePropertyDescriptor(object);
			addWherePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Subselect feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubselectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Map_subselect_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Map_subselect_feature", "_UI_Map_type"),
				 Hbm30Package.eINSTANCE.getMap_Subselect(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Map_comment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Map_comment_feature", "_UI_Map_type"),
				 Hbm30Package.eINSTANCE.getMap_Comment(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Access feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Map_access_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Map_access_feature", "_UI_Map_type"),
				 Hbm30Package.eINSTANCE.getMap_Access(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Batch Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBatchSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Map_batchSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Map_batchSize_feature", "_UI_Map_type"),
				 Hbm30Package.eINSTANCE.getMap_BatchSize(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cascade feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCascadePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Map_cascade_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Map_cascade_feature", "_UI_Map_type"),
				 Hbm30Package.eINSTANCE.getMap_Cascade(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Catalog feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCatalogPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Map_catalog_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Map_catalog_feature", "_UI_Map_type"),
				 Hbm30Package.eINSTANCE.getMap_Catalog(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Check feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCheckPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Map_check_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Map_check_feature", "_UI_Map_type"),
				 Hbm30Package.eINSTANCE.getMap_Check(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Collection Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCollectionTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Map_collectionType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Map_collectionType_feature", "_UI_Map_type"),
				 Hbm30Package.eINSTANCE.getMap_CollectionType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Embed Xml feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmbedXmlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Map_embedXml_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Map_embedXml_feature", "_UI_Map_type"),
				 Hbm30Package.eINSTANCE.getMap_EmbedXml(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fetch feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFetchPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Map_fetch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Map_fetch_feature", "_UI_Map_type"),
				 Hbm30Package.eINSTANCE.getMap_Fetch(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inverse feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInversePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Map_inverse_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Map_inverse_feature", "_UI_Map_type"),
				 Hbm30Package.eINSTANCE.getMap_Inverse(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lazy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLazyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Map_lazy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Map_lazy_feature", "_UI_Map_type"),
				 Hbm30Package.eINSTANCE.getMap_Lazy(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mutable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMutablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Map_mutable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Map_mutable_feature", "_UI_Map_type"),
				 Hbm30Package.eINSTANCE.getMap_Mutable(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Map_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Map_name_feature", "_UI_Map_type"),
				 Hbm30Package.eINSTANCE.getMap_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Map_node_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Map_node_feature", "_UI_Map_type"),
				 Hbm30Package.eINSTANCE.getMap_Node(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Optimistic Lock feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOptimisticLockPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Map_optimisticLock_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Map_optimisticLock_feature", "_UI_Map_type"),
				 Hbm30Package.eINSTANCE.getMap_OptimisticLock(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Order By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrderByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Map_orderBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Map_orderBy_feature", "_UI_Map_type"),
				 Hbm30Package.eINSTANCE.getMap_OrderBy(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Outer Join feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOuterJoinPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Map_outerJoin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Map_outerJoin_feature", "_UI_Map_type"),
				 Hbm30Package.eINSTANCE.getMap_OuterJoin(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Persister feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPersisterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Map_persister_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Map_persister_feature", "_UI_Map_type"),
				 Hbm30Package.eINSTANCE.getMap_Persister(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Schema feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSchemaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Map_schema_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Map_schema_feature", "_UI_Map_type"),
				 Hbm30Package.eINSTANCE.getMap_Schema(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sort feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Map_sort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Map_sort_feature", "_UI_Map_type"),
				 Hbm30Package.eINSTANCE.getMap_Sort(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subselect1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubselect1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Map_subselect1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Map_subselect1_feature", "_UI_Map_type"),
				 Hbm30Package.eINSTANCE.getMap_Subselect1(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Table feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Map_table_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Map_table_feature", "_UI_Map_type"),
				 Hbm30Package.eINSTANCE.getMap_Table(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Where feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWherePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Map_where_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Map_where_feature", "_UI_Map_type"),
				 Hbm30Package.eINSTANCE.getMap_Where(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Hbm30Package.eINSTANCE.getMap_Meta());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getMap_Cache());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getMap_Synchronize());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getMap_Key());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getMap_MapKey());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getMap_CompositeMapKey());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getMap_MapKeyManyToMany());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getMap_Index());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getMap_CompositeIndex());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getMap_IndexManyToMany());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getMap_IndexManyToAny());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getMap_Element());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getMap_OneToMany());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getMap_ManyToMany());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getMap_CompositeElement());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getMap_ManyToAny());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getMap_Loader());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getMap_SqlInsert());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getMap_SqlUpdate());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getMap_SqlDelete());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getMap_SqlDeleteAll());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getMap_Filter());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Map.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Map"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Map)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Map_type") :
			getString("_UI_Map_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Map.class)) {
			case Hbm30Package.MAP__SUBSELECT:
			case Hbm30Package.MAP__COMMENT:
			case Hbm30Package.MAP__ACCESS:
			case Hbm30Package.MAP__BATCH_SIZE:
			case Hbm30Package.MAP__CASCADE:
			case Hbm30Package.MAP__CATALOG:
			case Hbm30Package.MAP__CHECK:
			case Hbm30Package.MAP__COLLECTION_TYPE:
			case Hbm30Package.MAP__EMBED_XML:
			case Hbm30Package.MAP__FETCH:
			case Hbm30Package.MAP__INVERSE:
			case Hbm30Package.MAP__LAZY:
			case Hbm30Package.MAP__MUTABLE:
			case Hbm30Package.MAP__NAME:
			case Hbm30Package.MAP__NODE:
			case Hbm30Package.MAP__OPTIMISTIC_LOCK:
			case Hbm30Package.MAP__ORDER_BY:
			case Hbm30Package.MAP__OUTER_JOIN:
			case Hbm30Package.MAP__PERSISTER:
			case Hbm30Package.MAP__SCHEMA:
			case Hbm30Package.MAP__SORT:
			case Hbm30Package.MAP__SUBSELECT1:
			case Hbm30Package.MAP__TABLE:
			case Hbm30Package.MAP__WHERE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Hbm30Package.MAP__META:
			case Hbm30Package.MAP__CACHE:
			case Hbm30Package.MAP__SYNCHRONIZE:
			case Hbm30Package.MAP__KEY:
			case Hbm30Package.MAP__MAP_KEY:
			case Hbm30Package.MAP__COMPOSITE_MAP_KEY:
			case Hbm30Package.MAP__MAP_KEY_MANY_TO_MANY:
			case Hbm30Package.MAP__INDEX:
			case Hbm30Package.MAP__COMPOSITE_INDEX:
			case Hbm30Package.MAP__INDEX_MANY_TO_MANY:
			case Hbm30Package.MAP__INDEX_MANY_TO_ANY:
			case Hbm30Package.MAP__ELEMENT:
			case Hbm30Package.MAP__ONE_TO_MANY:
			case Hbm30Package.MAP__MANY_TO_MANY:
			case Hbm30Package.MAP__COMPOSITE_ELEMENT:
			case Hbm30Package.MAP__MANY_TO_ANY:
			case Hbm30Package.MAP__LOADER:
			case Hbm30Package.MAP__SQL_INSERT:
			case Hbm30Package.MAP__SQL_UPDATE:
			case Hbm30Package.MAP__SQL_DELETE:
			case Hbm30Package.MAP__SQL_DELETE_ALL:
			case Hbm30Package.MAP__FILTER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getMap_Meta(),
				 Hbm30Factory.eINSTANCE.createMeta()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getMap_Cache(),
				 Hbm30Factory.eINSTANCE.createCache()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getMap_Synchronize(),
				 Hbm30Factory.eINSTANCE.createSynchronize()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getMap_Key(),
				 Hbm30Factory.eINSTANCE.createKey()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getMap_MapKey(),
				 Hbm30Factory.eINSTANCE.createMapKey()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getMap_CompositeMapKey(),
				 Hbm30Factory.eINSTANCE.createCompositeMapKey()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getMap_MapKeyManyToMany(),
				 Hbm30Factory.eINSTANCE.createMapKeyManyToMany()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getMap_Index(),
				 Hbm30Factory.eINSTANCE.createIndex()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getMap_CompositeIndex(),
				 Hbm30Factory.eINSTANCE.createCompositeIndex()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getMap_IndexManyToMany(),
				 Hbm30Factory.eINSTANCE.createIndexManyToMany()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getMap_IndexManyToAny(),
				 Hbm30Factory.eINSTANCE.createIndexManyToAny()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getMap_Element(),
				 Hbm30Factory.eINSTANCE.createElement()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getMap_OneToMany(),
				 Hbm30Factory.eINSTANCE.createOneToMany()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getMap_ManyToMany(),
				 Hbm30Factory.eINSTANCE.createManyToMany()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getMap_CompositeElement(),
				 Hbm30Factory.eINSTANCE.createCompositeElement()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getMap_ManyToAny(),
				 Hbm30Factory.eINSTANCE.createManyToAny()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getMap_Loader(),
				 Hbm30Factory.eINSTANCE.createLoader()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getMap_SqlInsert(),
				 Hbm30Factory.eINSTANCE.createSqlInsert()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getMap_SqlUpdate(),
				 Hbm30Factory.eINSTANCE.createSqlUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getMap_SqlDelete(),
				 Hbm30Factory.eINSTANCE.createSqlDelete()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getMap_SqlDeleteAll(),
				 Hbm30Factory.eINSTANCE.createSqlDeleteAll()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getMap_Filter(),
				 Hbm30Factory.eINSTANCE.createFilter()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Hbm30EditPlugin.INSTANCE;
	}

}
