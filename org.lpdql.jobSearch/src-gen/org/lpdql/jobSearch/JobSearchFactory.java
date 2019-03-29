/**
 */
package org.lpdql.jobSearch;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.lpdql.jobSearch.JobSearchPackage
 * @generated
 */
public interface JobSearchFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JobSearchFactory eINSTANCE = org.lpdql.jobSearch.impl.JobSearchFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Entreprise</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entreprise</em>'.
	 * @generated
	 */
	Entreprise createEntreprise();

	/**
	 * Returns a new object of class '<em>Candidat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Candidat</em>'.
	 * @generated
	 */
	Candidat createCandidat();

	/**
	 * Returns a new object of class '<em>Offre Emploi</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Offre Emploi</em>'.
	 * @generated
	 */
	OffreEmploi createOffreEmploi();

	/**
	 * Returns a new object of class '<em>Diplome</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diplome</em>'.
	 * @generated
	 */
	Diplome createDiplome();

	/**
	 * Returns a new object of class '<em>Experience</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Experience</em>'.
	 * @generated
	 */
	Experience createExperience();

	/**
	 * Returns a new object of class '<em>Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact</em>'.
	 * @generated
	 */
	Contact createContact();

	/**
	 * Returns a new object of class '<em>Competence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Competence</em>'.
	 * @generated
	 */
	Competence createCompetence();

	/**
	 * Returns a new object of class '<em>Job Search</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job Search</em>'.
	 * @generated
	 */
	JobSearch createJobSearch();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JobSearchPackage getJobSearchPackage();

} //JobSearchFactory
