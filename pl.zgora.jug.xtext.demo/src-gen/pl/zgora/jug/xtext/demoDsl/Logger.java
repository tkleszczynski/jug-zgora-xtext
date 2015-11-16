/**
 */
package pl.zgora.jug.xtext.demoDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pl.zgora.jug.xtext.demoDsl.Logger#getLevel <em>Level</em>}</li>
 *   <li>{@link pl.zgora.jug.xtext.demoDsl.Logger#getAppenders <em>Appenders</em>}</li>
 *   <li>{@link pl.zgora.jug.xtext.demoDsl.Logger#getLoggers <em>Loggers</em>}</li>
 *   <li>{@link pl.zgora.jug.xtext.demoDsl.Logger#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see pl.zgora.jug.xtext.demoDsl.DemoDslPackage#getLogger()
 * @model
 * @generated
 */
public interface Logger extends EObject
{
  /**
   * Returns the value of the '<em><b>Level</b></em>' attribute.
   * The literals are from the enumeration {@link pl.zgora.jug.xtext.demoDsl.LevelEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Level</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Level</em>' attribute.
   * @see pl.zgora.jug.xtext.demoDsl.LevelEnum
   * @see #setLevel(LevelEnum)
   * @see pl.zgora.jug.xtext.demoDsl.DemoDslPackage#getLogger_Level()
   * @model
   * @generated
   */
  LevelEnum getLevel();

  /**
   * Sets the value of the '{@link pl.zgora.jug.xtext.demoDsl.Logger#getLevel <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Level</em>' attribute.
   * @see pl.zgora.jug.xtext.demoDsl.LevelEnum
   * @see #getLevel()
   * @generated
   */
  void setLevel(LevelEnum value);

  /**
   * Returns the value of the '<em><b>Appenders</b></em>' reference list.
   * The list contents are of type {@link pl.zgora.jug.xtext.demoDsl.Appender}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Appenders</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Appenders</em>' reference list.
   * @see pl.zgora.jug.xtext.demoDsl.DemoDslPackage#getLogger_Appenders()
   * @model
   * @generated
   */
  EList<Appender> getAppenders();

  /**
   * Returns the value of the '<em><b>Loggers</b></em>' containment reference list.
   * The list contents are of type {@link pl.zgora.jug.xtext.demoDsl.Logger}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Loggers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loggers</em>' containment reference list.
   * @see pl.zgora.jug.xtext.demoDsl.DemoDslPackage#getLogger_Loggers()
   * @model containment="true"
   * @generated
   */
  EList<Logger> getLoggers();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see pl.zgora.jug.xtext.demoDsl.DemoDslPackage#getLogger_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link pl.zgora.jug.xtext.demoDsl.Logger#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Logger
