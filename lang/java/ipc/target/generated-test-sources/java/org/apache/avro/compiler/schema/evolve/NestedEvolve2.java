/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.apache.avro.compiler.schema.evolve;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;
import java.util.Optional;
@org.apache.avro.specific.AvroGenerated
public class NestedEvolve2 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5704960604399298040L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"NestedEvolve2\",\"namespace\":\"org.apache.avro.compiler.schema.evolve\",\"fields\":[{\"name\":\"rootName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"nested\",\"type\":{\"type\":\"record\",\"name\":\"TestRecord2\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"value\",\"type\":\"long\"},{\"name\":\"data\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<NestedEvolve2> ENCODER =
      new BinaryMessageEncoder<NestedEvolve2>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<NestedEvolve2> DECODER =
      new BinaryMessageDecoder<NestedEvolve2>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<NestedEvolve2> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<NestedEvolve2> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<NestedEvolve2> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<NestedEvolve2>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this NestedEvolve2 to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a NestedEvolve2 from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a NestedEvolve2 instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static NestedEvolve2 fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.String rootName;
  private org.apache.avro.compiler.schema.evolve.TestRecord2 nested;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public NestedEvolve2() {}

  /**
   * All-args constructor.
   * @param rootName The new value for rootName
   * @param nested The new value for nested
   */
  public NestedEvolve2(java.lang.String rootName, org.apache.avro.compiler.schema.evolve.TestRecord2 nested) {
    this.rootName = rootName;
    this.nested = nested;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return rootName;
    case 1: return nested;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: rootName = value$ != null ? value$.toString() : null; break;
    case 1: nested = (org.apache.avro.compiler.schema.evolve.TestRecord2)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'rootName' field.
   * @return The value of the 'rootName' field.
   */
  public java.lang.String getRootName() {
    return rootName;
  }

  /**
   * Gets the value of the 'rootName' field as an Optional&lt;java.lang.String&gt;.
   * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
   */
  public Optional<java.lang.String> getOptionalRootName() {
    return Optional.<java.lang.String>ofNullable(rootName);
  }

  /**
   * Sets the value of the 'rootName' field.
   * @param value the value to set.
   */
  public void setRootName(java.lang.String value) {
    this.rootName = value;
  }

  /**
   * Gets the value of the 'nested' field.
   * @return The value of the 'nested' field.
   */
  public org.apache.avro.compiler.schema.evolve.TestRecord2 getNested() {
    return nested;
  }

  /**
   * Gets the value of the 'nested' field as an Optional&lt;org.apache.avro.compiler.schema.evolve.TestRecord2&gt;.
   * @return The value wrapped in an Optional&lt;org.apache.avro.compiler.schema.evolve.TestRecord2&gt;.
   */
  public Optional<org.apache.avro.compiler.schema.evolve.TestRecord2> getOptionalNested() {
    return Optional.<org.apache.avro.compiler.schema.evolve.TestRecord2>ofNullable(nested);
  }

  /**
   * Sets the value of the 'nested' field.
   * @param value the value to set.
   */
  public void setNested(org.apache.avro.compiler.schema.evolve.TestRecord2 value) {
    this.nested = value;
  }

  /**
   * Creates a new NestedEvolve2 RecordBuilder.
   * @return A new NestedEvolve2 RecordBuilder
   */
  public static org.apache.avro.compiler.schema.evolve.NestedEvolve2.Builder newBuilder() {
    return new org.apache.avro.compiler.schema.evolve.NestedEvolve2.Builder();
  }

  /**
   * Creates a new NestedEvolve2 RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new NestedEvolve2 RecordBuilder
   */
  public static org.apache.avro.compiler.schema.evolve.NestedEvolve2.Builder newBuilder(org.apache.avro.compiler.schema.evolve.NestedEvolve2.Builder other) {
    if (other == null) {
      return new org.apache.avro.compiler.schema.evolve.NestedEvolve2.Builder();
    } else {
      return new org.apache.avro.compiler.schema.evolve.NestedEvolve2.Builder(other);
    }
  }

  /**
   * Creates a new NestedEvolve2 RecordBuilder by copying an existing NestedEvolve2 instance.
   * @param other The existing instance to copy.
   * @return A new NestedEvolve2 RecordBuilder
   */
  public static org.apache.avro.compiler.schema.evolve.NestedEvolve2.Builder newBuilder(org.apache.avro.compiler.schema.evolve.NestedEvolve2 other) {
    if (other == null) {
      return new org.apache.avro.compiler.schema.evolve.NestedEvolve2.Builder();
    } else {
      return new org.apache.avro.compiler.schema.evolve.NestedEvolve2.Builder(other);
    }
  }

  /**
   * RecordBuilder for NestedEvolve2 instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<NestedEvolve2>
    implements org.apache.avro.data.RecordBuilder<NestedEvolve2> {

    private java.lang.String rootName;
    private org.apache.avro.compiler.schema.evolve.TestRecord2 nested;
    private org.apache.avro.compiler.schema.evolve.TestRecord2.Builder nestedBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.avro.compiler.schema.evolve.NestedEvolve2.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.rootName)) {
        this.rootName = data().deepCopy(fields()[0].schema(), other.rootName);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.nested)) {
        this.nested = data().deepCopy(fields()[1].schema(), other.nested);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (other.hasNestedBuilder()) {
        this.nestedBuilder = org.apache.avro.compiler.schema.evolve.TestRecord2.newBuilder(other.getNestedBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing NestedEvolve2 instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.avro.compiler.schema.evolve.NestedEvolve2 other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.rootName)) {
        this.rootName = data().deepCopy(fields()[0].schema(), other.rootName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.nested)) {
        this.nested = data().deepCopy(fields()[1].schema(), other.nested);
        fieldSetFlags()[1] = true;
      }
      this.nestedBuilder = null;
    }

    /**
      * Gets the value of the 'rootName' field.
      * @return The value.
      */
    public java.lang.String getRootName() {
      return rootName;
    }

    /**
      * Gets the value of the 'rootName' field as an Optional&lt;java.lang.String&gt;.
      * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
      */
    public Optional<java.lang.String> getOptionalRootName() {
      return Optional.<java.lang.String>ofNullable(rootName);
    }

    /**
      * Sets the value of the 'rootName' field.
      * @param value The value of 'rootName'.
      * @return This builder.
      */
    public org.apache.avro.compiler.schema.evolve.NestedEvolve2.Builder setRootName(java.lang.String value) {
      validate(fields()[0], value);
      this.rootName = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'rootName' field has been set.
      * @return True if the 'rootName' field has been set, false otherwise.
      */
    public boolean hasRootName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'rootName' field.
      * @return This builder.
      */
    public org.apache.avro.compiler.schema.evolve.NestedEvolve2.Builder clearRootName() {
      rootName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'nested' field.
      * @return The value.
      */
    public org.apache.avro.compiler.schema.evolve.TestRecord2 getNested() {
      return nested;
    }

    /**
      * Gets the value of the 'nested' field as an Optional&lt;org.apache.avro.compiler.schema.evolve.TestRecord2&gt;.
      * @return The value wrapped in an Optional&lt;org.apache.avro.compiler.schema.evolve.TestRecord2&gt;.
      */
    public Optional<org.apache.avro.compiler.schema.evolve.TestRecord2> getOptionalNested() {
      return Optional.<org.apache.avro.compiler.schema.evolve.TestRecord2>ofNullable(nested);
    }

    /**
      * Sets the value of the 'nested' field.
      * @param value The value of 'nested'.
      * @return This builder.
      */
    public org.apache.avro.compiler.schema.evolve.NestedEvolve2.Builder setNested(org.apache.avro.compiler.schema.evolve.TestRecord2 value) {
      validate(fields()[1], value);
      this.nestedBuilder = null;
      this.nested = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'nested' field has been set.
      * @return True if the 'nested' field has been set, false otherwise.
      */
    public boolean hasNested() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'nested' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public org.apache.avro.compiler.schema.evolve.TestRecord2.Builder getNestedBuilder() {
      if (nestedBuilder == null) {
        if (hasNested()) {
          setNestedBuilder(org.apache.avro.compiler.schema.evolve.TestRecord2.newBuilder(nested));
        } else {
          setNestedBuilder(org.apache.avro.compiler.schema.evolve.TestRecord2.newBuilder());
        }
      }
      return nestedBuilder;
    }

    /**
     * Sets the Builder instance for the 'nested' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public org.apache.avro.compiler.schema.evolve.NestedEvolve2.Builder setNestedBuilder(org.apache.avro.compiler.schema.evolve.TestRecord2.Builder value) {
      clearNested();
      nestedBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'nested' field has an active Builder instance
     * @return True if the 'nested' field has an active Builder instance
     */
    public boolean hasNestedBuilder() {
      return nestedBuilder != null;
    }

    /**
      * Clears the value of the 'nested' field.
      * @return This builder.
      */
    public org.apache.avro.compiler.schema.evolve.NestedEvolve2.Builder clearNested() {
      nested = null;
      nestedBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public NestedEvolve2 build() {
      try {
        NestedEvolve2 record = new NestedEvolve2();
        record.rootName = fieldSetFlags()[0] ? this.rootName : (java.lang.String) defaultValue(fields()[0]);
        if (nestedBuilder != null) {
          try {
            record.nested = this.nestedBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("nested"));
            throw e;
          }
        } else {
          record.nested = fieldSetFlags()[1] ? this.nested : (org.apache.avro.compiler.schema.evolve.TestRecord2) defaultValue(fields()[1]);
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
  private static final org.apache.avro.io.DatumWriter<NestedEvolve2>
    WRITER$ = (org.apache.avro.io.DatumWriter<NestedEvolve2>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<NestedEvolve2>
    READER$ = (org.apache.avro.io.DatumReader<NestedEvolve2>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.rootName);

    this.nested.customEncode(out);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.rootName = in.readString();

      if (this.nested == null) {
        this.nested = new org.apache.avro.compiler.schema.evolve.TestRecord2();
      }
      this.nested.customDecode(in);

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.rootName = in.readString();
          break;

        case 1:
          if (this.nested == null) {
            this.nested = new org.apache.avro.compiler.schema.evolve.TestRecord2();
          }
          this.nested.customDecode(in);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










