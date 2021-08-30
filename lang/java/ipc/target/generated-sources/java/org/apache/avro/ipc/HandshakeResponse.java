/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.apache.avro.ipc;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;
import java.util.Optional;
@org.apache.avro.specific.AvroGenerated
public class HandshakeResponse extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1055336403110395392L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"HandshakeResponse\",\"namespace\":\"org.apache.avro.ipc\",\"fields\":[{\"name\":\"match\",\"type\":{\"type\":\"enum\",\"name\":\"HandshakeMatch\",\"symbols\":[\"BOTH\",\"CLIENT\",\"NONE\"]}},{\"name\":\"serverProtocol\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"serverHash\",\"type\":[\"null\",{\"type\":\"fixed\",\"name\":\"MD5\",\"size\":16}]},{\"name\":\"meta\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"bytes\",\"avro.java.string\":\"String\"}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<HandshakeResponse> ENCODER =
      new BinaryMessageEncoder<HandshakeResponse>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<HandshakeResponse> DECODER =
      new BinaryMessageDecoder<HandshakeResponse>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<HandshakeResponse> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<HandshakeResponse> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<HandshakeResponse> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<HandshakeResponse>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this HandshakeResponse to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a HandshakeResponse from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a HandshakeResponse instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static HandshakeResponse fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private org.apache.avro.ipc.HandshakeMatch match;
  private java.lang.String serverProtocol;
  private org.apache.avro.ipc.MD5 serverHash;
  private java.util.Map<java.lang.String,java.nio.ByteBuffer> meta;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public HandshakeResponse() {}

  /**
   * All-args constructor.
   * @param match The new value for match
   * @param serverProtocol The new value for serverProtocol
   * @param serverHash The new value for serverHash
   * @param meta The new value for meta
   */
  public HandshakeResponse(org.apache.avro.ipc.HandshakeMatch match, java.lang.String serverProtocol, org.apache.avro.ipc.MD5 serverHash, java.util.Map<java.lang.String,java.nio.ByteBuffer> meta) {
    this.match = match;
    this.serverProtocol = serverProtocol;
    this.serverHash = serverHash;
    this.meta = meta;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return match;
    case 1: return serverProtocol;
    case 2: return serverHash;
    case 3: return meta;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: match = (org.apache.avro.ipc.HandshakeMatch)value$; break;
    case 1: serverProtocol = value$ != null ? value$.toString() : null; break;
    case 2: serverHash = (org.apache.avro.ipc.MD5)value$; break;
    case 3: meta = (java.util.Map<java.lang.String,java.nio.ByteBuffer>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'match' field.
   * @return The value of the 'match' field.
   */
  public org.apache.avro.ipc.HandshakeMatch getMatch() {
    return match;
  }

  /**
   * Gets the value of the 'match' field as an Optional&lt;org.apache.avro.ipc.HandshakeMatch&gt;.
   * @return The value wrapped in an Optional&lt;org.apache.avro.ipc.HandshakeMatch&gt;.
   */
  public Optional<org.apache.avro.ipc.HandshakeMatch> getOptionalMatch() {
    return Optional.<org.apache.avro.ipc.HandshakeMatch>ofNullable(match);
  }

  /**
   * Sets the value of the 'match' field.
   * @param value the value to set.
   */
  public void setMatch(org.apache.avro.ipc.HandshakeMatch value) {
    this.match = value;
  }

  /**
   * Gets the value of the 'serverProtocol' field.
   * @return The value of the 'serverProtocol' field.
   */
  public java.lang.String getServerProtocol() {
    return serverProtocol;
  }

  /**
   * Gets the value of the 'serverProtocol' field as an Optional&lt;java.lang.String&gt;.
   * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
   */
  public Optional<java.lang.String> getOptionalServerProtocol() {
    return Optional.<java.lang.String>ofNullable(serverProtocol);
  }

  /**
   * Sets the value of the 'serverProtocol' field.
   * @param value the value to set.
   */
  public void setServerProtocol(java.lang.String value) {
    this.serverProtocol = value;
  }

  /**
   * Gets the value of the 'serverHash' field.
   * @return The value of the 'serverHash' field.
   */
  public org.apache.avro.ipc.MD5 getServerHash() {
    return serverHash;
  }

  /**
   * Gets the value of the 'serverHash' field as an Optional&lt;org.apache.avro.ipc.MD5&gt;.
   * @return The value wrapped in an Optional&lt;org.apache.avro.ipc.MD5&gt;.
   */
  public Optional<org.apache.avro.ipc.MD5> getOptionalServerHash() {
    return Optional.<org.apache.avro.ipc.MD5>ofNullable(serverHash);
  }

  /**
   * Sets the value of the 'serverHash' field.
   * @param value the value to set.
   */
  public void setServerHash(org.apache.avro.ipc.MD5 value) {
    this.serverHash = value;
  }

  /**
   * Gets the value of the 'meta' field.
   * @return The value of the 'meta' field.
   */
  public java.util.Map<java.lang.String,java.nio.ByteBuffer> getMeta() {
    return meta;
  }

  /**
   * Gets the value of the 'meta' field as an Optional&lt;java.util.Map<java.lang.String,java.nio.ByteBuffer>&gt;.
   * @return The value wrapped in an Optional&lt;java.util.Map<java.lang.String,java.nio.ByteBuffer>&gt;.
   */
  public Optional<java.util.Map<java.lang.String,java.nio.ByteBuffer>> getOptionalMeta() {
    return Optional.<java.util.Map<java.lang.String,java.nio.ByteBuffer>>ofNullable(meta);
  }

  /**
   * Sets the value of the 'meta' field.
   * @param value the value to set.
   */
  public void setMeta(java.util.Map<java.lang.String,java.nio.ByteBuffer> value) {
    this.meta = value;
  }

  /**
   * Creates a new HandshakeResponse RecordBuilder.
   * @return A new HandshakeResponse RecordBuilder
   */
  public static org.apache.avro.ipc.HandshakeResponse.Builder newBuilder() {
    return new org.apache.avro.ipc.HandshakeResponse.Builder();
  }

  /**
   * Creates a new HandshakeResponse RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new HandshakeResponse RecordBuilder
   */
  public static org.apache.avro.ipc.HandshakeResponse.Builder newBuilder(org.apache.avro.ipc.HandshakeResponse.Builder other) {
    if (other == null) {
      return new org.apache.avro.ipc.HandshakeResponse.Builder();
    } else {
      return new org.apache.avro.ipc.HandshakeResponse.Builder(other);
    }
  }

  /**
   * Creates a new HandshakeResponse RecordBuilder by copying an existing HandshakeResponse instance.
   * @param other The existing instance to copy.
   * @return A new HandshakeResponse RecordBuilder
   */
  public static org.apache.avro.ipc.HandshakeResponse.Builder newBuilder(org.apache.avro.ipc.HandshakeResponse other) {
    if (other == null) {
      return new org.apache.avro.ipc.HandshakeResponse.Builder();
    } else {
      return new org.apache.avro.ipc.HandshakeResponse.Builder(other);
    }
  }

  /**
   * RecordBuilder for HandshakeResponse instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<HandshakeResponse>
    implements org.apache.avro.data.RecordBuilder<HandshakeResponse> {

    private org.apache.avro.ipc.HandshakeMatch match;
    private java.lang.String serverProtocol;
    private org.apache.avro.ipc.MD5 serverHash;
    private java.util.Map<java.lang.String,java.nio.ByteBuffer> meta;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.avro.ipc.HandshakeResponse.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.match)) {
        this.match = data().deepCopy(fields()[0].schema(), other.match);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.serverProtocol)) {
        this.serverProtocol = data().deepCopy(fields()[1].schema(), other.serverProtocol);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.serverHash)) {
        this.serverHash = data().deepCopy(fields()[2].schema(), other.serverHash);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.meta)) {
        this.meta = data().deepCopy(fields()[3].schema(), other.meta);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing HandshakeResponse instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.avro.ipc.HandshakeResponse other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.match)) {
        this.match = data().deepCopy(fields()[0].schema(), other.match);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.serverProtocol)) {
        this.serverProtocol = data().deepCopy(fields()[1].schema(), other.serverProtocol);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.serverHash)) {
        this.serverHash = data().deepCopy(fields()[2].schema(), other.serverHash);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.meta)) {
        this.meta = data().deepCopy(fields()[3].schema(), other.meta);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'match' field.
      * @return The value.
      */
    public org.apache.avro.ipc.HandshakeMatch getMatch() {
      return match;
    }

    /**
      * Gets the value of the 'match' field as an Optional&lt;org.apache.avro.ipc.HandshakeMatch&gt;.
      * @return The value wrapped in an Optional&lt;org.apache.avro.ipc.HandshakeMatch&gt;.
      */
    public Optional<org.apache.avro.ipc.HandshakeMatch> getOptionalMatch() {
      return Optional.<org.apache.avro.ipc.HandshakeMatch>ofNullable(match);
    }

    /**
      * Sets the value of the 'match' field.
      * @param value The value of 'match'.
      * @return This builder.
      */
    public org.apache.avro.ipc.HandshakeResponse.Builder setMatch(org.apache.avro.ipc.HandshakeMatch value) {
      validate(fields()[0], value);
      this.match = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'match' field has been set.
      * @return True if the 'match' field has been set, false otherwise.
      */
    public boolean hasMatch() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'match' field.
      * @return This builder.
      */
    public org.apache.avro.ipc.HandshakeResponse.Builder clearMatch() {
      match = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'serverProtocol' field.
      * @return The value.
      */
    public java.lang.String getServerProtocol() {
      return serverProtocol;
    }

    /**
      * Gets the value of the 'serverProtocol' field as an Optional&lt;java.lang.String&gt;.
      * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
      */
    public Optional<java.lang.String> getOptionalServerProtocol() {
      return Optional.<java.lang.String>ofNullable(serverProtocol);
    }

    /**
      * Sets the value of the 'serverProtocol' field.
      * @param value The value of 'serverProtocol'.
      * @return This builder.
      */
    public org.apache.avro.ipc.HandshakeResponse.Builder setServerProtocol(java.lang.String value) {
      validate(fields()[1], value);
      this.serverProtocol = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'serverProtocol' field has been set.
      * @return True if the 'serverProtocol' field has been set, false otherwise.
      */
    public boolean hasServerProtocol() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'serverProtocol' field.
      * @return This builder.
      */
    public org.apache.avro.ipc.HandshakeResponse.Builder clearServerProtocol() {
      serverProtocol = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'serverHash' field.
      * @return The value.
      */
    public org.apache.avro.ipc.MD5 getServerHash() {
      return serverHash;
    }

    /**
      * Gets the value of the 'serverHash' field as an Optional&lt;org.apache.avro.ipc.MD5&gt;.
      * @return The value wrapped in an Optional&lt;org.apache.avro.ipc.MD5&gt;.
      */
    public Optional<org.apache.avro.ipc.MD5> getOptionalServerHash() {
      return Optional.<org.apache.avro.ipc.MD5>ofNullable(serverHash);
    }

    /**
      * Sets the value of the 'serverHash' field.
      * @param value The value of 'serverHash'.
      * @return This builder.
      */
    public org.apache.avro.ipc.HandshakeResponse.Builder setServerHash(org.apache.avro.ipc.MD5 value) {
      validate(fields()[2], value);
      this.serverHash = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'serverHash' field has been set.
      * @return True if the 'serverHash' field has been set, false otherwise.
      */
    public boolean hasServerHash() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'serverHash' field.
      * @return This builder.
      */
    public org.apache.avro.ipc.HandshakeResponse.Builder clearServerHash() {
      serverHash = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'meta' field.
      * @return The value.
      */
    public java.util.Map<java.lang.String,java.nio.ByteBuffer> getMeta() {
      return meta;
    }

    /**
      * Gets the value of the 'meta' field as an Optional&lt;java.util.Map<java.lang.String,java.nio.ByteBuffer>&gt;.
      * @return The value wrapped in an Optional&lt;java.util.Map<java.lang.String,java.nio.ByteBuffer>&gt;.
      */
    public Optional<java.util.Map<java.lang.String,java.nio.ByteBuffer>> getOptionalMeta() {
      return Optional.<java.util.Map<java.lang.String,java.nio.ByteBuffer>>ofNullable(meta);
    }

    /**
      * Sets the value of the 'meta' field.
      * @param value The value of 'meta'.
      * @return This builder.
      */
    public org.apache.avro.ipc.HandshakeResponse.Builder setMeta(java.util.Map<java.lang.String,java.nio.ByteBuffer> value) {
      validate(fields()[3], value);
      this.meta = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'meta' field has been set.
      * @return True if the 'meta' field has been set, false otherwise.
      */
    public boolean hasMeta() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'meta' field.
      * @return This builder.
      */
    public org.apache.avro.ipc.HandshakeResponse.Builder clearMeta() {
      meta = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public HandshakeResponse build() {
      try {
        HandshakeResponse record = new HandshakeResponse();
        record.match = fieldSetFlags()[0] ? this.match : (org.apache.avro.ipc.HandshakeMatch) defaultValue(fields()[0]);
        record.serverProtocol = fieldSetFlags()[1] ? this.serverProtocol : (java.lang.String) defaultValue(fields()[1]);
        record.serverHash = fieldSetFlags()[2] ? this.serverHash : (org.apache.avro.ipc.MD5) defaultValue(fields()[2]);
        record.meta = fieldSetFlags()[3] ? this.meta : (java.util.Map<java.lang.String,java.nio.ByteBuffer>) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<HandshakeResponse>
    WRITER$ = (org.apache.avro.io.DatumWriter<HandshakeResponse>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<HandshakeResponse>
    READER$ = (org.apache.avro.io.DatumReader<HandshakeResponse>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeEnum(this.match.ordinal());

    if (this.serverProtocol == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.serverProtocol);
    }

    if (this.serverHash == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeFixed(this.serverHash.bytes(), 0, 16);
    }

    if (this.meta == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      long size0 = this.meta.size();
      out.writeMapStart();
      out.setItemCount(size0);
      long actualSize0 = 0;
      for (java.util.Map.Entry<java.lang.String, java.nio.ByteBuffer> e0: this.meta.entrySet()) {
        actualSize0++;
        out.startItem();
        out.writeString(e0.getKey());
        java.nio.ByteBuffer v0 = e0.getValue();
        out.writeBytes(v0);
      }
      out.writeMapEnd();
      if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Map-size written was " + size0 + ", but element count was " + actualSize0 + ".");
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.match = org.apache.avro.ipc.HandshakeMatch.values()[in.readEnum()];

      if (in.readIndex() != 1) {
        in.readNull();
        this.serverProtocol = null;
      } else {
        this.serverProtocol = in.readString();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.serverHash = null;
      } else {
        if (this.serverHash == null) {
          this.serverHash = new org.apache.avro.ipc.MD5();
        }
        in.readFixed(this.serverHash.bytes(), 0, 16);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.meta = null;
      } else {
        long size0 = in.readMapStart();
        java.util.Map<java.lang.String,java.nio.ByteBuffer> m0 = this.meta; // Need fresh name due to limitation of macro system
        if (m0 == null) {
          m0 = new java.util.HashMap<java.lang.String,java.nio.ByteBuffer>((int)size0);
          this.meta = m0;
        } else m0.clear();
        for ( ; 0 < size0; size0 = in.mapNext()) {
          for ( ; size0 != 0; size0--) {
            java.lang.String k0 = null;
            k0 = in.readString();
            java.nio.ByteBuffer v0 = null;
            v0 = in.readBytes(v0);
            m0.put(k0, v0);
          }
        }
      }

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.match = org.apache.avro.ipc.HandshakeMatch.values()[in.readEnum()];
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.serverProtocol = null;
          } else {
            this.serverProtocol = in.readString();
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.serverHash = null;
          } else {
            if (this.serverHash == null) {
              this.serverHash = new org.apache.avro.ipc.MD5();
            }
            in.readFixed(this.serverHash.bytes(), 0, 16);
          }
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.meta = null;
          } else {
            long size0 = in.readMapStart();
            java.util.Map<java.lang.String,java.nio.ByteBuffer> m0 = this.meta; // Need fresh name due to limitation of macro system
            if (m0 == null) {
              m0 = new java.util.HashMap<java.lang.String,java.nio.ByteBuffer>((int)size0);
              this.meta = m0;
            } else m0.clear();
            for ( ; 0 < size0; size0 = in.mapNext()) {
              for ( ; size0 != 0; size0--) {
                java.lang.String k0 = null;
                k0 = in.readString();
                java.nio.ByteBuffer v0 = null;
                v0 = in.readBytes(v0);
                m0.put(k0, v0);
              }
            }
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










