/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.apache.avro.compiler.schema.evolve;

/** * A few simple test schemas for testing schema evolution the IDL generated classes */
@org.apache.avro.specific.AvroGenerated
public interface SchemaEvolveTesting {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"SchemaEvolveTesting\",\"namespace\":\"org.apache.avro.compiler.schema.evolve\",\"doc\":\"* A few simple test schemas for testing schema evolution the IDL generated classes\",\"types\":[{\"type\":\"record\",\"name\":\"TestRecord1\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"value\",\"type\":\"long\"}]},{\"type\":\"record\",\"name\":\"TestRecord2\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"value\",\"type\":\"long\"},{\"name\":\"data\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]},{\"type\":\"record\",\"name\":\"TestRecord3\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"data\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]},{\"type\":\"record\",\"name\":\"NestedEvolve1\",\"fields\":[{\"name\":\"rootName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"nested\",\"type\":\"TestRecord1\"}]},{\"type\":\"record\",\"name\":\"NestedEvolve2\",\"fields\":[{\"name\":\"rootName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"nested\",\"type\":\"TestRecord2\"}]},{\"type\":\"record\",\"name\":\"NestedEvolve3\",\"fields\":[{\"name\":\"rootName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"nested\",\"type\":\"TestRecord3\"}]}],\"messages\":{}}");

  /** * A few simple test schemas for testing schema evolution the IDL generated classes */
  @org.apache.avro.specific.AvroGenerated
  public interface Callback extends SchemaEvolveTesting {
    public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.compiler.schema.evolve.SchemaEvolveTesting.PROTOCOL;
  }
}