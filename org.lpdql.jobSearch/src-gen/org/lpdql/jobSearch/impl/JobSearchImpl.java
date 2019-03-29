/**
 */
package org.lpdql.jobSearch.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.lpdql.jobSearch.Candidat;
import org.lpdql.jobSearch.Entreprise;
import org.lpdql.jobSearch.JobSearch;
import org.lpdql.jobSearch.JobSearchPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Search</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.lpdql.jobSearch.impl.JobSearchImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lpdql.jobSearch.impl.JobSearchImpl#getCandidat <em>Candidat</em>}</li>
 *   <li>{@link org.lpdql.jobSearch.impl.JobSearchImpl#getEntreprise <em>Entreprise</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobSearchImpl extends MinimalEObjectImpl.Container implements JobSearch {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCandidat() <em>Candidat</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCandidat()
	 * @generated
	 * @ordered
	 */
	protected EList<Candidat> candidat;

	/**
	 * The cached value of the '{@link #getEntreprise() <em>Entreprise</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntreprise()
	 * @generated
	 * @ordered
	 */
	protected EList<Entreprise> entreprise;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobSearchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobSearchPackage.Literals.JOB_SEARCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobSearchPackage.JOB_SEARCH__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Candidat> getCandidat() {
		if (candidat == null) {
			candidat = new EObjectContainmentEList<Candidat>(Candidat.class, this,
					JobSearchPackage.JOB_SEARCH__CANDIDAT);
		}
		return candidat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entreprise> getEntreprise() {
		if (entreprise == null) {
			entreprise = new EObjectContainmentEList<Entreprise>(Entreprise.class, this,
					JobSearchPackage.JOB_SEARCH__ENTREPRISE);
		}
		return entreprise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JobSearchPackage.JOB_SEARCH__CANDIDAT:
			return ((InternalEList<?>) getCandidat()).basicRemove(otherEnd, msgs);
		case JobSearchPackage.JOB_SEARCH__ENTREPRISE:
			return ((InternalEList<?>) getEntreprise()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JobSearchPackage.JOB_SEARCH__NAME:
			return getName();
		case JobSearchPackage.JOB_SEARCH__CANDIDAT:
			return getCandidat();
		case JobSearchPackage.JOB_SEARCH__ENTREPRISE:
			return getEntreprise();
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
		case JobSearchPackage.JOB_SEARCH__NAME:
			setName((String) newValue);
			return;
		case JobSearchPackage.JOB_SEARCH__CANDIDAT:
			getCandidat().clear();
			getCandidat().addAll((Collection<? extends Candidat>) newValue);
			return;
		case JobSearchPackage.JOB_SEARCH__ENTREPRISE:
			getEntreprise().clear();
			getEntreprise().addAll((Collection<? extends Entreprise>) newValue);
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
		case JobSearchPackage.JOB_SEARCH__NAME:
			setName(NAME_EDEFAULT);
			return;
		case JobSearchPackage.JOB_SEARCH__CANDIDAT:
			getCandidat().clear();
			return;
		case JobSearchPackage.JOB_SEARCH__ENTREPRISE:
			getEntreprise().clear();
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
		case JobSearchPackage.JOB_SEARCH__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case JobSearchPackage.JOB_SEARCH__CANDIDAT:
			return candidat != null && !candidat.isEmpty();
		case JobSearchPackage.JOB_SEARCH__ENTREPRISE:
			return entreprise != null && !entreprise.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //JobSearchImpl
