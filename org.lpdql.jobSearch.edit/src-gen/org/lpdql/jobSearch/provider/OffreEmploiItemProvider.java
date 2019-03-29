/**
 */
package org.lpdql.jobSearch.provider;

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

import org.lpdql.jobSearch.JobSearchFactory;
import org.lpdql.jobSearch.JobSearchPackage;
import org.lpdql.jobSearch.OffreEmploi;

/**
 * This is the item provider adapter for a {@link org.lpdql.jobSearch.OffreEmploi} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OffreEmploiItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffreEmploiItemProvider(AdapterFactory adapterFactory) {
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

			addTitrePropertyDescriptor(object);
			addDatePublicationPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addTypeContratPropertyDescriptor(object);
			addNiveauEtudePropertyDescriptor(object);
			addNiveauExperiencePropertyDescriptor(object);
			addVilleEmploiPropertyDescriptor(object);
			addCandidatPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Titre feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitrePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_OffreEmploi_titre_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_OffreEmploi_titre_feature",
								"_UI_OffreEmploi_type"),
						JobSearchPackage.Literals.OFFRE_EMPLOI__TITRE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Date Publication feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatePublicationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_OffreEmploi_datePublication_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_OffreEmploi_datePublication_feature",
								"_UI_OffreEmploi_type"),
						JobSearchPackage.Literals.OFFRE_EMPLOI__DATE_PUBLICATION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_OffreEmploi_description_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_OffreEmploi_description_feature",
								"_UI_OffreEmploi_type"),
						JobSearchPackage.Literals.OFFRE_EMPLOI__DESCRIPTION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Type Contrat feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypeContratPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_OffreEmploi_typeContrat_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_OffreEmploi_typeContrat_feature",
								"_UI_OffreEmploi_type"),
						JobSearchPackage.Literals.OFFRE_EMPLOI__TYPE_CONTRAT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Niveau Etude feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNiveauEtudePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_OffreEmploi_niveauEtude_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_OffreEmploi_niveauEtude_feature",
								"_UI_OffreEmploi_type"),
						JobSearchPackage.Literals.OFFRE_EMPLOI__NIVEAU_ETUDE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Niveau Experience feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNiveauExperiencePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_OffreEmploi_niveauExperience_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_OffreEmploi_niveauExperience_feature",
								"_UI_OffreEmploi_type"),
						JobSearchPackage.Literals.OFFRE_EMPLOI__NIVEAU_EXPERIENCE, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Ville Emploi feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVilleEmploiPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_OffreEmploi_villeEmploi_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_OffreEmploi_villeEmploi_feature",
								"_UI_OffreEmploi_type"),
						JobSearchPackage.Literals.OFFRE_EMPLOI__VILLE_EMPLOI, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Candidat feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCandidatPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_OffreEmploi_candidat_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_OffreEmploi_candidat_feature",
								"_UI_OffreEmploi_type"),
						JobSearchPackage.Literals.OFFRE_EMPLOI__CANDIDAT, true, false, true, null, null, null));
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
			childrenFeatures.add(JobSearchPackage.Literals.OFFRE_EMPLOI__CANDIDAT);
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
	 * This returns OffreEmploi.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OffreEmploi"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((OffreEmploi) object).getTitre();
		return label == null || label.length() == 0 ? getString("_UI_OffreEmploi_type")
				: getString("_UI_OffreEmploi_type") + " " + label;
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

		switch (notification.getFeatureID(OffreEmploi.class)) {
		case JobSearchPackage.OFFRE_EMPLOI__TITRE:
		case JobSearchPackage.OFFRE_EMPLOI__DATE_PUBLICATION:
		case JobSearchPackage.OFFRE_EMPLOI__DESCRIPTION:
		case JobSearchPackage.OFFRE_EMPLOI__TYPE_CONTRAT:
		case JobSearchPackage.OFFRE_EMPLOI__NIVEAU_ETUDE:
		case JobSearchPackage.OFFRE_EMPLOI__NIVEAU_EXPERIENCE:
		case JobSearchPackage.OFFRE_EMPLOI__VILLE_EMPLOI:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case JobSearchPackage.OFFRE_EMPLOI__CANDIDAT:
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

		newChildDescriptors.add(createChildParameter(JobSearchPackage.Literals.OFFRE_EMPLOI__CANDIDAT,
				JobSearchFactory.eINSTANCE.createCandidat()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return JobSearchEditPlugin.INSTANCE;
	}

}
