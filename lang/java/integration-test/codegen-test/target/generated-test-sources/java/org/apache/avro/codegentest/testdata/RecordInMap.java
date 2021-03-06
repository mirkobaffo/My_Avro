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

@org.apache.avro.specific.AvroGenerated
public class RecordInMap extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7481942459234654881L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RecordInMap\",\"namespace\":\"org.apache.avro.codegentest.testdata\",\"fields\":[{\"name\":\"nullableDateField\",\"type\":[\"null\",{\"type\":\"int\",\"logicalType\":\"date\"}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.DateConversion());
  }

  private static final BinaryMessageEncoder<RecordInMap> ENCODER =
      new BinaryMessageEncoder<RecordInMap>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<RecordInMap> DECODER =
      new BinaryMessageDecoder<RecordInMap>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<RecordInMap> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<RecordInMap> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<RecordInMap> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<RecordInMap>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this RecordInMap to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a RecordInMap from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a RecordInMap instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static RecordInMap fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.time.LocalDate nullableDateField;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public RecordInMap() {}

  /**
   * All-args constructor.
   * @param nullableDateField The new value for nullableDateField
   */
  public RecordInMap(java.time.LocalDate nullableDateField) {
    this.nullableDateField = nullableDateField;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return nullableDateField;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: nullableDateField = (java.time.LocalDate)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'nullableDateField' field.
   * @return The value of the 'nullableDateField' field.
   */
  public java.time.LocalDate getNullableDateField() {
    return nullableDateField;
  }


  /**
   * Sets the value of the 'nullableDateField' field.
   * @param value the value to set.
   */
  public void setNullableDateField(java.time.LocalDate value) {
    this.nullableDateField = value;
  }

  /**
   * Creates a new RecordInMap RecordBuilder.
   * @return A new RecordInMap RecordBuilder
   */
  public static org.apache.avro.codegentest.testdata.RecordInMap.Builder newBuilder() {
    return new org.apache.avro.codegentest.testdata.RecordInMap.Builder();
  }

  /**
   * Creates a new RecordInMap RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new RecordInMap RecordBuilder
   */
  public static org.apache.avro.codegentest.testdata.RecordInMap.Builder newBuilder(org.apache.avro.codegentest.testdata.RecordInMap.Builder other) {
    if (other == null) {
      return new org.apache.avro.codegentest.testdata.RecordInMap.Builder();
    } else {
      return new org.apache.avro.codegentest.testdata.RecordInMap.Builder(other);
    }
  }

  /**
   * Creates a new RecordInMap RecordBuilder by copying an existing RecordInMap instance.
   * @param other The existing instance to copy.
   * @return A new RecordInMap RecordBuilder
   */
  public static org.apache.avro.codegentest.testdata.RecordInMap.Builder newBuilder(org.apache.avro.codegentest.testdata.RecordInMap other) {
    if (other == null) {
      return new org.apache.avro.codegentest.testdata.RecordInMap.Builder();
    } else {
      return new org.apache.avro.codegentest.testdata.RecordInMap.Builder(other);
    }
  }

  /**
   * RecordBuilder for RecordInMap instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<RecordInMap>
    implements org.apache.avro.data.RecordBuilder<RecordInMap> {

    private java.time.LocalDate nullableDateField;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.avro.codegentest.testdata.RecordInMap.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.nullableDateField)) {
        this.nullableDateField = data().deepCopy(fields()[0].schema(), other.nullableDateField);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing RecordInMap instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.avro.codegentest.testdata.RecordInMap other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.nullableDateField)) {
        this.nullableDateField = data().deepCopy(fields()[0].schema(), other.nullableDateField);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'nullableDateField' field.
      * @return The value.
      */
    public java.time.LocalDate getNullableDateField() {
      return nullableDateField;
    }


    /**
      * Sets the value of the 'nullableDateField' field.
      * @param value The value of 'nullableDateField'.
      * @return This builder.
      */
    public org.apache.avro.codegentest.testdata.RecordInMap.Builder setNullableDateField(java.time.LocalDate value) {
      validate(fields()[0], value);
      this.nullableDateField = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'nullableDateField' field has been set.
      * @return True if the 'nullableDateField' field has been set, false otherwise.
      */
    public boolean hasNullableDateField() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'nullableDateField' field.
      * @return This builder.
      */
    public org.apache.avro.codegentest.testdata.RecordInMap.Builder clearNullableDateField() {
      nullableDateField = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public RecordInMap build() {
      try {
        RecordInMap record = new RecordInMap();
        record.nullableDateField = fieldSetFlags()[0] ? this.nullableDateField : (java.time.LocalDate) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<RecordInMap>
    WRITER$ = (org.apache.avro.io.DatumWriter<RecordInMap>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<RecordInMap>
    READER$ = (org.apache.avro.io.DatumReader<RecordInMap>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










