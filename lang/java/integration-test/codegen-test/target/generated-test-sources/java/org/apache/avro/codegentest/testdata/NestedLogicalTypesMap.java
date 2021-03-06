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
public class NestedLogicalTypesMap extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1187253397664004496L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"NestedLogicalTypesMap\",\"namespace\":\"org.apache.avro.codegentest.testdata\",\"doc\":\"Test nested types with logical types in generated Java classes\",\"fields\":[{\"name\":\"mapOfRecords\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"RecordInMap\",\"fields\":[{\"name\":\"nullableDateField\",\"type\":[\"null\",{\"type\":\"int\",\"logicalType\":\"date\"}]}]},\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.DateConversion());
  }

  private static final BinaryMessageEncoder<NestedLogicalTypesMap> ENCODER =
      new BinaryMessageEncoder<NestedLogicalTypesMap>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<NestedLogicalTypesMap> DECODER =
      new BinaryMessageDecoder<NestedLogicalTypesMap>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<NestedLogicalTypesMap> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<NestedLogicalTypesMap> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<NestedLogicalTypesMap> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<NestedLogicalTypesMap>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this NestedLogicalTypesMap to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a NestedLogicalTypesMap from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a NestedLogicalTypesMap instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static NestedLogicalTypesMap fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.util.Map<java.lang.String,org.apache.avro.codegentest.testdata.RecordInMap> mapOfRecords;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public NestedLogicalTypesMap() {}

  /**
   * All-args constructor.
   * @param mapOfRecords The new value for mapOfRecords
   */
  public NestedLogicalTypesMap(java.util.Map<java.lang.String,org.apache.avro.codegentest.testdata.RecordInMap> mapOfRecords) {
    this.mapOfRecords = mapOfRecords;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return mapOfRecords;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: mapOfRecords = (java.util.Map<java.lang.String,org.apache.avro.codegentest.testdata.RecordInMap>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'mapOfRecords' field.
   * @return The value of the 'mapOfRecords' field.
   */
  public java.util.Map<java.lang.String,org.apache.avro.codegentest.testdata.RecordInMap> getMapOfRecords() {
    return mapOfRecords;
  }


  /**
   * Sets the value of the 'mapOfRecords' field.
   * @param value the value to set.
   */
  public void setMapOfRecords(java.util.Map<java.lang.String,org.apache.avro.codegentest.testdata.RecordInMap> value) {
    this.mapOfRecords = value;
  }

  /**
   * Creates a new NestedLogicalTypesMap RecordBuilder.
   * @return A new NestedLogicalTypesMap RecordBuilder
   */
  public static org.apache.avro.codegentest.testdata.NestedLogicalTypesMap.Builder newBuilder() {
    return new org.apache.avro.codegentest.testdata.NestedLogicalTypesMap.Builder();
  }

  /**
   * Creates a new NestedLogicalTypesMap RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new NestedLogicalTypesMap RecordBuilder
   */
  public static org.apache.avro.codegentest.testdata.NestedLogicalTypesMap.Builder newBuilder(org.apache.avro.codegentest.testdata.NestedLogicalTypesMap.Builder other) {
    if (other == null) {
      return new org.apache.avro.codegentest.testdata.NestedLogicalTypesMap.Builder();
    } else {
      return new org.apache.avro.codegentest.testdata.NestedLogicalTypesMap.Builder(other);
    }
  }

  /**
   * Creates a new NestedLogicalTypesMap RecordBuilder by copying an existing NestedLogicalTypesMap instance.
   * @param other The existing instance to copy.
   * @return A new NestedLogicalTypesMap RecordBuilder
   */
  public static org.apache.avro.codegentest.testdata.NestedLogicalTypesMap.Builder newBuilder(org.apache.avro.codegentest.testdata.NestedLogicalTypesMap other) {
    if (other == null) {
      return new org.apache.avro.codegentest.testdata.NestedLogicalTypesMap.Builder();
    } else {
      return new org.apache.avro.codegentest.testdata.NestedLogicalTypesMap.Builder(other);
    }
  }

  /**
   * RecordBuilder for NestedLogicalTypesMap instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<NestedLogicalTypesMap>
    implements org.apache.avro.data.RecordBuilder<NestedLogicalTypesMap> {

    private java.util.Map<java.lang.String,org.apache.avro.codegentest.testdata.RecordInMap> mapOfRecords;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.avro.codegentest.testdata.NestedLogicalTypesMap.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.mapOfRecords)) {
        this.mapOfRecords = data().deepCopy(fields()[0].schema(), other.mapOfRecords);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing NestedLogicalTypesMap instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.avro.codegentest.testdata.NestedLogicalTypesMap other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.mapOfRecords)) {
        this.mapOfRecords = data().deepCopy(fields()[0].schema(), other.mapOfRecords);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'mapOfRecords' field.
      * @return The value.
      */
    public java.util.Map<java.lang.String,org.apache.avro.codegentest.testdata.RecordInMap> getMapOfRecords() {
      return mapOfRecords;
    }


    /**
      * Sets the value of the 'mapOfRecords' field.
      * @param value The value of 'mapOfRecords'.
      * @return This builder.
      */
    public org.apache.avro.codegentest.testdata.NestedLogicalTypesMap.Builder setMapOfRecords(java.util.Map<java.lang.String,org.apache.avro.codegentest.testdata.RecordInMap> value) {
      validate(fields()[0], value);
      this.mapOfRecords = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'mapOfRecords' field has been set.
      * @return True if the 'mapOfRecords' field has been set, false otherwise.
      */
    public boolean hasMapOfRecords() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'mapOfRecords' field.
      * @return This builder.
      */
    public org.apache.avro.codegentest.testdata.NestedLogicalTypesMap.Builder clearMapOfRecords() {
      mapOfRecords = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public NestedLogicalTypesMap build() {
      try {
        NestedLogicalTypesMap record = new NestedLogicalTypesMap();
        record.mapOfRecords = fieldSetFlags()[0] ? this.mapOfRecords : (java.util.Map<java.lang.String,org.apache.avro.codegentest.testdata.RecordInMap>) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<NestedLogicalTypesMap>
    WRITER$ = (org.apache.avro.io.DatumWriter<NestedLogicalTypesMap>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<NestedLogicalTypesMap>
    READER$ = (org.apache.avro.io.DatumReader<NestedLogicalTypesMap>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










