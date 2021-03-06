/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.apache.avro.specific.test;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

/** Test schema changes: this is the 'new' schema actually used to write data */
@org.apache.avro.specific.AvroGenerated
public class FullRecordV2 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8618550502304446537L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FullRecordV2\",\"namespace\":\"org.apache.avro.specific.test\",\"doc\":\"Test schema changes: this is the 'new' schema actually used to write data\",\"fields\":[{\"name\":\"b\",\"type\":\"boolean\"},{\"name\":\"i64\",\"type\":\"int\"},{\"name\":\"i32\",\"type\":\"int\"},{\"name\":\"f64\",\"type\":\"long\"},{\"name\":\"f32\",\"type\":[\"float\",\"null\"]},{\"name\":\"newfield\",\"type\":\"string\"},{\"name\":\"h\",\"type\":\"bytes\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<FullRecordV2> ENCODER =
      new BinaryMessageEncoder<FullRecordV2>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<FullRecordV2> DECODER =
      new BinaryMessageDecoder<FullRecordV2>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<FullRecordV2> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<FullRecordV2> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<FullRecordV2> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<FullRecordV2>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this FullRecordV2 to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a FullRecordV2 from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a FullRecordV2 instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static FullRecordV2 fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private boolean b;
  private int i64;
  private int i32;
  private long f64;
  private java.lang.Float f32;
  private java.lang.CharSequence newfield;
  private java.nio.ByteBuffer h;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public FullRecordV2() {}

  /**
   * All-args constructor.
   * @param b The new value for b
   * @param i64 The new value for i64
   * @param i32 The new value for i32
   * @param f64 The new value for f64
   * @param f32 The new value for f32
   * @param newfield The new value for newfield
   * @param h The new value for h
   */
  public FullRecordV2(java.lang.Boolean b, java.lang.Integer i64, java.lang.Integer i32, java.lang.Long f64, java.lang.Float f32, java.lang.CharSequence newfield, java.nio.ByteBuffer h) {
    this.b = b;
    this.i64 = i64;
    this.i32 = i32;
    this.f64 = f64;
    this.f32 = f32;
    this.newfield = newfield;
    this.h = h;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return b;
    case 1: return i64;
    case 2: return i32;
    case 3: return f64;
    case 4: return f32;
    case 5: return newfield;
    case 6: return h;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: b = (java.lang.Boolean)value$; break;
    case 1: i64 = (java.lang.Integer)value$; break;
    case 2: i32 = (java.lang.Integer)value$; break;
    case 3: f64 = (java.lang.Long)value$; break;
    case 4: f32 = (java.lang.Float)value$; break;
    case 5: newfield = (java.lang.CharSequence)value$; break;
    case 6: h = (java.nio.ByteBuffer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'b' field.
   * @return The value of the 'b' field.
   */
  public boolean getB() {
    return b;
  }


  /**
   * Sets the value of the 'b' field.
   * @param value the value to set.
   */
  public void setB(boolean value) {
    this.b = value;
  }

  /**
   * Gets the value of the 'i64' field.
   * @return The value of the 'i64' field.
   */
  public int getI64() {
    return i64;
  }


  /**
   * Sets the value of the 'i64' field.
   * @param value the value to set.
   */
  public void setI64(int value) {
    this.i64 = value;
  }

  /**
   * Gets the value of the 'i32' field.
   * @return The value of the 'i32' field.
   */
  public int getI32() {
    return i32;
  }


  /**
   * Sets the value of the 'i32' field.
   * @param value the value to set.
   */
  public void setI32(int value) {
    this.i32 = value;
  }

  /**
   * Gets the value of the 'f64' field.
   * @return The value of the 'f64' field.
   */
  public long getF64() {
    return f64;
  }


  /**
   * Sets the value of the 'f64' field.
   * @param value the value to set.
   */
  public void setF64(long value) {
    this.f64 = value;
  }

  /**
   * Gets the value of the 'f32' field.
   * @return The value of the 'f32' field.
   */
  public java.lang.Float getF32() {
    return f32;
  }


  /**
   * Sets the value of the 'f32' field.
   * @param value the value to set.
   */
  public void setF32(java.lang.Float value) {
    this.f32 = value;
  }

  /**
   * Gets the value of the 'newfield' field.
   * @return The value of the 'newfield' field.
   */
  public java.lang.CharSequence getNewfield() {
    return newfield;
  }


  /**
   * Sets the value of the 'newfield' field.
   * @param value the value to set.
   */
  public void setNewfield(java.lang.CharSequence value) {
    this.newfield = value;
  }

  /**
   * Gets the value of the 'h' field.
   * @return The value of the 'h' field.
   */
  public java.nio.ByteBuffer getH() {
    return h;
  }


  /**
   * Sets the value of the 'h' field.
   * @param value the value to set.
   */
  public void setH(java.nio.ByteBuffer value) {
    this.h = value;
  }

  /**
   * Creates a new FullRecordV2 RecordBuilder.
   * @return A new FullRecordV2 RecordBuilder
   */
  public static org.apache.avro.specific.test.FullRecordV2.Builder newBuilder() {
    return new org.apache.avro.specific.test.FullRecordV2.Builder();
  }

  /**
   * Creates a new FullRecordV2 RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new FullRecordV2 RecordBuilder
   */
  public static org.apache.avro.specific.test.FullRecordV2.Builder newBuilder(org.apache.avro.specific.test.FullRecordV2.Builder other) {
    if (other == null) {
      return new org.apache.avro.specific.test.FullRecordV2.Builder();
    } else {
      return new org.apache.avro.specific.test.FullRecordV2.Builder(other);
    }
  }

  /**
   * Creates a new FullRecordV2 RecordBuilder by copying an existing FullRecordV2 instance.
   * @param other The existing instance to copy.
   * @return A new FullRecordV2 RecordBuilder
   */
  public static org.apache.avro.specific.test.FullRecordV2.Builder newBuilder(org.apache.avro.specific.test.FullRecordV2 other) {
    if (other == null) {
      return new org.apache.avro.specific.test.FullRecordV2.Builder();
    } else {
      return new org.apache.avro.specific.test.FullRecordV2.Builder(other);
    }
  }

  /**
   * RecordBuilder for FullRecordV2 instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FullRecordV2>
    implements org.apache.avro.data.RecordBuilder<FullRecordV2> {

    private boolean b;
    private int i64;
    private int i32;
    private long f64;
    private java.lang.Float f32;
    private java.lang.CharSequence newfield;
    private java.nio.ByteBuffer h;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.avro.specific.test.FullRecordV2.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.b)) {
        this.b = data().deepCopy(fields()[0].schema(), other.b);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.i64)) {
        this.i64 = data().deepCopy(fields()[1].schema(), other.i64);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.i32)) {
        this.i32 = data().deepCopy(fields()[2].schema(), other.i32);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.f64)) {
        this.f64 = data().deepCopy(fields()[3].schema(), other.f64);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.f32)) {
        this.f32 = data().deepCopy(fields()[4].schema(), other.f32);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.newfield)) {
        this.newfield = data().deepCopy(fields()[5].schema(), other.newfield);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.h)) {
        this.h = data().deepCopy(fields()[6].schema(), other.h);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
    }

    /**
     * Creates a Builder by copying an existing FullRecordV2 instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.avro.specific.test.FullRecordV2 other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.b)) {
        this.b = data().deepCopy(fields()[0].schema(), other.b);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.i64)) {
        this.i64 = data().deepCopy(fields()[1].schema(), other.i64);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.i32)) {
        this.i32 = data().deepCopy(fields()[2].schema(), other.i32);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.f64)) {
        this.f64 = data().deepCopy(fields()[3].schema(), other.f64);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.f32)) {
        this.f32 = data().deepCopy(fields()[4].schema(), other.f32);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.newfield)) {
        this.newfield = data().deepCopy(fields()[5].schema(), other.newfield);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.h)) {
        this.h = data().deepCopy(fields()[6].schema(), other.h);
        fieldSetFlags()[6] = true;
      }
    }

    /**
      * Gets the value of the 'b' field.
      * @return The value.
      */
    public boolean getB() {
      return b;
    }


    /**
      * Sets the value of the 'b' field.
      * @param value The value of 'b'.
      * @return This builder.
      */
    public org.apache.avro.specific.test.FullRecordV2.Builder setB(boolean value) {
      validate(fields()[0], value);
      this.b = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'b' field has been set.
      * @return True if the 'b' field has been set, false otherwise.
      */
    public boolean hasB() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'b' field.
      * @return This builder.
      */
    public org.apache.avro.specific.test.FullRecordV2.Builder clearB() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'i64' field.
      * @return The value.
      */
    public int getI64() {
      return i64;
    }


    /**
      * Sets the value of the 'i64' field.
      * @param value The value of 'i64'.
      * @return This builder.
      */
    public org.apache.avro.specific.test.FullRecordV2.Builder setI64(int value) {
      validate(fields()[1], value);
      this.i64 = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'i64' field has been set.
      * @return True if the 'i64' field has been set, false otherwise.
      */
    public boolean hasI64() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'i64' field.
      * @return This builder.
      */
    public org.apache.avro.specific.test.FullRecordV2.Builder clearI64() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'i32' field.
      * @return The value.
      */
    public int getI32() {
      return i32;
    }


    /**
      * Sets the value of the 'i32' field.
      * @param value The value of 'i32'.
      * @return This builder.
      */
    public org.apache.avro.specific.test.FullRecordV2.Builder setI32(int value) {
      validate(fields()[2], value);
      this.i32 = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'i32' field has been set.
      * @return True if the 'i32' field has been set, false otherwise.
      */
    public boolean hasI32() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'i32' field.
      * @return This builder.
      */
    public org.apache.avro.specific.test.FullRecordV2.Builder clearI32() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'f64' field.
      * @return The value.
      */
    public long getF64() {
      return f64;
    }


    /**
      * Sets the value of the 'f64' field.
      * @param value The value of 'f64'.
      * @return This builder.
      */
    public org.apache.avro.specific.test.FullRecordV2.Builder setF64(long value) {
      validate(fields()[3], value);
      this.f64 = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'f64' field has been set.
      * @return True if the 'f64' field has been set, false otherwise.
      */
    public boolean hasF64() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'f64' field.
      * @return This builder.
      */
    public org.apache.avro.specific.test.FullRecordV2.Builder clearF64() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'f32' field.
      * @return The value.
      */
    public java.lang.Float getF32() {
      return f32;
    }


    /**
      * Sets the value of the 'f32' field.
      * @param value The value of 'f32'.
      * @return This builder.
      */
    public org.apache.avro.specific.test.FullRecordV2.Builder setF32(java.lang.Float value) {
      validate(fields()[4], value);
      this.f32 = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'f32' field has been set.
      * @return True if the 'f32' field has been set, false otherwise.
      */
    public boolean hasF32() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'f32' field.
      * @return This builder.
      */
    public org.apache.avro.specific.test.FullRecordV2.Builder clearF32() {
      f32 = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'newfield' field.
      * @return The value.
      */
    public java.lang.CharSequence getNewfield() {
      return newfield;
    }


    /**
      * Sets the value of the 'newfield' field.
      * @param value The value of 'newfield'.
      * @return This builder.
      */
    public org.apache.avro.specific.test.FullRecordV2.Builder setNewfield(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.newfield = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'newfield' field has been set.
      * @return True if the 'newfield' field has been set, false otherwise.
      */
    public boolean hasNewfield() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'newfield' field.
      * @return This builder.
      */
    public org.apache.avro.specific.test.FullRecordV2.Builder clearNewfield() {
      newfield = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'h' field.
      * @return The value.
      */
    public java.nio.ByteBuffer getH() {
      return h;
    }


    /**
      * Sets the value of the 'h' field.
      * @param value The value of 'h'.
      * @return This builder.
      */
    public org.apache.avro.specific.test.FullRecordV2.Builder setH(java.nio.ByteBuffer value) {
      validate(fields()[6], value);
      this.h = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'h' field has been set.
      * @return True if the 'h' field has been set, false otherwise.
      */
    public boolean hasH() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'h' field.
      * @return This builder.
      */
    public org.apache.avro.specific.test.FullRecordV2.Builder clearH() {
      h = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public FullRecordV2 build() {
      try {
        FullRecordV2 record = new FullRecordV2();
        record.b = fieldSetFlags()[0] ? this.b : (java.lang.Boolean) defaultValue(fields()[0]);
        record.i64 = fieldSetFlags()[1] ? this.i64 : (java.lang.Integer) defaultValue(fields()[1]);
        record.i32 = fieldSetFlags()[2] ? this.i32 : (java.lang.Integer) defaultValue(fields()[2]);
        record.f64 = fieldSetFlags()[3] ? this.f64 : (java.lang.Long) defaultValue(fields()[3]);
        record.f32 = fieldSetFlags()[4] ? this.f32 : (java.lang.Float) defaultValue(fields()[4]);
        record.newfield = fieldSetFlags()[5] ? this.newfield : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.h = fieldSetFlags()[6] ? this.h : (java.nio.ByteBuffer) defaultValue(fields()[6]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<FullRecordV2>
    WRITER$ = (org.apache.avro.io.DatumWriter<FullRecordV2>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<FullRecordV2>
    READER$ = (org.apache.avro.io.DatumReader<FullRecordV2>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeBoolean(this.b);

    out.writeInt(this.i64);

    out.writeInt(this.i32);

    out.writeLong(this.f64);

    if (this.f32 == null) {
      out.writeIndex(1);
      out.writeNull();
    } else {
      out.writeIndex(0);
      out.writeFloat(this.f32);
    }

    out.writeString(this.newfield);

    out.writeBytes(this.h);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.b = in.readBoolean();

      this.i64 = in.readInt();

      this.i32 = in.readInt();

      this.f64 = in.readLong();

      if (in.readIndex() != 0) {
        in.readNull();
        this.f32 = null;
      } else {
        this.f32 = in.readFloat();
      }

      this.newfield = in.readString(this.newfield instanceof Utf8 ? (Utf8)this.newfield : null);

      this.h = in.readBytes(this.h);

    } else {
      for (int i = 0; i < 7; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.b = in.readBoolean();
          break;

        case 1:
          this.i64 = in.readInt();
          break;

        case 2:
          this.i32 = in.readInt();
          break;

        case 3:
          this.f64 = in.readLong();
          break;

        case 4:
          if (in.readIndex() != 0) {
            in.readNull();
            this.f32 = null;
          } else {
            this.f32 = in.readFloat();
          }
          break;

        case 5:
          this.newfield = in.readString(this.newfield instanceof Utf8 ? (Utf8)this.newfield : null);
          break;

        case 6:
          this.h = in.readBytes(this.h);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










