/**
 */
package org.lpdql.jobSearch.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.lpdql.jobSearch.Candidat;
import org.lpdql.jobSearch.Competence;
import org.lpdql.jobSearch.Contact;
import org.lpdql.jobSearch.Diplome;
import org.lpdql.jobSearch.Entreprise;
import org.lpdql.jobSearch.Experience;
import org.lpdql.jobSearch.JobSearch;
import org.lpdql.jobSearch.JobSearchFactory;
import org.lpdql.jobSearch.JobSearchPackage;
import org.lpdql.jobSearch.NamedElement;
import org.lpdql.jobSearch.OffreEmploi;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JobSearchPackageImpl extends EPackageImpl implements JobSearchPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entrepriseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass candidatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offreEmploiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diplomeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass experienceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass competenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobSearchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.lpdql.jobSearch.JobSearchPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JobSearchPackageImpl() {
		super(eNS_URI, JobSearchFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link JobSearchPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JobSearchPackage init() {
		if (isInited)
			return (JobSearchPackage) EPackage.Registry.INSTANCE.getEPackage(JobSearchPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredJobSearchPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		JobSearchPackageImpl theJobSearchPackage = registeredJobSearchPackage instanceof JobSearchPackageImpl
				? (JobSearchPackageImpl) registeredJobSearchPackage
				: new JobSearchPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theJobSearchPackage.createPackageContents();

		// Initialize created meta-data
		theJobSearchPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJobSearchPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JobSearchPackage.eNS_URI, theJobSearchPackage);
		return theJobSearchPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntreprise() {
		return entrepriseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntreprise_Contact() {
		return (EReference) entrepriseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntreprise_Domaine() {
		return (EAttribute) entrepriseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntreprise_Description() {
		return (EAttribute) entrepriseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntreprise_Publier() {
		return (EReference) entrepriseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCandidat() {
		return candidatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCandidat_Diplome() {
		return (EReference) candidatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCandidat_Experience() {
		return (EReference) candidatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCandidat_Contact() {
		return (EReference) candidatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCandidat_Prenom() {
		return (EAttribute) candidatEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCandidat_Genre() {
		return (EAttribute) candidatEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCandidat_DateNaissance() {
		return (EAttribute) candidatEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCandidat_Competence() {
		return (EReference) candidatEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCandidat__Postuler__OffreEmploi() {
		return candidatEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCandidat__RechercherEmploi__String_String() {
		return candidatEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOffreEmploi() {
		return offreEmploiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOffreEmploi_Titre() {
		return (EAttribute) offreEmploiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOffreEmploi_DatePublication() {
		return (EAttribute) offreEmploiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOffreEmploi_Description() {
		return (EAttribute) offreEmploiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOffreEmploi_TypeContrat() {
		return (EAttribute) offreEmploiEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOffreEmploi_NiveauEtude() {
		return (EAttribute) offreEmploiEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOffreEmploi_NiveauExperience() {
		return (EAttribute) offreEmploiEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOffreEmploi_VilleEmploi() {
		return (EAttribute) offreEmploiEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOffreEmploi_Candidat() {
		return (EReference) offreEmploiEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiplome() {
		return diplomeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiplome_Niveau() {
		return (EAttribute) diplomeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiplome_Domaine() {
		return (EAttribute) diplomeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiplome_AnneeObtention() {
		return (EAttribute) diplomeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiplome_Etablissement() {
		return (EAttribute) diplomeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExperience() {
		return experienceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperience_Entreprise() {
		return (EAttribute) experienceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperience_DateDebut() {
		return (EAttribute) experienceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperience_DateFin() {
		return (EAttribute) experienceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperience_Poste() {
		return (EAttribute) experienceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContact() {
		return contactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContact_Adresse() {
		return (EAttribute) contactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContact_Ville() {
		return (EAttribute) contactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContact_CodePostal() {
		return (EAttribute) contactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContact_Telephone() {
		return (EAttribute) contactEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContact_Email() {
		return (EAttribute) contactEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompetence() {
		return competenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJobSearch() {
		return jobSearchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobSearch_Candidat() {
		return (EReference) jobSearchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobSearch_Entreprise() {
		return (EReference) jobSearchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobSearchFactory getJobSearchFactory() {
		return (JobSearchFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		entrepriseEClass = createEClass(ENTREPRISE);
		createEReference(entrepriseEClass, ENTREPRISE__CONTACT);
		createEAttribute(entrepriseEClass, ENTREPRISE__DOMAINE);
		createEAttribute(entrepriseEClass, ENTREPRISE__DESCRIPTION);
		createEReference(entrepriseEClass, ENTREPRISE__PUBLIER);

		candidatEClass = createEClass(CANDIDAT);
		createEReference(candidatEClass, CANDIDAT__DIPLOME);
		createEReference(candidatEClass, CANDIDAT__EXPERIENCE);
		createEReference(candidatEClass, CANDIDAT__CONTACT);
		createEAttribute(candidatEClass, CANDIDAT__PRENOM);
		createEAttribute(candidatEClass, CANDIDAT__GENRE);
		createEAttribute(candidatEClass, CANDIDAT__DATE_NAISSANCE);
		createEReference(candidatEClass, CANDIDAT__COMPETENCE);
		createEOperation(candidatEClass, CANDIDAT___POSTULER__OFFREEMPLOI);
		createEOperation(candidatEClass, CANDIDAT___RECHERCHER_EMPLOI__STRING_STRING);

		offreEmploiEClass = createEClass(OFFRE_EMPLOI);
		createEAttribute(offreEmploiEClass, OFFRE_EMPLOI__TITRE);
		createEAttribute(offreEmploiEClass, OFFRE_EMPLOI__DATE_PUBLICATION);
		createEAttribute(offreEmploiEClass, OFFRE_EMPLOI__DESCRIPTION);
		createEAttribute(offreEmploiEClass, OFFRE_EMPLOI__TYPE_CONTRAT);
		createEAttribute(offreEmploiEClass, OFFRE_EMPLOI__NIVEAU_ETUDE);
		createEAttribute(offreEmploiEClass, OFFRE_EMPLOI__NIVEAU_EXPERIENCE);
		createEAttribute(offreEmploiEClass, OFFRE_EMPLOI__VILLE_EMPLOI);
		createEReference(offreEmploiEClass, OFFRE_EMPLOI__CANDIDAT);

		diplomeEClass = createEClass(DIPLOME);
		createEAttribute(diplomeEClass, DIPLOME__NIVEAU);
		createEAttribute(diplomeEClass, DIPLOME__DOMAINE);
		createEAttribute(diplomeEClass, DIPLOME__ANNEE_OBTENTION);
		createEAttribute(diplomeEClass, DIPLOME__ETABLISSEMENT);

		experienceEClass = createEClass(EXPERIENCE);
		createEAttribute(experienceEClass, EXPERIENCE__ENTREPRISE);
		createEAttribute(experienceEClass, EXPERIENCE__DATE_DEBUT);
		createEAttribute(experienceEClass, EXPERIENCE__DATE_FIN);
		createEAttribute(experienceEClass, EXPERIENCE__POSTE);

		contactEClass = createEClass(CONTACT);
		createEAttribute(contactEClass, CONTACT__ADRESSE);
		createEAttribute(contactEClass, CONTACT__VILLE);
		createEAttribute(contactEClass, CONTACT__CODE_POSTAL);
		createEAttribute(contactEClass, CONTACT__TELEPHONE);
		createEAttribute(contactEClass, CONTACT__EMAIL);

		competenceEClass = createEClass(COMPETENCE);

		jobSearchEClass = createEClass(JOB_SEARCH);
		createEReference(jobSearchEClass, JOB_SEARCH__CANDIDAT);
		createEReference(jobSearchEClass, JOB_SEARCH__ENTREPRISE);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		entrepriseEClass.getESuperTypes().add(this.getNamedElement());
		candidatEClass.getESuperTypes().add(this.getNamedElement());
		competenceEClass.getESuperTypes().add(this.getNamedElement());
		jobSearchEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(entrepriseEClass, Entreprise.class, "Entreprise", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntreprise_Contact(), this.getContact(), null, "contact", null, 0, 1, Entreprise.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntreprise_Domaine(), ecorePackage.getEString(), "domaine", null, 0, 1, Entreprise.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntreprise_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				Entreprise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEntreprise_Publier(), this.getOffreEmploi(), null, "publier", null, 0, -1, Entreprise.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(candidatEClass, Candidat.class, "Candidat", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCandidat_Diplome(), this.getDiplome(), null, "diplome", null, 0, -1, Candidat.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCandidat_Experience(), this.getExperience(), null, "experience", null, 0, -1, Candidat.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCandidat_Contact(), this.getContact(), null, "contact", null, 0, 1, Candidat.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCandidat_Prenom(), ecorePackage.getEString(), "prenom", null, 0, 1, Candidat.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCandidat_Genre(), ecorePackage.getEChar(), "genre", null, 0, 1, Candidat.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCandidat_DateNaissance(), ecorePackage.getEDate(), "dateNaissance", null, 0, 1,
				Candidat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getCandidat_Competence(), this.getCompetence(), null, "competence", null, 0, -1, Candidat.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getCandidat__Postuler__OffreEmploi(), null, "postuler", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getOffreEmploi(), "offreEmploi", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCandidat__RechercherEmploi__String_String(), this.getOffreEmploi(), "rechercherEmploi",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lieu", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "motsCles", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(offreEmploiEClass, OffreEmploi.class, "OffreEmploi", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOffreEmploi_Titre(), ecorePackage.getEString(), "titre", null, 0, 1, OffreEmploi.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOffreEmploi_DatePublication(), ecorePackage.getEDate(), "datePublication", null, 0, 1,
				OffreEmploi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getOffreEmploi_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				OffreEmploi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getOffreEmploi_TypeContrat(), ecorePackage.getEString(), "typeContrat", null, 0, 1,
				OffreEmploi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getOffreEmploi_NiveauEtude(), ecorePackage.getEString(), "niveauEtude", null, 0, 1,
				OffreEmploi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getOffreEmploi_NiveauExperience(), ecorePackage.getEInt(), "niveauExperience", null, 0, 1,
				OffreEmploi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getOffreEmploi_VilleEmploi(), ecorePackage.getEString(), "villeEmploi", null, 0, 1,
				OffreEmploi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getOffreEmploi_Candidat(), this.getCandidat(), null, "candidat", null, 0, -1, OffreEmploi.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diplomeEClass, Diplome.class, "Diplome", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiplome_Niveau(), ecorePackage.getEString(), "niveau", null, 0, 1, Diplome.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiplome_Domaine(), ecorePackage.getEString(), "domaine", null, 0, 1, Diplome.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiplome_AnneeObtention(), ecorePackage.getEDate(), "anneeObtention", null, 0, 1,
				Diplome.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiplome_Etablissement(), ecorePackage.getEString(), "etablissement", null, 0, 1,
				Diplome.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(experienceEClass, Experience.class, "Experience", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExperience_Entreprise(), ecorePackage.getEString(), "entreprise", null, 0, 1,
				Experience.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperience_DateDebut(), ecorePackage.getEDate(), "dateDebut", null, 0, 1, Experience.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperience_DateFin(), ecorePackage.getEDate(), "dateFin", null, 0, 1, Experience.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperience_Poste(), ecorePackage.getEString(), "poste", null, 0, 1, Experience.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contactEClass, Contact.class, "Contact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContact_Adresse(), ecorePackage.getEString(), "adresse", null, 0, 1, Contact.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContact_Ville(), ecorePackage.getEString(), "ville", null, 0, 1, Contact.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContact_CodePostal(), ecorePackage.getEInt(), "codePostal", null, 0, 1, Contact.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContact_Telephone(), ecorePackage.getEInt(), "telephone", null, 0, 1, Contact.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContact_Email(), ecorePackage.getEString(), "email", null, 0, 1, Contact.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(competenceEClass, Competence.class, "Competence", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(jobSearchEClass, JobSearch.class, "JobSearch", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJobSearch_Candidat(), this.getCandidat(), null, "candidat", null, 0, -1, JobSearch.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJobSearch_Entreprise(), this.getEntreprise(), null, "entreprise", null, 0, -1,
				JobSearch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //JobSearchPackageImpl
