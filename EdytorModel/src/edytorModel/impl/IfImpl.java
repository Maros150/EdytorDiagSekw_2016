/**
 */
package edytorModel.impl;

import edytorModel.Code;
import edytorModel.EdytorModelPackage;
import edytorModel.Else;
import edytorModel.ElseiFQueueElement;
import edytorModel.If;
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
 * An implementation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edytorModel.impl.IfImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link edytorModel.impl.IfImpl#getElseifqueue <em>Elseifqueue</em>}</li>
 *   <li>{@link edytorModel.impl.IfImpl#getElse <em>Else</em>}</li>
 *   <li>{@link edytorModel.impl.IfImpl#getOperationsqueue <em>Operationsqueue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfImpl extends OperationImpl implements If {
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
	 * The cached value of the '{@link #getElseifqueue() <em>Elseifqueue</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseifqueue()
	 * @generated
	 * @ordered
	 */
	protected EList<ElseiFQueueElement> elseifqueue;

	/**
	 * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElse()
	 * @generated
	 * @ordered
	 */
	protected Else else_;

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
	protected IfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdytorModelPackage.Literals.IF;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdytorModelPackage.IF__CONDITION, oldCondition, newCondition);
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
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdytorModelPackage.IF__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdytorModelPackage.IF__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdytorModelPackage.IF__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElseiFQueueElement> getElseifqueue() {
		if (elseifqueue == null) {
			elseifqueue = new EObjectContainmentEList<ElseiFQueueElement>(ElseiFQueueElement.class, this, EdytorModelPackage.IF__ELSEIFQUEUE);
		}
		return elseifqueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Else getElse() {
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElse(Else newElse, NotificationChain msgs) {
		Else oldElse = else_;
		else_ = newElse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdytorModelPackage.IF__ELSE, oldElse, newElse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElse(Else newElse) {
		if (newElse != else_) {
			NotificationChain msgs = null;
			if (else_ != null)
				msgs = ((InternalEObject)else_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdytorModelPackage.IF__ELSE, null, msgs);
			if (newElse != null)
				msgs = ((InternalEObject)newElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdytorModelPackage.IF__ELSE, null, msgs);
			msgs = basicSetElse(newElse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdytorModelPackage.IF__ELSE, newElse, newElse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationsQueueElement> getOperationsqueue() {
		if (operationsqueue == null) {
			operationsqueue = new EObjectContainmentEList<OperationsQueueElement>(OperationsQueueElement.class, this, EdytorModelPackage.IF__OPERATIONSQUEUE);
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
			case EdytorModelPackage.IF__CONDITION:
				return basicSetCondition(null, msgs);
			case EdytorModelPackage.IF__ELSEIFQUEUE:
				return ((InternalEList<?>)getElseifqueue()).basicRemove(otherEnd, msgs);
			case EdytorModelPackage.IF__ELSE:
				return basicSetElse(null, msgs);
			case EdytorModelPackage.IF__OPERATIONSQUEUE:
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
			case EdytorModelPackage.IF__CONDITION:
				return getCondition();
			case EdytorModelPackage.IF__ELSEIFQUEUE:
				return getElseifqueue();
			case EdytorModelPackage.IF__ELSE:
				return getElse();
			case EdytorModelPackage.IF__OPERATIONSQUEUE:
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
			case EdytorModelPackage.IF__CONDITION:
				setCondition((Code)newValue);
				return;
			case EdytorModelPackage.IF__ELSEIFQUEUE:
				getElseifqueue().clear();
				getElseifqueue().addAll((Collection<? extends ElseiFQueueElement>)newValue);
				return;
			case EdytorModelPackage.IF__ELSE:
				setElse((Else)newValue);
				return;
			case EdytorModelPackage.IF__OPERATIONSQUEUE:
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
			case EdytorModelPackage.IF__CONDITION:
				setCondition((Code)null);
				return;
			case EdytorModelPackage.IF__ELSEIFQUEUE:
				getElseifqueue().clear();
				return;
			case EdytorModelPackage.IF__ELSE:
				setElse((Else)null);
				return;
			case EdytorModelPackage.IF__OPERATIONSQUEUE:
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
			case EdytorModelPackage.IF__CONDITION:
				return condition != null;
			case EdytorModelPackage.IF__ELSEIFQUEUE:
				return elseifqueue != null && !elseifqueue.isEmpty();
			case EdytorModelPackage.IF__ELSE:
				return else_ != null;
			case EdytorModelPackage.IF__OPERATIONSQUEUE:
				return operationsqueue != null && !operationsqueue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfImpl
