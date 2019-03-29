/**
 */
package org.lpdql.jobSearch.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.lpdql.jobSearch.Candidat;
import org.lpdql.jobSearch.JobSearchPackage;
import org.lpdql.jobSearch.OffreEmploi;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Offre Emploi</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.lpdql.jobSearch.impl.OffreEmploiImpl#getTitre <em>Titre</em>}</li>
 *   <li>{@link org.lpdql.jobSearch.impl.OffreEmploiImpl#getDatePublication <em>Date Publication</em>}</li>
 *   <li>{@link org.lpdql.jobSearch.impl.OffreEmploiImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.lpdql.jobSearch.impl.OffreEmploiImpl#getTypeContrat <em>Type Contrat</em>}</li>
 *   <li>{@link org.lpdql.jobSearch.impl.OffreEmploiImpl#getNiveauEtude <em>Niveau Etude</em>}</li>
 *   <li>{@link org.lpdql.jobSearch.impl.OffreEmploiImpl#getNiveauExperience <em>Niveau Experience</em>}</li>
 *   <li>{@link org.lpdql.jobSearch.impl.OffreEmploiImpl#getVilleEmploi <em>Ville Emploi</em>}</li>
 *   <li>{@link org.lpdql.jobSearch.impl.OffreEmploiImpl#getCandidat <em>Candidat</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OffreEmploiImpl extends MinimalEObjectImpl.Container implements OffreEmploi {
	/**
	 * The default value of the '{@link #getTitre() <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitre()
	 * @generated
	 * @ordered
	 */
	protected static final String TITRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitre() <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitre()
	 * @generated
	 * @ordered
	 */
	protected String titre = TITRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatePublication() <em>Date Publication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatePublication()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_PUBLICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatePublication() <em>Date Publication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatePublication()
	 * @generated
	 * @ordered
	 */
	protected Date datePublication = DATE_PUBLICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeContrat() <em>Type Contrat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeContrat()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_CONTRAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeContrat() <em>Type Contrat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeContrat()
	 * @generated
	 * @ordered
	 */
	protected String typeContrat = TYPE_CONTRAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNiveauEtude() <em>Niveau Etude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauEtude()
	 * @generated
	 * @ordered
	 */
	protected static final String NIVEAU_ETUDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNiveauEtude() <em>Niveau Etude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauEtude()
	 * @generated
	 * @ordered
	 */
	protected String niveauEtude = NIVEAU_ETUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNiveauExperience() <em>Niveau Experience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauExperience()
	 * @generated
	 * @ordered
	 */
	protected static final int NIVEAU_EXPERIENCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNiveauExperience() <em>Niveau Experience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauExperience()
	 * @generated
	 * @ordered
	 */
	protected int niveauExperience = NIVEAU_EXPERIENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVilleEmploi() <em>Ville Emploi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVilleEmploi()
	 * @generated
	 * @ordered
	 */
	protected static final String VILLE_EMPLOI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVilleEmploi() <em>Ville Emploi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVilleEmploi()
	 * @generated
	 * @ordered
	 */
	protected String villeEmploi = VILLE_EMPLOI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCandidat() <em>Candidat</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCandidat()
	 * @generated
	 * @ordered
	 */
	protected EList<Candidat> candidat;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OffreEmploiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobSearchPackage.Literals.OFFRE_EMPLOI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitre(String newTitre) {
		String oldTitre = titre;
		titre = newTitre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobSearchPackage.OFFRE_EMPLOI__TITRE, oldTitre,
					titre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDatePublication() {
		return datePublication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatePublication(Date newDatePublication) {
		Date oldDatePublication = datePublication;
		datePublication = newDatePublication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobSearchPackage.OFFRE_EMPLOI__DATE_PUBLICATION,
					oldDatePublication, datePublication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobSearchPackage.OFFRE_EMPLOI__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeContrat() {
		return typeContrat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeContrat(String newTypeContrat) {
		String oldTypeContrat = typeContrat;
		typeContrat = newTypeContrat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobSearchPackage.OFFRE_EMPLOI__TYPE_CONTRAT,
					oldTypeContrat, typeContrat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNiveauEtude() {
		return niveauEtude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveauEtude(String newNiveauEtude) {
		String oldNiveauEtude = niveauEtude;
		niveauEtude = newNiveauEtude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobSearchPackage.OFFRE_EMPLOI__NIVEAU_ETUDE,
					oldNiveauEtude, niveauEtude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNiveauExperience() {
		return niveauExperience;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveauExperience(int newNiveauExperience) {
		int oldNiveauExperience = niveauExperience;
		niveauExperience = newNiveauExperience;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobSearchPackage.OFFRE_EMPLOI__NIVEAU_EXPERIENCE,
					oldNiveauExperience, niveauExperience));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVilleEmploi() {
		return villeEmploi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVilleEmploi(String newVilleEmploi) {
		String oldVilleEmploi = villeEmploi;
		villeEmploi = newVilleEmploi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobSearchPackage.OFFRE_EMPLOI__VILLE_EMPLOI,
					oldVilleEmploi, villeEmploi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Candidat> getCandidat() {
		if (candidat == null) {
			candidat = new EObjectResolvingEList<Candidat>(Candidat.class, this,
					JobSearchPackage.OFFRE_EMPLOI__CANDIDAT);
		}
		return candidat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JobSearchPackage.OFFRE_EMPLOI__TITRE:
			return getTitre();
		case JobSearchPackage.OFFRE_EMPLOI__DATE_PUBLICATION:
			return getDatePublication();
		case JobSearchPackage.OFFRE_EMPLOI__DESCRIPTION:
			return getDescription();
		case JobSearchPackage.OFFRE_EMPLOI__TYPE_CONTRAT:
			return getTypeContrat();
		case JobSearchPackage.OFFRE_EMPLOI__NIVEAU_ETUDE:
			return getNiveauEtude();
		case JobSearchPackage.OFFRE_EMPLOI__NIVEAU_EXPERIENCE:
			return getNiveauExperience();
		case JobSearchPackage.OFFRE_EMPLOI__VILLE_EMPLOI:
			return getVilleEmploi();
		case JobSearchPackage.OFFRE_EMPLOI__CANDIDAT:
			return getCandidat();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case JobSearchPackage.OFFRE_EMPLOI__TITRE:
			setTitre((String) newValue);
			return;
		case JobSearchPackage.OFFRE_EMPLOI__DATE_PUBLICATION:
			setDatePublication((Date) newValue);
			return;
		case JobSearchPackage.OFFRE_EMPLOI__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case JobSearchPackage.OFFRE_EMPLOI__TYPE_CONTRAT:
			setTypeContrat((String) newValue);
			return;
		case JobSearchPackage.OFFRE_EMPLOI__NIVEAU_ETUDE:
			setNiveauEtude((String) newValue);
			return;
		case JobSearchPackage.OFFRE_EMPLOI__NIVEAU_EXPERIENCE:
			setNiveauExperience((Integer) newValue);
			return;
		case JobSearchPackage.OFFRE_EMPLOI__VILLE_EMPLOI:
			setVilleEmploi((String) newValue);
			return;
		case JobSearchPackage.OFFRE_EMPLOI__CANDIDAT:
			getCandidat().clear();
			getCandidat().addAll((Collection<? extends Candidat>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case JobSearchPackage.OFFRE_EMPLOI__TITRE:
			setTitre(TITRE_EDEFAULT);
			return;
		case JobSearchPackage.OFFRE_EMPLOI__DATE_PUBLICATION:
			setDatePublication(DATE_PUBLICATION_EDEFAULT);
			return;
		case JobSearchPackage.OFFRE_EMPLOI__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case JobSearchPackage.OFFRE_EMPLOI__TYPE_CONTRAT:
			setTypeContrat(TYPE_CONTRAT_EDEFAULT);
			return;
		case JobSearchPackage.OFFRE_EMPLOI__NIVEAU_ETUDE:
			setNiveauEtude(NIVEAU_ETUDE_EDEFAULT);
			return;
		case JobSearchPackage.OFFRE_EMPLOI__NIVEAU_EXPERIENCE:
			setNiveauExperience(NIVEAU_EXPERIENCE_EDEFAULT);
			return;
		case JobSearchPackage.OFFRE_EMPLOI__VILLE_EMPLOI:
			setVilleEmploi(VILLE_EMPLOI_EDEFAULT);
			return;
		case JobSearchPackage.OFFRE_EMPLOI__CANDIDAT:
			getCandidat().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case JobSearchPackage.OFFRE_EMPLOI__TITRE:
			return TITRE_EDEFAULT == null ? titre != null : !TITRE_EDEFAULT.equals(titre);
		case JobSearchPackage.OFFRE_EMPLOI__DATE_PUBLICATION:
			return DATE_PUBLICATION_EDEFAULT == null ? datePublication != null
					: !DATE_PUBLICATION_EDEFAULT.equals(datePublication);
		case JobSearchPackage.OFFRE_EMPLOI__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case JobSearchPackage.OFFRE_EMPLOI__TYPE_CONTRAT:
			return TYPE_CONTRAT_EDEFAULT == null ? typeContrat != null : !TYPE_CONTRAT_EDEFAULT.equals(typeContrat);
		case JobSearchPackage.OFFRE_EMPLOI__NIVEAU_ETUDE:
			return NIVEAU_ETUDE_EDEFAULT == null ? niveauEtude != null : !NIVEAU_ETUDE_EDEFAULT.equals(niveauEtude);
		case JobSearchPackage.OFFRE_EMPLOI__NIVEAU_EXPERIENCE:
			return niveauExperience != NIVEAU_EXPERIENCE_EDEFAULT;
		case JobSearchPackage.OFFRE_EMPLOI__VILLE_EMPLOI:
			return VILLE_EMPLOI_EDEFAULT == null ? villeEmploi != null : !VILLE_EMPLOI_EDEFAULT.equals(villeEmploi);
		case JobSearchPackage.OFFRE_EMPLOI__CANDIDAT:
			return candidat != null && !candidat.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (titre: ");
		result.append(titre);
		result.append(", datePublication: ");
		result.append(datePublication);
		result.append(", description: ");
		result.append(description);
		result.append(", typeContrat: ");
		result.append(typeContrat);
		result.append(", niveauEtude: ");
		result.append(niveauEtude);
		result.append(", niveauExperience: ");
		result.append(niveauExperience);
		result.append(", villeEmploi: ");
		result.append(villeEmploi);
		result.append(')');
		return result.toString();
	}

} //OffreEmploiImpl
