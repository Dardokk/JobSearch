/**
 */
package org.lpdql.jobSearch.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.lpdql.jobSearch.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.lpdql.jobSearch.JobSearchPackage
 * @generated
 */
public class JobSearchSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JobSearchPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobSearchSwitch() {
		if (modelPackage == null) {
			modelPackage = JobSearchPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case JobSearchPackage.ENTREPRISE: {
			Entreprise entreprise = (Entreprise) theEObject;
			T result = caseEntreprise(entreprise);
			if (result == null)
				result = caseNamedElement(entreprise);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JobSearchPackage.CANDIDAT: {
			Candidat candidat = (Candidat) theEObject;
			T result = caseCandidat(candidat);
			if (result == null)
				result = caseNamedElement(candidat);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JobSearchPackage.OFFRE_EMPLOI: {
			OffreEmploi offreEmploi = (OffreEmploi) theEObject;
			T result = caseOffreEmploi(offreEmploi);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JobSearchPackage.DIPLOME: {
			Diplome diplome = (Diplome) theEObject;
			T result = caseDiplome(diplome);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JobSearchPackage.EXPERIENCE: {
			Experience experience = (Experience) theEObject;
			T result = caseExperience(experience);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JobSearchPackage.CONTACT: {
			Contact contact = (Contact) theEObject;
			T result = caseContact(contact);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JobSearchPackage.COMPETENCE: {
			Competence competence = (Competence) theEObject;
			T result = caseCompetence(competence);
			if (result == null)
				result = caseNamedElement(competence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JobSearchPackage.JOB_SEARCH: {
			JobSearch jobSearch = (JobSearch) theEObject;
			T result = caseJobSearch(jobSearch);
			if (result == null)
				result = caseNamedElement(jobSearch);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JobSearchPackage.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entreprise</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entreprise</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntreprise(Entreprise object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Candidat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Candidat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCandidat(Candidat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offre Emploi</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offre Emploi</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOffreEmploi(OffreEmploi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diplome</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diplome</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiplome(Diplome object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Experience</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experience</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExperience(Experience object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContact(Contact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Competence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Competence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompetence(Competence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Job Search</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Job Search</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJobSearch(JobSearch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //JobSearchSwitch
