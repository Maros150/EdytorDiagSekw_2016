/**
 */
package edytorModel.impl;

import edytorModel.Actor;
import edytorModel.Argument;
import edytorModel.Code;
import edytorModel.CodeBlock;
import edytorModel.EdytorModelFactory;
import edytorModel.EdytorModelPackage;
import edytorModel.Else;
import edytorModel.ElseIf;
import edytorModel.ElseiFQueueElement;
import edytorModel.FunctionBlock;
import edytorModel.FunctionDefinition;
import edytorModel.If;
import edytorModel.Loop;
import edytorModel.Operation;
import edytorModel.OperationsQueueElement;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EdytorModelFactoryImpl extends EFactoryImpl implements EdytorModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EdytorModelFactory init() {
		try {
			EdytorModelFactory theEdytorModelFactory = (EdytorModelFactory)EPackage.Registry.INSTANCE.getEFactory(EdytorModelPackage.eNS_URI);
			if (theEdytorModelFactory != null) {
				return theEdytorModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EdytorModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdytorModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EdytorModelPackage.OPERATION: return createOperation();
			case EdytorModelPackage.LOOP: return createLoop();
			case EdytorModelPackage.IF: return createIf();
			case EdytorModelPackage.CODE: return createCode();
			case EdytorModelPackage.ELSE_IF: return createElseIf();
			case EdytorModelPackage.OPERATIONS_QUEUE_ELEMENT: return createOperationsQueueElement();
			case EdytorModelPackage.ELSEI_FQUEUE_ELEMENT: return createElseiFQueueElement();
			case EdytorModelPackage.ELSE: return createElse();
			case EdytorModelPackage.CODE_BLOCK: return createCodeBlock();
			case EdytorModelPackage.FUNCTION_BLOCK: return createFunctionBlock();
			case EdytorModelPackage.ARGUMENT: return createArgument();
			case EdytorModelPackage.FUNCTION_DEFINITION: return createFunctionDefinition();
			case EdytorModelPackage.CLASS: return createClass();
			case EdytorModelPackage.ACTOR: return createActor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Loop createLoop() {
		LoopImpl loop = new LoopImpl();
		return loop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public If createIf() {
		IfImpl if_ = new IfImpl();
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code createCode() {
		CodeImpl code = new CodeImpl();
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElseIf createElseIf() {
		ElseIfImpl elseIf = new ElseIfImpl();
		return elseIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationsQueueElement createOperationsQueueElement() {
		OperationsQueueElementImpl operationsQueueElement = new OperationsQueueElementImpl();
		return operationsQueueElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElseiFQueueElement createElseiFQueueElement() {
		ElseiFQueueElementImpl elseiFQueueElement = new ElseiFQueueElementImpl();
		return elseiFQueueElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Else createElse() {
		ElseImpl else_ = new ElseImpl();
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeBlock createCodeBlock() {
		CodeBlockImpl codeBlock = new CodeBlockImpl();
		return codeBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlock createFunctionBlock() {
		FunctionBlockImpl functionBlock = new FunctionBlockImpl();
		return functionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument createArgument() {
		ArgumentImpl argument = new ArgumentImpl();
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionDefinition createFunctionDefinition() {
		FunctionDefinitionImpl functionDefinition = new FunctionDefinitionImpl();
		return functionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public edytorModel.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdytorModelPackage getEdytorModelPackage() {
		return (EdytorModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EdytorModelPackage getPackage() {
		return EdytorModelPackage.eINSTANCE;
	}

} //EdytorModelFactoryImpl
