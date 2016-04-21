/**
 */
package edytorModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elsei FQueue Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edytorModel.ElseiFQueueElement#getId <em>Id</em>}</li>
 *   <li>{@link edytorModel.ElseiFQueueElement#getElseif <em>Elseif</em>}</li>
 * </ul>
 *
 * @see edytorModel.EdytorModelPackage#getElseiFQueueElement()
 * @model
 * @generated
 */
public interface ElseiFQueueElement extends EObject {
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
	 * @see edytorModel.EdytorModelPackage#getElseiFQueueElement_Id()
	 * @model required="true"
	 * @generated
	 */
	double getId();

	/**
	 * Sets the value of the '{@link edytorModel.ElseiFQueueElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(double value);

	/**
	 * Returns the value of the '<em><b>Elseif</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elseif</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elseif</em>' containment reference.
	 * @see #setElseif(ElseIf)
	 * @see edytorModel.EdytorModelPackage#getElseiFQueueElement_Elseif()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ElseIf getElseif();

	/**
	 * Sets the value of the '{@link edytorModel.ElseiFQueueElement#getElseif <em>Elseif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elseif</em>' containment reference.
	 * @see #getElseif()
	 * @generated
	 */
	void setElseif(ElseIf value);

} // ElseiFQueueElement
