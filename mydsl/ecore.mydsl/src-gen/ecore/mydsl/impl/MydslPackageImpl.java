/**
 */
package ecore.mydsl.impl;

import ecore.mydsl.MyAbstractElement;
import ecore.mydsl.MyElement;
import ecore.mydsl.MyModel;
import ecore.mydsl.MyReference;
import ecore.mydsl.MydslFactory;
import ecore.mydsl.MydslPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MydslPackageImpl extends EPackageImpl implements MydslPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass myModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass myAbstractElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass myElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass myReferenceEClass = null;

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
	 * @see ecore.mydsl.MydslPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MydslPackageImpl() {
		super(eNS_URI, MydslFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MydslPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MydslPackage init() {
		if (isInited)
			return (MydslPackage) EPackage.Registry.INSTANCE.getEPackage(MydslPackage.eNS_URI);

		// Obtain or create and register package
		MydslPackageImpl theMydslPackage = (MydslPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof MydslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new MydslPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theMydslPackage.createPackageContents();

		// Initialize created meta-data
		theMydslPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMydslPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MydslPackage.eNS_URI, theMydslPackage);
		return theMydslPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMyModel() {
		return myModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMyModel_Name() {
		return (EAttribute) myModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMyModel_Elements() {
		return (EReference) myModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMyAbstractElement() {
		return myAbstractElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMyElement() {
		return myElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMyElement_Name() {
		return (EAttribute) myElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMyReference() {
		return myReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMyReference_Element() {
		return (EReference) myReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MydslFactory getMydslFactory() {
		return (MydslFactory) getEFactoryInstance();
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
		myModelEClass = createEClass(MY_MODEL);
		createEAttribute(myModelEClass, MY_MODEL__NAME);
		createEReference(myModelEClass, MY_MODEL__ELEMENTS);

		myAbstractElementEClass = createEClass(MY_ABSTRACT_ELEMENT);

		myElementEClass = createEClass(MY_ELEMENT);
		createEAttribute(myElementEClass, MY_ELEMENT__NAME);

		myReferenceEClass = createEClass(MY_REFERENCE);
		createEReference(myReferenceEClass, MY_REFERENCE__ELEMENT);
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
		myElementEClass.getESuperTypes().add(this.getMyAbstractElement());
		myReferenceEClass.getESuperTypes().add(this.getMyAbstractElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(myModelEClass, MyModel.class, "MyModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMyModel_Name(), ecorePackage.getEString(), "name", null, 1, 1, MyModel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMyModel_Elements(), this.getMyAbstractElement(), null, "elements", null, 0, -1, MyModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(myAbstractElementEClass, MyAbstractElement.class, "MyAbstractElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(myElementEClass, MyElement.class, "MyElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMyElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, MyElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(myReferenceEClass, MyReference.class, "MyReference", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMyReference_Element(), this.getMyElement(), null, "element", null, 1, 1, MyReference.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MydslPackageImpl
