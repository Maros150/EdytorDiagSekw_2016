/**
 */
package edytorModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edytorModel.FunctionBlock#getOperationsqueue <em>Operationsqueue</em>}</li>
 *   <li>{@link edytorModel.FunctionBlock#getReturn <em>Return</em>}</li>
 *   <li>{@link edytorModel.FunctionBlock#getFunctionName <em>Function Name</em>}</li>
 *   <li>{@link edytorModel.FunctionBlock#getArguments <em>Arguments</em>}</li>
 *   <li>{@link edytorModel.FunctionBlock#getFunctionDef <em>Function Def</em>}</li>
 *   <li>{@link edytorModel.FunctionBlock#isIsDef <em>Is Def</em>}</li>
 * </ul>
 *
 * @see edytorModel.EdytorModelPackage#getFunctionBlock()
 * @model
 * @generated
 */
public interface FunctionBlock extends Operation {
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
	 * @see edytorModel.EdytorModelPackage#getFunctionBlock_Operationsqueue()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationsQueueElement> getOperationsqueue();

	/**
	 * Returns the value of the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' containment reference.
	 * @see #setReturn(Code)
	 * @see edytorModel.EdytorModelPackage#getFunctionBlock_Return()
	 * @model containment="true"
	 * @generated
	 */
	Code getReturn();

	/**
	 * Sets the value of the '{@link edytorModel.FunctionBlock#getReturn <em>Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' containment reference.
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(Code value);

	/**
	 * Returns the value of the '<em><b>Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Name</em>' attribute.
	 * @see #setFunctionName(String)
	 * @see edytorModel.EdytorModelPackage#getFunctionBlock_FunctionName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getFunctionName();

	/**
	 * Sets the value of the '{@link edytorModel.FunctionBlock#getFunctionName <em>Function Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Name</em>' attribute.
	 * @see #getFunctionName()
	 * @generated
	 */
	void setFunctionName(String value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link edytorModel.Argument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see edytorModel.EdytorModelPackage#getFunctionBlock_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Argument> getArguments();

	/**
	 * Returns the value of the '<em><b>Function Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Def</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Def</em>' reference.
	 * @see #setFunctionDef(FunctionBlock)
	 * @see edytorModel.EdytorModelPackage#getFunctionBlock_FunctionDef()
	 * @model
	 * @generated
	 */
	FunctionBlock getFunctionDef();

	/**
	 * Sets the value of the '{@link edytorModel.FunctionBlock#getFunctionDef <em>Function Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Def</em>' reference.
	 * @see #getFunctionDef()
	 * @generated
	 */
	void setFunctionDef(FunctionBlock value);

	/**
	 * Returns the value of the '<em><b>Is Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Def</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Def</em>' attribute.
	 * @see #setIsDef(boolean)
	 * @see edytorModel.EdytorModelPackage#getFunctionBlock_IsDef()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsDef();

	/**
	 * Sets the value of the '{@link edytorModel.FunctionBlock#isIsDef <em>Is Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Def</em>' attribute.
	 * @see #isIsDef()
	 * @generated
	 */
	void setIsDef(boolean value);

} // FunctionBlock
