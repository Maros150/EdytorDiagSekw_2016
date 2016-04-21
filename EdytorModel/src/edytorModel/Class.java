/**
 */
package edytorModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edytorModel.Class#getFunctionsdefinition <em>Functionsdefinition</em>}</li>
 *   <li>{@link edytorModel.Class#getFunctionblocks <em>Functionblocks</em>}</li>
 *   <li>{@link edytorModel.Class#getExtends <em>Extends</em>}</li>
 *   <li>{@link edytorModel.Class#isIsThread <em>Is Thread</em>}</li>
 *   <li>{@link edytorModel.Class#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see edytorModel.EdytorModelPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends EObject {
	/**
	 * Returns the value of the '<em><b>Functionsdefinition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functionsdefinition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functionsdefinition</em>' containment reference.
	 * @see #setFunctionsdefinition(FunctionDefinition)
	 * @see edytorModel.EdytorModelPackage#getClass_Functionsdefinition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FunctionDefinition getFunctionsdefinition();

	/**
	 * Sets the value of the '{@link edytorModel.Class#getFunctionsdefinition <em>Functionsdefinition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functionsdefinition</em>' containment reference.
	 * @see #getFunctionsdefinition()
	 * @generated
	 */
	void setFunctionsdefinition(FunctionDefinition value);

	/**
	 * Returns the value of the '<em><b>Functionblocks</b></em>' containment reference list.
	 * The list contents are of type {@link edytorModel.FunctionBlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functionblocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functionblocks</em>' containment reference list.
	 * @see edytorModel.EdytorModelPackage#getClass_Functionblocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionBlock> getFunctionblocks();

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference.
	 * @see #setExtends(Class)
	 * @see edytorModel.EdytorModelPackage#getClass_Extends()
	 * @model
	 * @generated
	 */
	Class getExtends();

	/**
	 * Sets the value of the '{@link edytorModel.Class#getExtends <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(Class value);

	/**
	 * Returns the value of the '<em><b>Is Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Thread</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Thread</em>' attribute.
	 * @see #setIsThread(boolean)
	 * @see edytorModel.EdytorModelPackage#getClass_IsThread()
	 * @model
	 * @generated
	 */
	boolean isIsThread();

	/**
	 * Sets the value of the '{@link edytorModel.Class#isIsThread <em>Is Thread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Thread</em>' attribute.
	 * @see #isIsThread()
	 * @generated
	 */
	void setIsThread(boolean value);

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
	 * @see edytorModel.EdytorModelPackage#getClass_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edytorModel.Class#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Class
