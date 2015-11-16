/**
 */
package pl.zgora.jug.xtext.demoDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pl.zgora.jug.xtext.demoDsl.DemoDslFactory
 * @model kind="package"
 * @generated
 */
public interface DemoDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "demoDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://jug.zgora.pl/xtext/DemoDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "demoDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DemoDslPackage eINSTANCE = pl.zgora.jug.xtext.demoDsl.impl.DemoDslPackageImpl.init();

  /**
   * The meta object id for the '{@link pl.zgora.jug.xtext.demoDsl.impl.LoggerConfigImpl <em>Logger Config</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see pl.zgora.jug.xtext.demoDsl.impl.LoggerConfigImpl
   * @see pl.zgora.jug.xtext.demoDsl.impl.DemoDslPackageImpl#getLoggerConfig()
   * @generated
   */
  int LOGGER_CONFIG = 0;

  /**
   * The feature id for the '<em><b>Debug</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGGER_CONFIG__DEBUG = 0;

  /**
   * The feature id for the '<em><b>Scan</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGGER_CONFIG__SCAN = 1;

  /**
   * The feature id for the '<em><b>Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGGER_CONFIG__PERIOD = 2;

  /**
   * The feature id for the '<em><b>Appenders</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGGER_CONFIG__APPENDERS = 3;

  /**
   * The feature id for the '<em><b>Root Logger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGGER_CONFIG__ROOT_LOGGER = 4;

  /**
   * The number of structural features of the '<em>Logger Config</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGGER_CONFIG_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link pl.zgora.jug.xtext.demoDsl.impl.AppenderImpl <em>Appender</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see pl.zgora.jug.xtext.demoDsl.impl.AppenderImpl
   * @see pl.zgora.jug.xtext.demoDsl.impl.DemoDslPackageImpl#getAppender()
   * @generated
   */
  int APPENDER = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPENDER__NAME = 0;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPENDER__CLASS = 1;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPENDER__PATTERN = 2;

  /**
   * The number of structural features of the '<em>Appender</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPENDER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link pl.zgora.jug.xtext.demoDsl.impl.LoggerImpl <em>Logger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see pl.zgora.jug.xtext.demoDsl.impl.LoggerImpl
   * @see pl.zgora.jug.xtext.demoDsl.impl.DemoDslPackageImpl#getLogger()
   * @generated
   */
  int LOGGER = 2;

  /**
   * The feature id for the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGGER__LEVEL = 0;

  /**
   * The feature id for the '<em><b>Appenders</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGGER__APPENDERS = 1;

  /**
   * The feature id for the '<em><b>Loggers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGGER__LOGGERS = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGGER__NAME = 3;

  /**
   * The number of structural features of the '<em>Logger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGGER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link pl.zgora.jug.xtext.demoDsl.LevelEnum <em>Level Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see pl.zgora.jug.xtext.demoDsl.LevelEnum
   * @see pl.zgora.jug.xtext.demoDsl.impl.DemoDslPackageImpl#getLevelEnum()
   * @generated
   */
  int LEVEL_ENUM = 3;


  /**
   * Returns the meta object for class '{@link pl.zgora.jug.xtext.demoDsl.LoggerConfig <em>Logger Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Logger Config</em>'.
   * @see pl.zgora.jug.xtext.demoDsl.LoggerConfig
   * @generated
   */
  EClass getLoggerConfig();

  /**
   * Returns the meta object for the attribute '{@link pl.zgora.jug.xtext.demoDsl.LoggerConfig#isDebug <em>Debug</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Debug</em>'.
   * @see pl.zgora.jug.xtext.demoDsl.LoggerConfig#isDebug()
   * @see #getLoggerConfig()
   * @generated
   */
  EAttribute getLoggerConfig_Debug();

  /**
   * Returns the meta object for the attribute '{@link pl.zgora.jug.xtext.demoDsl.LoggerConfig#isScan <em>Scan</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scan</em>'.
   * @see pl.zgora.jug.xtext.demoDsl.LoggerConfig#isScan()
   * @see #getLoggerConfig()
   * @generated
   */
  EAttribute getLoggerConfig_Scan();

  /**
   * Returns the meta object for the attribute '{@link pl.zgora.jug.xtext.demoDsl.LoggerConfig#getPeriod <em>Period</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Period</em>'.
   * @see pl.zgora.jug.xtext.demoDsl.LoggerConfig#getPeriod()
   * @see #getLoggerConfig()
   * @generated
   */
  EAttribute getLoggerConfig_Period();

  /**
   * Returns the meta object for the containment reference list '{@link pl.zgora.jug.xtext.demoDsl.LoggerConfig#getAppenders <em>Appenders</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Appenders</em>'.
   * @see pl.zgora.jug.xtext.demoDsl.LoggerConfig#getAppenders()
   * @see #getLoggerConfig()
   * @generated
   */
  EReference getLoggerConfig_Appenders();

  /**
   * Returns the meta object for the containment reference '{@link pl.zgora.jug.xtext.demoDsl.LoggerConfig#getRootLogger <em>Root Logger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Root Logger</em>'.
   * @see pl.zgora.jug.xtext.demoDsl.LoggerConfig#getRootLogger()
   * @see #getLoggerConfig()
   * @generated
   */
  EReference getLoggerConfig_RootLogger();

  /**
   * Returns the meta object for class '{@link pl.zgora.jug.xtext.demoDsl.Appender <em>Appender</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Appender</em>'.
   * @see pl.zgora.jug.xtext.demoDsl.Appender
   * @generated
   */
  EClass getAppender();

  /**
   * Returns the meta object for the attribute '{@link pl.zgora.jug.xtext.demoDsl.Appender#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see pl.zgora.jug.xtext.demoDsl.Appender#getName()
   * @see #getAppender()
   * @generated
   */
  EAttribute getAppender_Name();

  /**
   * Returns the meta object for the attribute '{@link pl.zgora.jug.xtext.demoDsl.Appender#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see pl.zgora.jug.xtext.demoDsl.Appender#getClass_()
   * @see #getAppender()
   * @generated
   */
  EAttribute getAppender_Class();

  /**
   * Returns the meta object for the attribute '{@link pl.zgora.jug.xtext.demoDsl.Appender#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pattern</em>'.
   * @see pl.zgora.jug.xtext.demoDsl.Appender#getPattern()
   * @see #getAppender()
   * @generated
   */
  EAttribute getAppender_Pattern();

  /**
   * Returns the meta object for class '{@link pl.zgora.jug.xtext.demoDsl.Logger <em>Logger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Logger</em>'.
   * @see pl.zgora.jug.xtext.demoDsl.Logger
   * @generated
   */
  EClass getLogger();

  /**
   * Returns the meta object for the attribute '{@link pl.zgora.jug.xtext.demoDsl.Logger#getLevel <em>Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Level</em>'.
   * @see pl.zgora.jug.xtext.demoDsl.Logger#getLevel()
   * @see #getLogger()
   * @generated
   */
  EAttribute getLogger_Level();

  /**
   * Returns the meta object for the reference list '{@link pl.zgora.jug.xtext.demoDsl.Logger#getAppenders <em>Appenders</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Appenders</em>'.
   * @see pl.zgora.jug.xtext.demoDsl.Logger#getAppenders()
   * @see #getLogger()
   * @generated
   */
  EReference getLogger_Appenders();

  /**
   * Returns the meta object for the containment reference list '{@link pl.zgora.jug.xtext.demoDsl.Logger#getLoggers <em>Loggers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Loggers</em>'.
   * @see pl.zgora.jug.xtext.demoDsl.Logger#getLoggers()
   * @see #getLogger()
   * @generated
   */
  EReference getLogger_Loggers();

  /**
   * Returns the meta object for the attribute '{@link pl.zgora.jug.xtext.demoDsl.Logger#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see pl.zgora.jug.xtext.demoDsl.Logger#getName()
   * @see #getLogger()
   * @generated
   */
  EAttribute getLogger_Name();

  /**
   * Returns the meta object for enum '{@link pl.zgora.jug.xtext.demoDsl.LevelEnum <em>Level Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Level Enum</em>'.
   * @see pl.zgora.jug.xtext.demoDsl.LevelEnum
   * @generated
   */
  EEnum getLevelEnum();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DemoDslFactory getDemoDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link pl.zgora.jug.xtext.demoDsl.impl.LoggerConfigImpl <em>Logger Config</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see pl.zgora.jug.xtext.demoDsl.impl.LoggerConfigImpl
     * @see pl.zgora.jug.xtext.demoDsl.impl.DemoDslPackageImpl#getLoggerConfig()
     * @generated
     */
    EClass LOGGER_CONFIG = eINSTANCE.getLoggerConfig();

    /**
     * The meta object literal for the '<em><b>Debug</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOGGER_CONFIG__DEBUG = eINSTANCE.getLoggerConfig_Debug();

    /**
     * The meta object literal for the '<em><b>Scan</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOGGER_CONFIG__SCAN = eINSTANCE.getLoggerConfig_Scan();

    /**
     * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOGGER_CONFIG__PERIOD = eINSTANCE.getLoggerConfig_Period();

    /**
     * The meta object literal for the '<em><b>Appenders</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGGER_CONFIG__APPENDERS = eINSTANCE.getLoggerConfig_Appenders();

    /**
     * The meta object literal for the '<em><b>Root Logger</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGGER_CONFIG__ROOT_LOGGER = eINSTANCE.getLoggerConfig_RootLogger();

    /**
     * The meta object literal for the '{@link pl.zgora.jug.xtext.demoDsl.impl.AppenderImpl <em>Appender</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see pl.zgora.jug.xtext.demoDsl.impl.AppenderImpl
     * @see pl.zgora.jug.xtext.demoDsl.impl.DemoDslPackageImpl#getAppender()
     * @generated
     */
    EClass APPENDER = eINSTANCE.getAppender();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPENDER__NAME = eINSTANCE.getAppender_Name();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPENDER__CLASS = eINSTANCE.getAppender_Class();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPENDER__PATTERN = eINSTANCE.getAppender_Pattern();

    /**
     * The meta object literal for the '{@link pl.zgora.jug.xtext.demoDsl.impl.LoggerImpl <em>Logger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see pl.zgora.jug.xtext.demoDsl.impl.LoggerImpl
     * @see pl.zgora.jug.xtext.demoDsl.impl.DemoDslPackageImpl#getLogger()
     * @generated
     */
    EClass LOGGER = eINSTANCE.getLogger();

    /**
     * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOGGER__LEVEL = eINSTANCE.getLogger_Level();

    /**
     * The meta object literal for the '<em><b>Appenders</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGGER__APPENDERS = eINSTANCE.getLogger_Appenders();

    /**
     * The meta object literal for the '<em><b>Loggers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGGER__LOGGERS = eINSTANCE.getLogger_Loggers();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOGGER__NAME = eINSTANCE.getLogger_Name();

    /**
     * The meta object literal for the '{@link pl.zgora.jug.xtext.demoDsl.LevelEnum <em>Level Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see pl.zgora.jug.xtext.demoDsl.LevelEnum
     * @see pl.zgora.jug.xtext.demoDsl.impl.DemoDslPackageImpl#getLevelEnum()
     * @generated
     */
    EEnum LEVEL_ENUM = eINSTANCE.getLevelEnum();

  }

} //DemoDslPackage
