/**
 */
package pl.zgora.jug.xtext.demoDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Level Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see pl.zgora.jug.xtext.demoDsl.DemoDslPackage#getLevelEnum()
 * @model
 * @generated
 */
public enum LevelEnum implements Enumerator
{
  /**
   * The '<em><b>UNDEFINED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNDEFINED_VALUE
   * @generated
   * @ordered
   */
  UNDEFINED(0, "UNDEFINED", "UNDEFINED"),

  /**
   * The '<em><b>OFF</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OFF_VALUE
   * @generated
   * @ordered
   */
  OFF(1, "OFF", "off"),

  /**
   * The '<em><b>ERROR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ERROR_VALUE
   * @generated
   * @ordered
   */
  ERROR(2, "ERROR", "error"),

  /**
   * The '<em><b>WARNING</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WARNING_VALUE
   * @generated
   * @ordered
   */
  WARNING(3, "WARNING", "warn"),

  /**
   * The '<em><b>INFO</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INFO_VALUE
   * @generated
   * @ordered
   */
  INFO(4, "INFO", "info"),

  /**
   * The '<em><b>DEBUG</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DEBUG_VALUE
   * @generated
   * @ordered
   */
  DEBUG(5, "DEBUG", "debug"),

  /**
   * The '<em><b>TRACE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TRACE_VALUE
   * @generated
   * @ordered
   */
  TRACE(6, "TRACE", "trace");

  /**
   * The '<em><b>UNDEFINED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>UNDEFINED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UNDEFINED
   * @model
   * @generated
   * @ordered
   */
  public static final int UNDEFINED_VALUE = 0;

  /**
   * The '<em><b>OFF</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>OFF</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OFF
   * @model literal="off"
   * @generated
   * @ordered
   */
  public static final int OFF_VALUE = 1;

  /**
   * The '<em><b>ERROR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ERROR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ERROR
   * @model literal="error"
   * @generated
   * @ordered
   */
  public static final int ERROR_VALUE = 2;

  /**
   * The '<em><b>WARNING</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>WARNING</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WARNING
   * @model literal="warn"
   * @generated
   * @ordered
   */
  public static final int WARNING_VALUE = 3;

  /**
   * The '<em><b>INFO</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INFO</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INFO
   * @model literal="info"
   * @generated
   * @ordered
   */
  public static final int INFO_VALUE = 4;

  /**
   * The '<em><b>DEBUG</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DEBUG</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DEBUG
   * @model literal="debug"
   * @generated
   * @ordered
   */
  public static final int DEBUG_VALUE = 5;

  /**
   * The '<em><b>TRACE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TRACE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TRACE
   * @model literal="trace"
   * @generated
   * @ordered
   */
  public static final int TRACE_VALUE = 6;

  /**
   * An array of all the '<em><b>Level Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final LevelEnum[] VALUES_ARRAY =
    new LevelEnum[]
    {
      UNDEFINED,
      OFF,
      ERROR,
      WARNING,
      INFO,
      DEBUG,
      TRACE,
    };

  /**
   * A public read-only list of all the '<em><b>Level Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<LevelEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Level Enum</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static LevelEnum get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      LevelEnum result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Level Enum</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static LevelEnum getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      LevelEnum result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Level Enum</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static LevelEnum get(int value)
  {
    switch (value)
    {
      case UNDEFINED_VALUE: return UNDEFINED;
      case OFF_VALUE: return OFF;
      case ERROR_VALUE: return ERROR;
      case WARNING_VALUE: return WARNING;
      case INFO_VALUE: return INFO;
      case DEBUG_VALUE: return DEBUG;
      case TRACE_VALUE: return TRACE;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private LevelEnum(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //LevelEnum
