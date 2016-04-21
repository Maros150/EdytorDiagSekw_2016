/**
 */
package edytorModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edytorModel.EdytorModelFactory
 * @model kind="package"
 * @generated
 */
public interface EdytorModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "edytorModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/edytorModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "edytorModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EdytorModelPackage eINSTANCE = edytorModel.impl.EdytorModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link edytorModel.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edytorModel.impl.OperationImpl
	 * @see edytorModel.impl.EdytorModelPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 0;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edytorModel.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edytorModel.impl.LoopImpl
	 * @see edytorModel.impl.EdytorModelPackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__START = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__END = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__STEP = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operationsqueue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__OPERATIONSQUEUE = OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edytorModel.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edytorModel.impl.IfImpl
	 * @see edytorModel.impl.EdytorModelPackageImpl#getIf()
	 * @generated
	 */
	int IF = 2;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONDITION = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elseifqueue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSEIFQUEUE = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSE = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operationsqueue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__OPERATIONSQUEUE = OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edytorModel.impl.CodeImpl <em>Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edytorModel.impl.CodeImpl
	 * @see edytorModel.impl.EdytorModelPackageImpl#getCode()
	 * @generated
	 */
	int CODE = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__CODE = 0;

	/**
	 * The number of structural features of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edytorModel.impl.ElseIfImpl <em>Else If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edytorModel.impl.ElseIfImpl
	 * @see edytorModel.impl.EdytorModelPackageImpl#getElseIf()
	 * @generated
	 */
	int ELSE_IF = 4;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF__CONDITION = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operationsqueue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF__OPERATIONSQUEUE = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Else If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Else If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edytorModel.impl.OperationsQueueElementImpl <em>Operations Queue Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edytorModel.impl.OperationsQueueElementImpl
	 * @see edytorModel.impl.EdytorModelPackageImpl#getOperationsQueueElement()
	 * @generated
	 */
	int OPERATIONS_QUEUE_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_QUEUE_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_QUEUE_ELEMENT__OPERATION = 1;

	/**
	 * The number of structural features of the '<em>Operations Queue Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_QUEUE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Operations Queue Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_QUEUE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edytorModel.impl.ElseiFQueueElementImpl <em>Elsei FQueue Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edytorModel.impl.ElseiFQueueElementImpl
	 * @see edytorModel.impl.EdytorModelPackageImpl#getElseiFQueueElement()
	 * @generated
	 */
	int ELSEI_FQUEUE_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEI_FQUEUE_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Elseif</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEI_FQUEUE_ELEMENT__ELSEIF = 1;

	/**
	 * The number of structural features of the '<em>Elsei FQueue Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEI_FQUEUE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Elsei FQueue Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEI_FQUEUE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edytorModel.impl.ElseImpl <em>Else</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edytorModel.impl.ElseImpl
	 * @see edytorModel.impl.EdytorModelPackageImpl#getElse()
	 * @generated
	 */
	int ELSE = 7;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE__CODE = 0;

	/**
	 * The feature id for the '<em><b>Operationsqueue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE__OPERATIONSQUEUE = 1;

	/**
	 * The number of structural features of the '<em>Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edytorModel.impl.CodeBlockImpl <em>Code Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edytorModel.impl.CodeBlockImpl
	 * @see edytorModel.impl.EdytorModelPackageImpl#getCodeBlock()
	 * @generated
	 */
	int CODE_BLOCK = 8;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__CODE = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Code Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Code Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edytorModel.impl.FunctionBlockImpl <em>Function Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edytorModel.impl.FunctionBlockImpl
	 * @see edytorModel.impl.EdytorModelPackageImpl#getFunctionBlock()
	 * @generated
	 */
	int FUNCTION_BLOCK = 9;

	/**
	 * The feature id for the '<em><b>Operationsqueue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__OPERATIONSQUEUE = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__RETURN = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__FUNCTION_NAME = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__ARGUMENTS = OPERATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Function Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__FUNCTION_DEF = OPERATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__IS_DEF = OPERATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Function Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Function Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edytorModel.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edytorModel.impl.ArgumentImpl
	 * @see edytorModel.impl.EdytorModelPackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edytorModel.impl.FunctionDefinitionImpl <em>Function Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edytorModel.impl.FunctionDefinitionImpl
	 * @see edytorModel.impl.EdytorModelPackageImpl#getFunctionDefinition()
	 * @generated
	 */
	int FUNCTION_DEFINITION = 11;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__FUNCTIONS = 0;

	/**
	 * The number of structural features of the '<em>Function Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Function Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edytorModel.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edytorModel.impl.ClassImpl
	 * @see edytorModel.impl.EdytorModelPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 12;

	/**
	 * The feature id for the '<em><b>Functionsdefinition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__FUNCTIONSDEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Functionblocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__FUNCTIONBLOCKS = 1;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__EXTENDS = 2;

	/**
	 * The feature id for the '<em><b>Is Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_THREAD = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = 4;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edytorModel.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edytorModel.impl.ActorImpl
	 * @see edytorModel.impl.EdytorModelPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 13;

	/**
	 * The feature id for the '<em><b>Operationsqueue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__OPERATIONSQUEUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = 1;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link edytorModel.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see edytorModel.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for class '{@link edytorModel.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see edytorModel.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for the containment reference '{@link edytorModel.Loop#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see edytorModel.Loop#getStart()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Start();

	/**
	 * Returns the meta object for the containment reference '{@link edytorModel.Loop#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see edytorModel.Loop#getEnd()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_End();

	/**
	 * Returns the meta object for the containment reference '{@link edytorModel.Loop#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Step</em>'.
	 * @see edytorModel.Loop#getStep()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Step();

	/**
	 * Returns the meta object for the containment reference list '{@link edytorModel.Loop#getOperationsqueue <em>Operationsqueue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operationsqueue</em>'.
	 * @see edytorModel.Loop#getOperationsqueue()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Operationsqueue();

	/**
	 * Returns the meta object for class '{@link edytorModel.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see edytorModel.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference '{@link edytorModel.If#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see edytorModel.If#getCondition()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link edytorModel.If#getElseifqueue <em>Elseifqueue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elseifqueue</em>'.
	 * @see edytorModel.If#getElseifqueue()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Elseifqueue();

	/**
	 * Returns the meta object for the containment reference '{@link edytorModel.If#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see edytorModel.If#getElse()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Else();

	/**
	 * Returns the meta object for the containment reference list '{@link edytorModel.If#getOperationsqueue <em>Operationsqueue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operationsqueue</em>'.
	 * @see edytorModel.If#getOperationsqueue()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Operationsqueue();

	/**
	 * Returns the meta object for class '{@link edytorModel.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code</em>'.
	 * @see edytorModel.Code
	 * @generated
	 */
	EClass getCode();

	/**
	 * Returns the meta object for the attribute '{@link edytorModel.Code#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see edytorModel.Code#getCode()
	 * @see #getCode()
	 * @generated
	 */
	EAttribute getCode_Code();

	/**
	 * Returns the meta object for class '{@link edytorModel.ElseIf <em>Else If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Else If</em>'.
	 * @see edytorModel.ElseIf
	 * @generated
	 */
	EClass getElseIf();

	/**
	 * Returns the meta object for the containment reference '{@link edytorModel.ElseIf#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see edytorModel.ElseIf#getCondition()
	 * @see #getElseIf()
	 * @generated
	 */
	EReference getElseIf_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link edytorModel.ElseIf#getOperationsqueue <em>Operationsqueue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operationsqueue</em>'.
	 * @see edytorModel.ElseIf#getOperationsqueue()
	 * @see #getElseIf()
	 * @generated
	 */
	EReference getElseIf_Operationsqueue();

	/**
	 * Returns the meta object for class '{@link edytorModel.OperationsQueueElement <em>Operations Queue Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operations Queue Element</em>'.
	 * @see edytorModel.OperationsQueueElement
	 * @generated
	 */
	EClass getOperationsQueueElement();

	/**
	 * Returns the meta object for the attribute '{@link edytorModel.OperationsQueueElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edytorModel.OperationsQueueElement#getId()
	 * @see #getOperationsQueueElement()
	 * @generated
	 */
	EAttribute getOperationsQueueElement_Id();

	/**
	 * Returns the meta object for the containment reference '{@link edytorModel.OperationsQueueElement#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see edytorModel.OperationsQueueElement#getOperation()
	 * @see #getOperationsQueueElement()
	 * @generated
	 */
	EReference getOperationsQueueElement_Operation();

	/**
	 * Returns the meta object for class '{@link edytorModel.ElseiFQueueElement <em>Elsei FQueue Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elsei FQueue Element</em>'.
	 * @see edytorModel.ElseiFQueueElement
	 * @generated
	 */
	EClass getElseiFQueueElement();

	/**
	 * Returns the meta object for the attribute '{@link edytorModel.ElseiFQueueElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edytorModel.ElseiFQueueElement#getId()
	 * @see #getElseiFQueueElement()
	 * @generated
	 */
	EAttribute getElseiFQueueElement_Id();

	/**
	 * Returns the meta object for the containment reference '{@link edytorModel.ElseiFQueueElement#getElseif <em>Elseif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elseif</em>'.
	 * @see edytorModel.ElseiFQueueElement#getElseif()
	 * @see #getElseiFQueueElement()
	 * @generated
	 */
	EReference getElseiFQueueElement_Elseif();

	/**
	 * Returns the meta object for class '{@link edytorModel.Else <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Else</em>'.
	 * @see edytorModel.Else
	 * @generated
	 */
	EClass getElse();

	/**
	 * Returns the meta object for the containment reference '{@link edytorModel.Else#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see edytorModel.Else#getCode()
	 * @see #getElse()
	 * @generated
	 */
	EReference getElse_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link edytorModel.Else#getOperationsqueue <em>Operationsqueue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operationsqueue</em>'.
	 * @see edytorModel.Else#getOperationsqueue()
	 * @see #getElse()
	 * @generated
	 */
	EReference getElse_Operationsqueue();

	/**
	 * Returns the meta object for class '{@link edytorModel.CodeBlock <em>Code Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Block</em>'.
	 * @see edytorModel.CodeBlock
	 * @generated
	 */
	EClass getCodeBlock();

	/**
	 * Returns the meta object for the containment reference '{@link edytorModel.CodeBlock#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see edytorModel.CodeBlock#getCode()
	 * @see #getCodeBlock()
	 * @generated
	 */
	EReference getCodeBlock_Code();

	/**
	 * Returns the meta object for class '{@link edytorModel.FunctionBlock <em>Function Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Block</em>'.
	 * @see edytorModel.FunctionBlock
	 * @generated
	 */
	EClass getFunctionBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link edytorModel.FunctionBlock#getOperationsqueue <em>Operationsqueue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operationsqueue</em>'.
	 * @see edytorModel.FunctionBlock#getOperationsqueue()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_Operationsqueue();

	/**
	 * Returns the meta object for the containment reference '{@link edytorModel.FunctionBlock#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see edytorModel.FunctionBlock#getReturn()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_Return();

	/**
	 * Returns the meta object for the attribute '{@link edytorModel.FunctionBlock#getFunctionName <em>Function Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Name</em>'.
	 * @see edytorModel.FunctionBlock#getFunctionName()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EAttribute getFunctionBlock_FunctionName();

	/**
	 * Returns the meta object for the containment reference list '{@link edytorModel.FunctionBlock#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see edytorModel.FunctionBlock#getArguments()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_Arguments();

	/**
	 * Returns the meta object for the reference '{@link edytorModel.FunctionBlock#getFunctionDef <em>Function Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function Def</em>'.
	 * @see edytorModel.FunctionBlock#getFunctionDef()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_FunctionDef();

	/**
	 * Returns the meta object for the attribute '{@link edytorModel.FunctionBlock#isIsDef <em>Is Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Def</em>'.
	 * @see edytorModel.FunctionBlock#isIsDef()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EAttribute getFunctionBlock_IsDef();

	/**
	 * Returns the meta object for class '{@link edytorModel.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see edytorModel.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for the attribute '{@link edytorModel.Argument#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edytorModel.Argument#getName()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_Name();

	/**
	 * Returns the meta object for the containment reference '{@link edytorModel.Argument#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see edytorModel.Argument#getValue()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_Value();

	/**
	 * Returns the meta object for the attribute '{@link edytorModel.Argument#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edytorModel.Argument#getType()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_Type();

	/**
	 * Returns the meta object for class '{@link edytorModel.FunctionDefinition <em>Function Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Definition</em>'.
	 * @see edytorModel.FunctionDefinition
	 * @generated
	 */
	EClass getFunctionDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link edytorModel.FunctionDefinition#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see edytorModel.FunctionDefinition#getFunctions()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EReference getFunctionDefinition_Functions();

	/**
	 * Returns the meta object for class '{@link edytorModel.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see edytorModel.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the containment reference '{@link edytorModel.Class#getFunctionsdefinition <em>Functionsdefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Functionsdefinition</em>'.
	 * @see edytorModel.Class#getFunctionsdefinition()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Functionsdefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link edytorModel.Class#getFunctionblocks <em>Functionblocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functionblocks</em>'.
	 * @see edytorModel.Class#getFunctionblocks()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Functionblocks();

	/**
	 * Returns the meta object for the reference '{@link edytorModel.Class#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extends</em>'.
	 * @see edytorModel.Class#getExtends()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Extends();

	/**
	 * Returns the meta object for the attribute '{@link edytorModel.Class#isIsThread <em>Is Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Thread</em>'.
	 * @see edytorModel.Class#isIsThread()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_IsThread();

	/**
	 * Returns the meta object for the attribute '{@link edytorModel.Class#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edytorModel.Class#getName()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Name();

	/**
	 * Returns the meta object for class '{@link edytorModel.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see edytorModel.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the containment reference list '{@link edytorModel.Actor#getOperationsqueue <em>Operationsqueue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operationsqueue</em>'.
	 * @see edytorModel.Actor#getOperationsqueue()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Operationsqueue();

	/**
	 * Returns the meta object for the attribute '{@link edytorModel.Actor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edytorModel.Actor#getName()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EdytorModelFactory getEdytorModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edytorModel.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edytorModel.impl.OperationImpl
		 * @see edytorModel.impl.EdytorModelPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '{@link edytorModel.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edytorModel.impl.LoopImpl
		 * @see edytorModel.impl.EdytorModelPackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__START = eINSTANCE.getLoop_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__END = eINSTANCE.getLoop_End();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__STEP = eINSTANCE.getLoop_Step();

		/**
		 * The meta object literal for the '<em><b>Operationsqueue</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__OPERATIONSQUEUE = eINSTANCE.getLoop_Operationsqueue();

		/**
		 * The meta object literal for the '{@link edytorModel.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edytorModel.impl.IfImpl
		 * @see edytorModel.impl.EdytorModelPackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__CONDITION = eINSTANCE.getIf_Condition();

		/**
		 * The meta object literal for the '<em><b>Elseifqueue</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSEIFQUEUE = eINSTANCE.getIf_Elseifqueue();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSE = eINSTANCE.getIf_Else();

		/**
		 * The meta object literal for the '<em><b>Operationsqueue</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__OPERATIONSQUEUE = eINSTANCE.getIf_Operationsqueue();

		/**
		 * The meta object literal for the '{@link edytorModel.impl.CodeImpl <em>Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edytorModel.impl.CodeImpl
		 * @see edytorModel.impl.EdytorModelPackageImpl#getCode()
		 * @generated
		 */
		EClass CODE = eINSTANCE.getCode();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE__CODE = eINSTANCE.getCode_Code();

		/**
		 * The meta object literal for the '{@link edytorModel.impl.ElseIfImpl <em>Else If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edytorModel.impl.ElseIfImpl
		 * @see edytorModel.impl.EdytorModelPackageImpl#getElseIf()
		 * @generated
		 */
		EClass ELSE_IF = eINSTANCE.getElseIf();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSE_IF__CONDITION = eINSTANCE.getElseIf_Condition();

		/**
		 * The meta object literal for the '<em><b>Operationsqueue</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSE_IF__OPERATIONSQUEUE = eINSTANCE.getElseIf_Operationsqueue();

		/**
		 * The meta object literal for the '{@link edytorModel.impl.OperationsQueueElementImpl <em>Operations Queue Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edytorModel.impl.OperationsQueueElementImpl
		 * @see edytorModel.impl.EdytorModelPackageImpl#getOperationsQueueElement()
		 * @generated
		 */
		EClass OPERATIONS_QUEUE_ELEMENT = eINSTANCE.getOperationsQueueElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATIONS_QUEUE_ELEMENT__ID = eINSTANCE.getOperationsQueueElement_Id();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONS_QUEUE_ELEMENT__OPERATION = eINSTANCE.getOperationsQueueElement_Operation();

		/**
		 * The meta object literal for the '{@link edytorModel.impl.ElseiFQueueElementImpl <em>Elsei FQueue Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edytorModel.impl.ElseiFQueueElementImpl
		 * @see edytorModel.impl.EdytorModelPackageImpl#getElseiFQueueElement()
		 * @generated
		 */
		EClass ELSEI_FQUEUE_ELEMENT = eINSTANCE.getElseiFQueueElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELSEI_FQUEUE_ELEMENT__ID = eINSTANCE.getElseiFQueueElement_Id();

		/**
		 * The meta object literal for the '<em><b>Elseif</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSEI_FQUEUE_ELEMENT__ELSEIF = eINSTANCE.getElseiFQueueElement_Elseif();

		/**
		 * The meta object literal for the '{@link edytorModel.impl.ElseImpl <em>Else</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edytorModel.impl.ElseImpl
		 * @see edytorModel.impl.EdytorModelPackageImpl#getElse()
		 * @generated
		 */
		EClass ELSE = eINSTANCE.getElse();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSE__CODE = eINSTANCE.getElse_Code();

		/**
		 * The meta object literal for the '<em><b>Operationsqueue</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSE__OPERATIONSQUEUE = eINSTANCE.getElse_Operationsqueue();

		/**
		 * The meta object literal for the '{@link edytorModel.impl.CodeBlockImpl <em>Code Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edytorModel.impl.CodeBlockImpl
		 * @see edytorModel.impl.EdytorModelPackageImpl#getCodeBlock()
		 * @generated
		 */
		EClass CODE_BLOCK = eINSTANCE.getCodeBlock();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_BLOCK__CODE = eINSTANCE.getCodeBlock_Code();

		/**
		 * The meta object literal for the '{@link edytorModel.impl.FunctionBlockImpl <em>Function Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edytorModel.impl.FunctionBlockImpl
		 * @see edytorModel.impl.EdytorModelPackageImpl#getFunctionBlock()
		 * @generated
		 */
		EClass FUNCTION_BLOCK = eINSTANCE.getFunctionBlock();

		/**
		 * The meta object literal for the '<em><b>Operationsqueue</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__OPERATIONSQUEUE = eINSTANCE.getFunctionBlock_Operationsqueue();

		/**
		 * The meta object literal for the '<em><b>Return</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__RETURN = eINSTANCE.getFunctionBlock_Return();

		/**
		 * The meta object literal for the '<em><b>Function Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_BLOCK__FUNCTION_NAME = eINSTANCE.getFunctionBlock_FunctionName();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__ARGUMENTS = eINSTANCE.getFunctionBlock_Arguments();

		/**
		 * The meta object literal for the '<em><b>Function Def</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__FUNCTION_DEF = eINSTANCE.getFunctionBlock_FunctionDef();

		/**
		 * The meta object literal for the '<em><b>Is Def</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_BLOCK__IS_DEF = eINSTANCE.getFunctionBlock_IsDef();

		/**
		 * The meta object literal for the '{@link edytorModel.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edytorModel.impl.ArgumentImpl
		 * @see edytorModel.impl.EdytorModelPackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__NAME = eINSTANCE.getArgument_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__VALUE = eINSTANCE.getArgument_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__TYPE = eINSTANCE.getArgument_Type();

		/**
		 * The meta object literal for the '{@link edytorModel.impl.FunctionDefinitionImpl <em>Function Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edytorModel.impl.FunctionDefinitionImpl
		 * @see edytorModel.impl.EdytorModelPackageImpl#getFunctionDefinition()
		 * @generated
		 */
		EClass FUNCTION_DEFINITION = eINSTANCE.getFunctionDefinition();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEFINITION__FUNCTIONS = eINSTANCE.getFunctionDefinition_Functions();

		/**
		 * The meta object literal for the '{@link edytorModel.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edytorModel.impl.ClassImpl
		 * @see edytorModel.impl.EdytorModelPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Functionsdefinition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__FUNCTIONSDEFINITION = eINSTANCE.getClass_Functionsdefinition();

		/**
		 * The meta object literal for the '<em><b>Functionblocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__FUNCTIONBLOCKS = eINSTANCE.getClass_Functionblocks();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__EXTENDS = eINSTANCE.getClass_Extends();

		/**
		 * The meta object literal for the '<em><b>Is Thread</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__IS_THREAD = eINSTANCE.getClass_IsThread();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

		/**
		 * The meta object literal for the '{@link edytorModel.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edytorModel.impl.ActorImpl
		 * @see edytorModel.impl.EdytorModelPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Operationsqueue</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__OPERATIONSQUEUE = eINSTANCE.getActor_Operationsqueue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__NAME = eINSTANCE.getActor_Name();

	}

} //EdytorModelPackage
