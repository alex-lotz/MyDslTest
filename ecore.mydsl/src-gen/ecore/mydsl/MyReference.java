/**
 */
package ecore.mydsl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>My Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.mydsl.MyReference#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see ecore.mydsl.MydslPackage#getMyReference()
 * @model
 * @generated
 */
public interface MyReference extends MyAbstractElement {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(MyElement)
	 * @see ecore.mydsl.MydslPackage#getMyReference_Element()
	 * @model required="true"
	 * @generated
	 */
	MyElement getElement();

	/**
	 * Sets the value of the '{@link ecore.mydsl.MyReference#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(MyElement value);

} // MyReference
