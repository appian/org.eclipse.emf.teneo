/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClassItemProvider.java,v 1.1 2010/08/18 09:29:33 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMapUtil;

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
 * This is the item provider adapter for a {@link org.eclipse.emf.teneo.db2m.hbm30.Class} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassItemProvider
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
	public ClassItemProvider(AdapterFactory adapterFactory) {
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
			addAbstractPropertyDescriptor(object);
			addBatchSizePropertyDescriptor(object);
			addCatalogPropertyDescriptor(object);
			addCheckPropertyDescriptor(object);
			addDiscriminatorValuePropertyDescriptor(object);
			addDynamicInsertPropertyDescriptor(object);
			addDynamicUpdatePropertyDescriptor(object);
			addEntityNamePropertyDescriptor(object);
			addLazyPropertyDescriptor(object);
			addMutablePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addNodePropertyDescriptor(object);
			addOptimisticLockPropertyDescriptor(object);
			addPersisterPropertyDescriptor(object);
			addPolymorphismPropertyDescriptor(object);
			addProxyPropertyDescriptor(object);
			addRowidPropertyDescriptor(object);
			addSchemaPropertyDescriptor(object);
			addSelectBeforeUpdatePropertyDescriptor(object);
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
				 getString("_UI_Class_subselect_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_subselect_feature", "_UI_Class_type"),
				 Hbm30Package.eINSTANCE.getClass_Subselect(),
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
				 getString("_UI_Class_comment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_comment_feature", "_UI_Class_type"),
				 Hbm30Package.eINSTANCE.getClass_Comment(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Abstract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbstractPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_abstract_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_abstract_feature", "_UI_Class_type"),
				 Hbm30Package.eINSTANCE.getClass_Abstract(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_Class_batchSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_batchSize_feature", "_UI_Class_type"),
				 Hbm30Package.eINSTANCE.getClass_BatchSize(),
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
				 getString("_UI_Class_catalog_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_catalog_feature", "_UI_Class_type"),
				 Hbm30Package.eINSTANCE.getClass_Catalog(),
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
				 getString("_UI_Class_check_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_check_feature", "_UI_Class_type"),
				 Hbm30Package.eINSTANCE.getClass_Check(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Discriminator Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiscriminatorValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_discriminatorValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_discriminatorValue_feature", "_UI_Class_type"),
				 Hbm30Package.eINSTANCE.getClass_DiscriminatorValue(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dynamic Insert feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDynamicInsertPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_dynamicInsert_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_dynamicInsert_feature", "_UI_Class_type"),
				 Hbm30Package.eINSTANCE.getClass_DynamicInsert(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dynamic Update feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDynamicUpdatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_dynamicUpdate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_dynamicUpdate_feature", "_UI_Class_type"),
				 Hbm30Package.eINSTANCE.getClass_DynamicUpdate(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Entity Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEntityNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_entityName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_entityName_feature", "_UI_Class_type"),
				 Hbm30Package.eINSTANCE.getClass_EntityName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_Class_lazy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_lazy_feature", "_UI_Class_type"),
				 Hbm30Package.eINSTANCE.getClass_Lazy(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_Class_mutable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_mutable_feature", "_UI_Class_type"),
				 Hbm30Package.eINSTANCE.getClass_Mutable(),
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
				 getString("_UI_Class_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_name_feature", "_UI_Class_type"),
				 Hbm30Package.eINSTANCE.getClass_Name(),
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
				 getString("_UI_Class_node_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_node_feature", "_UI_Class_type"),
				 Hbm30Package.eINSTANCE.getClass_Node(),
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
				 getString("_UI_Class_optimisticLock_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_optimisticLock_feature", "_UI_Class_type"),
				 Hbm30Package.eINSTANCE.getClass_OptimisticLock(),
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
				 getString("_UI_Class_persister_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_persister_feature", "_UI_Class_type"),
				 Hbm30Package.eINSTANCE.getClass_Persister(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Polymorphism feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPolymorphismPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_polymorphism_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_polymorphism_feature", "_UI_Class_type"),
				 Hbm30Package.eINSTANCE.getClass_Polymorphism(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Proxy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProxyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_proxy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_proxy_feature", "_UI_Class_type"),
				 Hbm30Package.eINSTANCE.getClass_Proxy(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rowid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRowidPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_rowid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_rowid_feature", "_UI_Class_type"),
				 Hbm30Package.eINSTANCE.getClass_Rowid(),
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
				 getString("_UI_Class_schema_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_schema_feature", "_UI_Class_type"),
				 Hbm30Package.eINSTANCE.getClass_Schema(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Select Before Update feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectBeforeUpdatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_selectBeforeUpdate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_selectBeforeUpdate_feature", "_UI_Class_type"),
				 Hbm30Package.eINSTANCE.getClass_SelectBeforeUpdate(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_Class_subselect1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_subselect1_feature", "_UI_Class_type"),
				 Hbm30Package.eINSTANCE.getClass_Subselect1(),
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
				 getString("_UI_Class_table_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_table_feature", "_UI_Class_type"),
				 Hbm30Package.eINSTANCE.getClass_Table(),
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
				 getString("_UI_Class_where_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_where_feature", "_UI_Class_type"),
				 Hbm30Package.eINSTANCE.getClass_Where(),
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
			childrenFeatures.add(Hbm30Package.eINSTANCE.getClass_Meta());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getClass_Cache());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getClass_Synchronize());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getClass_Tuplizer());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getClass_Id());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getClass_CompositeId());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getClass_Discriminator());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getClass_NaturalId());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getClass_Version());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getClass_Timestamp());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getClass_Group());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getClass_Join());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getClass_Subclass());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getClass_JoinedSubclass());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getClass_UnionSubclass());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getClass_Loader());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getClass_SqlInsert());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getClass_SqlUpdate());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getClass_SqlDelete());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getClass_Filter());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getClass_Resultset());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getClass_Group1());
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
	 * This returns Class.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Class"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((org.eclipse.emf.teneo.db2m.hbm30.Class)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Class_type") :
			getString("_UI_Class_type") + " " + label;
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

		switch (notification.getFeatureID(org.eclipse.emf.teneo.db2m.hbm30.Class.class)) {
			case Hbm30Package.CLASS__SUBSELECT:
			case Hbm30Package.CLASS__COMMENT:
			case Hbm30Package.CLASS__ABSTRACT:
			case Hbm30Package.CLASS__BATCH_SIZE:
			case Hbm30Package.CLASS__CATALOG:
			case Hbm30Package.CLASS__CHECK:
			case Hbm30Package.CLASS__DISCRIMINATOR_VALUE:
			case Hbm30Package.CLASS__DYNAMIC_INSERT:
			case Hbm30Package.CLASS__DYNAMIC_UPDATE:
			case Hbm30Package.CLASS__ENTITY_NAME:
			case Hbm30Package.CLASS__LAZY:
			case Hbm30Package.CLASS__MUTABLE:
			case Hbm30Package.CLASS__NAME:
			case Hbm30Package.CLASS__NODE:
			case Hbm30Package.CLASS__OPTIMISTIC_LOCK:
			case Hbm30Package.CLASS__PERSISTER:
			case Hbm30Package.CLASS__POLYMORPHISM:
			case Hbm30Package.CLASS__PROXY:
			case Hbm30Package.CLASS__ROWID:
			case Hbm30Package.CLASS__SCHEMA:
			case Hbm30Package.CLASS__SELECT_BEFORE_UPDATE:
			case Hbm30Package.CLASS__SUBSELECT1:
			case Hbm30Package.CLASS__TABLE:
			case Hbm30Package.CLASS__WHERE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Hbm30Package.CLASS__META:
			case Hbm30Package.CLASS__CACHE:
			case Hbm30Package.CLASS__SYNCHRONIZE:
			case Hbm30Package.CLASS__TUPLIZER:
			case Hbm30Package.CLASS__ID:
			case Hbm30Package.CLASS__COMPOSITE_ID:
			case Hbm30Package.CLASS__DISCRIMINATOR:
			case Hbm30Package.CLASS__NATURAL_ID:
			case Hbm30Package.CLASS__VERSION:
			case Hbm30Package.CLASS__TIMESTAMP:
			case Hbm30Package.CLASS__GROUP:
			case Hbm30Package.CLASS__JOIN:
			case Hbm30Package.CLASS__SUBCLASS:
			case Hbm30Package.CLASS__JOINED_SUBCLASS:
			case Hbm30Package.CLASS__UNION_SUBCLASS:
			case Hbm30Package.CLASS__LOADER:
			case Hbm30Package.CLASS__SQL_INSERT:
			case Hbm30Package.CLASS__SQL_UPDATE:
			case Hbm30Package.CLASS__SQL_DELETE:
			case Hbm30Package.CLASS__FILTER:
			case Hbm30Package.CLASS__RESULTSET:
			case Hbm30Package.CLASS__GROUP1:
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
				(Hbm30Package.eINSTANCE.getClass_Meta(),
				 Hbm30Factory.eINSTANCE.createMeta()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getClass_Cache(),
				 Hbm30Factory.eINSTANCE.createCache()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getClass_Synchronize(),
				 Hbm30Factory.eINSTANCE.createSynchronize()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getClass_Tuplizer(),
				 Hbm30Factory.eINSTANCE.createTuplizer()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getClass_Id(),
				 Hbm30Factory.eINSTANCE.createId()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getClass_CompositeId(),
				 Hbm30Factory.eINSTANCE.createCompositeId()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getClass_Discriminator(),
				 Hbm30Factory.eINSTANCE.createDiscriminator()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getClass_NaturalId(),
				 Hbm30Factory.eINSTANCE.createNaturalId()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getClass_Version(),
				 Hbm30Factory.eINSTANCE.createVersion()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getClass_Timestamp(),
				 Hbm30Factory.eINSTANCE.createTimestamp()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getClass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getClass_Property(),
					 Hbm30Factory.eINSTANCE.createProperty())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getClass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getClass_ManyToOne(),
					 Hbm30Factory.eINSTANCE.createManyToOne())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getClass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getClass_OneToOne(),
					 Hbm30Factory.eINSTANCE.createOneToOne())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getClass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getClass_Component(),
					 Hbm30Factory.eINSTANCE.createComponent())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getClass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getClass_DynamicComponent(),
					 Hbm30Factory.eINSTANCE.createDynamicComponent())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getClass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getClass_Properties(),
					 Hbm30Factory.eINSTANCE.createProperties())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getClass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getClass_Any(),
					 Hbm30Factory.eINSTANCE.createAny())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getClass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getClass_Map(),
					 Hbm30Factory.eINSTANCE.createMap())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getClass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getClass_Set(),
					 Hbm30Factory.eINSTANCE.createSet())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getClass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getClass_List(),
					 Hbm30Factory.eINSTANCE.createList())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getClass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getClass_Bag(),
					 Hbm30Factory.eINSTANCE.createBag())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getClass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getClass_Idbag(),
					 Hbm30Factory.eINSTANCE.createIdbag())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getClass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getClass_Array(),
					 Hbm30Factory.eINSTANCE.createArray())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getClass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getClass_PrimitiveArray(),
					 Hbm30Factory.eINSTANCE.createPrimitiveArray())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getClass_Join(),
				 Hbm30Factory.eINSTANCE.createJoin()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getClass_Subclass(),
				 Hbm30Factory.eINSTANCE.createSubclass()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getClass_JoinedSubclass(),
				 Hbm30Factory.eINSTANCE.createJoinedSubclass()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getClass_UnionSubclass(),
				 Hbm30Factory.eINSTANCE.createUnionSubclass()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getClass_Loader(),
				 Hbm30Factory.eINSTANCE.createLoader()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getClass_SqlInsert(),
				 Hbm30Factory.eINSTANCE.createSqlInsert()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getClass_SqlUpdate(),
				 Hbm30Factory.eINSTANCE.createSqlUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getClass_SqlDelete(),
				 Hbm30Factory.eINSTANCE.createSqlDelete()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getClass_Filter(),
				 Hbm30Factory.eINSTANCE.createFilter()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getClass_Resultset(),
				 Hbm30Factory.eINSTANCE.createResultset()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getClass_Group1(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getClass_Query(),
					 Hbm30Factory.eINSTANCE.createQuery())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getClass_Group1(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getClass_SqlQuery(),
					 Hbm30Factory.eINSTANCE.createSqlQuery())));
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
