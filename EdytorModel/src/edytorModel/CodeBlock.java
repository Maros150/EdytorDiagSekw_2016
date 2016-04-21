/**
 */
package edytorModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edytorModel.CodeBlock#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see edytorModel.EdytorModelPackage#getCodeBlock()
 * @model
 * @generated
 */
public interface CodeBlock extends Operation {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(Code)
	 * @see edytorModel.EdytorModelPackage#getCodeBlock_Code()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getCode();

	/**
	 * Sets the value of the '{@link edytorModel.CodeBlock#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Code value);

} // CodeBlock
