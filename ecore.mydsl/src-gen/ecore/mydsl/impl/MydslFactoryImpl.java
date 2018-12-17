/**
 */
package ecore.mydsl.impl;

import ecore.mydsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MydslFactoryImpl extends EFactoryImpl implements MydslFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MydslFactory init() {
		try {
			MydslFactory theMydslFactory = (MydslFactory) EPackage.Registry.INSTANCE.getEFactory(MydslPackage.eNS_URI);
			if (theMydslFactory != null) {
				return theMydslFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MydslFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MydslFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MydslPackage.MY_MODEL:
			return createMyModel();
		case MydslPackage.MY_ELEMENT:
			return createMyElement();
		case MydslPackage.MY_REFERENCE:
			return createMyReference();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyModel createMyModel() {
		MyModelImpl myModel = new MyModelImpl();
		return myModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyElement createMyElement() {
		MyElementImpl myElement = new MyElementImpl();
		return myElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyReference createMyReference() {
		MyReferenceImpl myReference = new MyReferenceImpl();
		return myReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MydslPackage getMydslPackage() {
		return (MydslPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MydslPackage getPackage() {
		return MydslPackage.eINSTANCE;
	}

} //MydslFactoryImpl
