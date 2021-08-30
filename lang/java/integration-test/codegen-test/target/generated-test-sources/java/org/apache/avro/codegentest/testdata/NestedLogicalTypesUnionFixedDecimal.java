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
public class NestedLogicalTypesUnionFixedDecimal extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3952493075277363798L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"NestedLogicalTypesUnionFixedDecimal\",\"namespace\":\"org.apache.avro.codegentest.testdata\",\"doc\":\"Test nested types with logical types in generated Java classes\",\"fields\":[{\"name\":\"unionOfFixedDecimal\",\"type\":[\"null\",{\"type\":\"fixed\",\"name\":\"FixedInUnion\",\"size\":12,\"logicalType\":\"decimal\",\"precision\":28,\"scale\":15}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.codegentest.CustomDecimalConversion());
  }

  private static final BinaryMessageEncoder<NestedLogicalTypesUnionFixedDecimal> ENCODER =
      new BinaryMessageEncoder<NestedLogicalTypesUnionFixedDecimal>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<NestedLogicalTypesUnionFixedDecimal> DECODER =
      new BinaryMessageDecoder<NestedLogicalTypesUnionFixedDecimal>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<NestedLogicalTypesUnionFixedDecimal> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<NestedLogicalTypesUnionFixedDecimal> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<NestedLogicalTypesUnionFixedDecimal> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<NestedLogicalTypesUnionFixedDecimal>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this NestedLogicalTypesUnionFixedDecimal to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a NestedLogicalTypesUnionFixedDecimal from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a NestedLogicalTypesUnionFixedDecimal instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static NestedLogicalTypesUnionFixedDecimal fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private org.apache.avro.codegentest.CustomDecimal unionOfFixedDecimal;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public NestedLogicalTypesUnionFixedDecimal() {}

  /**
   * All-args constructor.
   * @param unionOfFixedDecimal The new value for unionOfFixedDecimal
   */
  public NestedLogicalTypesUnionFixedDecimal(org.apache.avro.codegentest.CustomDecimal unionOfFixedDecimal) {
    this.unionOfFixedDecimal = unionOfFixedDecimal;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return unionOfFixedDecimal;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: unionOfFixedDecimal = (org.apache.avro.codegentest.CustomDecimal)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'unionOfFixedDecimal' field.
   * @return The value of the 'unionOfFixedDecimal' field.
   */
  public org.apache.avro.codegentest.CustomDecimal getUnionOfFixedDecimal() {
    return unionOfFixedDecimal;
  }


  /**
   * Sets the value of the 'unionOfFixedDecimal' field.
   * @param value the value to set.
   */
  public void setUnionOfFixedDecimal(org.apache.avro.codegentest.CustomDecimal value) {
    this.unionOfFixedDecimal = value;
  }

  /**
   * Creates a new NestedLogicalTypesUnionFixedDecimal RecordBuilder.
   * @return A new NestedLogicalTypesUnionFixedDecimal RecordBuilder
   */
  public static org.apache.avro.codegentest.testdata.NestedLogicalTypesUnionFixedDecimal.Builder newBuilder() {
    return new org.apache.avro.codegentest.testdata.NestedLogicalTypesUnionFixedDecimal.Builder();
  }

  /**
   * Creates a new NestedLogicalTypesUnionFixedDecimal RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new NestedLogicalTypesUnionFixedDecimal RecordBuilder
   */
  public static org.apache.avro.codegentest.testdata.NestedLogicalTypesUnionFixedDecimal.Builder newBuilder(org.apache.avro.codegentest.testdata.NestedLogicalTypesUnionFixedDecimal.Builder other) {
    if (other == null) {
      return new org.apache.avro.codegentest.testdata.NestedLogicalTypesUnionFixedDecimal.Builder();
    } else {
      return new org.apache.avro.codegentest.testdata.NestedLogicalTypesUnionFixedDecimal.Builder(other);
    }
  }

  /**
   * Creates a new NestedLogicalTypesUnionFixedDecimal RecordBuilder by copying an existing NestedLogicalTypesUnionFixedDecimal instance.
   * @param other The existing instance to copy.
   * @return A new NestedLogicalTypesUnionFixedDecimal RecordBuilder
   */
  public static org.apache.avro.codegentest.testdata.NestedLogicalTypesUnionFixedDecimal.Builder newBuilder(org.apache.avro.codegentest.testdata.NestedLogicalTypesUnionFixedDecimal other) {
    if (other == null) {
      return new org.apache.avro.codegentest.testdata.NestedLogicalTypesUnionFixedDecimal.Builder();
    } else {
      return new org.apache.avro.codegentest.testdata.NestedLogicalTypesUnionFixedDecimal.Builder(other);
    }
  }

  /**
   * RecordBuilder for NestedLogicalTypesUnionFixedDecimal instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<NestedLogicalTypesUnionFixedDecimal>
    implements org.apache.avro.data.RecordBuilder<NestedLogicalTypesUnionFixedDecimal> {

    private org.apache.avro.codegentest.CustomDecimal unionOfFixedDecimal;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.avro.codegentest.testdata.NestedLogicalTypesUnionFixedDecimal.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.unionOfFixedDecimal)) {
        this.unionOfFixedDecimal = data().deepCopy(fields()[0].schema(), other.unionOfFixedDecimal);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing NestedLogicalTypesUnionFixedDecimal instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.avro.codegentest.testdata.NestedLogicalTypesUnionFixedDecimal other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.unionOfFixedDecimal)) {
        this.unionOfFixedDecimal = data().deepCopy(fields()[0].schema(), other.unionOfFixedDecimal);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'unionOfFixedDecimal' field.
      * @return The value.
      */
    public org.apache.avro.codegentest.CustomDecimal getUnionOfFixedDecimal() {
      return unionOfFixedDecimal;
    }


    /**
      * Sets the value of the 'unionOfFixedDecimal' field.
      * @param value The value of 'unionOfFixedDecimal'.
      * @return This builder.
      */
    public org.apache.avro.codegentest.testdata.NestedLogicalTypesUnionFixedDecimal.Builder setUnionOfFixedDecimal(org.apache.avro.codegentest.CustomDecimal value) {
      validate(fields()[0], value);
      this.unionOfFixedDecimal = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'unionOfFixedDecimal' field has been set.
      * @return True if the 'unionOfFixedDecimal' field has been set, false otherwise.
      */
    public boolean hasUnionOfFixedDecimal() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'unionOfFixedDecimal' field.
      * @return This builder.
      */
    public org.apache.avro.codegentest.testdata.NestedLogicalTypesUnionFixedDecimal.Builder clearUnionOfFixedDecimal() {
      unionOfFixedDecimal = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public NestedLogicalTypesUnionFixedDecimal build() {
      try {
        NestedLogicalTypesUnionFixedDecimal record = new NestedLogicalTypesUnionFixedDecimal();
        record.unionOfFixedDecimal = fieldSetFlags()[0] ? this.unionOfFixedDecimal : (org.apache.avro.codegentest.CustomDecimal) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<NestedLogicalTypesUnionFixedDecimal>
    WRITER$ = (org.apache.avro.io.DatumWriter<NestedLogicalTypesUnionFixedDecimal>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<NestedLogicalTypesUnionFixedDecimal>
    READER$ = (org.apache.avro.io.DatumReader<NestedLogicalTypesUnionFixedDecimal>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}









