/**
 */
package edytorModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edytorModel.If#getCondition <em>Condition</em>}</li>
 *   <li>{@link edytorModel.If#getElseifqueue <em>Elseifqueue</em>}</li>
 *   <li>{@link edytorModel.If#getElse <em>Else</em>}</li>
 *   <li>{@link edytorModel.If#getOperationsqueue <em>Operationsqueue</em>}</li>
 * </ul>
 *
 * @see edytorModel.EdytorModelPackage#getIf()
 * @model
 * @generated
 */
public interface If extends Operation {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Code)
	 * @see edytorModel.EdytorModelPackage#getIf_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getCondition();

	/**
	 * Sets the value of the '{@link edytorModel.If#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Code value);

	/**
	 * Returns the value of the '<em><b>Elseifqueue</b></em>' containment reference list.
	 * The list contents are of type {@link edytorModel.ElseiFQueueElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elseifqueue</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elseifqueue</em>' containment reference list.
	 * @see edytorModel.EdytorModelPackage#getIf_Elseifqueue()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElseiFQueueElement> getElseifqueue();

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference.
	 * @see #setElse(Else)
	 * @see edytorModel.EdytorModelPackage#getIf_Else()
	 * @model containment="true"
	 * @generated
	 */
	Else getElse();

	/**
	 * Sets the value of the '{@link edytorModel.If#getElse <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' containment reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(Else value);

	/**
	 * Returns the value of the '<em><b>Operationsqueue</b></em>' containment reference list.
	 * The list contents are of type {@link edytorModel.OperationsQueueElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operationsqueue</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operationsqueue</em>' containment reference list.
	 * @see edytorModel.EdytorModelPackage#getIf_Operationsqueue()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationsQueueElement> getOperationsqueue();

} // If
