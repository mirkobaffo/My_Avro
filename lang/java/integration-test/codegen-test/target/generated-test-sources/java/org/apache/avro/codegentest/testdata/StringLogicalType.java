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

/** Test logical type applied to field of type string */
@org.apache.avro.specific.AvroGenerated
public class StringLogicalType extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5976992399496878556L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"StringLogicalType\",\"namespace\":\"org.apache.avro.codegentest.testdata\",\"doc\":\"Test logical type applied to field of type string\",\"fields\":[{\"name\":\"someIdentifier\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"someJavaString\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Just to ensure no one removed <stringType>String</stringType> because this is the basis of this test\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.Conversions.UUIDConversion());
  }

  private static final BinaryMessageEncoder<StringLogicalType> ENCODER =
      new BinaryMessageEncoder<StringLogicalType>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<StringLogicalType> DECODER =
      new BinaryMessageDecoder<StringLogicalType>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<StringLogicalType> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<StringLogicalType> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<StringLogicalType> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<StringLogicalType>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this StringLogicalType to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a StringLogicalType from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a StringLogicalType instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static StringLogicalType fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.util.UUID someIdentifier;
  /** Just to ensure no one removed <stringType>String</stringType> because this is the basis of this test */
  private java.lang.String someJavaString;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public StringLogicalType() {}

  /**
   * All-args constructor.
   * @param someIdentifier The new value for someIdentifier
   * @param someJavaString Just to ensure no one removed <stringType>String</stringType> because this is the basis of this test
   */
  public StringLogicalType(java.util.UUID someIdentifier, java.lang.String someJavaString) {
    this.someIdentifier = someIdentifier;
    this.someJavaString = someJavaString;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return someIdentifier;
    case 1: return someJavaString;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      new org.apache.avro.Conversions.UUIDConversion(),
      null,
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
    case 0: someIdentifier = (java.util.UUID)value$; break;
    case 1: someJavaString = value$ != null ? value$.toString() : null; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'someIdentifier' field.
   * @return The value of the 'someIdentifier' field.
   */
  public java.util.UUID getSomeIdentifier() {
    return someIdentifier;
  }


  /**
   * Sets the value of the 'someIdentifier' field.
   * @param value the value to set.
   */
  public void setSomeIdentifier(java.util.UUID value) {
    this.someIdentifier = value;
  }

  /**
   * Gets the value of the 'someJavaString' field.
   * @return Just to ensure no one removed <stringType>String</stringType> because this is the basis of this test
   */
  public java.lang.String getSomeJavaString() {
    return someJavaString;
  }


  /**
   * Sets the value of the 'someJavaString' field.
   * Just to ensure no one removed <stringType>String</stringType> because this is the basis of this test
   * @param value the value to set.
   */
  public void setSomeJavaString(java.lang.String value) {
    this.someJavaString = value;
  }

  /**
   * Creates a new StringLogicalType RecordBuilder.
   * @return A new StringLogicalType RecordBuilder
   */
  public static org.apache.avro.codegentest.testdata.StringLogicalType.Builder newBuilder() {
    return new org.apache.avro.codegentest.testdata.StringLogicalType.Builder();
  }

  /**
   * Creates a new StringLogicalType RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new StringLogicalType RecordBuilder
   */
  public static org.apache.avro.codegentest.testdata.StringLogicalType.Builder newBuilder(org.apache.avro.codegentest.testdata.StringLogicalType.Builder other) {
    if (other == null) {
      return new org.apache.avro.codegentest.testdata.StringLogicalType.Builder();
    } else {
      return new org.apache.avro.codegentest.testdata.StringLogicalType.Builder(other);
    }
  }

  /**
   * Creates a new StringLogicalType RecordBuilder by copying an existing StringLogicalType instance.
   * @param other The existing instance to copy.
   * @return A new StringLogicalType RecordBuilder
   */
  public static org.apache.avro.codegentest.testdata.StringLogicalType.Builder newBuilder(org.apache.avro.codegentest.testdata.StringLogicalType other) {
    if (other == null) {
      return new org.apache.avro.codegentest.testdata.StringLogicalType.Builder();
    } else {
      return new org.apache.avro.codegentest.testdata.StringLogicalType.Builder(other);
    }
  }

  /**
   * RecordBuilder for StringLogicalType instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<StringLogicalType>
    implements org.apache.avro.data.RecordBuilder<StringLogicalType> {

    private java.util.UUID someIdentifier;
    /** Just to ensure no one removed <stringType>String</stringType> because this is the basis of this test */
    private java.lang.String someJavaString;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.avro.codegentest.testdata.StringLogicalType.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.someIdentifier)) {
        this.someIdentifier = data().deepCopy(fields()[0].schema(), other.someIdentifier);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.someJavaString)) {
        this.someJavaString = data().deepCopy(fields()[1].schema(), other.someJavaString);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing StringLogicalType instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.avro.codegentest.testdata.StringLogicalType other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.someIdentifier)) {
        this.someIdentifier = data().deepCopy(fields()[0].schema(), other.someIdentifier);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.someJavaString)) {
        this.someJavaString = data().deepCopy(fields()[1].schema(), other.someJavaString);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'someIdentifier' field.
      * @return The value.
      */
    public java.util.UUID getSomeIdentifier() {
      return someIdentifier;
    }


    /**
      * Sets the value of the 'someIdentifier' field.
      * @param value The value of 'someIdentifier'.
      * @return This builder.
      */
    public org.apache.avro.codegentest.testdata.StringLogicalType.Builder setSomeIdentifier(java.util.UUID value) {
      validate(fields()[0], value);
      this.someIdentifier = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'someIdentifier' field has been set.
      * @return True if the 'someIdentifier' field has been set, false otherwise.
      */
    public boolean hasSomeIdentifier() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'someIdentifier' field.
      * @return This builder.
      */
    public org.apache.avro.codegentest.testdata.StringLogicalType.Builder clearSomeIdentifier() {
      someIdentifier = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'someJavaString' field.
      * Just to ensure no one removed <stringType>String</stringType> because this is the basis of this test
      * @return The value.
      */
    public java.lang.String getSomeJavaString() {
      return someJavaString;
    }


    /**
      * Sets the value of the 'someJavaString' field.
      * Just to ensure no one removed <stringType>String</stringType> because this is the basis of this test
      * @param value The value of 'someJavaString'.
      * @return This builder.
      */
    public org.apache.avro.codegentest.testdata.StringLogicalType.Builder setSomeJavaString(java.lang.String value) {
      validate(fields()[1], value);
      this.someJavaString = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'someJavaString' field has been set.
      * Just to ensure no one removed <stringType>String</stringType> because this is the basis of this test
      * @return True if the 'someJavaString' field has been set, false otherwise.
      */
    public boolean hasSomeJavaString() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'someJavaString' field.
      * Just to ensure no one removed <stringType>String</stringType> because this is the basis of this test
      * @return This builder.
      */
    public org.apache.avro.codegentest.testdata.StringLogicalType.Builder clearSomeJavaString() {
      someJavaString = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public StringLogicalType build() {
      try {
        StringLogicalType record = new StringLogicalType();
        record.someIdentifier = fieldSetFlags()[0] ? this.someIdentifier : (java.util.UUID) defaultValue(fields()[0]);
        record.someJavaString = fieldSetFlags()[1] ? this.someJavaString : (java.lang.String) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<StringLogicalType>
    WRITER$ = (org.apache.avro.io.DatumWriter<StringLogicalType>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<StringLogicalType>
    READER$ = (org.apache.avro.io.DatumReader<StringLogicalType>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}









