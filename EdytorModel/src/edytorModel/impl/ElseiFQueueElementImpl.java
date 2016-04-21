/**
 */
package edytorModel.impl;

import edytorModel.EdytorModelPackage;
import edytorModel.ElseIf;
import edytorModel.ElseiFQueueElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elsei FQueue Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edytorModel.impl.ElseiFQueueElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link edytorModel.impl.ElseiFQueueElementImpl#getElseif <em>Elseif</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElseiFQueueElementImpl extends MinimalEObjectImpl.Container implements ElseiFQueueElement {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final double ID_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected double id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElseif() <em>Elseif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseif()
	 * @generated
	 * @ordered
	 */
	protected ElseIf elseif;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElseiFQueueElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdytorModelPackage.Literals.ELSEI_FQUEUE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(double newId) {
		double oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdytorModelPackage.ELSEI_FQUEUE_ELEMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElseIf getElseif() {
		return elseif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseif(ElseIf newElseif, NotificationChain msgs) {
		ElseIf oldElseif = elseif;
		elseif = newElseif;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdytorModelPackage.ELSEI_FQUEUE_ELEMENT__ELSEIF, oldElseif, newElseif);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseif(ElseIf newElseif) {
		if (newElseif != elseif) {
			NotificationChain msgs = null;
			if (elseif != null)
				msgs = ((InternalEObject)elseif).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdytorModelPackage.ELSEI_FQUEUE_ELEMENT__ELSEIF, null, msgs);
			if (newElseif != null)
				msgs = ((InternalEObject)newElseif).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdytorModelPackage.ELSEI_FQUEUE_ELEMENT__ELSEIF, null, msgs);
			msgs = basicSetElseif(newElseif, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdytorModelPackage.ELSEI_FQUEUE_ELEMENT__ELSEIF, newElseif, newElseif));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdytorModelPackage.ELSEI_FQUEUE_ELEMENT__ELSEIF:
				return basicSetElseif(null, msgs);
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
			case EdytorModelPackage.ELSEI_FQUEUE_ELEMENT__ID:
				return getId();
			case EdytorModelPackage.ELSEI_FQUEUE_ELEMENT__ELSEIF:
				return getElseif();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EdytorModelPackage.ELSEI_FQUEUE_ELEMENT__ID:
				setId((Double)newValue);
				return;
			case EdytorModelPackage.ELSEI_FQUEUE_ELEMENT__ELSEIF:
				setElseif((ElseIf)newValue);
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
			case EdytorModelPackage.ELSEI_FQUEUE_ELEMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case EdytorModelPackage.ELSEI_FQUEUE_ELEMENT__ELSEIF:
				setElseif((ElseIf)null);
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
			case EdytorModelPackage.ELSEI_FQUEUE_ELEMENT__ID:
				return id != ID_EDEFAULT;
			case EdytorModelPackage.ELSEI_FQUEUE_ELEMENT__ELSEIF:
				return elseif != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ElseiFQueueElementImpl
