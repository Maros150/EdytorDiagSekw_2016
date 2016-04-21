/**
 */
package edytorModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edytorModel.Loop#getStart <em>Start</em>}</li>
 *   <li>{@link edytorModel.Loop#getEnd <em>End</em>}</li>
 *   <li>{@link edytorModel.Loop#getStep <em>Step</em>}</li>
 *   <li>{@link edytorModel.Loop#getOperationsqueue <em>Operationsqueue</em>}</li>
 * </ul>
 *
 * @see edytorModel.EdytorModelPackage#getLoop()
 * @model
 * @generated
 */
public interface Loop extends Operation {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(Code)
	 * @see edytorModel.EdytorModelPackage#getLoop_Start()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStart();

	/**
	 * Sets the value of the '{@link edytorModel.Loop#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Code value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(Code)
	 * @see edytorModel.EdytorModelPackage#getLoop_End()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getEnd();

	/**
	 * Sets the value of the '{@link edytorModel.Loop#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Code value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' containment reference.
	 * @see #setStep(Code)
	 * @see edytorModel.EdytorModelPackage#getLoop_Step()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStep();

	/**
	 * Sets the value of the '{@link edytorModel.Loop#getStep <em>Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' containment reference.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(Code value);

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
	 * @see edytorModel.EdytorModelPackage#getLoop_Operationsqueue()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationsQueueElement> getOperationsqueue();

} // Loop
