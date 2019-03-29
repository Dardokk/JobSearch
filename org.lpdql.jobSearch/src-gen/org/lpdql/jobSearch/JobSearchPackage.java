/**
 */
package org.lpdql.jobSearch;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.lpdql.jobSearch.JobSearchFactory
 * @model kind="package"
 * @generated
 */
public interface JobSearchPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jobSearch";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/jobSearch";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jobSearch";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JobSearchPackage eINSTANCE = org.lpdql.jobSearch.impl.JobSearchPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.lpdql.jobSearch.NamedElement <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lpdql.jobSearch.NamedElement
	 * @see org.lpdql.jobSearch.impl.JobSearchPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.lpdql.jobSearch.impl.EntrepriseImpl <em>Entreprise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lpdql.jobSearch.impl.EntrepriseImpl
	 * @see org.lpdql.jobSearch.impl.JobSearchPackageImpl#getEntreprise()
	 * @generated
	 */
	int ENTREPRISE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREPRISE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREPRISE__CONTACT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Domaine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREPRISE__DOMAINE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREPRISE__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Publier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREPRISE__PUBLIER = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Entreprise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREPRISE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Entreprise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREPRISE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lpdql.jobSearch.impl.CandidatImpl <em>Candidat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lpdql.jobSearch.impl.CandidatImpl
	 * @see org.lpdql.jobSearch.impl.JobSearchPackageImpl#getCandidat()
	 * @generated
	 */
	int CANDIDAT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDAT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Diplome</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDAT__DIPLOME = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Experience</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDAT__EXPERIENCE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDAT__CONTACT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDAT__PRENOM = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Genre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDAT__GENRE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Date Naissance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDAT__DATE_NAISSANCE = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Competence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDAT__COMPETENCE = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Candidat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDAT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Postuler</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDAT___POSTULER__OFFREEMPLOI = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Rechercher Emploi</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDAT___RECHERCHER_EMPLOI__STRING_STRING = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Candidat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDAT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.lpdql.jobSearch.impl.OffreEmploiImpl <em>Offre Emploi</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lpdql.jobSearch.impl.OffreEmploiImpl
	 * @see org.lpdql.jobSearch.impl.JobSearchPackageImpl#getOffreEmploi()
	 * @generated
	 */
	int OFFRE_EMPLOI = 2;

	/**
	 * The feature id for the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFRE_EMPLOI__TITRE = 0;

	/**
	 * The feature id for the '<em><b>Date Publication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFRE_EMPLOI__DATE_PUBLICATION = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFRE_EMPLOI__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Type Contrat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFRE_EMPLOI__TYPE_CONTRAT = 3;

	/**
	 * The feature id for the '<em><b>Niveau Etude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFRE_EMPLOI__NIVEAU_ETUDE = 4;

	/**
	 * The feature id for the '<em><b>Niveau Experience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFRE_EMPLOI__NIVEAU_EXPERIENCE = 5;

	/**
	 * The feature id for the '<em><b>Ville Emploi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFRE_EMPLOI__VILLE_EMPLOI = 6;

	/**
	 * The feature id for the '<em><b>Candidat</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFRE_EMPLOI__CANDIDAT = 7;

	/**
	 * The number of structural features of the '<em>Offre Emploi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFRE_EMPLOI_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Offre Emploi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFRE_EMPLOI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.lpdql.jobSearch.impl.DiplomeImpl <em>Diplome</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lpdql.jobSearch.impl.DiplomeImpl
	 * @see org.lpdql.jobSearch.impl.JobSearchPackageImpl#getDiplome()
	 * @generated
	 */
	int DIPLOME = 3;

	/**
	 * The feature id for the '<em><b>Niveau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIPLOME__NIVEAU = 0;

	/**
	 * The feature id for the '<em><b>Domaine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIPLOME__DOMAINE = 1;

	/**
	 * The feature id for the '<em><b>Annee Obtention</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIPLOME__ANNEE_OBTENTION = 2;

	/**
	 * The feature id for the '<em><b>Etablissement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIPLOME__ETABLISSEMENT = 3;

	/**
	 * The number of structural features of the '<em>Diplome</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIPLOME_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Diplome</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIPLOME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.lpdql.jobSearch.impl.ExperienceImpl <em>Experience</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lpdql.jobSearch.impl.ExperienceImpl
	 * @see org.lpdql.jobSearch.impl.JobSearchPackageImpl#getExperience()
	 * @generated
	 */
	int EXPERIENCE = 4;

	/**
	 * The feature id for the '<em><b>Entreprise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE__ENTREPRISE = 0;

	/**
	 * The feature id for the '<em><b>Date Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE__DATE_DEBUT = 1;

	/**
	 * The feature id for the '<em><b>Date Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE__DATE_FIN = 2;

	/**
	 * The feature id for the '<em><b>Poste</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE__POSTE = 3;

	/**
	 * The number of structural features of the '<em>Experience</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Experience</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.lpdql.jobSearch.impl.ContactImpl <em>Contact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lpdql.jobSearch.impl.ContactImpl
	 * @see org.lpdql.jobSearch.impl.JobSearchPackageImpl#getContact()
	 * @generated
	 */
	int CONTACT = 5;

	/**
	 * The feature id for the '<em><b>Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__ADRESSE = 0;

	/**
	 * The feature id for the '<em><b>Ville</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__VILLE = 1;

	/**
	 * The feature id for the '<em><b>Code Postal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__CODE_POSTAL = 2;

	/**
	 * The feature id for the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__TELEPHONE = 3;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__EMAIL = 4;

	/**
	 * The number of structural features of the '<em>Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.lpdql.jobSearch.impl.CompetenceImpl <em>Competence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lpdql.jobSearch.impl.CompetenceImpl
	 * @see org.lpdql.jobSearch.impl.JobSearchPackageImpl#getCompetence()
	 * @generated
	 */
	int COMPETENCE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETENCE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Competence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETENCE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Competence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETENCE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lpdql.jobSearch.impl.JobSearchImpl <em>Job Search</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lpdql.jobSearch.impl.JobSearchImpl
	 * @see org.lpdql.jobSearch.impl.JobSearchPackageImpl#getJobSearch()
	 * @generated
	 */
	int JOB_SEARCH = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SEARCH__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Candidat</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SEARCH__CANDIDAT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entreprise</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SEARCH__ENTREPRISE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Job Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SEARCH_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Job Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SEARCH_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.lpdql.jobSearch.Entreprise <em>Entreprise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entreprise</em>'.
	 * @see org.lpdql.jobSearch.Entreprise
	 * @generated
	 */
	EClass getEntreprise();

	/**
	 * Returns the meta object for the containment reference '{@link org.lpdql.jobSearch.Entreprise#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contact</em>'.
	 * @see org.lpdql.jobSearch.Entreprise#getContact()
	 * @see #getEntreprise()
	 * @generated
	 */
	EReference getEntreprise_Contact();

	/**
	 * Returns the meta object for the attribute '{@link org.lpdql.jobSearch.Entreprise#getDomaine <em>Domaine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domaine</em>'.
	 * @see org.lpdql.jobSearch.Entreprise#getDomaine()
	 * @see #getEntreprise()
	 * @generated
	 */
	EAttribute getEntreprise_Domaine();

	/**
	 * Returns the meta object for the attribute '{@link org.lpdql.jobSearch.Entreprise#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.lpdql.jobSearch.Entreprise#getDescription()
	 * @see #getEntreprise()
	 * @generated
	 */
	EAttribute getEntreprise_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lpdql.jobSearch.Entreprise#getPublier <em>Publier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publier</em>'.
	 * @see org.lpdql.jobSearch.Entreprise#getPublier()
	 * @see #getEntreprise()
	 * @generated
	 */
	EReference getEntreprise_Publier();

	/**
	 * Returns the meta object for class '{@link org.lpdql.jobSearch.Candidat <em>Candidat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Candidat</em>'.
	 * @see org.lpdql.jobSearch.Candidat
	 * @generated
	 */
	EClass getCandidat();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lpdql.jobSearch.Candidat#getDiplome <em>Diplome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diplome</em>'.
	 * @see org.lpdql.jobSearch.Candidat#getDiplome()
	 * @see #getCandidat()
	 * @generated
	 */
	EReference getCandidat_Diplome();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lpdql.jobSearch.Candidat#getExperience <em>Experience</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Experience</em>'.
	 * @see org.lpdql.jobSearch.Candidat#getExperience()
	 * @see #getCandidat()
	 * @generated
	 */
	EReference getCandidat_Experience();

	/**
	 * Returns the meta object for the containment reference '{@link org.lpdql.jobSearch.Candidat#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contact</em>'.
	 * @see org.lpdql.jobSearch.Candidat#getContact()
	 * @see #getCandidat()
	 * @generated
	 */
	EReference getCandidat_Contact();

	/**
	 * Returns the meta object for the attribute '{@link org.lpdql.jobSearch.Candidat#getPrenom <em>Prenom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prenom</em>'.
	 * @see org.lpdql.jobSearch.Candidat#getPrenom()
	 * @see #getCandidat()
	 * @generated
	 */
	EAttribute getCandidat_Prenom();

	/**
	 * Returns the meta object for the attribute '{@link org.lpdql.jobSearch.Candidat#getGenre <em>Genre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Genre</em>'.
	 * @see org.lpdql.jobSearch.Candidat#getGenre()
	 * @see #getCandidat()
	 * @generated
	 */
	EAttribute getCandidat_Genre();

	/**
	 * Returns the meta object for the attribute '{@link org.lpdql.jobSearch.Candidat#getDateNaissance <em>Date Naissance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Naissance</em>'.
	 * @see org.lpdql.jobSearch.Candidat#getDateNaissance()
	 * @see #getCandidat()
	 * @generated
	 */
	EAttribute getCandidat_DateNaissance();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lpdql.jobSearch.Candidat#getCompetence <em>Competence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Competence</em>'.
	 * @see org.lpdql.jobSearch.Candidat#getCompetence()
	 * @see #getCandidat()
	 * @generated
	 */
	EReference getCandidat_Competence();

	/**
	 * Returns the meta object for the '{@link org.lpdql.jobSearch.Candidat#postuler(org.lpdql.jobSearch.OffreEmploi) <em>Postuler</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Postuler</em>' operation.
	 * @see org.lpdql.jobSearch.Candidat#postuler(org.lpdql.jobSearch.OffreEmploi)
	 * @generated
	 */
	EOperation getCandidat__Postuler__OffreEmploi();

	/**
	 * Returns the meta object for the '{@link org.lpdql.jobSearch.Candidat#rechercherEmploi(java.lang.String, java.lang.String) <em>Rechercher Emploi</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rechercher Emploi</em>' operation.
	 * @see org.lpdql.jobSearch.Candidat#rechercherEmploi(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCandidat__RechercherEmploi__String_String();

	/**
	 * Returns the meta object for class '{@link org.lpdql.jobSearch.OffreEmploi <em>Offre Emploi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offre Emploi</em>'.
	 * @see org.lpdql.jobSearch.OffreEmploi
	 * @generated
	 */
	EClass getOffreEmploi();

	/**
	 * Returns the meta object for the attribute '{@link org.lpdql.jobSearch.OffreEmploi#getTitre <em>Titre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titre</em>'.
	 * @see org.lpdql.jobSearch.OffreEmploi#getTitre()
	 * @see #getOffreEmploi()
	 * @generated
	 */
	EAttribute getOffreEmploi_Titre();

	/**
	 * Returns the meta object for the attribute '{@link org.lpdql.jobSearch.OffreEmploi#getDatePublication <em>Date Publication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Publication</em>'.
	 * @see org.lpdql.jobSearch.OffreEmploi#getDatePublication()
	 * @see #getOffreEmploi()
	 * @generated
	 */
	EAttribute getOffreEmploi_DatePublication();

	/**
	 * Returns the meta object for the attribute '{@link org.lpdql.jobSearch.OffreEmploi#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.lpdql.jobSearch.OffreEmploi#getDescription()
	 * @see #getOffreEmploi()
	 * @generated
	 */
	EAttribute getOffreEmploi_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.lpdql.jobSearch.OffreEmploi#getTypeContrat <em>Type Contrat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Contrat</em>'.
	 * @see org.lpdql.jobSearch.OffreEmploi#getTypeContrat()
	 * @see #getOffreEmploi()
	 * @generated
	 */
	EAttribute getOffreEmploi_TypeContrat();

	/**
	 * Returns the meta object for the attribute '{@link org.lpdql.jobSearch.OffreEmploi#getNiveauEtude <em>Niveau Etude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Niveau Etude</em>'.
	 * @see org.lpdql.jobSearch.OffreEmploi#getNiveauEtude()
	 * @see #getOffreEmploi()
	 * @generated
	 */
	EAttribute getOffreEmploi_NiveauEtude();

	/**
	 * Returns the meta object for the attribute '{@link org.lpdql.jobSearch.OffreEmploi#getNiveauExperience <em>Niveau Experience</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Niveau Experience</em>'.
	 * @see org.lpdql.jobSearch.OffreEmploi#getNiveauExperience()
	 * @see #getOffreEmploi()
	 * @generated
	 */
	EAttribute getOffreEmploi_NiveauExperience();

	/**
	 * Returns the meta object for the attribute '{@link org.lpdql.jobSearch.OffreEmploi#getVilleEmploi <em>Ville Emploi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ville Emploi</em>'.
	 * @see org.lpdql.jobSearch.OffreEmploi#getVilleEmploi()
	 * @see #getOffreEmploi()
	 * @generated
	 */
	EAttribute getOffreEmploi_VilleEmploi();

	/**
	 * Returns the meta object for the reference list '{@link org.lpdql.jobSearch.OffreEmploi#getCandidat <em>Candidat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Candidat</em>'.
	 * @see org.lpdql.jobSearch.OffreEmploi#getCandidat()
	 * @see #getOffreEmploi()
	 * @generated
	 */
	EReference getOffreEmploi_Candidat();

	/**
	 * Returns the meta object for class '{@link org.lpdql.jobSearch.Diplome <em>Diplome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diplome</em>'.
	 * @see org.lpdql.jobSearch.Diplome
	 * @generated
	 */
	EClass getDiplome();

	/**
	 * Returns the meta object for the attribute '{@link org.lpdql.jobSearch.Diplome#getNiveau <em>Niveau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Niveau</em>'.
	 * @see org.lpdql.jobSearch.Diplome#getNiveau()
	 * @see #getDiplome()
	 * @generated
	 */
	EAttribute getDiplome_Niveau();

	/**
	 * Returns the meta object for the attribute '{@link org.lpdql.jobSearch.Diplome#getDomaine <em>Domaine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domaine</em>'.
	 * @see org.lpdql.jobSearch.Diplome#getDomaine()
	 * @see #getDiplome()
	 * @generated
	 */
	EAttribute getDiplome_Domaine();

	/**
	 * Returns the meta object for the attribute '{@link org.lpdql.jobSearch.Diplome#getAnneeObtention <em>Annee Obtention</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annee Obtention</em>'.
	 * @see org.lpdql.jobSearch.Diplome#getAnneeObtention()
	 * @see #getDiplome()
	 * @generated
	 */
	EAttribute getDiplome_AnneeObtention();

	/**
	 * Returns the meta object for the attribute '{@link org.lpdql.jobSearch.Diplome#getEtablissement <em>Etablissement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etablissement</em>'.
	 * @see org.lpdql.jobSearch.Diplome#getEtablissement()
	 * @see #getDiplome()
	 * @generated
	 */
	EAttribute getDiplome_Etablissement();

	/**
	 * Returns the meta object for class '{@link org.lpdql.jobSearch.Experience <em>Experience</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experience</em>'.
	 * @see org.lpdql.jobSearch.Experience
	 * @generated
	 */
	EClass getExperience();

	/**
	 * Returns the meta object for the attribute '{@link org.lpdql.jobSearch.Experience#getEntreprise <em>Entreprise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entreprise</em>'.
	 * @see org.lpdql.jobSearch.Experience#getEntreprise()
	 * @see #getExperience()
	 * @generated
	 */
	EAttribute getExperience_Entreprise();

	/**
	 * Returns the meta object for the attribute '{@link org.lpdql.jobSearch.Experience#getDateDebut <em>Date Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Debut</em>'.
	 * @see org.lpdql.jobSearch.Experience#getDateDebut()
	 * @see #getExperience()
	 * @generated
	 */
	EAttribute getExperience_DateDebut();

	/**
	 * Returns the meta object for the attribute '{@link org.lpdql.jobSearch.Experience#getDateFin <em>Date Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Fin</em>'.
	 * @see org.lpdql.jobSearch.Experience#getDateFin()
	 * @see #getExperience()
	 * @generated
	 */
	EAttribute getExperience_DateFin();

	/**
	 * Returns the meta object for the attribute '{@link org.lpdql.jobSearch.Experience#getPoste <em>Poste</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Poste</em>'.
	 * @see org.lpdql.jobSearch.Experience#getPoste()
	 * @see #getExperience()
	 * @generated
	 */
	EAttribute getExperience_Poste();

	/**
	 * Returns the meta object for class '{@link org.lpdql.jobSearch.Contact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact</em>'.
	 * @see org.lpdql.jobSearch.Contact
	 * @generated
	 */
	EClass getContact();

	/**
	 * Returns the meta object for the attribute '{@link org.lpdql.jobSearch.Contact#getAdresse <em>Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adresse</em>'.
	 * @see org.lpdql.jobSearch.Contact#getAdresse()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Adresse();

	/**
	 * Returns the meta object for the attribute '{@link org.lpdql.jobSearch.Contact#getVille <em>Ville</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ville</em>'.
	 * @see org.lpdql.jobSearch.Contact#getVille()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Ville();

	/**
	 * Returns the meta object for the attribute '{@link org.lpdql.jobSearch.Contact#getCodePostal <em>Code Postal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Postal</em>'.
	 * @see org.lpdql.jobSearch.Contact#getCodePostal()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_CodePostal();

	/**
	 * Returns the meta object for the attribute '{@link org.lpdql.jobSearch.Contact#getTelephone <em>Telephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telephone</em>'.
	 * @see org.lpdql.jobSearch.Contact#getTelephone()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Telephone();

	/**
	 * Returns the meta object for the attribute '{@link org.lpdql.jobSearch.Contact#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see org.lpdql.jobSearch.Contact#getEmail()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Email();

	/**
	 * Returns the meta object for class '{@link org.lpdql.jobSearch.Competence <em>Competence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Competence</em>'.
	 * @see org.lpdql.jobSearch.Competence
	 * @generated
	 */
	EClass getCompetence();

	/**
	 * Returns the meta object for class '{@link org.lpdql.jobSearch.JobSearch <em>Job Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Search</em>'.
	 * @see org.lpdql.jobSearch.JobSearch
	 * @generated
	 */
	EClass getJobSearch();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lpdql.jobSearch.JobSearch#getCandidat <em>Candidat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Candidat</em>'.
	 * @see org.lpdql.jobSearch.JobSearch#getCandidat()
	 * @see #getJobSearch()
	 * @generated
	 */
	EReference getJobSearch_Candidat();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lpdql.jobSearch.JobSearch#getEntreprise <em>Entreprise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entreprise</em>'.
	 * @see org.lpdql.jobSearch.JobSearch#getEntreprise()
	 * @see #getJobSearch()
	 * @generated
	 */
	EReference getJobSearch_Entreprise();

	/**
	 * Returns the meta object for class '{@link org.lpdql.jobSearch.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.lpdql.jobSearch.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.lpdql.jobSearch.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.lpdql.jobSearch.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JobSearchFactory getJobSearchFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.lpdql.jobSearch.impl.EntrepriseImpl <em>Entreprise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lpdql.jobSearch.impl.EntrepriseImpl
		 * @see org.lpdql.jobSearch.impl.JobSearchPackageImpl#getEntreprise()
		 * @generated
		 */
		EClass ENTREPRISE = eINSTANCE.getEntreprise();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTREPRISE__CONTACT = eINSTANCE.getEntreprise_Contact();

		/**
		 * The meta object literal for the '<em><b>Domaine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTREPRISE__DOMAINE = eINSTANCE.getEntreprise_Domaine();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTREPRISE__DESCRIPTION = eINSTANCE.getEntreprise_Description();

		/**
		 * The meta object literal for the '<em><b>Publier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTREPRISE__PUBLIER = eINSTANCE.getEntreprise_Publier();

		/**
		 * The meta object literal for the '{@link org.lpdql.jobSearch.impl.CandidatImpl <em>Candidat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lpdql.jobSearch.impl.CandidatImpl
		 * @see org.lpdql.jobSearch.impl.JobSearchPackageImpl#getCandidat()
		 * @generated
		 */
		EClass CANDIDAT = eINSTANCE.getCandidat();

		/**
		 * The meta object literal for the '<em><b>Diplome</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANDIDAT__DIPLOME = eINSTANCE.getCandidat_Diplome();

		/**
		 * The meta object literal for the '<em><b>Experience</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANDIDAT__EXPERIENCE = eINSTANCE.getCandidat_Experience();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANDIDAT__CONTACT = eINSTANCE.getCandidat_Contact();

		/**
		 * The meta object literal for the '<em><b>Prenom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANDIDAT__PRENOM = eINSTANCE.getCandidat_Prenom();

		/**
		 * The meta object literal for the '<em><b>Genre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANDIDAT__GENRE = eINSTANCE.getCandidat_Genre();

		/**
		 * The meta object literal for the '<em><b>Date Naissance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANDIDAT__DATE_NAISSANCE = eINSTANCE.getCandidat_DateNaissance();

		/**
		 * The meta object literal for the '<em><b>Competence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANDIDAT__COMPETENCE = eINSTANCE.getCandidat_Competence();

		/**
		 * The meta object literal for the '<em><b>Postuler</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CANDIDAT___POSTULER__OFFREEMPLOI = eINSTANCE.getCandidat__Postuler__OffreEmploi();

		/**
		 * The meta object literal for the '<em><b>Rechercher Emploi</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CANDIDAT___RECHERCHER_EMPLOI__STRING_STRING = eINSTANCE
				.getCandidat__RechercherEmploi__String_String();

		/**
		 * The meta object literal for the '{@link org.lpdql.jobSearch.impl.OffreEmploiImpl <em>Offre Emploi</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lpdql.jobSearch.impl.OffreEmploiImpl
		 * @see org.lpdql.jobSearch.impl.JobSearchPackageImpl#getOffreEmploi()
		 * @generated
		 */
		EClass OFFRE_EMPLOI = eINSTANCE.getOffreEmploi();

		/**
		 * The meta object literal for the '<em><b>Titre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFRE_EMPLOI__TITRE = eINSTANCE.getOffreEmploi_Titre();

		/**
		 * The meta object literal for the '<em><b>Date Publication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFRE_EMPLOI__DATE_PUBLICATION = eINSTANCE.getOffreEmploi_DatePublication();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFRE_EMPLOI__DESCRIPTION = eINSTANCE.getOffreEmploi_Description();

		/**
		 * The meta object literal for the '<em><b>Type Contrat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFRE_EMPLOI__TYPE_CONTRAT = eINSTANCE.getOffreEmploi_TypeContrat();

		/**
		 * The meta object literal for the '<em><b>Niveau Etude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFRE_EMPLOI__NIVEAU_ETUDE = eINSTANCE.getOffreEmploi_NiveauEtude();

		/**
		 * The meta object literal for the '<em><b>Niveau Experience</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFRE_EMPLOI__NIVEAU_EXPERIENCE = eINSTANCE.getOffreEmploi_NiveauExperience();

		/**
		 * The meta object literal for the '<em><b>Ville Emploi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFRE_EMPLOI__VILLE_EMPLOI = eINSTANCE.getOffreEmploi_VilleEmploi();

		/**
		 * The meta object literal for the '<em><b>Candidat</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFRE_EMPLOI__CANDIDAT = eINSTANCE.getOffreEmploi_Candidat();

		/**
		 * The meta object literal for the '{@link org.lpdql.jobSearch.impl.DiplomeImpl <em>Diplome</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lpdql.jobSearch.impl.DiplomeImpl
		 * @see org.lpdql.jobSearch.impl.JobSearchPackageImpl#getDiplome()
		 * @generated
		 */
		EClass DIPLOME = eINSTANCE.getDiplome();

		/**
		 * The meta object literal for the '<em><b>Niveau</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIPLOME__NIVEAU = eINSTANCE.getDiplome_Niveau();

		/**
		 * The meta object literal for the '<em><b>Domaine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIPLOME__DOMAINE = eINSTANCE.getDiplome_Domaine();

		/**
		 * The meta object literal for the '<em><b>Annee Obtention</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIPLOME__ANNEE_OBTENTION = eINSTANCE.getDiplome_AnneeObtention();

		/**
		 * The meta object literal for the '<em><b>Etablissement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIPLOME__ETABLISSEMENT = eINSTANCE.getDiplome_Etablissement();

		/**
		 * The meta object literal for the '{@link org.lpdql.jobSearch.impl.ExperienceImpl <em>Experience</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lpdql.jobSearch.impl.ExperienceImpl
		 * @see org.lpdql.jobSearch.impl.JobSearchPackageImpl#getExperience()
		 * @generated
		 */
		EClass EXPERIENCE = eINSTANCE.getExperience();

		/**
		 * The meta object literal for the '<em><b>Entreprise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIENCE__ENTREPRISE = eINSTANCE.getExperience_Entreprise();

		/**
		 * The meta object literal for the '<em><b>Date Debut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIENCE__DATE_DEBUT = eINSTANCE.getExperience_DateDebut();

		/**
		 * The meta object literal for the '<em><b>Date Fin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIENCE__DATE_FIN = eINSTANCE.getExperience_DateFin();

		/**
		 * The meta object literal for the '<em><b>Poste</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIENCE__POSTE = eINSTANCE.getExperience_Poste();

		/**
		 * The meta object literal for the '{@link org.lpdql.jobSearch.impl.ContactImpl <em>Contact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lpdql.jobSearch.impl.ContactImpl
		 * @see org.lpdql.jobSearch.impl.JobSearchPackageImpl#getContact()
		 * @generated
		 */
		EClass CONTACT = eINSTANCE.getContact();

		/**
		 * The meta object literal for the '<em><b>Adresse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__ADRESSE = eINSTANCE.getContact_Adresse();

		/**
		 * The meta object literal for the '<em><b>Ville</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__VILLE = eINSTANCE.getContact_Ville();

		/**
		 * The meta object literal for the '<em><b>Code Postal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__CODE_POSTAL = eINSTANCE.getContact_CodePostal();

		/**
		 * The meta object literal for the '<em><b>Telephone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__TELEPHONE = eINSTANCE.getContact_Telephone();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__EMAIL = eINSTANCE.getContact_Email();

		/**
		 * The meta object literal for the '{@link org.lpdql.jobSearch.impl.CompetenceImpl <em>Competence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lpdql.jobSearch.impl.CompetenceImpl
		 * @see org.lpdql.jobSearch.impl.JobSearchPackageImpl#getCompetence()
		 * @generated
		 */
		EClass COMPETENCE = eINSTANCE.getCompetence();

		/**
		 * The meta object literal for the '{@link org.lpdql.jobSearch.impl.JobSearchImpl <em>Job Search</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lpdql.jobSearch.impl.JobSearchImpl
		 * @see org.lpdql.jobSearch.impl.JobSearchPackageImpl#getJobSearch()
		 * @generated
		 */
		EClass JOB_SEARCH = eINSTANCE.getJobSearch();

		/**
		 * The meta object literal for the '<em><b>Candidat</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_SEARCH__CANDIDAT = eINSTANCE.getJobSearch_Candidat();

		/**
		 * The meta object literal for the '<em><b>Entreprise</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_SEARCH__ENTREPRISE = eINSTANCE.getJobSearch_Entreprise();

		/**
		 * The meta object literal for the '{@link org.lpdql.jobSearch.NamedElement <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lpdql.jobSearch.NamedElement
		 * @see org.lpdql.jobSearch.impl.JobSearchPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

	}

} //JobSearchPackage
