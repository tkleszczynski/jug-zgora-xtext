/**
 */
package pl.zgora.jug.xtext.demoDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Appender</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pl.zgora.jug.xtext.demoDsl.Appender#getName <em>Name</em>}</li>
 *   <li>{@link pl.zgora.jug.xtext.demoDsl.Appender#getClass_ <em>Class</em>}</li>
 *   <li>{@link pl.zgora.jug.xtext.demoDsl.Appender#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @see pl.zgora.jug.xtext.demoDsl.DemoDslPackage#getAppender()
 * @model
 * @generated
 */
public interface Appender extends EObject
{
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
   * @see pl.zgora.jug.xtext.demoDsl.DemoDslPackage#getAppender_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link pl.zgora.jug.xtext.demoDsl.Appender#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' attribute.
   * @see #setClass(String)
   * @see pl.zgora.jug.xtext.demoDsl.DemoDslPackage#getAppender_Class()
   * @model
   * @generated
   */
  String getClass_();

  /**
   * Sets the value of the '{@link pl.zgora.jug.xtext.demoDsl.Appender#getClass_ <em>Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' attribute.
   * @see #getClass_()
   * @generated
   */
  void setClass(String value);

  /**
   * Returns the value of the '<em><b>Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' attribute.
   * @see #setPattern(String)
   * @see pl.zgora.jug.xtext.demoDsl.DemoDslPackage#getAppender_Pattern()
   * @model
   * @generated
   */
  String getPattern();

  /**
   * Sets the value of the '{@link pl.zgora.jug.xtext.demoDsl.Appender#getPattern <em>Pattern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' attribute.
   * @see #getPattern()
   * @generated
   */
  void setPattern(String value);

} // Appender
