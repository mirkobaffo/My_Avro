/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.apache.avro.test;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.TestAnnotation
@org.apache.avro.specific.AvroGenerated
public class TestRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2530317830657753100L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TestRecord\",\"namespace\":\"org.apache.avro.test\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"order\":\"ignore\",\"javaAnnotation\":\"org.apache.avro.TestAnnotation\"},{\"name\":\"kind\",\"type\":{\"type\":\"enum\",\"name\":\"Kind\",\"symbols\":[\"FOO\",\"BAR\",\"BAZ\"],\"javaAnnotation\":\"org.apache.avro.TestAnnotation\"},\"order\":\"descending\"},{\"name\":\"hash\",\"type\":{\"type\":\"fixed\",\"name\":\"MD5\",\"size\":16,\"javaAnnotation\":\"org.apache.avro.TestAnnotation\"}}],\"javaAnnotation\":\"org.apache.avro.TestAnnotation\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<TestRecord> ENCODER =
      new BinaryMessageEncoder<TestRecord>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<TestRecord> DECODER =
      new BinaryMessageDecoder<TestRecord>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<TestRecord> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<TestRecord> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<TestRecord> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<TestRecord>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this TestRecord to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a TestRecord from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a TestRecord instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static TestRecord fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @org.apache.avro.TestAnnotation
  private java.lang.CharSequence name;
  private org.apache.avro.test.Kind kind;
  private org.apache.avro.test.MD5 hash;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public TestRecord() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param kind The new value for kind
   * @param hash The new value for hash
   */
  public TestRecord(java.lang.CharSequence name, org.apache.avro.test.Kind kind, org.apache.avro.test.MD5 hash) {
    this.name = name;
    this.kind = kind;
    this.hash = hash;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return kind;
    case 2: return hash;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: kind = (org.apache.avro.test.Kind)value$; break;
    case 2: hash = (org.apache.avro.test.MD5)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'kind' field.
   * @return The value of the 'kind' field.
   */
  public org.apache.avro.test.Kind getKind() {
    return kind;
  }


  /**
   * Sets the value of the 'kind' field.
   * @param value the value to set.
   */
  public void setKind(org.apache.avro.test.Kind value) {
    this.kind = value;
  }

  /**
   * Gets the value of the 'hash' field.
   * @return The value of the 'hash' field.
   */
  public org.apache.avro.test.MD5 getHash() {
    return hash;
  }


  /**
   * Sets the value of the 'hash' field.
   * @param value the value to set.
   */
  public void setHash(org.apache.avro.test.MD5 value) {
    this.hash = value;
  }

  /**
   * Creates a new TestRecord RecordBuilder.
   * @return A new TestRecord RecordBuilder
   */
  public static org.apache.avro.test.TestRecord.Builder newBuilder() {
    return new org.apache.avro.test.TestRecord.Builder();
  }

  /**
   * Creates a new TestRecord RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new TestRecord RecordBuilder
   */
  public static org.apache.avro.test.TestRecord.Builder newBuilder(org.apache.avro.test.TestRecord.Builder other) {
    if (other == null) {
      return new org.apache.avro.test.TestRecord.Builder();
    } else {
      return new org.apache.avro.test.TestRecord.Builder(other);
    }
  }

  /**
   * Creates a new TestRecord RecordBuilder by copying an existing TestRecord instance.
   * @param other The existing instance to copy.
   * @return A new TestRecord RecordBuilder
   */
  public static org.apache.avro.test.TestRecord.Builder newBuilder(org.apache.avro.test.TestRecord other) {
    if (other == null) {
      return new org.apache.avro.test.TestRecord.Builder();
    } else {
      return new org.apache.avro.test.TestRecord.Builder(other);
    }
  }

  /**
   * RecordBuilder for TestRecord instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TestRecord>
    implements org.apache.avro.data.RecordBuilder<TestRecord> {

    private java.lang.CharSequence name;
    private org.apache.avro.test.Kind kind;
    private org.apache.avro.test.MD5 hash;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.avro.test.TestRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.kind)) {
        this.kind = data().deepCopy(fields()[1].schema(), other.kind);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.hash)) {
        this.hash = data().deepCopy(fields()[2].schema(), other.hash);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing TestRecord instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.avro.test.TestRecord other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.kind)) {
        this.kind = data().deepCopy(fields()[1].schema(), other.kind);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.hash)) {
        this.hash = data().deepCopy(fields()[2].schema(), other.hash);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public org.apache.avro.test.TestRecord.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public org.apache.avro.test.TestRecord.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'kind' field.
      * @return The value.
      */
    public org.apache.avro.test.Kind getKind() {
      return kind;
    }


    /**
      * Sets the value of the 'kind' field.
      * @param value The value of 'kind'.
      * @return This builder.
      */
    public org.apache.avro.test.TestRecord.Builder setKind(org.apache.avro.test.Kind value) {
      validate(fields()[1], value);
      this.kind = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'kind' field has been set.
      * @return True if the 'kind' field has been set, false otherwise.
      */
    public boolean hasKind() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'kind' field.
      * @return This builder.
      */
    public org.apache.avro.test.TestRecord.Builder clearKind() {
      kind = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'hash' field.
      * @return The value.
      */
    public org.apache.avro.test.MD5 getHash() {
      return hash;
    }


    /**
      * Sets the value of the 'hash' field.
      * @param value The value of 'hash'.
      * @return This builder.
      */
    public org.apache.avro.test.TestRecord.Builder setHash(org.apache.avro.test.MD5 value) {
      validate(fields()[2], value);
      this.hash = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'hash' field has been set.
      * @return True if the 'hash' field has been set, false otherwise.
      */
    public boolean hasHash() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'hash' field.
      * @return This builder.
      */
    public org.apache.avro.test.TestRecord.Builder clearHash() {
      hash = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public TestRecord build() {
      try {
        TestRecord record = new TestRecord();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.kind = fieldSetFlags()[1] ? this.kind : (org.apache.avro.test.Kind) defaultValue(fields()[1]);
        record.hash = fieldSetFlags()[2] ? this.hash : (org.apache.avro.test.MD5) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<TestRecord>
    WRITER$ = (org.apache.avro.io.DatumWriter<TestRecord>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<TestRecord>
    READER$ = (org.apache.avro.io.DatumReader<TestRecord>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.name);

    out.writeEnum(this.kind.ordinal());

    out.writeFixed(this.hash.bytes(), 0, 16);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);

      this.kind = org.apache.avro.test.Kind.values()[in.readEnum()];

      if (this.hash == null) {
        this.hash = new org.apache.avro.test.MD5();
      }
      in.readFixed(this.hash.bytes(), 0, 16);

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);
          break;

        case 1:
          this.kind = org.apache.avro.test.Kind.values()[in.readEnum()];
          break;

        case 2:
          if (this.hash == null) {
            this.hash = new org.apache.avro.test.MD5();
          }
          in.readFixed(this.hash.bytes(), 0, 16);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










