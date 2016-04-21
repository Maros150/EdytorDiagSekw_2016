/**
 */
package edytorModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operations Queue Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edytorModel.OperationsQueueElement#getId <em>Id</em>}</li>
 *   <li>{@link edytorModel.OperationsQueueElement#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see edytorModel.EdytorModelPackage#getOperationsQueueElement()
 * @model
 * @generated
 */
public interface OperationsQueueElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(double)
	 * @see edytorModel.EdytorModelPackage#getOperationsQueueElement_Id()
	 * @model required="true"
	 * @generated
	 */
	double getId();

	/**
	 * Sets the value of the '{@link edytorModel.OperationsQueueElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(double value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference.
	 * @see #setOperation(Operation)
	 * @see edytorModel.EdytorModelPackage#getOperationsQueueElement_Operation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link edytorModel.OperationsQueueElement#getOperation <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' containment reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

} // OperationsQueueElement
