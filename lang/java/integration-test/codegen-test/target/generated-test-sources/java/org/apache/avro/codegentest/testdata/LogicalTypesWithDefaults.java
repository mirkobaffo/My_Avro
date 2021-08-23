/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.apache.avro.codegentest.testdata;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

/** Test logical types and default values in generated Java classes */
@org.apache.avro.specific.AvroGenerated
public class LogicalTypesWithDefaults extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2835528569326412839L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"LogicalTypesWithDefaults\",\"namespace\":\"org.apache.avro.codegentest.testdata\",\"doc\":\"Test logical types and default values in generated Java classes\",\"fields\":[{\"name\":\"nullableDate\",\"type\":[{\"type\":\"int\",\"logicalType\":\"date\"},\"null\"],\"default\":1234},{\"name\":\"nonNullDate\",\"type\":{\"type\":\"int\",\"logicalType\":\"date\"},\"default\":1234}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.DateConversion());
  }

  private static final BinaryMessageEncoder<LogicalTypesWithDefaults> ENCODER =
      new BinaryMessageEncoder<LogicalTypesWithDefaults>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<LogicalTypesWithDefaults> DECODER =
      new BinaryMessageDecoder<LogicalTypesWithDefaults>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<LogicalTypesWithDefaults> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<LogicalTypesWithDefaults> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<LogicalTypesWithDefaults> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<LogicalTypesWithDefaults>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this LogicalTypesWithDefaults to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a LogicalTypesWithDefaults from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a LogicalTypesWithDefaults instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static LogicalTypesWithDefaults fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.time.LocalDate nullableDate;
  private java.time.LocalDate nonNullDate;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public LogicalTypesWithDefaults() {}

  /**
   * All-args constructor.
   * @param nullableDate The new value for nullableDate
   * @param nonNullDate The new value for nonNullDate
   */
  public LogicalTypesWithDefaults(java.time.LocalDate nullableDate, java.time.LocalDate nonNullDate) {
    this.nullableDate = nullableDate;
    this.nonNullDate = nonNullDate;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return nullableDate;
    case 1: return nonNullDate;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      null,
      new org.apache.avro.data.TimeConversions.DateConversion(),
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: nullableDate = (java.time.LocalDate)value$; break;
    case 1: nonNullDate = (java.time.LocalDate)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'nullableDate' field.
   * @return The value of the 'nullableDate' field.
   */
  public java.time.LocalDate getNullableDate() {
    return nullableDate;
  }


  /**
   * Sets the value of the 'nullableDate' field.
   * @param value the value to set.
   */
  public void setNullableDate(java.time.LocalDate value) {
    this.nullableDate = value;
  }

  /**
   * Gets the value of the 'nonNullDate' field.
   * @return The value of the 'nonNullDate' field.
   */
  public java.time.LocalDate getNonNullDate() {
    return nonNullDate;
  }


  /**
   * Sets the value of the 'nonNullDate' field.
   * @param value the value to set.
   */
  public void setNonNullDate(java.time.LocalDate value) {
    this.nonNullDate = value;
  }

  /**
   * Creates a new LogicalTypesWithDefaults RecordBuilder.
   * @return A new LogicalTypesWithDefaults RecordBuilder
   */
  public static org.apache.avro.codegentest.testdata.LogicalTypesWithDefaults.Builder newBuilder() {
    return new org.apache.avro.codegentest.testdata.LogicalTypesWithDefaults.Builder();
  }

  /**
   * Creates a new LogicalTypesWithDefaults RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new LogicalTypesWithDefaults RecordBuilder
   */
  public static org.apache.avro.codegentest.testdata.LogicalTypesWithDefaults.Builder newBuilder(org.apache.avro.codegentest.testdata.LogicalTypesWithDefaults.Builder other) {
    if (other == null) {
      return new org.apache.avro.codegentest.testdata.LogicalTypesWithDefaults.Builder();
    } else {
      return new org.apache.avro.codegentest.testdata.LogicalTypesWithDefaults.Builder(other);
    }
  }

  /**
   * Creates a new LogicalTypesWithDefaults RecordBuilder by copying an existing LogicalTypesWithDefaults instance.
   * @param other The existing instance to copy.
   * @return A new LogicalTypesWithDefaults RecordBuilder
   */
  public static org.apache.avro.codegentest.testdata.LogicalTypesWithDefaults.Builder newBuilder(org.apache.avro.codegentest.testdata.LogicalTypesWithDefaults other) {
    if (other == null) {
      return new org.apache.avro.codegentest.testdata.LogicalTypesWithDefaults.Builder();
    } else {
      return new org.apache.avro.codegentest.testdata.LogicalTypesWithDefaults.Builder(other);
    }
  }

  /**
   * RecordBuilder for LogicalTypesWithDefaults instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<LogicalTypesWithDefaults>
    implements org.apache.avro.data.RecordBuilder<LogicalTypesWithDefaults> {

    private java.time.LocalDate nullableDate;
    private java.time.LocalDate nonNullDate;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.avro.codegentest.testdata.LogicalTypesWithDefaults.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.nullableDate)) {
        this.nullableDate = data().deepCopy(fields()[0].schema(), other.nullableDate);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.nonNullDate)) {
        this.nonNullDate = data().deepCopy(fields()[1].schema(), other.nonNullDate);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing LogicalTypesWithDefaults instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.avro.codegentest.testdata.LogicalTypesWithDefaults other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.nullableDate)) {
        this.nullableDate = data().deepCopy(fields()[0].schema(), other.nullableDate);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.nonNullDate)) {
        this.nonNullDate = data().deepCopy(fields()[1].schema(), other.nonNullDate);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'nullableDate' field.
      * @return The value.
      */
    public java.time.LocalDate getNullableDate() {
      return nullableDate;
    }


    /**
      * Sets the value of the 'nullableDate' field.
      * @param value The value of 'nullableDate'.
      * @return This builder.
      */
    public org.apache.avro.codegentest.testdata.LogicalTypesWithDefaults.Builder setNullableDate(java.time.LocalDate value) {
      validate(fields()[0], value);
      this.nullableDate = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'nullableDate' field has been set.
      * @return True if the 'nullableDate' field has been set, false otherwise.
      */
    public boolean hasNullableDate() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'nullableDate' field.
      * @return This builder.
      */
    public org.apache.avro.codegentest.testdata.LogicalTypesWithDefaults.Builder clearNullableDate() {
      nullableDate = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'nonNullDate' field.
      * @return The value.
      */
    public java.time.LocalDate getNonNullDate() {
      return nonNullDate;
    }


    /**
      * Sets the value of the 'nonNullDate' field.
      * @param value The value of 'nonNullDate'.
      * @return This builder.
      */
    public org.apache.avro.codegentest.testdata.LogicalTypesWithDefaults.Builder setNonNullDate(java.time.LocalDate value) {
      validate(fields()[1], value);
      this.nonNullDate = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'nonNullDate' field has been set.
      * @return True if the 'nonNullDate' field has been set, false otherwise.
      */
    public boolean hasNonNullDate() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'nonNullDate' field.
      * @return This builder.
      */
    public org.apache.avro.codegentest.testdata.LogicalTypesWithDefaults.Builder clearNonNullDate() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public LogicalTypesWithDefaults build() {
      try {
        LogicalTypesWithDefaults record = new LogicalTypesWithDefaults();
        record.nullableDate = fieldSetFlags()[0] ? this.nullableDate : (java.time.LocalDate) defaultValue(fields()[0]);
        record.nonNullDate = fieldSetFlags()[1] ? this.nonNullDate : (java.time.LocalDate) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<LogicalTypesWithDefaults>
    WRITER$ = (org.apache.avro.io.DatumWriter<LogicalTypesWithDefaults>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<LogicalTypesWithDefaults>
    READER$ = (org.apache.avro.io.DatumReader<LogicalTypesWithDefaults>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










