/**
 */
package ecore.mydsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ecore.mydsl.MydslPackage
 * @generated
 */
public interface MydslFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MydslFactory eINSTANCE = ecore.mydsl.impl.MydslFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>My Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>My Model</em>'.
	 * @generated
	 */
	MyModel createMyModel();

	/**
	 * Returns a new object of class '<em>My Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>My Element</em>'.
	 * @generated
	 */
	MyElement createMyElement();

	/**
	 * Returns a new object of class '<em>My Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>My Reference</em>'.
	 * @generated
	 */
	MyReference createMyReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MydslPackage getMydslPackage();

} //MydslFactory
