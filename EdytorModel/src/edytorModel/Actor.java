/**
 */
package edytorModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edytorModel.Actor#getOperationsqueue <em>Operationsqueue</em>}</li>
 *   <li>{@link edytorModel.Actor#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see edytorModel.EdytorModelPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends EObject {
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
	 * @see edytorModel.EdytorModelPackage#getActor_Operationsqueue()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationsQueueElement> getOperationsqueue();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edytorModel.EdytorModelPackage#getActor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edytorModel.Actor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Actor
