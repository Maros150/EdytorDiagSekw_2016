/**
 */
package edytorModel.impl;

import edytorModel.Code;
import edytorModel.EdytorModelPackage;
import edytorModel.Loop;
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
 * An implementation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edytorModel.impl.LoopImpl#getStart <em>Start</em>}</li>
 *   <li>{@link edytorModel.impl.LoopImpl#getEnd <em>End</em>}</li>
 *   <li>{@link edytorModel.impl.LoopImpl#getStep <em>Step</em>}</li>
 *   <li>{@link edytorModel.impl.LoopImpl#getOperationsqueue <em>Operationsqueue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoopImpl extends OperationImpl implements Loop {
	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Code start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Code end;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected Code step;

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
	protected LoopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdytorModelPackage.Literals.LOOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(Code newStart, NotificationChain msgs) {
		Code oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdytorModelPackage.LOOP__START, oldStart, newStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Code newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdytorModelPackage.LOOP__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdytorModelPackage.LOOP__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdytorModelPackage.LOOP__START, newStart, newStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(Code newEnd, NotificationChain msgs) {
		Code oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdytorModelPackage.LOOP__END, oldEnd, newEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Code newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdytorModelPackage.LOOP__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdytorModelPackage.LOOP__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdytorModelPackage.LOOP__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getStep() {
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStep(Code newStep, NotificationChain msgs) {
		Code oldStep = step;
		step = newStep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdytorModelPackage.LOOP__STEP, oldStep, newStep);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStep(Code newStep) {
		if (newStep != step) {
			NotificationChain msgs = null;
			if (step != null)
				msgs = ((InternalEObject)step).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdytorModelPackage.LOOP__STEP, null, msgs);
			if (newStep != null)
				msgs = ((InternalEObject)newStep).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdytorModelPackage.LOOP__STEP, null, msgs);
			msgs = basicSetStep(newStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdytorModelPackage.LOOP__STEP, newStep, newStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationsQueueElement> getOperationsqueue() {
		if (operationsqueue == null) {
			operationsqueue = new EObjectContainmentEList<OperationsQueueElement>(OperationsQueueElement.class, this, EdytorModelPackage.LOOP__OPERATIONSQUEUE);
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
			case EdytorModelPackage.LOOP__START:
				return basicSetStart(null, msgs);
			case EdytorModelPackage.LOOP__END:
				return basicSetEnd(null, msgs);
			case EdytorModelPackage.LOOP__STEP:
				return basicSetStep(null, msgs);
			case EdytorModelPackage.LOOP__OPERATIONSQUEUE:
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
			case EdytorModelPackage.LOOP__START:
				return getStart();
			case EdytorModelPackage.LOOP__END:
				return getEnd();
			case EdytorModelPackage.LOOP__STEP:
				return getStep();
			case EdytorModelPackage.LOOP__OPERATIONSQUEUE:
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
			case EdytorModelPackage.LOOP__START:
				setStart((Code)newValue);
				return;
			case EdytorModelPackage.LOOP__END:
				setEnd((Code)newValue);
				return;
			case EdytorModelPackage.LOOP__STEP:
				setStep((Code)newValue);
				return;
			case EdytorModelPackage.LOOP__OPERATIONSQUEUE:
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
			case EdytorModelPackage.LOOP__START:
				setStart((Code)null);
				return;
			case EdytorModelPackage.LOOP__END:
				setEnd((Code)null);
				return;
			case EdytorModelPackage.LOOP__STEP:
				setStep((Code)null);
				return;
			case EdytorModelPackage.LOOP__OPERATIONSQUEUE:
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
			case EdytorModelPackage.LOOP__START:
				return start != null;
			case EdytorModelPackage.LOOP__END:
				return end != null;
			case EdytorModelPackage.LOOP__STEP:
				return step != null;
			case EdytorModelPackage.LOOP__OPERATIONSQUEUE:
				return operationsqueue != null && !operationsqueue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LoopImpl
