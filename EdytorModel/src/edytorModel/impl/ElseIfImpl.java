/**
 */
package edytorModel.impl;

import edytorModel.Code;
import edytorModel.EdytorModelPackage;
import edytorModel.ElseIf;
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
 * An implementation of the model object '<em><b>Else If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edytorModel.impl.ElseIfImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link edytorModel.impl.ElseIfImpl#getOperationsqueue <em>Operationsqueue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElseIfImpl extends OperationImpl implements ElseIf {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Code condition;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElseIfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdytorModelPackage.Literals.ELSE_IF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Code newCondition, NotificationChain msgs) {
		Code oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdytorModelPackage.ELSE_IF__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Code newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdytorModelPackage.ELSE_IF__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdytorModelPackage.ELSE_IF__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdytorModelPackage.ELSE_IF__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationsQueueElement> getOperationsqueue() {
		if (operationsqueue == null) {
			operationsqueue = new EObjectContainmentEList<OperationsQueueElement>(OperationsQueueElement.class, this, EdytorModelPackage.ELSE_IF__OPERATIONSQUEUE);
		}
		return operationsqueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdytorModelPackage.ELSE_IF__CONDITION:
				return basicSetCondition(null, msgs);
			case EdytorModelPackage.ELSE_IF__OPERATIONSQUEUE:
				return ((InternalEList<?>)getOperationsqueue()).basicRemove(otherEnd, msgs);
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
			case EdytorModelPackage.ELSE_IF__CONDITION:
				return getCondition();
			case EdytorModelPackage.ELSE_IF__OPERATIONSQUEUE:
				return getOperationsqueue();
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
			case EdytorModelPackage.ELSE_IF__CONDITION:
				setCondition((Code)newValue);
				return;
			case EdytorModelPackage.ELSE_IF__OPERATIONSQUEUE:
				getOperationsqueue().clear();
				getOperationsqueue().addAll((Collection<? extends OperationsQueueElement>)newValue);
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
			case EdytorModelPackage.ELSE_IF__CONDITION:
				setCondition((Code)null);
				return;
			case EdytorModelPackage.ELSE_IF__OPERATIONSQUEUE:
				getOperationsqueue().clear();
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
			case EdytorModelPackage.ELSE_IF__CONDITION:
				return condition != null;
			case EdytorModelPackage.ELSE_IF__OPERATIONSQUEUE:
				return operationsqueue != null && !operationsqueue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ElseIfImpl
