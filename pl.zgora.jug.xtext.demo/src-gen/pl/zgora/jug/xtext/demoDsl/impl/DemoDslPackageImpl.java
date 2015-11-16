/**
 */
package pl.zgora.jug.xtext.demoDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pl.zgora.jug.xtext.demoDsl.Appender;
import pl.zgora.jug.xtext.demoDsl.DemoDslFactory;
import pl.zgora.jug.xtext.demoDsl.DemoDslPackage;
import pl.zgora.jug.xtext.demoDsl.LevelEnum;
import pl.zgora.jug.xtext.demoDsl.Logger;
import pl.zgora.jug.xtext.demoDsl.LoggerConfig;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DemoDslPackageImpl extends EPackageImpl implements DemoDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loggerConfigEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass appenderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loggerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum levelEnumEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see pl.zgora.jug.xtext.demoDsl.DemoDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DemoDslPackageImpl()
  {
    super(eNS_URI, DemoDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link DemoDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DemoDslPackage init()
  {
    if (isInited) return (DemoDslPackage)EPackage.Registry.INSTANCE.getEPackage(DemoDslPackage.eNS_URI);

    // Obtain or create and register package
    DemoDslPackageImpl theDemoDslPackage = (DemoDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DemoDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DemoDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theDemoDslPackage.createPackageContents();

    // Initialize created meta-data
    theDemoDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDemoDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DemoDslPackage.eNS_URI, theDemoDslPackage);
    return theDemoDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLoggerConfig()
  {
    return loggerConfigEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoggerConfig_Debug()
  {
    return (EAttribute)loggerConfigEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoggerConfig_Scan()
  {
    return (EAttribute)loggerConfigEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoggerConfig_Period()
  {
    return (EAttribute)loggerConfigEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLoggerConfig_Appenders()
  {
    return (EReference)loggerConfigEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLoggerConfig_RootLogger()
  {
    return (EReference)loggerConfigEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAppender()
  {
    return appenderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAppender_Name()
  {
    return (EAttribute)appenderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAppender_Class()
  {
    return (EAttribute)appenderEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAppender_Pattern()
  {
    return (EAttribute)appenderEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLogger()
  {
    return loggerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLogger_Level()
  {
    return (EAttribute)loggerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogger_Appenders()
  {
    return (EReference)loggerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogger_Loggers()
  {
    return (EReference)loggerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLogger_Name()
  {
    return (EAttribute)loggerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLevelEnum()
  {
    return levelEnumEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DemoDslFactory getDemoDslFactory()
  {
    return (DemoDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    loggerConfigEClass = createEClass(LOGGER_CONFIG);
    createEAttribute(loggerConfigEClass, LOGGER_CONFIG__DEBUG);
    createEAttribute(loggerConfigEClass, LOGGER_CONFIG__SCAN);
    createEAttribute(loggerConfigEClass, LOGGER_CONFIG__PERIOD);
    createEReference(loggerConfigEClass, LOGGER_CONFIG__APPENDERS);
    createEReference(loggerConfigEClass, LOGGER_CONFIG__ROOT_LOGGER);

    appenderEClass = createEClass(APPENDER);
    createEAttribute(appenderEClass, APPENDER__NAME);
    createEAttribute(appenderEClass, APPENDER__CLASS);
    createEAttribute(appenderEClass, APPENDER__PATTERN);

    loggerEClass = createEClass(LOGGER);
    createEAttribute(loggerEClass, LOGGER__LEVEL);
    createEReference(loggerEClass, LOGGER__APPENDERS);
    createEReference(loggerEClass, LOGGER__LOGGERS);
    createEAttribute(loggerEClass, LOGGER__NAME);

    // Create enums
    levelEnumEEnum = createEEnum(LEVEL_ENUM);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(loggerConfigEClass, LoggerConfig.class, "LoggerConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLoggerConfig_Debug(), ecorePackage.getEBoolean(), "debug", null, 0, 1, LoggerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLoggerConfig_Scan(), ecorePackage.getEBoolean(), "scan", null, 0, 1, LoggerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLoggerConfig_Period(), ecorePackage.getEString(), "period", null, 0, 1, LoggerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLoggerConfig_Appenders(), this.getAppender(), null, "appenders", null, 0, -1, LoggerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLoggerConfig_RootLogger(), this.getLogger(), null, "rootLogger", null, 0, 1, LoggerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(appenderEClass, Appender.class, "Appender", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAppender_Name(), ecorePackage.getEString(), "name", null, 0, 1, Appender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAppender_Class(), ecorePackage.getEString(), "class", null, 0, 1, Appender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAppender_Pattern(), ecorePackage.getEString(), "pattern", null, 0, 1, Appender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(loggerEClass, Logger.class, "Logger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLogger_Level(), this.getLevelEnum(), "level", null, 0, 1, Logger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLogger_Appenders(), this.getAppender(), null, "appenders", null, 0, -1, Logger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLogger_Loggers(), this.getLogger(), null, "loggers", null, 0, -1, Logger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLogger_Name(), ecorePackage.getEString(), "name", null, 0, 1, Logger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(levelEnumEEnum, LevelEnum.class, "LevelEnum");
    addEEnumLiteral(levelEnumEEnum, LevelEnum.UNDEFINED);
    addEEnumLiteral(levelEnumEEnum, LevelEnum.OFF);
    addEEnumLiteral(levelEnumEEnum, LevelEnum.ERROR);
    addEEnumLiteral(levelEnumEEnum, LevelEnum.WARNING);
    addEEnumLiteral(levelEnumEEnum, LevelEnum.INFO);
    addEEnumLiteral(levelEnumEEnum, LevelEnum.DEBUG);
    addEEnumLiteral(levelEnumEEnum, LevelEnum.TRACE);

    // Create resource
    createResource(eNS_URI);
  }

} //DemoDslPackageImpl
