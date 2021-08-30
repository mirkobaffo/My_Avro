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
public class Exception extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6218853338055537828L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Exception\",\"namespace\":\"org.apache.avro.test.specialtypes\",\"fields\":[{\"name\":\"whatever\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Exception> ENCODER =
      new BinaryMessageEncoder<Exception>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Exception> DECODER =
      new BinaryMessageDecoder<Exception>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Exception> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Exception> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Exception> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Exception>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Exception to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Exception from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Exception instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Exception fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.String whatever;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Exception() {}

  /**
   * All-args constructor.
   * @param whatever The new value for whatever
   */
  public Exception(java.lang.String whatever) {
    this.whatever = whatever;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return whatever;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: whatever = value$ != null ? value$.toString() : null; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'whatever' field.
   * @return The value of the 'whatever' field.
   */
  public java.lang.String getWhatever() {
    return whatever;
  }

  /**
   * Gets the value of the 'whatever' field as an Optional&lt;java.lang.String&gt;.
   * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
   */
  public Optional<java.lang.String> getOptionalWhatever() {
    return Optional.<java.lang.String>ofNullable(whatever);
  }

  /**
   * Sets the value of the 'whatever' field.
   * @param value the value to set.
   */
  public void setWhatever(java.lang.String value) {
    this.whatever = value;
  }

  /**
   * Creates a new Exception RecordBuilder.
   * @return A new Exception RecordBuilder
   */
  public static org.apache.avro.test.specialtypes.Exception.Builder newBuilder() {
    return new org.apache.avro.test.specialtypes.Exception.Builder();
  }

  /**
   * Creates a new Exception RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Exception RecordBuilder
   */
  public static org.apache.avro.test.specialtypes.Exception.Builder newBuilder(org.apache.avro.test.specialtypes.Exception.Builder other) {
    if (other == null) {
      return new org.apache.avro.test.specialtypes.Exception.Builder();
    } else {
      return new org.apache.avro.test.specialtypes.Exception.Builder(other);
    }
  }

  /**
   * Creates a new Exception RecordBuilder by copying an existing Exception instance.
   * @param other The existing instance to copy.
   * @return A new Exception RecordBuilder
   */
  public static org.apache.avro.test.specialtypes.Exception.Builder newBuilder(org.apache.avro.test.specialtypes.Exception other) {
    if (other == null) {
      return new org.apache.avro.test.specialtypes.Exception.Builder();
    } else {
      return new org.apache.avro.test.specialtypes.Exception.Builder(other);
    }
  }

  /**
   * RecordBuilder for Exception instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Exception>
    implements org.apache.avro.data.RecordBuilder<Exception> {

    private java.lang.String whatever;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.avro.test.specialtypes.Exception.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.whatever)) {
        this.whatever = data().deepCopy(fields()[0].schema(), other.whatever);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing Exception instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.avro.test.specialtypes.Exception other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.whatever)) {
        this.whatever = data().deepCopy(fields()[0].schema(), other.whatever);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'whatever' field.
      * @return The value.
      */
    public java.lang.String getWhatever() {
      return whatever;
    }

    /**
      * Gets the value of the 'whatever' field as an Optional&lt;java.lang.String&gt;.
      * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
      */
    public Optional<java.lang.String> getOptionalWhatever() {
      return Optional.<java.lang.String>ofNullable(whatever);
    }

    /**
      * Sets the value of the 'whatever' field.
      * @param value The value of 'whatever'.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.Exception.Builder setWhatever(java.lang.String value) {
      validate(fields()[0], value);
      this.whatever = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'whatever' field has been set.
      * @return True if the 'whatever' field has been set, false otherwise.
      */
    public boolean hasWhatever() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'whatever' field.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.Exception.Builder clearWhatever() {
      whatever = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Exception build() {
      try {
        Exception record = new Exception();
        record.whatever = fieldSetFlags()[0] ? this.whatever : (java.lang.String) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Exception>
    WRITER$ = (org.apache.avro.io.DatumWriter<Exception>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Exception>
    READER$ = (org.apache.avro.io.DatumReader<Exception>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.whatever);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.whatever = in.readString();

    } else {
      for (int i = 0; i < 1; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.whatever = in.readString();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









