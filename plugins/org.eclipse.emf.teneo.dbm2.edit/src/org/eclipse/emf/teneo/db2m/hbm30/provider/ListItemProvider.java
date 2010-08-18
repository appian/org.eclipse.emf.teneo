/**
 * <copyright>
 * </copyright>
 *
 * $Id: ListItemProvider.java,v 1.1 2010/08/18 09:29:33 cbouhier Exp $
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

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.teneo.db2m.hbm30.List} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ListItemProvider
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
	public ListItemProvider(AdapterFactory adapterFactory) {
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
			addOuterJoinPropertyDescriptor(object);
			addPersisterPropertyDescriptor(object);
			addSchemaPropertyDescriptor(object);
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
				 getString("_UI_List_subselect_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_List_subselect_feature", "_UI_List_type"),
				 Hbm30Package.eINSTANCE.getList_Subselect(),
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
				 getString("_UI_List_comment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_List_comment_feature", "_UI_List_type"),
				 Hbm30Package.eINSTANCE.getList_Comment(),
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
				 getString("_UI_List_access_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_List_access_feature", "_UI_List_type"),
				 Hbm30Package.eINSTANCE.getList_Access(),
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
				 getString("_UI_List_batchSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_List_batchSize_feature", "_UI_List_type"),
				 Hbm30Package.eINSTANCE.getList_BatchSize(),
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
				 getString("_UI_List_cascade_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_List_cascade_feature", "_UI_List_type"),
				 Hbm30Package.eINSTANCE.getList_Cascade(),
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
				 getString("_UI_List_catalog_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_List_catalog_feature", "_UI_List_type"),
				 Hbm30Package.eINSTANCE.getList_Catalog(),
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
				 getString("_UI_List_check_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_List_check_feature", "_UI_List_type"),
				 Hbm30Package.eINSTANCE.getList_Check(),
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
				 getString("_UI_List_collectionType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_List_collectionType_feature", "_UI_List_type"),
				 Hbm30Package.eINSTANCE.getList_CollectionType(),
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
				 getString("_UI_List_embedXml_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_List_embedXml_feature", "_UI_List_type"),
				 Hbm30Package.eINSTANCE.getList_EmbedXml(),
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
				 getString("_UI_List_fetch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_List_fetch_feature", "_UI_List_type"),
				 Hbm30Package.eINSTANCE.getList_Fetch(),
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
				 getString("_UI_List_inverse_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_List_inverse_feature", "_UI_List_type"),
				 Hbm30Package.eINSTANCE.getList_Inverse(),
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
				 getString("_UI_List_lazy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_List_lazy_feature", "_UI_List_type"),
				 Hbm30Package.eINSTANCE.getList_Lazy(),
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
				 getString("_UI_List_mutable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_List_mutable_feature", "_UI_List_type"),
				 Hbm30Package.eINSTANCE.getList_Mutable(),
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
				 getString("_UI_List_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_List_name_feature", "_UI_List_type"),
				 Hbm30Package.eINSTANCE.getList_Name(),
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
				 getString("_UI_List_node_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_List_node_feature", "_UI_List_type"),
				 Hbm30Package.eINSTANCE.getList_Node(),
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
				 getString("_UI_List_optimisticLock_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_List_optimisticLock_feature", "_UI_List_type"),
				 Hbm30Package.eINSTANCE.getList_OptimisticLock(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_List_outerJoin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_List_outerJoin_feature", "_UI_List_type"),
				 Hbm30Package.eINSTANCE.getList_OuterJoin(),
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
				 getString("_UI_List_persister_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_List_persister_feature", "_UI_List_type"),
				 Hbm30Package.eINSTANCE.getList_Persister(),
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
				 getString("_UI_List_schema_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_List_schema_feature", "_UI_List_type"),
				 Hbm30Package.eINSTANCE.getList_Schema(),
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
				 getString("_UI_List_subselect1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_List_subselect1_feature", "_UI_List_type"),
				 Hbm30Package.eINSTANCE.getList_Subselect1(),
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
				 getString("_UI_List_table_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_List_table_feature", "_UI_List_type"),
				 Hbm30Package.eINSTANCE.getList_Table(),
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
				 getString("_UI_List_where_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_List_where_feature", "_UI_List_type"),
				 Hbm30Package.eINSTANCE.getList_Where(),
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
			childrenFeatures.add(Hbm30Package.eINSTANCE.getList_Meta());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getList_Cache());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getList_Synchronize());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getList_Key());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getList_Index());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getList_ListIndex());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getList_Element());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getList_OneToMany());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getList_ManyToMany());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getList_CompositeElement());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getList_ManyToAny());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getList_Loader());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getList_SqlInsert());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getList_SqlUpdate());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getList_SqlDelete());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getList_SqlDeleteAll());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getList_Filter());
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
	 * This returns List.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/List"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((org.eclipse.emf.teneo.db2m.hbm30.List)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_List_type") :
			getString("_UI_List_type") + " " + label;
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

		switch (notification.getFeatureID(org.eclipse.emf.teneo.db2m.hbm30.List.class)) {
			case Hbm30Package.LIST__SUBSELECT:
			case Hbm30Package.LIST__COMMENT:
			case Hbm30Package.LIST__ACCESS:
			case Hbm30Package.LIST__BATCH_SIZE:
			case Hbm30Package.LIST__CASCADE:
			case Hbm30Package.LIST__CATALOG:
			case Hbm30Package.LIST__CHECK:
			case Hbm30Package.LIST__COLLECTION_TYPE:
			case Hbm30Package.LIST__EMBED_XML:
			case Hbm30Package.LIST__FETCH:
			case Hbm30Package.LIST__INVERSE:
			case Hbm30Package.LIST__LAZY:
			case Hbm30Package.LIST__MUTABLE:
			case Hbm30Package.LIST__NAME:
			case Hbm30Package.LIST__NODE:
			case Hbm30Package.LIST__OPTIMISTIC_LOCK:
			case Hbm30Package.LIST__OUTER_JOIN:
			case Hbm30Package.LIST__PERSISTER:
			case Hbm30Package.LIST__SCHEMA:
			case Hbm30Package.LIST__SUBSELECT1:
			case Hbm30Package.LIST__TABLE:
			case Hbm30Package.LIST__WHERE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Hbm30Package.LIST__META:
			case Hbm30Package.LIST__CACHE:
			case Hbm30Package.LIST__SYNCHRONIZE:
			case Hbm30Package.LIST__KEY:
			case Hbm30Package.LIST__INDEX:
			case Hbm30Package.LIST__LIST_INDEX:
			case Hbm30Package.LIST__ELEMENT:
			case Hbm30Package.LIST__ONE_TO_MANY:
			case Hbm30Package.LIST__MANY_TO_MANY:
			case Hbm30Package.LIST__COMPOSITE_ELEMENT:
			case Hbm30Package.LIST__MANY_TO_ANY:
			case Hbm30Package.LIST__LOADER:
			case Hbm30Package.LIST__SQL_INSERT:
			case Hbm30Package.LIST__SQL_UPDATE:
			case Hbm30Package.LIST__SQL_DELETE:
			case Hbm30Package.LIST__SQL_DELETE_ALL:
			case Hbm30Package.LIST__FILTER:
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
				(Hbm30Package.eINSTANCE.getList_Meta(),
				 Hbm30Factory.eINSTANCE.createMeta()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getList_Cache(),
				 Hbm30Factory.eINSTANCE.createCache()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getList_Synchronize(),
				 Hbm30Factory.eINSTANCE.createSynchronize()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getList_Key(),
				 Hbm30Factory.eINSTANCE.createKey()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getList_Index(),
				 Hbm30Factory.eINSTANCE.createIndex()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getList_ListIndex(),
				 Hbm30Factory.eINSTANCE.createListIndex()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getList_Element(),
				 Hbm30Factory.eINSTANCE.createElement()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getList_OneToMany(),
				 Hbm30Factory.eINSTANCE.createOneToMany()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getList_ManyToMany(),
				 Hbm30Factory.eINSTANCE.createManyToMany()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getList_CompositeElement(),
				 Hbm30Factory.eINSTANCE.createCompositeElement()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getList_ManyToAny(),
				 Hbm30Factory.eINSTANCE.createManyToAny()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getList_Loader(),
				 Hbm30Factory.eINSTANCE.createLoader()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getList_SqlInsert(),
				 Hbm30Factory.eINSTANCE.createSqlInsert()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getList_SqlUpdate(),
				 Hbm30Factory.eINSTANCE.createSqlUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getList_SqlDelete(),
				 Hbm30Factory.eINSTANCE.createSqlDelete()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getList_SqlDeleteAll(),
				 Hbm30Factory.eINSTANCE.createSqlDeleteAll()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getList_Filter(),
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
