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
import org.eclipse.emf.ecore.util.InternalEList;

import pl.zgora.jug.xtext.demoDsl.Appender;
import pl.zgora.jug.xtext.demoDsl.DemoDslPackage;
import pl.zgora.jug.xtext.demoDsl.Logger;
import pl.zgora.jug.xtext.demoDsl.LoggerConfig;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logger Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pl.zgora.jug.xtext.demoDsl.impl.LoggerConfigImpl#isDebug <em>Debug</em>}</li>
 *   <li>{@link pl.zgora.jug.xtext.demoDsl.impl.LoggerConfigImpl#isScan <em>Scan</em>}</li>
 *   <li>{@link pl.zgora.jug.xtext.demoDsl.impl.LoggerConfigImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link pl.zgora.jug.xtext.demoDsl.impl.LoggerConfigImpl#getAppenders <em>Appenders</em>}</li>
 *   <li>{@link pl.zgora.jug.xtext.demoDsl.impl.LoggerConfigImpl#getRootLogger <em>Root Logger</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoggerConfigImpl extends MinimalEObjectImpl.Container implements LoggerConfig
{
  /**
   * The default value of the '{@link #isDebug() <em>Debug</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDebug()
   * @generated
   * @ordered
   */
  protected static final boolean DEBUG_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDebug() <em>Debug</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDebug()
   * @generated
   * @ordered
   */
  protected boolean debug = DEBUG_EDEFAULT;

  /**
   * The default value of the '{@link #isScan() <em>Scan</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isScan()
   * @generated
   * @ordered
   */
  protected static final boolean SCAN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isScan() <em>Scan</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isScan()
   * @generated
   * @ordered
   */
  protected boolean scan = SCAN_EDEFAULT;

  /**
   * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPeriod()
   * @generated
   * @ordered
   */
  protected static final String PERIOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPeriod()
   * @generated
   * @ordered
   */
  protected String period = PERIOD_EDEFAULT;

  /**
   * The cached value of the '{@link #getAppenders() <em>Appenders</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAppenders()
   * @generated
   * @ordered
   */
  protected EList<Appender> appenders;

  /**
   * The cached value of the '{@link #getRootLogger() <em>Root Logger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRootLogger()
   * @generated
   * @ordered
   */
  protected Logger rootLogger;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LoggerConfigImpl()
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
    return DemoDslPackage.Literals.LOGGER_CONFIG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDebug()
  {
    return debug;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDebug(boolean newDebug)
  {
    boolean oldDebug = debug;
    debug = newDebug;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoDslPackage.LOGGER_CONFIG__DEBUG, oldDebug, debug));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isScan()
  {
    return scan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScan(boolean newScan)
  {
    boolean oldScan = scan;
    scan = newScan;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoDslPackage.LOGGER_CONFIG__SCAN, oldScan, scan));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPeriod()
  {
    return period;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPeriod(String newPeriod)
  {
    String oldPeriod = period;
    period = newPeriod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoDslPackage.LOGGER_CONFIG__PERIOD, oldPeriod, period));
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
      appenders = new EObjectContainmentEList<Appender>(Appender.class, this, DemoDslPackage.LOGGER_CONFIG__APPENDERS);
    }
    return appenders;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Logger getRootLogger()
  {
    return rootLogger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRootLogger(Logger newRootLogger, NotificationChain msgs)
  {
    Logger oldRootLogger = rootLogger;
    rootLogger = newRootLogger;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DemoDslPackage.LOGGER_CONFIG__ROOT_LOGGER, oldRootLogger, newRootLogger);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRootLogger(Logger newRootLogger)
  {
    if (newRootLogger != rootLogger)
    {
      NotificationChain msgs = null;
      if (rootLogger != null)
        msgs = ((InternalEObject)rootLogger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DemoDslPackage.LOGGER_CONFIG__ROOT_LOGGER, null, msgs);
      if (newRootLogger != null)
        msgs = ((InternalEObject)newRootLogger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DemoDslPackage.LOGGER_CONFIG__ROOT_LOGGER, null, msgs);
      msgs = basicSetRootLogger(newRootLogger, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoDslPackage.LOGGER_CONFIG__ROOT_LOGGER, newRootLogger, newRootLogger));
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
      case DemoDslPackage.LOGGER_CONFIG__APPENDERS:
        return ((InternalEList<?>)getAppenders()).basicRemove(otherEnd, msgs);
      case DemoDslPackage.LOGGER_CONFIG__ROOT_LOGGER:
        return basicSetRootLogger(null, msgs);
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
      case DemoDslPackage.LOGGER_CONFIG__DEBUG:
        return isDebug();
      case DemoDslPackage.LOGGER_CONFIG__SCAN:
        return isScan();
      case DemoDslPackage.LOGGER_CONFIG__PERIOD:
        return getPeriod();
      case DemoDslPackage.LOGGER_CONFIG__APPENDERS:
        return getAppenders();
      case DemoDslPackage.LOGGER_CONFIG__ROOT_LOGGER:
        return getRootLogger();
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
      case DemoDslPackage.LOGGER_CONFIG__DEBUG:
        setDebug((Boolean)newValue);
        return;
      case DemoDslPackage.LOGGER_CONFIG__SCAN:
        setScan((Boolean)newValue);
        return;
      case DemoDslPackage.LOGGER_CONFIG__PERIOD:
        setPeriod((String)newValue);
        return;
      case DemoDslPackage.LOGGER_CONFIG__APPENDERS:
        getAppenders().clear();
        getAppenders().addAll((Collection<? extends Appender>)newValue);
        return;
      case DemoDslPackage.LOGGER_CONFIG__ROOT_LOGGER:
        setRootLogger((Logger)newValue);
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
      case DemoDslPackage.LOGGER_CONFIG__DEBUG:
        setDebug(DEBUG_EDEFAULT);
        return;
      case DemoDslPackage.LOGGER_CONFIG__SCAN:
        setScan(SCAN_EDEFAULT);
        return;
      case DemoDslPackage.LOGGER_CONFIG__PERIOD:
        setPeriod(PERIOD_EDEFAULT);
        return;
      case DemoDslPackage.LOGGER_CONFIG__APPENDERS:
        getAppenders().clear();
        return;
      case DemoDslPackage.LOGGER_CONFIG__ROOT_LOGGER:
        setRootLogger((Logger)null);
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
      case DemoDslPackage.LOGGER_CONFIG__DEBUG:
        return debug != DEBUG_EDEFAULT;
      case DemoDslPackage.LOGGER_CONFIG__SCAN:
        return scan != SCAN_EDEFAULT;
      case DemoDslPackage.LOGGER_CONFIG__PERIOD:
        return PERIOD_EDEFAULT == null ? period != null : !PERIOD_EDEFAULT.equals(period);
      case DemoDslPackage.LOGGER_CONFIG__APPENDERS:
        return appenders != null && !appenders.isEmpty();
      case DemoDslPackage.LOGGER_CONFIG__ROOT_LOGGER:
        return rootLogger != null;
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
    result.append(" (debug: ");
    result.append(debug);
    result.append(", scan: ");
    result.append(scan);
    result.append(", period: ");
    result.append(period);
    result.append(')');
    return result.toString();
  }

} //LoggerConfigImpl
