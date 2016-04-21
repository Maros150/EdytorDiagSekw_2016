/**
 */
package edytorModel.impl;

import edytorModel.EdytorModelPackage;
import edytorModel.FunctionBlock;
import edytorModel.FunctionDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edytorModel.impl.ClassImpl#getFunctionsdefinition <em>Functionsdefinition</em>}</li>
 *   <li>{@link edytorModel.impl.ClassImpl#getFunctionblocks <em>Functionblocks</em>}</li>
 *   <li>{@link edytorModel.impl.ClassImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link edytorModel.impl.ClassImpl#isIsThread <em>Is Thread</em>}</li>
 *   <li>{@link edytorModel.impl.ClassImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends MinimalEObjectImpl.Container implements edytorModel.Class {
	/**
	 * The cached value of the '{@link #getFunctionsdefinition() <em>Functionsdefinition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionsdefinition()
	 * @generated
	 * @ordered
	 */
	protected FunctionDefinition functionsdefinition;

	/**
	 * The cached value of the '{@link #getFunctionblocks() <em>Functionblocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionblocks()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionBlock> functionblocks;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected edytorModel.Class extends_;

	/**
	 * The default value of the '{@link #isIsThread() <em>Is Thread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsThread()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_THREAD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsThread() <em>Is Thread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsThread()
	 * @generated
	 * @ordered
	 */
	protected boolean isThread = IS_THREAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdytorModelPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionDefinition getFunctionsdefinition() {
		return functionsdefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctionsdefinition(FunctionDefinition newFunctionsdefinition, NotificationChain msgs) {
		FunctionDefinition oldFunctionsdefinition = functionsdefinition;
		functionsdefinition = newFunctionsdefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdytorModelPackage.CLASS__FUNCTIONSDEFINITION, oldFunctionsdefinition, newFunctionsdefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionsdefinition(FunctionDefinition newFunctionsdefinition) {
		if (newFunctionsdefinition != functionsdefinition) {
			NotificationChain msgs = null;
			if (functionsdefinition != null)
				msgs = ((InternalEObject)functionsdefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdytorModelPackage.CLASS__FUNCTIONSDEFINITION, null, msgs);
			if (newFunctionsdefinition != null)
				msgs = ((InternalEObject)newFunctionsdefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdytorModelPackage.CLASS__FUNCTIONSDEFINITION, null, msgs);
			msgs = basicSetFunctionsdefinition(newFunctionsdefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdytorModelPackage.CLASS__FUNCTIONSDEFINITION, newFunctionsdefinition, newFunctionsdefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionBlock> getFunctionblocks() {
		if (functionblocks == null) {
			functionblocks = new EObjectContainmentEList<FunctionBlock>(FunctionBlock.class, this, EdytorModelPackage.CLASS__FUNCTIONBLOCKS);
		}
		return functionblocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public edytorModel.Class getExtends() {
		if (extends_ != null && extends_.eIsProxy()) {
			InternalEObject oldExtends = (InternalEObject)extends_;
			extends_ = (edytorModel.Class)eResolveProxy(oldExtends);
			if (extends_ != oldExtends) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdytorModelPackage.CLASS__EXTENDS, oldExtends, extends_));
			}
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public edytorModel.Class basicGetExtends() {
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtends(edytorModel.Class newExtends) {
		edytorModel.Class oldExtends = extends_;
		extends_ = newExtends;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdytorModelPackage.CLASS__EXTENDS, oldExtends, extends_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsThread() {
		return isThread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsThread(boolean newIsThread) {
		boolean oldIsThread = isThread;
		isThread = newIsThread;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdytorModelPackage.CLASS__IS_THREAD, oldIsThread, isThread));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdytorModelPackage.CLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdytorModelPackage.CLASS__FUNCTIONSDEFINITION:
				return basicSetFunctionsdefinition(null, msgs);
			case EdytorModelPackage.CLASS__FUNCTIONBLOCKS:
				return ((InternalEList<?>)getFunctionblocks()).basicRemove(otherEnd, msgs);
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
			case EdytorModelPackage.CLASS__FUNCTIONSDEFINITION:
				return getFunctionsdefinition();
			case EdytorModelPackage.CLASS__FUNCTIONBLOCKS:
				return getFunctionblocks();
			case EdytorModelPackage.CLASS__EXTENDS:
				if (resolve) return getExtends();
				return basicGetExtends();
			case EdytorModelPackage.CLASS__IS_THREAD:
				return isIsThread();
			case EdytorModelPackage.CLASS__NAME:
				return getName();
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
			case EdytorModelPackage.CLASS__FUNCTIONSDEFINITION:
				setFunctionsdefinition((FunctionDefinition)newValue);
				return;
			case EdytorModelPackage.CLASS__FUNCTIONBLOCKS:
				getFunctionblocks().clear();
				getFunctionblocks().addAll((Collection<? extends FunctionBlock>)newValue);
				return;
			case EdytorModelPackage.CLASS__EXTENDS:
				setExtends((edytorModel.Class)newValue);
				return;
			case EdytorModelPackage.CLASS__IS_THREAD:
				setIsThread((Boolean)newValue);
				return;
			case EdytorModelPackage.CLASS__NAME:
				setName((String)newValue);
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
			case EdytorModelPackage.CLASS__FUNCTIONSDEFINITION:
				setFunctionsdefinition((FunctionDefinition)null);
				return;
			case EdytorModelPackage.CLASS__FUNCTIONBLOCKS:
				getFunctionblocks().clear();
				return;
			case EdytorModelPackage.CLASS__EXTENDS:
				setExtends((edytorModel.Class)null);
				return;
			case EdytorModelPackage.CLASS__IS_THREAD:
				setIsThread(IS_THREAD_EDEFAULT);
				return;
			case EdytorModelPackage.CLASS__NAME:
				setName(NAME_EDEFAULT);
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
			case EdytorModelPackage.CLASS__FUNCTIONSDEFINITION:
				return functionsdefinition != null;
			case EdytorModelPackage.CLASS__FUNCTIONBLOCKS:
				return functionblocks != null && !functionblocks.isEmpty();
			case EdytorModelPackage.CLASS__EXTENDS:
				return extends_ != null;
			case EdytorModelPackage.CLASS__IS_THREAD:
				return isThread != IS_THREAD_EDEFAULT;
			case EdytorModelPackage.CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (isThread: ");
		result.append(isThread);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
