/**
 */
package ecore.mydsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see ecore.mydsl.MydslFactory
 * @model kind="package"
 * @generated
 */
public interface MydslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mydsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/mydsl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mydsl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MydslPackage eINSTANCE = ecore.mydsl.impl.MydslPackageImpl.init();

	/**
	 * The meta object id for the '{@link ecore.mydsl.impl.MyModelImpl <em>My Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.mydsl.impl.MyModelImpl
	 * @see ecore.mydsl.impl.MydslPackageImpl#getMyModel()
	 * @generated
	 */
	int MY_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_MODEL__ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>My Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>My Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecore.mydsl.impl.MyAbstractElementImpl <em>My Abstract Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.mydsl.impl.MyAbstractElementImpl
	 * @see ecore.mydsl.impl.MydslPackageImpl#getMyAbstractElement()
	 * @generated
	 */
	int MY_ABSTRACT_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>My Abstract Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_ABSTRACT_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>My Abstract Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_ABSTRACT_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecore.mydsl.impl.MyElementImpl <em>My Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.mydsl.impl.MyElementImpl
	 * @see ecore.mydsl.impl.MydslPackageImpl#getMyElement()
	 * @generated
	 */
	int MY_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_ELEMENT__NAME = MY_ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>My Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_ELEMENT_FEATURE_COUNT = MY_ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>My Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_ELEMENT_OPERATION_COUNT = MY_ABSTRACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecore.mydsl.impl.MyReferenceImpl <em>My Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.mydsl.impl.MyReferenceImpl
	 * @see ecore.mydsl.impl.MydslPackageImpl#getMyReference()
	 * @generated
	 */
	int MY_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_REFERENCE__ELEMENT = MY_ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>My Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_REFERENCE_FEATURE_COUNT = MY_ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>My Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_REFERENCE_OPERATION_COUNT = MY_ABSTRACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link ecore.mydsl.MyModel <em>My Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>My Model</em>'.
	 * @see ecore.mydsl.MyModel
	 * @generated
	 */
	EClass getMyModel();

	/**
	 * Returns the meta object for the attribute '{@link ecore.mydsl.MyModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecore.mydsl.MyModel#getName()
	 * @see #getMyModel()
	 * @generated
	 */
	EAttribute getMyModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ecore.mydsl.MyModel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see ecore.mydsl.MyModel#getElements()
	 * @see #getMyModel()
	 * @generated
	 */
	EReference getMyModel_Elements();

	/**
	 * Returns the meta object for class '{@link ecore.mydsl.MyAbstractElement <em>My Abstract Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>My Abstract Element</em>'.
	 * @see ecore.mydsl.MyAbstractElement
	 * @generated
	 */
	EClass getMyAbstractElement();

	/**
	 * Returns the meta object for class '{@link ecore.mydsl.MyElement <em>My Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>My Element</em>'.
	 * @see ecore.mydsl.MyElement
	 * @generated
	 */
	EClass getMyElement();

	/**
	 * Returns the meta object for the attribute '{@link ecore.mydsl.MyElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecore.mydsl.MyElement#getName()
	 * @see #getMyElement()
	 * @generated
	 */
	EAttribute getMyElement_Name();

	/**
	 * Returns the meta object for class '{@link ecore.mydsl.MyReference <em>My Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>My Reference</em>'.
	 * @see ecore.mydsl.MyReference
	 * @generated
	 */
	EClass getMyReference();

	/**
	 * Returns the meta object for the reference '{@link ecore.mydsl.MyReference#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see ecore.mydsl.MyReference#getElement()
	 * @see #getMyReference()
	 * @generated
	 */
	EReference getMyReference_Element();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MydslFactory getMydslFactory();

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
		 * The meta object literal for the '{@link ecore.mydsl.impl.MyModelImpl <em>My Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.mydsl.impl.MyModelImpl
		 * @see ecore.mydsl.impl.MydslPackageImpl#getMyModel()
		 * @generated
		 */
		EClass MY_MODEL = eINSTANCE.getMyModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MY_MODEL__NAME = eINSTANCE.getMyModel_Name();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MY_MODEL__ELEMENTS = eINSTANCE.getMyModel_Elements();

		/**
		 * The meta object literal for the '{@link ecore.mydsl.impl.MyAbstractElementImpl <em>My Abstract Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.mydsl.impl.MyAbstractElementImpl
		 * @see ecore.mydsl.impl.MydslPackageImpl#getMyAbstractElement()
		 * @generated
		 */
		EClass MY_ABSTRACT_ELEMENT = eINSTANCE.getMyAbstractElement();

		/**
		 * The meta object literal for the '{@link ecore.mydsl.impl.MyElementImpl <em>My Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.mydsl.impl.MyElementImpl
		 * @see ecore.mydsl.impl.MydslPackageImpl#getMyElement()
		 * @generated
		 */
		EClass MY_ELEMENT = eINSTANCE.getMyElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MY_ELEMENT__NAME = eINSTANCE.getMyElement_Name();

		/**
		 * The meta object literal for the '{@link ecore.mydsl.impl.MyReferenceImpl <em>My Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.mydsl.impl.MyReferenceImpl
		 * @see ecore.mydsl.impl.MydslPackageImpl#getMyReference()
		 * @generated
		 */
		EClass MY_REFERENCE = eINSTANCE.getMyReference();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MY_REFERENCE__ELEMENT = eINSTANCE.getMyReference_Element();

	}

} //MydslPackage
