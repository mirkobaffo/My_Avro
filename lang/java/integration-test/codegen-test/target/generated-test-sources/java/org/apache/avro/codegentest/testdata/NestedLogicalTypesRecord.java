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

/** Test nested types with logical types in generated Java classes */
@org.apache.avro.specific.AvroGenerated
public class NestedLogicalTypesRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8953775017743319854L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"NestedLogicalTypesRecord\",\"namespace\":\"org.apache.avro.codegentest.testdata\",\"doc\":\"Test nested types with logical types in generated Java classes\",\"fields\":[{\"name\":\"nestedRecord\",\"type\":{\"type\":\"record\",\"name\":\"NestedRecord\",\"fields\":[{\"name\":\"nullableDateField\",\"type\":[\"null\",{\"type\":\"int\",\"logicalType\":\"date\"}]}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.DateConversion());
  }

  private static final BinaryMessageEncoder<NestedLogicalTypesRecord> ENCODER =
      new BinaryMessageEncoder<NestedLogicalTypesRecord>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<NestedLogicalTypesRecord> DECODER =
      new BinaryMessageDecoder<NestedLogicalTypesRecord>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<NestedLogicalTypesRecord> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<NestedLogicalTypesRecord> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<NestedLogicalTypesRecord> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<NestedLogicalTypesRecord>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this NestedLogicalTypesRecord to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a NestedLogicalTypesRecord from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a NestedLogicalTypesRecord instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static NestedLogicalTypesRecord fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private org.apache.avro.codegentest.testdata.NestedRecord nestedRecord;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public NestedLogicalTypesRecord() {}

  /**
   * All-args constructor.
   * @param nestedRecord The new value for nestedRecord
   */
  public NestedLogicalTypesRecord(org.apache.avro.codegentest.testdata.NestedRecord nestedRecord) {
    this.nestedRecord = nestedRecord;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return nestedRecord;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: nestedRecord = (org.apache.avro.codegentest.testdata.NestedRecord)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'nestedRecord' field.
   * @return The value of the 'nestedRecord' field.
   */
  public org.apache.avro.codegentest.testdata.NestedRecord getNestedRecord() {
    return nestedRecord;
  }


  /**
   * Sets the value of the 'nestedRecord' field.
   * @param value the value to set.
   */
  public void setNestedRecord(org.apache.avro.codegentest.testdata.NestedRecord value) {
    this.nestedRecord = value;
  }

  /**
   * Creates a new NestedLogicalTypesRecord RecordBuilder.
   * @return A new NestedLogicalTypesRecord RecordBuilder
   */
  public static org.apache.avro.codegentest.testdata.NestedLogicalTypesRecord.Builder newBuilder() {
    return new org.apache.avro.codegentest.testdata.NestedLogicalTypesRecord.Builder();
  }

  /**
   * Creates a new NestedLogicalTypesRecord RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new NestedLogicalTypesRecord RecordBuilder
   */
  public static org.apache.avro.codegentest.testdata.NestedLogicalTypesRecord.Builder newBuilder(org.apache.avro.codegentest.testdata.NestedLogicalTypesRecord.Builder other) {
    if (other == null) {
      return new org.apache.avro.codegentest.testdata.NestedLogicalTypesRecord.Builder();
    } else {
      return new org.apache.avro.codegentest.testdata.NestedLogicalTypesRecord.Builder(other);
    }
  }

  /**
   * Creates a new NestedLogicalTypesRecord RecordBuilder by copying an existing NestedLogicalTypesRecord instance.
   * @param other The existing instance to copy.
   * @return A new NestedLogicalTypesRecord RecordBuilder
   */
  public static org.apache.avro.codegentest.testdata.NestedLogicalTypesRecord.Builder newBuilder(org.apache.avro.codegentest.testdata.NestedLogicalTypesRecord other) {
    if (other == null) {
      return new org.apache.avro.codegentest.testdata.NestedLogicalTypesRecord.Builder();
    } else {
      return new org.apache.avro.codegentest.testdata.NestedLogicalTypesRecord.Builder(other);
    }
  }

  /**
   * RecordBuilder for NestedLogicalTypesRecord instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<NestedLogicalTypesRecord>
    implements org.apache.avro.data.RecordBuilder<NestedLogicalTypesRecord> {

    private org.apache.avro.codegentest.testdata.NestedRecord nestedRecord;
    private org.apache.avro.codegentest.testdata.NestedRecord.Builder nestedRecordBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.avro.codegentest.testdata.NestedLogicalTypesRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.nestedRecord)) {
        this.nestedRecord = data().deepCopy(fields()[0].schema(), other.nestedRecord);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasNestedRecordBuilder()) {
        this.nestedRecordBuilder = org.apache.avro.codegentest.testdata.NestedRecord.newBuilder(other.getNestedRecordBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing NestedLogicalTypesRecord instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.avro.codegentest.testdata.NestedLogicalTypesRecord other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.nestedRecord)) {
        this.nestedRecord = data().deepCopy(fields()[0].schema(), other.nestedRecord);
        fieldSetFlags()[0] = true;
      }
      this.nestedRecordBuilder = null;
    }

    /**
      * Gets the value of the 'nestedRecord' field.
      * @return The value.
      */
    public org.apache.avro.codegentest.testdata.NestedRecord getNestedRecord() {
      return nestedRecord;
    }


    /**
      * Sets the value of the 'nestedRecord' field.
      * @param value The value of 'nestedRecord'.
      * @return This builder.
      */
    public org.apache.avro.codegentest.testdata.NestedLogicalTypesRecord.Builder setNestedRecord(org.apache.avro.codegentest.testdata.NestedRecord value) {
      validate(fields()[0], value);
      this.nestedRecordBuilder = null;
      this.nestedRecord = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'nestedRecord' field has been set.
      * @return True if the 'nestedRecord' field has been set, false otherwise.
      */
    public boolean hasNestedRecord() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'nestedRecord' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public org.apache.avro.codegentest.testdata.NestedRecord.Builder getNestedRecordBuilder() {
      if (nestedRecordBuilder == null) {
        if (hasNestedRecord()) {
          setNestedRecordBuilder(org.apache.avro.codegentest.testdata.NestedRecord.newBuilder(nestedRecord));
        } else {
          setNestedRecordBuilder(org.apache.avro.codegentest.testdata.NestedRecord.newBuilder());
        }
      }
      return nestedRecordBuilder;
    }

    /**
     * Sets the Builder instance for the 'nestedRecord' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public org.apache.avro.codegentest.testdata.NestedLogicalTypesRecord.Builder setNestedRecordBuilder(org.apache.avro.codegentest.testdata.NestedRecord.Builder value) {
      clearNestedRecord();
      nestedRecordBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'nestedRecord' field has an active Builder instance
     * @return True if the 'nestedRecord' field has an active Builder instance
     */
    public boolean hasNestedRecordBuilder() {
      return nestedRecordBuilder != null;
    }

    /**
      * Clears the value of the 'nestedRecord' field.
      * @return This builder.
      */
    public org.apache.avro.codegentest.testdata.NestedLogicalTypesRecord.Builder clearNestedRecord() {
      nestedRecord = null;
      nestedRecordBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public NestedLogicalTypesRecord build() {
      try {
        NestedLogicalTypesRecord record = new NestedLogicalTypesRecord();
        if (nestedRecordBuilder != null) {
          try {
            record.nestedRecord = this.nestedRecordBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("nestedRecord"));
            throw e;
          }
        } else {
          record.nestedRecord = fieldSetFlags()[0] ? this.nestedRecord : (org.apache.avro.codegentest.testdata.NestedRecord) defaultValue(fields()[0]);
        }
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<NestedLogicalTypesRecord>
    WRITER$ = (org.apache.avro.io.DatumWriter<NestedLogicalTypesRecord>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<NestedLogicalTypesRecord>
    READER$ = (org.apache.avro.io.DatumReader<NestedLogicalTypesRecord>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










