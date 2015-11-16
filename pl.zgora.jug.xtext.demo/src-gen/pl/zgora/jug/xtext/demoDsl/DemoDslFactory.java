/**
 */
package pl.zgora.jug.xtext.demoDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pl.zgora.jug.xtext.demoDsl.DemoDslPackage
 * @generated
 */
public interface DemoDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DemoDslFactory eINSTANCE = pl.zgora.jug.xtext.demoDsl.impl.DemoDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Logger Config</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Logger Config</em>'.
   * @generated
   */
  LoggerConfig createLoggerConfig();

  /**
   * Returns a new object of class '<em>Appender</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Appender</em>'.
   * @generated
   */
  Appender createAppender();

  /**
   * Returns a new object of class '<em>Logger</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Logger</em>'.
   * @generated
   */
  Logger createLogger();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DemoDslPackage getDemoDslPackage();

} //DemoDslFactory
