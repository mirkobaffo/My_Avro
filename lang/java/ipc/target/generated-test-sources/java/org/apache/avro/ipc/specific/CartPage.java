/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.apache.avro.ipc.specific;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;
import java.util.Optional;
@org.apache.avro.specific.AvroGenerated
public class CartPage extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6652195414215556731L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CartPage\",\"namespace\":\"org.apache.avro.ipc.specific\",\"fields\":[{\"name\":\"productsInCart\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<CartPage> ENCODER =
      new BinaryMessageEncoder<CartPage>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<CartPage> DECODER =
      new BinaryMessageDecoder<CartPage>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<CartPage> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<CartPage> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<CartPage> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<CartPage>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this CartPage to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a CartPage from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a CartPage instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static CartPage fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.util.List<java.lang.String> productsInCart;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CartPage() {}

  /**
   * All-args constructor.
   * @param productsInCart The new value for productsInCart
   */
  public CartPage(java.util.List<java.lang.String> productsInCart) {
    this.productsInCart = productsInCart;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return productsInCart;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: productsInCart = (java.util.List<java.lang.String>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'productsInCart' field.
   * @return The value of the 'productsInCart' field.
   */
  public java.util.List<java.lang.String> getProductsInCart() {
    return productsInCart;
  }

  /**
   * Gets the value of the 'productsInCart' field as an Optional&lt;java.util.List<java.lang.String>&gt;.
   * @return The value wrapped in an Optional&lt;java.util.List<java.lang.String>&gt;.
   */
  public Optional<java.util.List<java.lang.String>> getOptionalProductsInCart() {
    return Optional.<java.util.List<java.lang.String>>ofNullable(productsInCart);
  }

  /**
   * Sets the value of the 'productsInCart' field.
   * @param value the value to set.
   */
  public void setProductsInCart(java.util.List<java.lang.String> value) {
    this.productsInCart = value;
  }

  /**
   * Creates a new CartPage RecordBuilder.
   * @return A new CartPage RecordBuilder
   */
  public static org.apache.avro.ipc.specific.CartPage.Builder newBuilder() {
    return new org.apache.avro.ipc.specific.CartPage.Builder();
  }

  /**
   * Creates a new CartPage RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CartPage RecordBuilder
   */
  public static org.apache.avro.ipc.specific.CartPage.Builder newBuilder(org.apache.avro.ipc.specific.CartPage.Builder other) {
    if (other == null) {
      return new org.apache.avro.ipc.specific.CartPage.Builder();
    } else {
      return new org.apache.avro.ipc.specific.CartPage.Builder(other);
    }
  }

  /**
   * Creates a new CartPage RecordBuilder by copying an existing CartPage instance.
   * @param other The existing instance to copy.
   * @return A new CartPage RecordBuilder
   */
  public static org.apache.avro.ipc.specific.CartPage.Builder newBuilder(org.apache.avro.ipc.specific.CartPage other) {
    if (other == null) {
      return new org.apache.avro.ipc.specific.CartPage.Builder();
    } else {
      return new org.apache.avro.ipc.specific.CartPage.Builder(other);
    }
  }

  /**
   * RecordBuilder for CartPage instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CartPage>
    implements org.apache.avro.data.RecordBuilder<CartPage> {

    private java.util.List<java.lang.String> productsInCart;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.avro.ipc.specific.CartPage.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.productsInCart)) {
        this.productsInCart = data().deepCopy(fields()[0].schema(), other.productsInCart);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing CartPage instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.avro.ipc.specific.CartPage other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.productsInCart)) {
        this.productsInCart = data().deepCopy(fields()[0].schema(), other.productsInCart);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'productsInCart' field.
      * @return The value.
      */
    public java.util.List<java.lang.String> getProductsInCart() {
      return productsInCart;
    }

    /**
      * Gets the value of the 'productsInCart' field as an Optional&lt;java.util.List<java.lang.String>&gt;.
      * @return The value wrapped in an Optional&lt;java.util.List<java.lang.String>&gt;.
      */
    public Optional<java.util.List<java.lang.String>> getOptionalProductsInCart() {
      return Optional.<java.util.List<java.lang.String>>ofNullable(productsInCart);
    }

    /**
      * Sets the value of the 'productsInCart' field.
      * @param value The value of 'productsInCart'.
      * @return This builder.
      */
    public org.apache.avro.ipc.specific.CartPage.Builder setProductsInCart(java.util.List<java.lang.String> value) {
      validate(fields()[0], value);
      this.productsInCart = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'productsInCart' field has been set.
      * @return True if the 'productsInCart' field has been set, false otherwise.
      */
    public boolean hasProductsInCart() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'productsInCart' field.
      * @return This builder.
      */
    public org.apache.avro.ipc.specific.CartPage.Builder clearProductsInCart() {
      productsInCart = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CartPage build() {
      try {
        CartPage record = new CartPage();
        record.productsInCart = fieldSetFlags()[0] ? this.productsInCart : (java.util.List<java.lang.String>) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<CartPage>
    WRITER$ = (org.apache.avro.io.DatumWriter<CartPage>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<CartPage>
    READER$ = (org.apache.avro.io.DatumReader<CartPage>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    long size0 = this.productsInCart.size();
    out.writeArrayStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (java.lang.String e0: this.productsInCart) {
      actualSize0++;
      out.startItem();
      out.writeString(e0);
    }
    out.writeArrayEnd();
    if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      long size0 = in.readArrayStart();
      java.util.List<java.lang.String> a0 = this.productsInCart;
      if (a0 == null) {
        a0 = new SpecificData.Array<java.lang.String>((int)size0, SCHEMA$.getField("productsInCart").schema());
        this.productsInCart = a0;
      } else a0.clear();
      SpecificData.Array<java.lang.String> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<java.lang.String>)a0 : null);
      for ( ; 0 < size0; size0 = in.arrayNext()) {
        for ( ; size0 != 0; size0--) {
          java.lang.String e0 = (ga0 != null ? ga0.peek() : null);
          e0 = in.readString();
          a0.add(e0);
        }
      }

    } else {
      for (int i = 0; i < 1; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          long size0 = in.readArrayStart();
          java.util.List<java.lang.String> a0 = this.productsInCart;
          if (a0 == null) {
            a0 = new SpecificData.Array<java.lang.String>((int)size0, SCHEMA$.getField("productsInCart").schema());
            this.productsInCart = a0;
          } else a0.clear();
          SpecificData.Array<java.lang.String> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<java.lang.String>)a0 : null);
          for ( ; 0 < size0; size0 = in.arrayNext()) {
            for ( ; size0 != 0; size0--) {
              java.lang.String e0 = (ga0 != null ? ga0.peek() : null);
              e0 = in.readString();
              a0.add(e0);
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










