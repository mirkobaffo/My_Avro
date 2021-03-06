/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.apache.avro.test.specialtypes;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;
import java.util.Optional;
@org.apache.avro.specific.AvroGenerated
public class Names extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5756097630374310911L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Names\",\"namespace\":\"org.apache.avro.test.specialtypes\",\"fields\":[{\"name\":\"Boolean\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"builder\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"Builder\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"builderBuilder\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"String\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"value\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Names> ENCODER =
      new BinaryMessageEncoder<Names>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Names> DECODER =
      new BinaryMessageDecoder<Names>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Names> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Names> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Names> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Names>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Names to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Names from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Names instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Names fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.String Boolean;
  private java.lang.String builder;
  private java.lang.String Builder$;
  private java.lang.String builderBuilder;
  private java.lang.String String;
  private java.lang.String value;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Names() {}

  /**
   * All-args constructor.
   * @param Boolean The new value for Boolean
   * @param builder The new value for builder
   * @param Builder$ The new value for Builder
   * @param builderBuilder The new value for builderBuilder
   * @param String The new value for String
   * @param value The new value for value
   */
  public Names(java.lang.String Boolean, java.lang.String builder, java.lang.String Builder$, java.lang.String builderBuilder, java.lang.String String, java.lang.String value) {
    this.Boolean = Boolean;
    this.builder = builder;
    this.Builder$ = Builder$;
    this.builderBuilder = builderBuilder;
    this.String = String;
    this.value = value;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return Boolean;
    case 1: return builder;
    case 2: return Builder$;
    case 3: return builderBuilder;
    case 4: return String;
    case 5: return value;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: Boolean = value$ != null ? value$.toString() : null; break;
    case 1: builder = value$ != null ? value$.toString() : null; break;
    case 2: Builder$ = value$ != null ? value$.toString() : null; break;
    case 3: builderBuilder = value$ != null ? value$.toString() : null; break;
    case 4: String = value$ != null ? value$.toString() : null; break;
    case 5: value = value$ != null ? value$.toString() : null; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'Boolean' field.
   * @return The value of the 'Boolean' field.
   */
  public java.lang.String getBoolean$() {
    return Boolean;
  }

  /**
   * Gets the value of the 'Boolean' field as an Optional&lt;java.lang.String&gt;.
   * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
   */
  public Optional<java.lang.String> getOptionalBoolean$() {
    return Optional.<java.lang.String>ofNullable(Boolean);
  }

  /**
   * Sets the value of the 'Boolean' field.
   * @param value the value to set.
   */
  public void setBoolean$(java.lang.String value) {
    this.Boolean = value;
  }

  /**
   * Gets the value of the 'builder' field.
   * @return The value of the 'builder' field.
   */
  public java.lang.String getBuilder$0() {
    return builder;
  }

  /**
   * Gets the value of the 'builder' field as an Optional&lt;java.lang.String&gt;.
   * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
   */
  public Optional<java.lang.String> getOptionalBuilder$0() {
    return Optional.<java.lang.String>ofNullable(builder);
  }

  /**
   * Sets the value of the 'builder' field.
   * @param value the value to set.
   */
  public void setBuilder$0(java.lang.String value) {
    this.builder = value;
  }

  /**
   * Gets the value of the 'Builder$' field.
   * @return The value of the 'Builder$' field.
   */
  public java.lang.String getBuilder$1() {
    return Builder$;
  }

  /**
   * Gets the value of the 'Builder$' field as an Optional&lt;java.lang.String&gt;.
   * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
   */
  public Optional<java.lang.String> getOptionalBuilder$1() {
    return Optional.<java.lang.String>ofNullable(Builder$);
  }

  /**
   * Sets the value of the 'Builder$' field.
   * @param value the value to set.
   */
  public void setBuilder$1(java.lang.String value) {
    this.Builder$ = value;
  }

  /**
   * Gets the value of the 'builderBuilder' field.
   * @return The value of the 'builderBuilder' field.
   */
  public java.lang.String getBuilderBuilder() {
    return builderBuilder;
  }

  /**
   * Gets the value of the 'builderBuilder' field as an Optional&lt;java.lang.String&gt;.
   * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
   */
  public Optional<java.lang.String> getOptionalBuilderBuilder() {
    return Optional.<java.lang.String>ofNullable(builderBuilder);
  }

  /**
   * Sets the value of the 'builderBuilder' field.
   * @param value the value to set.
   */
  public void setBuilderBuilder(java.lang.String value) {
    this.builderBuilder = value;
  }

  /**
   * Gets the value of the 'String' field.
   * @return The value of the 'String' field.
   */
  public java.lang.String getString() {
    return String;
  }

  /**
   * Gets the value of the 'String' field as an Optional&lt;java.lang.String&gt;.
   * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
   */
  public Optional<java.lang.String> getOptionalString() {
    return Optional.<java.lang.String>ofNullable(String);
  }

  /**
   * Sets the value of the 'String' field.
   * @param value the value to set.
   */
  public void setString(java.lang.String value) {
    this.String = value;
  }

  /**
   * Gets the value of the 'value' field.
   * @return The value of the 'value' field.
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * Gets the value of the 'value' field as an Optional&lt;java.lang.String&gt;.
   * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
   */
  public Optional<java.lang.String> getOptionalValue() {
    return Optional.<java.lang.String>ofNullable(value);
  }

  /**
   * Sets the value of the 'value' field.
   * @param value the value to set.
   */
  public void setValue(java.lang.String value) {
    this.value = value;
  }

  /**
   * Creates a new Names RecordBuilder.
   * @return A new Names RecordBuilder
   */
  public static org.apache.avro.test.specialtypes.Names.Builder newBuilder() {
    return new org.apache.avro.test.specialtypes.Names.Builder();
  }

  /**
   * Creates a new Names RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Names RecordBuilder
   */
  public static org.apache.avro.test.specialtypes.Names.Builder newBuilder(org.apache.avro.test.specialtypes.Names.Builder other) {
    if (other == null) {
      return new org.apache.avro.test.specialtypes.Names.Builder();
    } else {
      return new org.apache.avro.test.specialtypes.Names.Builder(other);
    }
  }

  /**
   * Creates a new Names RecordBuilder by copying an existing Names instance.
   * @param other The existing instance to copy.
   * @return A new Names RecordBuilder
   */
  public static org.apache.avro.test.specialtypes.Names.Builder newBuilder(org.apache.avro.test.specialtypes.Names other) {
    if (other == null) {
      return new org.apache.avro.test.specialtypes.Names.Builder();
    } else {
      return new org.apache.avro.test.specialtypes.Names.Builder(other);
    }
  }

  /**
   * RecordBuilder for Names instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Names>
    implements org.apache.avro.data.RecordBuilder<Names> {

    private java.lang.String Boolean;
    private java.lang.String builder;
    private java.lang.String Builder$;
    private java.lang.String builderBuilder;
    private java.lang.String String;
    private java.lang.String value;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.avro.test.specialtypes.Names.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.Boolean)) {
        this.Boolean = data().deepCopy(fields()[0].schema(), other.Boolean);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.builder)) {
        this.builder = data().deepCopy(fields()[1].schema(), other.builder);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.Builder$)) {
        this.Builder$ = data().deepCopy(fields()[2].schema(), other.Builder$);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.builderBuilder)) {
        this.builderBuilder = data().deepCopy(fields()[3].schema(), other.builderBuilder);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.String)) {
        this.String = data().deepCopy(fields()[4].schema(), other.String);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.value)) {
        this.value = data().deepCopy(fields()[5].schema(), other.value);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
    }

    /**
     * Creates a Builder by copying an existing Names instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.avro.test.specialtypes.Names other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.Boolean)) {
        this.Boolean = data().deepCopy(fields()[0].schema(), other.Boolean);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.builder)) {
        this.builder = data().deepCopy(fields()[1].schema(), other.builder);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.Builder$)) {
        this.Builder$ = data().deepCopy(fields()[2].schema(), other.Builder$);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.builderBuilder)) {
        this.builderBuilder = data().deepCopy(fields()[3].schema(), other.builderBuilder);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.String)) {
        this.String = data().deepCopy(fields()[4].schema(), other.String);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.value)) {
        this.value = data().deepCopy(fields()[5].schema(), other.value);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'Boolean' field.
      * @return The value.
      */
    public java.lang.String getBoolean$() {
      return Boolean;
    }

    /**
      * Gets the value of the 'Boolean' field as an Optional&lt;java.lang.String&gt;.
      * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
      */
    public Optional<java.lang.String> getOptionalBoolean$() {
      return Optional.<java.lang.String>ofNullable(Boolean);
    }

    /**
      * Sets the value of the 'Boolean' field.
      * @param value The value of 'Boolean'.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.Names.Builder setBoolean$(java.lang.String value) {
      validate(fields()[0], value);
      this.Boolean = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'Boolean' field has been set.
      * @return True if the 'Boolean' field has been set, false otherwise.
      */
    public boolean hasBoolean$() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'Boolean' field.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.Names.Builder clearBoolean$() {
      Boolean = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'builder' field.
      * @return The value.
      */
    public java.lang.String getBuilder$0() {
      return builder;
    }

    /**
      * Gets the value of the 'builder' field as an Optional&lt;java.lang.String&gt;.
      * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
      */
    public Optional<java.lang.String> getOptionalBuilder$0() {
      return Optional.<java.lang.String>ofNullable(builder);
    }

    /**
      * Sets the value of the 'builder' field.
      * @param value The value of 'builder'.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.Names.Builder setBuilder$0(java.lang.String value) {
      validate(fields()[1], value);
      this.builder = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'builder' field has been set.
      * @return True if the 'builder' field has been set, false otherwise.
      */
    public boolean hasBuilder$0() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'builder' field.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.Names.Builder clearBuilder$0() {
      builder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'Builder$' field.
      * @return The value.
      */
    public java.lang.String getBuilder$1() {
      return Builder$;
    }

    /**
      * Gets the value of the 'Builder$' field as an Optional&lt;java.lang.String&gt;.
      * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
      */
    public Optional<java.lang.String> getOptionalBuilder$1() {
      return Optional.<java.lang.String>ofNullable(Builder$);
    }

    /**
      * Sets the value of the 'Builder$' field.
      * @param value The value of 'Builder$'.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.Names.Builder setBuilder$1(java.lang.String value) {
      validate(fields()[2], value);
      this.Builder$ = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'Builder$' field has been set.
      * @return True if the 'Builder$' field has been set, false otherwise.
      */
    public boolean hasBuilder$1() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'Builder$' field.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.Names.Builder clearBuilder$1() {
      Builder$ = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'builderBuilder' field.
      * @return The value.
      */
    public java.lang.String getBuilderBuilder() {
      return builderBuilder;
    }

    /**
      * Gets the value of the 'builderBuilder' field as an Optional&lt;java.lang.String&gt;.
      * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
      */
    public Optional<java.lang.String> getOptionalBuilderBuilder() {
      return Optional.<java.lang.String>ofNullable(builderBuilder);
    }

    /**
      * Sets the value of the 'builderBuilder' field.
      * @param value The value of 'builderBuilder'.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.Names.Builder setBuilderBuilder(java.lang.String value) {
      validate(fields()[3], value);
      this.builderBuilder = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'builderBuilder' field has been set.
      * @return True if the 'builderBuilder' field has been set, false otherwise.
      */
    public boolean hasBuilderBuilder() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'builderBuilder' field.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.Names.Builder clearBuilderBuilder() {
      builderBuilder = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'String' field.
      * @return The value.
      */
    public java.lang.String getString() {
      return String;
    }

    /**
      * Gets the value of the 'String' field as an Optional&lt;java.lang.String&gt;.
      * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
      */
    public Optional<java.lang.String> getOptionalString() {
      return Optional.<java.lang.String>ofNullable(String);
    }

    /**
      * Sets the value of the 'String' field.
      * @param value The value of 'String'.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.Names.Builder setString(java.lang.String value) {
      validate(fields()[4], value);
      this.String = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'String' field has been set.
      * @return True if the 'String' field has been set, false otherwise.
      */
    public boolean hasString() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'String' field.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.Names.Builder clearString() {
      String = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'value' field.
      * @return The value.
      */
    public java.lang.String getValue() {
      return value;
    }

    /**
      * Gets the value of the 'value' field as an Optional&lt;java.lang.String&gt;.
      * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
      */
    public Optional<java.lang.String> getOptionalValue() {
      return Optional.<java.lang.String>ofNullable(value);
    }

    /**
      * Sets the value of the 'value' field.
      * @param value The value of 'value'.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.Names.Builder setValue(java.lang.String value) {
      validate(fields()[5], value);
      this.value = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'value' field has been set.
      * @return True if the 'value' field has been set, false otherwise.
      */
    public boolean hasValue() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'value' field.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.Names.Builder clearValue() {
      value = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Names build() {
      try {
        Names record = new Names();
        record.Boolean = fieldSetFlags()[0] ? this.Boolean : (java.lang.String) defaultValue(fields()[0]);
        record.builder = fieldSetFlags()[1] ? this.builder : (java.lang.String) defaultValue(fields()[1]);
        record.Builder$ = fieldSetFlags()[2] ? this.Builder$ : (java.lang.String) defaultValue(fields()[2]);
        record.builderBuilder = fieldSetFlags()[3] ? this.builderBuilder : (java.lang.String) defaultValue(fields()[3]);
        record.String = fieldSetFlags()[4] ? this.String : (java.lang.String) defaultValue(fields()[4]);
        record.value = fieldSetFlags()[5] ? this.value : (java.lang.String) defaultValue(fields()[5]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Names>
    WRITER$ = (org.apache.avro.io.DatumWriter<Names>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Names>
    READER$ = (org.apache.avro.io.DatumReader<Names>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.Boolean);

    out.writeString(this.builder);

    out.writeString(this.Builder$);

    out.writeString(this.builderBuilder);

    out.writeString(this.String);

    out.writeString(this.value);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.Boolean = in.readString();

      this.builder = in.readString();

      this.Builder$ = in.readString();

      this.builderBuilder = in.readString();

      this.String = in.readString();

      this.value = in.readString();

    } else {
      for (int i = 0; i < 6; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.Boolean = in.readString();
          break;

        case 1:
          this.builder = in.readString();
          break;

        case 2:
          this.Builder$ = in.readString();
          break;

        case 3:
          this.builderBuilder = in.readString();
          break;

        case 4:
          this.String = in.readString();
          break;

        case 5:
          this.value = in.readString();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










