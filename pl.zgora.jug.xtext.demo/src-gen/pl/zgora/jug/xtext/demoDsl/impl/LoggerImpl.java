/**
 */
package pl.zgora.jug.xtext.demoDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pl.zgora.jug.xtext.demoDsl.Appender;
import pl.zgora.jug.xtext.demoDsl.DemoDslPackage;
import pl.zgora.jug.xtext.demoDsl.LevelEnum;
import pl.zgora.jug.xtext.demoDsl.Logger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pl.zgora.jug.xtext.demoDsl.impl.LoggerImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link pl.zgora.jug.xtext.demoDsl.impl.LoggerImpl#getAppenders <em>Appenders</em>}</li>
 *   <li>{@link pl.zgora.jug.xtext.demoDsl.impl.LoggerImpl#getLoggers <em>Loggers</em>}</li>
 *   <li>{@link pl.zgora.jug.xtext.demoDsl.impl.LoggerImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoggerImpl extends MinimalEObjectImpl.Container implements Logger
{
  /**
   * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel()
   * @generated
   * @ordered
   */
  protected static final LevelEnum LEVEL_EDEFAULT = LevelEnum.UNDEFINED;

  /**
   * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel()
   * @generated
   * @ordered
   */
  protected LevelEnum level = LEVEL_EDEFAULT;

  /**
   * The cached value of the '{@link #getAppenders() <em>Appenders</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAppenders()
   * @generated
   * @ordered
   */
  protected EList<Appender> appenders;

  /**
   * The cached value of the '{@link #getLoggers() <em>Loggers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoggers()
   * @generated
   * @ordered
   */
  protected EList<Logger> loggers;

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
  protected LoggerImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DemoDslPackage.Literals.LOGGER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LevelEnum getLevel()
  {
    return level;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLevel(LevelEnum newLevel)
  {
    LevelEnum oldLevel = level;
    level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoDslPackage.LOGGER__LEVEL, oldLevel, level));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Appender> getAppenders()
  {
    if (appenders == null)
    {
      appenders = new EObjectResolvingEList<Appender>(Appender.class, this, DemoDslPackage.LOGGER__APPENDERS);
    }
    return appenders;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Logger> getLoggers()
  {
    if (loggers == null)
    {
      loggers = new EObjectContainmentEList<Logger>(Logger.class, this, DemoDslPackage.LOGGER__LOGGERS);
    }
    return loggers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoDslPackage.LOGGER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DemoDslPackage.LOGGER__LOGGERS:
        return ((InternalEList<?>)getLoggers()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DemoDslPackage.LOGGER__LEVEL:
        return getLevel();
      case DemoDslPackage.LOGGER__APPENDERS:
        return getAppenders();
      case DemoDslPackage.LOGGER__LOGGERS:
        return getLoggers();
      case DemoDslPackage.LOGGER__NAME:
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DemoDslPackage.LOGGER__LEVEL:
        setLevel((LevelEnum)newValue);
        return;
      case DemoDslPackage.LOGGER__APPENDERS:
        getAppenders().clear();
        getAppenders().addAll((Collection<? extends Appender>)newValue);
        return;
      case DemoDslPackage.LOGGER__LOGGERS:
        getLoggers().clear();
        getLoggers().addAll((Collection<? extends Logger>)newValue);
        return;
      case DemoDslPackage.LOGGER__NAME:
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DemoDslPackage.LOGGER__LEVEL:
        setLevel(LEVEL_EDEFAULT);
        return;
      case DemoDslPackage.LOGGER__APPENDERS:
        getAppenders().clear();
        return;
      case DemoDslPackage.LOGGER__LOGGERS:
        getLoggers().clear();
        return;
      case DemoDslPackage.LOGGER__NAME:
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DemoDslPackage.LOGGER__LEVEL:
        return level != LEVEL_EDEFAULT;
      case DemoDslPackage.LOGGER__APPENDERS:
        return appenders != null && !appenders.isEmpty();
      case DemoDslPackage.LOGGER__LOGGERS:
        return loggers != null && !loggers.isEmpty();
      case DemoDslPackage.LOGGER__NAME:
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
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (level: ");
    result.append(level);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //LoggerImpl
