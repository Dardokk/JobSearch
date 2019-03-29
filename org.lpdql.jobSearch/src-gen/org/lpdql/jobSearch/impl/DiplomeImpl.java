/**
 */
package org.lpdql.jobSearch.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.lpdql.jobSearch.Diplome;
import org.lpdql.jobSearch.JobSearchPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diplome</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.lpdql.jobSearch.impl.DiplomeImpl#getNiveau <em>Niveau</em>}</li>
 *   <li>{@link org.lpdql.jobSearch.impl.DiplomeImpl#getDomaine <em>Domaine</em>}</li>
 *   <li>{@link org.lpdql.jobSearch.impl.DiplomeImpl#getAnneeObtention <em>Annee Obtention</em>}</li>
 *   <li>{@link org.lpdql.jobSearch.impl.DiplomeImpl#getEtablissement <em>Etablissement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiplomeImpl extends MinimalEObjectImpl.Container implements Diplome {
	/**
	 * The default value of the '{@link #getNiveau() <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveau()
	 * @generated
	 * @ordered
	 */
	protected static final String NIVEAU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNiveau() <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveau()
	 * @generated
	 * @ordered
	 */
	protected String niveau = NIVEAU_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomaine() <em>Domaine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomaine()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomaine() <em>Domaine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomaine()
	 * @generated
	 * @ordered
	 */
	protected String domaine = DOMAINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnneeObtention() <em>Annee Obtention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnneeObtention()
	 * @generated
	 * @ordered
	 */
	protected static final Date ANNEE_OBTENTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnneeObtention() <em>Annee Obtention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnneeObtention()
	 * @generated
	 * @ordered
	 */
	protected Date anneeObtention = ANNEE_OBTENTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEtablissement() <em>Etablissement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtablissement()
	 * @generated
	 * @ordered
	 */
	protected static final String ETABLISSEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEtablissement() <em>Etablissement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtablissement()
	 * @generated
	 * @ordered
	 */
	protected String etablissement = ETABLISSEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiplomeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobSearchPackage.Literals.DIPLOME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNiveau() {
		return niveau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveau(String newNiveau) {
		String oldNiveau = niveau;
		niveau = newNiveau;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobSearchPackage.DIPLOME__NIVEAU, oldNiveau, niveau));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomaine() {
		return domaine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomaine(String newDomaine) {
		String oldDomaine = domaine;
		domaine = newDomaine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobSearchPackage.DIPLOME__DOMAINE, oldDomaine,
					domaine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getAnneeObtention() {
		return anneeObtention;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnneeObtention(Date newAnneeObtention) {
		Date oldAnneeObtention = anneeObtention;
		anneeObtention = newAnneeObtention;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobSearchPackage.DIPLOME__ANNEE_OBTENTION,
					oldAnneeObtention, anneeObtention));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtablissement() {
		return etablissement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtablissement(String newEtablissement) {
		String oldEtablissement = etablissement;
		etablissement = newEtablissement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobSearchPackage.DIPLOME__ETABLISSEMENT,
					oldEtablissement, etablissement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JobSearchPackage.DIPLOME__NIVEAU:
			return getNiveau();
		case JobSearchPackage.DIPLOME__DOMAINE:
			return getDomaine();
		case JobSearchPackage.DIPLOME__ANNEE_OBTENTION:
			return getAnneeObtention();
		case JobSearchPackage.DIPLOME__ETABLISSEMENT:
			return getEtablissement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case JobSearchPackage.DIPLOME__NIVEAU:
			setNiveau((String) newValue);
			return;
		case JobSearchPackage.DIPLOME__DOMAINE:
			setDomaine((String) newValue);
			return;
		case JobSearchPackage.DIPLOME__ANNEE_OBTENTION:
			setAnneeObtention((Date) newValue);
			return;
		case JobSearchPackage.DIPLOME__ETABLISSEMENT:
			setEtablissement((String) newValue);
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
		case JobSearchPackage.DIPLOME__NIVEAU:
			setNiveau(NIVEAU_EDEFAULT);
			return;
		case JobSearchPackage.DIPLOME__DOMAINE:
			setDomaine(DOMAINE_EDEFAULT);
			return;
		case JobSearchPackage.DIPLOME__ANNEE_OBTENTION:
			setAnneeObtention(ANNEE_OBTENTION_EDEFAULT);
			return;
		case JobSearchPackage.DIPLOME__ETABLISSEMENT:
			setEtablissement(ETABLISSEMENT_EDEFAULT);
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
		case JobSearchPackage.DIPLOME__NIVEAU:
			return NIVEAU_EDEFAULT == null ? niveau != null : !NIVEAU_EDEFAULT.equals(niveau);
		case JobSearchPackage.DIPLOME__DOMAINE:
			return DOMAINE_EDEFAULT == null ? domaine != null : !DOMAINE_EDEFAULT.equals(domaine);
		case JobSearchPackage.DIPLOME__ANNEE_OBTENTION:
			return ANNEE_OBTENTION_EDEFAULT == null ? anneeObtention != null
					: !ANNEE_OBTENTION_EDEFAULT.equals(anneeObtention);
		case JobSearchPackage.DIPLOME__ETABLISSEMENT:
			return ETABLISSEMENT_EDEFAULT == null ? etablissement != null
					: !ETABLISSEMENT_EDEFAULT.equals(etablissement);
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
		result.append(" (niveau: ");
		result.append(niveau);
		result.append(", domaine: ");
		result.append(domaine);
		result.append(", anneeObtention: ");
		result.append(anneeObtention);
		result.append(", etablissement: ");
		result.append(etablissement);
		result.append(')');
		return result.toString();
	}

} //DiplomeImpl
