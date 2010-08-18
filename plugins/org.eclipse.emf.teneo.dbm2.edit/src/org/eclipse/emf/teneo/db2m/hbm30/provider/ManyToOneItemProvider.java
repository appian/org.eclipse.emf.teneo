/**
 * <copyright>
 * </copyright>
 *
 * $Id: ManyToOneItemProvider.java,v 1.1 2010/08/18 09:29:33 cbouhier Exp $
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
import org.eclipse.emf.teneo.db2m.hbm30.ManyToOne;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ManyToOneItemProvider
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
	public ManyToOneItemProvider(AdapterFactory adapterFactory) {
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

			addFormulaPropertyDescriptor(object);
			addAccessPropertyDescriptor(object);
			addCascadePropertyDescriptor(object);
			addClassPropertyDescriptor(object);
			addColumn1PropertyDescriptor(object);
			addEmbedXmlPropertyDescriptor(object);
			addEntityNamePropertyDescriptor(object);
			addFetchPropertyDescriptor(object);
			addForeignKeyPropertyDescriptor(object);
			addFormula1PropertyDescriptor(object);
			addIndexPropertyDescriptor(object);
			addInsertPropertyDescriptor(object);
			addLazyPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addNodePropertyDescriptor(object);
			addNotFoundPropertyDescriptor(object);
			addNotNullPropertyDescriptor(object);
			addOptimisticLockPropertyDescriptor(object);
			addOuterJoinPropertyDescriptor(object);
			addPropertyRefPropertyDescriptor(object);
			addUniquePropertyDescriptor(object);
			addUniqueKeyPropertyDescriptor(object);
			addUpdatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Formula feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormulaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManyToOne_formula_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManyToOne_formula_feature", "_UI_ManyToOne_type"),
				 Hbm30Package.eINSTANCE.getManyToOne_Formula(),
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
				 getString("_UI_ManyToOne_access_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManyToOne_access_feature", "_UI_ManyToOne_type"),
				 Hbm30Package.eINSTANCE.getManyToOne_Access(),
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
				 getString("_UI_ManyToOne_cascade_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManyToOne_cascade_feature", "_UI_ManyToOne_type"),
				 Hbm30Package.eINSTANCE.getManyToOne_Cascade(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManyToOne_class_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManyToOne_class_feature", "_UI_ManyToOne_type"),
				 Hbm30Package.eINSTANCE.getManyToOne_Class(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Column1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColumn1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManyToOne_column1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManyToOne_column1_feature", "_UI_ManyToOne_type"),
				 Hbm30Package.eINSTANCE.getManyToOne_Column1(),
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
				 getString("_UI_ManyToOne_embedXml_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManyToOne_embedXml_feature", "_UI_ManyToOne_type"),
				 Hbm30Package.eINSTANCE.getManyToOne_EmbedXml(),
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
				 getString("_UI_ManyToOne_entityName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManyToOne_entityName_feature", "_UI_ManyToOne_type"),
				 Hbm30Package.eINSTANCE.getManyToOne_EntityName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_ManyToOne_fetch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManyToOne_fetch_feature", "_UI_ManyToOne_type"),
				 Hbm30Package.eINSTANCE.getManyToOne_Fetch(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Foreign Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForeignKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManyToOne_foreignKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManyToOne_foreignKey_feature", "_UI_ManyToOne_type"),
				 Hbm30Package.eINSTANCE.getManyToOne_ForeignKey(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Formula1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormula1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManyToOne_formula1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManyToOne_formula1_feature", "_UI_ManyToOne_type"),
				 Hbm30Package.eINSTANCE.getManyToOne_Formula1(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Index feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIndexPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManyToOne_index_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManyToOne_index_feature", "_UI_ManyToOne_type"),
				 Hbm30Package.eINSTANCE.getManyToOne_Index(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Insert feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInsertPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManyToOne_insert_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManyToOne_insert_feature", "_UI_ManyToOne_type"),
				 Hbm30Package.eINSTANCE.getManyToOne_Insert(),
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
				 getString("_UI_ManyToOne_lazy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManyToOne_lazy_feature", "_UI_ManyToOne_type"),
				 Hbm30Package.eINSTANCE.getManyToOne_Lazy(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_ManyToOne_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManyToOne_name_feature", "_UI_ManyToOne_type"),
				 Hbm30Package.eINSTANCE.getManyToOne_Name(),
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
				 getString("_UI_ManyToOne_node_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManyToOne_node_feature", "_UI_ManyToOne_type"),
				 Hbm30Package.eINSTANCE.getManyToOne_Node(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Not Found feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNotFoundPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManyToOne_notFound_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManyToOne_notFound_feature", "_UI_ManyToOne_type"),
				 Hbm30Package.eINSTANCE.getManyToOne_NotFound(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Not Null feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNotNullPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManyToOne_notNull_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManyToOne_notNull_feature", "_UI_ManyToOne_type"),
				 Hbm30Package.eINSTANCE.getManyToOne_NotNull(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_ManyToOne_optimisticLock_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManyToOne_optimisticLock_feature", "_UI_ManyToOne_type"),
				 Hbm30Package.eINSTANCE.getManyToOne_OptimisticLock(),
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
				 getString("_UI_ManyToOne_outerJoin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManyToOne_outerJoin_feature", "_UI_ManyToOne_type"),
				 Hbm30Package.eINSTANCE.getManyToOne_OuterJoin(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Property Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertyRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManyToOne_propertyRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManyToOne_propertyRef_feature", "_UI_ManyToOne_type"),
				 Hbm30Package.eINSTANCE.getManyToOne_PropertyRef(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Unique feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUniquePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManyToOne_unique_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManyToOne_unique_feature", "_UI_ManyToOne_type"),
				 Hbm30Package.eINSTANCE.getManyToOne_Unique(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Unique Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUniqueKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManyToOne_uniqueKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManyToOne_uniqueKey_feature", "_UI_ManyToOne_type"),
				 Hbm30Package.eINSTANCE.getManyToOne_UniqueKey(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Update feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpdatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManyToOne_update_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManyToOne_update_feature", "_UI_ManyToOne_type"),
				 Hbm30Package.eINSTANCE.getManyToOne_Update(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(Hbm30Package.eINSTANCE.getManyToOne_Meta());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getManyToOne_Group());
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
	 * This returns ManyToOne.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ManyToOne"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ManyToOne)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ManyToOne_type") :
			getString("_UI_ManyToOne_type") + " " + label;
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

		switch (notification.getFeatureID(ManyToOne.class)) {
			case Hbm30Package.MANY_TO_ONE__FORMULA:
			case Hbm30Package.MANY_TO_ONE__ACCESS:
			case Hbm30Package.MANY_TO_ONE__CASCADE:
			case Hbm30Package.MANY_TO_ONE__CLASS:
			case Hbm30Package.MANY_TO_ONE__COLUMN1:
			case Hbm30Package.MANY_TO_ONE__EMBED_XML:
			case Hbm30Package.MANY_TO_ONE__ENTITY_NAME:
			case Hbm30Package.MANY_TO_ONE__FETCH:
			case Hbm30Package.MANY_TO_ONE__FOREIGN_KEY:
			case Hbm30Package.MANY_TO_ONE__FORMULA1:
			case Hbm30Package.MANY_TO_ONE__INDEX:
			case Hbm30Package.MANY_TO_ONE__INSERT:
			case Hbm30Package.MANY_TO_ONE__LAZY:
			case Hbm30Package.MANY_TO_ONE__NAME:
			case Hbm30Package.MANY_TO_ONE__NODE:
			case Hbm30Package.MANY_TO_ONE__NOT_FOUND:
			case Hbm30Package.MANY_TO_ONE__NOT_NULL:
			case Hbm30Package.MANY_TO_ONE__OPTIMISTIC_LOCK:
			case Hbm30Package.MANY_TO_ONE__OUTER_JOIN:
			case Hbm30Package.MANY_TO_ONE__PROPERTY_REF:
			case Hbm30Package.MANY_TO_ONE__UNIQUE:
			case Hbm30Package.MANY_TO_ONE__UNIQUE_KEY:
			case Hbm30Package.MANY_TO_ONE__UPDATE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Hbm30Package.MANY_TO_ONE__META:
			case Hbm30Package.MANY_TO_ONE__GROUP:
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
				(Hbm30Package.eINSTANCE.getManyToOne_Meta(),
				 Hbm30Factory.eINSTANCE.createMeta()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getManyToOne_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getManyToOne_Column(),
					 Hbm30Factory.eINSTANCE.createColumn())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getManyToOne_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getManyToOne_Formula(),
					 "")));
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
