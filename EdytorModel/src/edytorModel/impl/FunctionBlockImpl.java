/**
 */
package edytorModel.impl;

import edytorModel.Argument;
import edytorModel.Code;
import edytorModel.EdytorModelPackage;
import edytorModel.FunctionBlock;
import edytorModel.OperationsQueueElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edytorModel.impl.FunctionBlockImpl#getOperationsqueue <em>Operationsqueue</em>}</li>
 *   <li>{@link edytorModel.impl.FunctionBlockImpl#getReturn <em>Return</em>}</li>
 *   <li>{@link edytorModel.impl.FunctionBlockImpl#getFunctionName <em>Function Name</em>}</li>
 *   <li>{@link edytorModel.impl.FunctionBlockImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link edytorModel.impl.FunctionBlockImpl#getFunctionDef <em>Function Def</em>}</li>
 *   <li>{@link edytorModel.impl.FunctionBlockImpl#isIsDef <em>Is Def</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionBlockImpl extends OperationImpl implements FunctionBlock {
	/**
	 * The cached value of the '{@link #getOperationsqueue() <em>Operationsqueue</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationsqueue()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationsQueueElement> operationsqueue;

	/**
	 * The cached value of the '{@link #getReturn() <em>Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturn()
	 * @generated
	 * @ordered
	 */
	protected Code return_;

	/**
	 * The default value of the '{@link #getFunctionName() <em>Function Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionName()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFunctionName() <em>Function Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionName()
	 * @generated
	 * @ordered
	 */
	protected String functionName = FUNCTION_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> arguments;

	/**
	 * The cached value of the '{@link #getFunctionDef() <em>Function Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionDef()
	 * @generated
	 * @ordered
	 */
	protected FunctionBlock functionDef;

	/**
	 * The default value of the '{@link #isIsDef() <em>Is Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDef()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DEF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDef() <em>Is Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDef()
	 * @generated
	 * @ordered
	 */
	protected boolean isDef = IS_DEF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdytorModelPackage.Literals.FUNCTION_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationsQueueElement> getOperationsqueue() {
		if (operationsqueue == null) {
			operationsqueue = new EObjectContainmentEList<OperationsQueueElement>(OperationsQueueElement.class, this, EdytorModelPackage.FUNCTION_BLOCK__OPERATIONSQUEUE);
		}
		return operationsqueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getReturn() {
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturn(Code newReturn, NotificationChain msgs) {
		Code oldReturn = return_;
		return_ = newReturn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdytorModelPackage.FUNCTION_BLOCK__RETURN, oldReturn, newReturn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturn(Code newReturn) {
		if (newReturn != return_) {
			NotificationChain msgs = null;
			if (return_ != null)
				msgs = ((InternalEObject)return_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdytorModelPackage.FUNCTION_BLOCK__RETURN, null, msgs);
			if (newReturn != null)
				msgs = ((InternalEObject)newReturn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdytorModelPackage.FUNCTION_BLOCK__RETURN, null, msgs);
			msgs = basicSetReturn(newReturn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdytorModelPackage.FUNCTION_BLOCK__RETURN, newReturn, newReturn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFunctionName() {
		return functionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionName(String newFunctionName) {
		String oldFunctionName = functionName;
		functionName = newFunctionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdytorModelPackage.FUNCTION_BLOCK__FUNCTION_NAME, oldFunctionName, functionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Argument> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<Argument>(Argument.class, this, EdytorModelPackage.FUNCTION_BLOCK__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlock getFunctionDef() {
		if (functionDef != null && functionDef.eIsProxy()) {
			InternalEObject oldFunctionDef = (InternalEObject)functionDef;
			functionDef = (FunctionBlock)eResolveProxy(oldFunctionDef);
			if (functionDef != oldFunctionDef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdytorModelPackage.FUNCTION_BLOCK__FUNCTION_DEF, oldFunctionDef, functionDef));
			}
		}
		return functionDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlock basicGetFunctionDef() {
		return functionDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionDef(FunctionBlock newFunctionDef) {
		FunctionBlock oldFunctionDef = functionDef;
		functionDef = newFunctionDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdytorModelPackage.FUNCTION_BLOCK__FUNCTION_DEF, oldFunctionDef, functionDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDef() {
		return isDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDef(boolean newIsDef) {
		boolean oldIsDef = isDef;
		isDef = newIsDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdytorModelPackage.FUNCTION_BLOCK__IS_DEF, oldIsDef, isDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdytorModelPackage.FUNCTION_BLOCK__OPERATIONSQUEUE:
				return ((InternalEList<?>)getOperationsqueue()).basicRemove(otherEnd, msgs);
			case EdytorModelPackage.FUNCTION_BLOCK__RETURN:
				return basicSetReturn(null, msgs);
			case EdytorModelPackage.FUNCTION_BLOCK__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdytorModelPackage.FUNCTION_BLOCK__OPERATIONSQUEUE:
				return getOperationsqueue();
			case EdytorModelPackage.FUNCTION_BLOCK__RETURN:
				return getReturn();
			case EdytorModelPackage.FUNCTION_BLOCK__FUNCTION_NAME:
				return getFunctionName();
			case EdytorModelPackage.FUNCTION_BLOCK__ARGUMENTS:
				return getArguments();
			case EdytorModelPackage.FUNCTION_BLOCK__FUNCTION_DEF:
				if (resolve) return getFunctionDef();
				return basicGetFunctionDef();
			case EdytorModelPackage.FUNCTION_BLOCK__IS_DEF:
				return isIsDef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EdytorModelPackage.FUNCTION_BLOCK__OPERATIONSQUEUE:
				getOperationsqueue().clear();
				getOperationsqueue().addAll((Collection<? extends OperationsQueueElement>)newValue);
				return;
			case EdytorModelPackage.FUNCTION_BLOCK__RETURN:
				setReturn((Code)newValue);
				return;
			case EdytorModelPackage.FUNCTION_BLOCK__FUNCTION_NAME:
				setFunctionName((String)newValue);
				return;
			case EdytorModelPackage.FUNCTION_BLOCK__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Argument>)newValue);
				return;
			case EdytorModelPackage.FUNCTION_BLOCK__FUNCTION_DEF:
				setFunctionDef((FunctionBlock)newValue);
				return;
			case EdytorModelPackage.FUNCTION_BLOCK__IS_DEF:
				setIsDef((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EdytorModelPackage.FUNCTION_BLOCK__OPERATIONSQUEUE:
				getOperationsqueue().clear();
				return;
			case EdytorModelPackage.FUNCTION_BLOCK__RETURN:
				setReturn((Code)null);
				return;
			case EdytorModelPackage.FUNCTION_BLOCK__FUNCTION_NAME:
				setFunctionName(FUNCTION_NAME_EDEFAULT);
				return;
			case EdytorModelPackage.FUNCTION_BLOCK__ARGUMENTS:
				getArguments().clear();
				return;
			case EdytorModelPackage.FUNCTION_BLOCK__FUNCTION_DEF:
				setFunctionDef((FunctionBlock)null);
				return;
			case EdytorModelPackage.FUNCTION_BLOCK__IS_DEF:
				setIsDef(IS_DEF_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EdytorModelPackage.FUNCTION_BLOCK__OPERATIONSQUEUE:
				return operationsqueue != null && !operationsqueue.isEmpty();
			case EdytorModelPackage.FUNCTION_BLOCK__RETURN:
				return return_ != null;
			case EdytorModelPackage.FUNCTION_BLOCK__FUNCTION_NAME:
				return FUNCTION_NAME_EDEFAULT == null ? functionName != null : !FUNCTION_NAME_EDEFAULT.equals(functionName);
			case EdytorModelPackage.FUNCTION_BLOCK__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case EdytorModelPackage.FUNCTION_BLOCK__FUNCTION_DEF:
				return functionDef != null;
			case EdytorModelPackage.FUNCTION_BLOCK__IS_DEF:
				return isDef != IS_DEF_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (functionName: ");
		result.append(functionName);
		result.append(", isDef: ");
		result.append(isDef);
		result.append(')');
		return result.toString();
	}

} //FunctionBlockImpl
