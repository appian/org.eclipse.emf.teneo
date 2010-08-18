/**
 * <copyright>
 * </copyright>
 *
 * $Id: SqlQueryItemProvider.java,v 1.1 2010/08/18 09:29:33 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

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
import org.eclipse.emf.teneo.db2m.hbm30.SqlQuery;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SqlQueryItemProvider
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
	public SqlQueryItemProvider(AdapterFactory adapterFactory) {
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

			addCacheablePropertyDescriptor(object);
			addCacheModePropertyDescriptor(object);
			addCacheRegionPropertyDescriptor(object);
			addCallablePropertyDescriptor(object);
			addCommentPropertyDescriptor(object);
			addFetchSizePropertyDescriptor(object);
			addFlushModePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addReadOnlyPropertyDescriptor(object);
			addResultsetRefPropertyDescriptor(object);
			addTimeoutPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Cacheable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCacheablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SqlQuery_cacheable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SqlQuery_cacheable_feature", "_UI_SqlQuery_type"),
				 Hbm30Package.eINSTANCE.getSqlQuery_Cacheable(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cache Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCacheModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SqlQuery_cacheMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SqlQuery_cacheMode_feature", "_UI_SqlQuery_type"),
				 Hbm30Package.eINSTANCE.getSqlQuery_CacheMode(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cache Region feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCacheRegionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SqlQuery_cacheRegion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SqlQuery_cacheRegion_feature", "_UI_SqlQuery_type"),
				 Hbm30Package.eINSTANCE.getSqlQuery_CacheRegion(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Callable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCallablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SqlQuery_callable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SqlQuery_callable_feature", "_UI_SqlQuery_type"),
				 Hbm30Package.eINSTANCE.getSqlQuery_Callable(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_SqlQuery_comment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SqlQuery_comment_feature", "_UI_SqlQuery_type"),
				 Hbm30Package.eINSTANCE.getSqlQuery_Comment(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fetch Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFetchSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SqlQuery_fetchSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SqlQuery_fetchSize_feature", "_UI_SqlQuery_type"),
				 Hbm30Package.eINSTANCE.getSqlQuery_FetchSize(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Flush Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlushModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SqlQuery_flushMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SqlQuery_flushMode_feature", "_UI_SqlQuery_type"),
				 Hbm30Package.eINSTANCE.getSqlQuery_FlushMode(),
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
				 getString("_UI_SqlQuery_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SqlQuery_name_feature", "_UI_SqlQuery_type"),
				 Hbm30Package.eINSTANCE.getSqlQuery_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Read Only feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReadOnlyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SqlQuery_readOnly_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SqlQuery_readOnly_feature", "_UI_SqlQuery_type"),
				 Hbm30Package.eINSTANCE.getSqlQuery_ReadOnly(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resultset Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResultsetRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SqlQuery_resultsetRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SqlQuery_resultsetRef_feature", "_UI_SqlQuery_type"),
				 Hbm30Package.eINSTANCE.getSqlQuery_ResultsetRef(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timeout feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeoutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SqlQuery_timeout_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SqlQuery_timeout_feature", "_UI_SqlQuery_type"),
				 Hbm30Package.eINSTANCE.getSqlQuery_Timeout(),
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
			childrenFeatures.add(Hbm30Package.eINSTANCE.getSqlQuery_Mixed());
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
	 * This returns SqlQuery.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SqlQuery"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SqlQuery)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SqlQuery_type") :
			getString("_UI_SqlQuery_type") + " " + label;
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

		switch (notification.getFeatureID(SqlQuery.class)) {
			case Hbm30Package.SQL_QUERY__CACHEABLE:
			case Hbm30Package.SQL_QUERY__CACHE_MODE:
			case Hbm30Package.SQL_QUERY__CACHE_REGION:
			case Hbm30Package.SQL_QUERY__CALLABLE:
			case Hbm30Package.SQL_QUERY__COMMENT:
			case Hbm30Package.SQL_QUERY__FETCH_SIZE:
			case Hbm30Package.SQL_QUERY__FLUSH_MODE:
			case Hbm30Package.SQL_QUERY__NAME:
			case Hbm30Package.SQL_QUERY__READ_ONLY:
			case Hbm30Package.SQL_QUERY__RESULTSET_REF:
			case Hbm30Package.SQL_QUERY__TIMEOUT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Hbm30Package.SQL_QUERY__MIXED:
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
				(Hbm30Package.eINSTANCE.getSqlQuery_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__COMMENT,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getSqlQuery_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__TEXT,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getSqlQuery_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__PROCESSING_INSTRUCTION,
					 XMLTypeFactory.eINSTANCE.createProcessingInstruction())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getSqlQuery_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__CDATA,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getSqlQuery_Mixed(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getSqlQuery_ReturnScalar(),
					 Hbm30Factory.eINSTANCE.createReturnScalar())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getSqlQuery_Mixed(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getSqlQuery_Return(),
					 Hbm30Factory.eINSTANCE.createReturn())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getSqlQuery_Mixed(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getSqlQuery_ReturnJoin(),
					 Hbm30Factory.eINSTANCE.createReturnJoin())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getSqlQuery_Mixed(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getSqlQuery_LoadCollection(),
					 Hbm30Factory.eINSTANCE.createLoadCollection())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getSqlQuery_Mixed(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getSqlQuery_Synchronize(),
					 Hbm30Factory.eINSTANCE.createSynchronize())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getSqlQuery_Mixed(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getSqlQuery_QueryParam(),
					 Hbm30Factory.eINSTANCE.createQueryParam())));
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
