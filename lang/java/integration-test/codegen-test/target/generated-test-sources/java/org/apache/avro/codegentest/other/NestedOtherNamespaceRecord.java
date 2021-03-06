/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.apache.avro.codegentest.other;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class NestedOtherNamespaceRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6012448418689912964L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"NestedOtherNamespaceRecord\",\"namespace\":\"org.apache.avro.codegentest.other\",\"fields\":[{\"name\":\"someField\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<NestedOtherNamespaceRecord> ENCODER =
      new BinaryMessageEncoder<NestedOtherNamespaceRecord>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<NestedOtherNamespaceRecord> DECODER =
      new BinaryMessageDecoder<NestedOtherNamespaceRecord>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<NestedOtherNamespaceRecord> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<NestedOtherNamespaceRecord> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<NestedOtherNamespaceRecord> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<NestedOtherNamespaceRecord>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this NestedOtherNamespaceRecord to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a NestedOtherNamespaceRecord from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a NestedOtherNamespaceRecord instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static NestedOtherNamespaceRecord fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private int someField;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public NestedOtherNamespaceRecord() {}

  /**
   * All-args constructor.
   * @param someField The new value for someField
   */
  public NestedOtherNamespaceRecord(java.lang.Integer someField) {
    this.someField = someField;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return someField;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: someField = (java.lang.Integer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'someField' field.
   * @return The value of the 'someField' field.
   */
  public int getSomeField() {
    return someField;
  }


  /**
   * Sets the value of the 'someField' field.
   * @param value the value to set.
   */
  public void setSomeField(int value) {
    this.someField = value;
  }

  /**
   * Creates a new NestedOtherNamespaceRecord RecordBuilder.
   * @return A new NestedOtherNamespaceRecord RecordBuilder
   */
  public static org.apache.avro.codegentest.other.NestedOtherNamespaceRecord.Builder newBuilder() {
    return new org.apache.avro.codegentest.other.NestedOtherNamespaceRecord.Builder();
  }

  /**
   * Creates a new NestedOtherNamespaceRecord RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new NestedOtherNamespaceRecord RecordBuilder
   */
  public static org.apache.avro.codegentest.other.NestedOtherNamespaceRecord.Builder newBuilder(org.apache.avro.codegentest.other.NestedOtherNamespaceRecord.Builder other) {
    if (other == null) {
      return new org.apache.avro.codegentest.other.NestedOtherNamespaceRecord.Builder();
    } else {
      return new org.apache.avro.codegentest.other.NestedOtherNamespaceRecord.Builder(other);
    }
  }

  /**
   * Creates a new NestedOtherNamespaceRecord RecordBuilder by copying an existing NestedOtherNamespaceRecord instance.
   * @param other The existing instance to copy.
   * @return A new NestedOtherNamespaceRecord RecordBuilder
   */
  public static org.apache.avro.codegentest.other.NestedOtherNamespaceRecord.Builder newBuilder(org.apache.avro.codegentest.other.NestedOtherNamespaceRecord other) {
    if (other == null) {
      return new org.apache.avro.codegentest.other.NestedOtherNamespaceRecord.Builder();
    } else {
      return new org.apache.avro.codegentest.other.NestedOtherNamespaceRecord.Builder(other);
    }
  }

  /**
   * RecordBuilder for NestedOtherNamespaceRecord instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<NestedOtherNamespaceRecord>
    implements org.apache.avro.data.RecordBuilder<NestedOtherNamespaceRecord> {

    private int someField;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.avro.codegentest.other.NestedOtherNamespaceRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.someField)) {
        this.someField = data().deepCopy(fields()[0].schema(), other.someField);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing NestedOtherNamespaceRecord instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.avro.codegentest.other.NestedOtherNamespaceRecord other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.someField)) {
        this.someField = data().deepCopy(fields()[0].schema(), other.someField);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'someField' field.
      * @return The value.
      */
    public int getSomeField() {
      return someField;
    }


    /**
      * Sets the value of the 'someField' field.
      * @param value The value of 'someField'.
      * @return This builder.
      */
    public org.apache.avro.codegentest.other.NestedOtherNamespaceRecord.Builder setSomeField(int value) {
      validate(fields()[0], value);
      this.someField = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'someField' field has been set.
      * @return True if the 'someField' field has been set, false otherwise.
      */
    public boolean hasSomeField() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'someField' field.
      * @return This builder.
      */
    public org.apache.avro.codegentest.other.NestedOtherNamespaceRecord.Builder clearSomeField() {
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public NestedOtherNamespaceRecord build() {
      try {
        NestedOtherNamespaceRecord record = new NestedOtherNamespaceRecord();
        record.someField = fieldSetFlags()[0] ? this.someField : (java.lang.Integer) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<NestedOtherNamespaceRecord>
    WRITER$ = (org.apache.avro.io.DatumWriter<NestedOtherNamespaceRecord>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<NestedOtherNamespaceRecord>
    READER$ = (org.apache.avro.io.DatumReader<NestedOtherNamespaceRecord>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeInt(this.someField);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.someField = in.readInt();

    } else {
      for (int i = 0; i < 1; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.someField = in.readInt();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










