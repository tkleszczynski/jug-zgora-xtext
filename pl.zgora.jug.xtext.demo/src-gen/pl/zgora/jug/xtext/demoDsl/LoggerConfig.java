/**
 */
package pl.zgora.jug.xtext.demoDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logger Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pl.zgora.jug.xtext.demoDsl.LoggerConfig#isDebug <em>Debug</em>}</li>
 *   <li>{@link pl.zgora.jug.xtext.demoDsl.LoggerConfig#isScan <em>Scan</em>}</li>
 *   <li>{@link pl.zgora.jug.xtext.demoDsl.LoggerConfig#getPeriod <em>Period</em>}</li>
 *   <li>{@link pl.zgora.jug.xtext.demoDsl.LoggerConfig#getAppenders <em>Appenders</em>}</li>
 *   <li>{@link pl.zgora.jug.xtext.demoDsl.LoggerConfig#getRootLogger <em>Root Logger</em>}</li>
 * </ul>
 *
 * @see pl.zgora.jug.xtext.demoDsl.DemoDslPackage#getLoggerConfig()
 * @model
 * @generated
 */
public interface LoggerConfig extends EObject
{
  /**
   * Returns the value of the '<em><b>Debug</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Debug</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Debug</em>' attribute.
   * @see #setDebug(boolean)
   * @see pl.zgora.jug.xtext.demoDsl.DemoDslPackage#getLoggerConfig_Debug()
   * @model
   * @generated
   */
  boolean isDebug();

  /**
   * Sets the value of the '{@link pl.zgora.jug.xtext.demoDsl.LoggerConfig#isDebug <em>Debug</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Debug</em>' attribute.
   * @see #isDebug()
   * @generated
   */
  void setDebug(boolean value);

  /**
   * Returns the value of the '<em><b>Scan</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scan</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scan</em>' attribute.
   * @see #setScan(boolean)
   * @see pl.zgora.jug.xtext.demoDsl.DemoDslPackage#getLoggerConfig_Scan()
   * @model
   * @generated
   */
  boolean isScan();

  /**
   * Sets the value of the '{@link pl.zgora.jug.xtext.demoDsl.LoggerConfig#isScan <em>Scan</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scan</em>' attribute.
   * @see #isScan()
   * @generated
   */
  void setScan(boolean value);

  /**
   * Returns the value of the '<em><b>Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Period</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Period</em>' attribute.
   * @see #setPeriod(String)
   * @see pl.zgora.jug.xtext.demoDsl.DemoDslPackage#getLoggerConfig_Period()
   * @model
   * @generated
   */
  String getPeriod();

  /**
   * Sets the value of the '{@link pl.zgora.jug.xtext.demoDsl.LoggerConfig#getPeriod <em>Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Period</em>' attribute.
   * @see #getPeriod()
   * @generated
   */
  void setPeriod(String value);

  /**
   * Returns the value of the '<em><b>Appenders</b></em>' containment reference list.
   * The list contents are of type {@link pl.zgora.jug.xtext.demoDsl.Appender}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Appenders</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Appenders</em>' containment reference list.
   * @see pl.zgora.jug.xtext.demoDsl.DemoDslPackage#getLoggerConfig_Appenders()
   * @model containment="true"
   * @generated
   */
  EList<Appender> getAppenders();

  /**
   * Returns the value of the '<em><b>Root Logger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root Logger</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root Logger</em>' containment reference.
   * @see #setRootLogger(Logger)
   * @see pl.zgora.jug.xtext.demoDsl.DemoDslPackage#getLoggerConfig_RootLogger()
   * @model containment="true"
   * @generated
   */
  Logger getRootLogger();

  /**
   * Sets the value of the '{@link pl.zgora.jug.xtext.demoDsl.LoggerConfig#getRootLogger <em>Root Logger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root Logger</em>' containment reference.
   * @see #getRootLogger()
   * @generated
   */
  void setRootLogger(Logger value);

} // LoggerConfig
