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
public class Person extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1759629958909541823L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Person\",\"namespace\":\"org.apache.avro.ipc.specific\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"year_of_birth\",\"type\":\"int\"},{\"name\":\"country\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"US\"},{\"name\":\"state\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"friends\",\"type\":{\"type\":\"array\",\"items\":\"Person\"},\"default\":[]},{\"name\":\"languages\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"default\":[\"English\",\"Java\"]},{\"name\":\"defaultPrivacy\",\"type\":{\"type\":\"enum\",\"name\":\"PrivacyType\",\"symbols\":[\"FRIENDS\",\"FRIENDS_OF_FRIENDS\",\"PUBLIC\",\"CUSTOM\"]},\"default\":\"FRIENDS\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Person> ENCODER =
      new BinaryMessageEncoder<Person>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Person> DECODER =
      new BinaryMessageDecoder<Person>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Person> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Person> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Person> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Person>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Person to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Person from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Person instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Person fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.String name;
  private int year_of_birth;
  private java.lang.String country;
  private java.lang.String state;
  private java.util.List<org.apache.avro.ipc.specific.Person> friends;
  private java.util.List<java.lang.String> languages;
  private org.apache.avro.ipc.specific.PrivacyType defaultPrivacy;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Person() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param year_of_birth The new value for year_of_birth
   * @param country The new value for country
   * @param state The new value for state
   * @param friends The new value for friends
   * @param languages The new value for languages
   * @param defaultPrivacy The new value for defaultPrivacy
   */
  public Person(java.lang.String name, java.lang.Integer year_of_birth, java.lang.String country, java.lang.String state, java.util.List<org.apache.avro.ipc.specific.Person> friends, java.util.List<java.lang.String> languages, org.apache.avro.ipc.specific.PrivacyType defaultPrivacy) {
    this.name = name;
    this.year_of_birth = year_of_birth;
    this.country = country;
    this.state = state;
    this.friends = friends;
    this.languages = languages;
    this.defaultPrivacy = defaultPrivacy;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return year_of_birth;
    case 2: return country;
    case 3: return state;
    case 4: return friends;
    case 5: return languages;
    case 6: return defaultPrivacy;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = value$ != null ? value$.toString() : null; break;
    case 1: year_of_birth = (java.lang.Integer)value$; break;
    case 2: country = value$ != null ? value$.toString() : null; break;
    case 3: state = value$ != null ? value$.toString() : null; break;
    case 4: friends = (java.util.List<org.apache.avro.ipc.specific.Person>)value$; break;
    case 5: languages = (java.util.List<java.lang.String>)value$; break;
    case 6: defaultPrivacy = (org.apache.avro.ipc.specific.PrivacyType)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Gets the value of the 'name' field as an Optional&lt;java.lang.String&gt;.
   * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
   */
  public Optional<java.lang.String> getOptionalName() {
    return Optional.<java.lang.String>ofNullable(name);
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'year_of_birth' field.
   * @return The value of the 'year_of_birth' field.
   */
  public int getYearOfBirth() {
    return year_of_birth;
  }

  /**
   * Gets the value of the 'year_of_birth' field as an Optional&lt;java.lang.Integer&gt;.
   * @return The value wrapped in an Optional&lt;java.lang.Integer&gt;.
   */
  public Optional<java.lang.Integer> getOptionalYearOfBirth() {
    return Optional.<java.lang.Integer>ofNullable(year_of_birth);
  }

  /**
   * Sets the value of the 'year_of_birth' field.
   * @param value the value to set.
   */
  public void setYearOfBirth(int value) {
    this.year_of_birth = value;
  }

  /**
   * Gets the value of the 'country' field.
   * @return The value of the 'country' field.
   */
  public java.lang.String getCountry() {
    return country;
  }

  /**
   * Gets the value of the 'country' field as an Optional&lt;java.lang.String&gt;.
   * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
   */
  public Optional<java.lang.String> getOptionalCountry() {
    return Optional.<java.lang.String>ofNullable(country);
  }

  /**
   * Sets the value of the 'country' field.
   * @param value the value to set.
   */
  public void setCountry(java.lang.String value) {
    this.country = value;
  }

  /**
   * Gets the value of the 'state' field.
   * @return The value of the 'state' field.
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Gets the value of the 'state' field as an Optional&lt;java.lang.String&gt;.
   * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
   */
  public Optional<java.lang.String> getOptionalState() {
    return Optional.<java.lang.String>ofNullable(state);
  }

  /**
   * Sets the value of the 'state' field.
   * @param value the value to set.
   */
  public void setState(java.lang.String value) {
    this.state = value;
  }

  /**
   * Gets the value of the 'friends' field.
   * @return The value of the 'friends' field.
   */
  public java.util.List<org.apache.avro.ipc.specific.Person> getFriends() {
    return friends;
  }

  /**
   * Gets the value of the 'friends' field as an Optional&lt;java.util.List<org.apache.avro.ipc.specific.Person>&gt;.
   * @return The value wrapped in an Optional&lt;java.util.List<org.apache.avro.ipc.specific.Person>&gt;.
   */
  public Optional<java.util.List<org.apache.avro.ipc.specific.Person>> getOptionalFriends() {
    return Optional.<java.util.List<org.apache.avro.ipc.specific.Person>>ofNullable(friends);
  }

  /**
   * Sets the value of the 'friends' field.
   * @param value the value to set.
   */
  public void setFriends(java.util.List<org.apache.avro.ipc.specific.Person> value) {
    this.friends = value;
  }

  /**
   * Gets the value of the 'languages' field.
   * @return The value of the 'languages' field.
   */
  public java.util.List<java.lang.String> getLanguages() {
    return languages;
  }

  /**
   * Gets the value of the 'languages' field as an Optional&lt;java.util.List<java.lang.String>&gt;.
   * @return The value wrapped in an Optional&lt;java.util.List<java.lang.String>&gt;.
   */
  public Optional<java.util.List<java.lang.String>> getOptionalLanguages() {
    return Optional.<java.util.List<java.lang.String>>ofNullable(languages);
  }

  /**
   * Sets the value of the 'languages' field.
   * @param value the value to set.
   */
  public void setLanguages(java.util.List<java.lang.String> value) {
    this.languages = value;
  }

  /**
   * Gets the value of the 'defaultPrivacy' field.
   * @return The value of the 'defaultPrivacy' field.
   */
  public org.apache.avro.ipc.specific.PrivacyType getDefaultPrivacy() {
    return defaultPrivacy;
  }

  /**
   * Gets the value of the 'defaultPrivacy' field as an Optional&lt;org.apache.avro.ipc.specific.PrivacyType&gt;.
   * @return The value wrapped in an Optional&lt;org.apache.avro.ipc.specific.PrivacyType&gt;.
   */
  public Optional<org.apache.avro.ipc.specific.PrivacyType> getOptionalDefaultPrivacy() {
    return Optional.<org.apache.avro.ipc.specific.PrivacyType>ofNullable(defaultPrivacy);
  }

  /**
   * Sets the value of the 'defaultPrivacy' field.
   * @param value the value to set.
   */
  public void setDefaultPrivacy(org.apache.avro.ipc.specific.PrivacyType value) {
    this.defaultPrivacy = value;
  }

  /**
   * Creates a new Person RecordBuilder.
   * @return A new Person RecordBuilder
   */
  public static org.apache.avro.ipc.specific.Person.Builder newBuilder() {
    return new org.apache.avro.ipc.specific.Person.Builder();
  }

  /**
   * Creates a new Person RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Person RecordBuilder
   */
  public static org.apache.avro.ipc.specific.Person.Builder newBuilder(org.apache.avro.ipc.specific.Person.Builder other) {
    if (other == null) {
      return new org.apache.avro.ipc.specific.Person.Builder();
    } else {
      return new org.apache.avro.ipc.specific.Person.Builder(other);
    }
  }

  /**
   * Creates a new Person RecordBuilder by copying an existing Person instance.
   * @param other The existing instance to copy.
   * @return A new Person RecordBuilder
   */
  public static org.apache.avro.ipc.specific.Person.Builder newBuilder(org.apache.avro.ipc.specific.Person other) {
    if (other == null) {
      return new org.apache.avro.ipc.specific.Person.Builder();
    } else {
      return new org.apache.avro.ipc.specific.Person.Builder(other);
    }
  }

  /**
   * RecordBuilder for Person instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Person>
    implements org.apache.avro.data.RecordBuilder<Person> {

    private java.lang.String name;
    private int year_of_birth;
    private java.lang.String country;
    private java.lang.String state;
    private java.util.List<org.apache.avro.ipc.specific.Person> friends;
    private java.util.List<java.lang.String> languages;
    private org.apache.avro.ipc.specific.PrivacyType defaultPrivacy;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.avro.ipc.specific.Person.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.year_of_birth)) {
        this.year_of_birth = data().deepCopy(fields()[1].schema(), other.year_of_birth);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.country)) {
        this.country = data().deepCopy(fields()[2].schema(), other.country);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.state)) {
        this.state = data().deepCopy(fields()[3].schema(), other.state);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.friends)) {
        this.friends = data().deepCopy(fields()[4].schema(), other.friends);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.languages)) {
        this.languages = data().deepCopy(fields()[5].schema(), other.languages);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.defaultPrivacy)) {
        this.defaultPrivacy = data().deepCopy(fields()[6].schema(), other.defaultPrivacy);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
    }

    /**
     * Creates a Builder by copying an existing Person instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.avro.ipc.specific.Person other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.year_of_birth)) {
        this.year_of_birth = data().deepCopy(fields()[1].schema(), other.year_of_birth);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.country)) {
        this.country = data().deepCopy(fields()[2].schema(), other.country);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.state)) {
        this.state = data().deepCopy(fields()[3].schema(), other.state);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.friends)) {
        this.friends = data().deepCopy(fields()[4].schema(), other.friends);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.languages)) {
        this.languages = data().deepCopy(fields()[5].schema(), other.languages);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.defaultPrivacy)) {
        this.defaultPrivacy = data().deepCopy(fields()[6].schema(), other.defaultPrivacy);
        fieldSetFlags()[6] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.String getName() {
      return name;
    }

    /**
      * Gets the value of the 'name' field as an Optional&lt;java.lang.String&gt;.
      * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
      */
    public Optional<java.lang.String> getOptionalName() {
      return Optional.<java.lang.String>ofNullable(name);
    }

    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public org.apache.avro.ipc.specific.Person.Builder setName(java.lang.String value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public org.apache.avro.ipc.specific.Person.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'year_of_birth' field.
      * @return The value.
      */
    public int getYearOfBirth() {
      return year_of_birth;
    }

    /**
      * Gets the value of the 'year_of_birth' field as an Optional&lt;java.lang.Integer&gt;.
      * @return The value wrapped in an Optional&lt;java.lang.Integer&gt;.
      */
    public Optional<java.lang.Integer> getOptionalYearOfBirth() {
      return Optional.<java.lang.Integer>ofNullable(year_of_birth);
    }

    /**
      * Sets the value of the 'year_of_birth' field.
      * @param value The value of 'year_of_birth'.
      * @return This builder.
      */
    public org.apache.avro.ipc.specific.Person.Builder setYearOfBirth(int value) {
      validate(fields()[1], value);
      this.year_of_birth = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'year_of_birth' field has been set.
      * @return True if the 'year_of_birth' field has been set, false otherwise.
      */
    public boolean hasYearOfBirth() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'year_of_birth' field.
      * @return This builder.
      */
    public org.apache.avro.ipc.specific.Person.Builder clearYearOfBirth() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'country' field.
      * @return The value.
      */
    public java.lang.String getCountry() {
      return country;
    }

    /**
      * Gets the value of the 'country' field as an Optional&lt;java.lang.String&gt;.
      * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
      */
    public Optional<java.lang.String> getOptionalCountry() {
      return Optional.<java.lang.String>ofNullable(country);
    }

    /**
      * Sets the value of the 'country' field.
      * @param value The value of 'country'.
      * @return This builder.
      */
    public org.apache.avro.ipc.specific.Person.Builder setCountry(java.lang.String value) {
      validate(fields()[2], value);
      this.country = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'country' field has been set.
      * @return True if the 'country' field has been set, false otherwise.
      */
    public boolean hasCountry() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'country' field.
      * @return This builder.
      */
    public org.apache.avro.ipc.specific.Person.Builder clearCountry() {
      country = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'state' field.
      * @return The value.
      */
    public java.lang.String getState() {
      return state;
    }

    /**
      * Gets the value of the 'state' field as an Optional&lt;java.lang.String&gt;.
      * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
      */
    public Optional<java.lang.String> getOptionalState() {
      return Optional.<java.lang.String>ofNullable(state);
    }

    /**
      * Sets the value of the 'state' field.
      * @param value The value of 'state'.
      * @return This builder.
      */
    public org.apache.avro.ipc.specific.Person.Builder setState(java.lang.String value) {
      validate(fields()[3], value);
      this.state = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'state' field has been set.
      * @return True if the 'state' field has been set, false otherwise.
      */
    public boolean hasState() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'state' field.
      * @return This builder.
      */
    public org.apache.avro.ipc.specific.Person.Builder clearState() {
      state = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'friends' field.
      * @return The value.
      */
    public java.util.List<org.apache.avro.ipc.specific.Person> getFriends() {
      return friends;
    }

    /**
      * Gets the value of the 'friends' field as an Optional&lt;java.util.List<org.apache.avro.ipc.specific.Person>&gt;.
      * @return The value wrapped in an Optional&lt;java.util.List<org.apache.avro.ipc.specific.Person>&gt;.
      */
    public Optional<java.util.List<org.apache.avro.ipc.specific.Person>> getOptionalFriends() {
      return Optional.<java.util.List<org.apache.avro.ipc.specific.Person>>ofNullable(friends);
    }

    /**
      * Sets the value of the 'friends' field.
      * @param value The value of 'friends'.
      * @return This builder.
      */
    public org.apache.avro.ipc.specific.Person.Builder setFriends(java.util.List<org.apache.avro.ipc.specific.Person> value) {
      validate(fields()[4], value);
      this.friends = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'friends' field has been set.
      * @return True if the 'friends' field has been set, false otherwise.
      */
    public boolean hasFriends() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'friends' field.
      * @return This builder.
      */
    public org.apache.avro.ipc.specific.Person.Builder clearFriends() {
      friends = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'languages' field.
      * @return The value.
      */
    public java.util.List<java.lang.String> getLanguages() {
      return languages;
    }

    /**
      * Gets the value of the 'languages' field as an Optional&lt;java.util.List<java.lang.String>&gt;.
      * @return The value wrapped in an Optional&lt;java.util.List<java.lang.String>&gt;.
      */
    public Optional<java.util.List<java.lang.String>> getOptionalLanguages() {
      return Optional.<java.util.List<java.lang.String>>ofNullable(languages);
    }

    /**
      * Sets the value of the 'languages' field.
      * @param value The value of 'languages'.
      * @return This builder.
      */
    public org.apache.avro.ipc.specific.Person.Builder setLanguages(java.util.List<java.lang.String> value) {
      validate(fields()[5], value);
      this.languages = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'languages' field has been set.
      * @return True if the 'languages' field has been set, false otherwise.
      */
    public boolean hasLanguages() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'languages' field.
      * @return This builder.
      */
    public org.apache.avro.ipc.specific.Person.Builder clearLanguages() {
      languages = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'defaultPrivacy' field.
      * @return The value.
      */
    public org.apache.avro.ipc.specific.PrivacyType getDefaultPrivacy() {
      return defaultPrivacy;
    }

    /**
      * Gets the value of the 'defaultPrivacy' field as an Optional&lt;org.apache.avro.ipc.specific.PrivacyType&gt;.
      * @return The value wrapped in an Optional&lt;org.apache.avro.ipc.specific.PrivacyType&gt;.
      */
    public Optional<org.apache.avro.ipc.specific.PrivacyType> getOptionalDefaultPrivacy() {
      return Optional.<org.apache.avro.ipc.specific.PrivacyType>ofNullable(defaultPrivacy);
    }

    /**
      * Sets the value of the 'defaultPrivacy' field.
      * @param value The value of 'defaultPrivacy'.
      * @return This builder.
      */
    public org.apache.avro.ipc.specific.Person.Builder setDefaultPrivacy(org.apache.avro.ipc.specific.PrivacyType value) {
      validate(fields()[6], value);
      this.defaultPrivacy = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'defaultPrivacy' field has been set.
      * @return True if the 'defaultPrivacy' field has been set, false otherwise.
      */
    public boolean hasDefaultPrivacy() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'defaultPrivacy' field.
      * @return This builder.
      */
    public org.apache.avro.ipc.specific.Person.Builder clearDefaultPrivacy() {
      defaultPrivacy = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Person build() {
      try {
        Person record = new Person();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.String) defaultValue(fields()[0]);
        record.year_of_birth = fieldSetFlags()[1] ? this.year_of_birth : (java.lang.Integer) defaultValue(fields()[1]);
        record.country = fieldSetFlags()[2] ? this.country : (java.lang.String) defaultValue(fields()[2]);
        record.state = fieldSetFlags()[3] ? this.state : (java.lang.String) defaultValue(fields()[3]);
        record.friends = fieldSetFlags()[4] ? this.friends : (java.util.List<org.apache.avro.ipc.specific.Person>) defaultValue(fields()[4]);
        record.languages = fieldSetFlags()[5] ? this.languages : (java.util.List<java.lang.String>) defaultValue(fields()[5]);
        record.defaultPrivacy = fieldSetFlags()[6] ? this.defaultPrivacy : (org.apache.avro.ipc.specific.PrivacyType) defaultValue(fields()[6]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Person>
    WRITER$ = (org.apache.avro.io.DatumWriter<Person>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Person>
    READER$ = (org.apache.avro.io.DatumReader<Person>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.name);

    out.writeInt(this.year_of_birth);

    out.writeString(this.country);

    out.writeString(this.state);

    long size0 = this.friends.size();
    out.writeArrayStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (org.apache.avro.ipc.specific.Person e0: this.friends) {
      actualSize0++;
      out.startItem();
      e0.customEncode(out);
    }
    out.writeArrayEnd();
    if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");

    long size1 = this.languages.size();
    out.writeArrayStart();
    out.setItemCount(size1);
    long actualSize1 = 0;
    for (java.lang.String e1: this.languages) {
      actualSize1++;
      out.startItem();
      out.writeString(e1);
    }
    out.writeArrayEnd();
    if (actualSize1 != size1)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size1 + ", but element count was " + actualSize1 + ".");

    out.writeEnum(this.defaultPrivacy.ordinal());

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.name = in.readString();

      this.year_of_birth = in.readInt();

      this.country = in.readString();

      this.state = in.readString();

      long size0 = in.readArrayStart();
      java.util.List<org.apache.avro.ipc.specific.Person> a0 = this.friends;
      if (a0 == null) {
        a0 = new SpecificData.Array<org.apache.avro.ipc.specific.Person>((int)size0, SCHEMA$.getField("friends").schema());
        this.friends = a0;
      } else a0.clear();
      SpecificData.Array<org.apache.avro.ipc.specific.Person> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<org.apache.avro.ipc.specific.Person>)a0 : null);
      for ( ; 0 < size0; size0 = in.arrayNext()) {
        for ( ; size0 != 0; size0--) {
          org.apache.avro.ipc.specific.Person e0 = (ga0 != null ? ga0.peek() : null);
          if (e0 == null) {
            e0 = new org.apache.avro.ipc.specific.Person();
          }
          e0.customDecode(in);
          a0.add(e0);
        }
      }

      long size1 = in.readArrayStart();
      java.util.List<java.lang.String> a1 = this.languages;
      if (a1 == null) {
        a1 = new SpecificData.Array<java.lang.String>((int)size1, SCHEMA$.getField("languages").schema());
        this.languages = a1;
      } else a1.clear();
      SpecificData.Array<java.lang.String> ga1 = (a1 instanceof SpecificData.Array ? (SpecificData.Array<java.lang.String>)a1 : null);
      for ( ; 0 < size1; size1 = in.arrayNext()) {
        for ( ; size1 != 0; size1--) {
          java.lang.String e1 = (ga1 != null ? ga1.peek() : null);
          e1 = in.readString();
          a1.add(e1);
        }
      }

      this.defaultPrivacy = org.apache.avro.ipc.specific.PrivacyType.values()[in.readEnum()];

    } else {
      for (int i = 0; i < 7; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.name = in.readString();
          break;

        case 1:
          this.year_of_birth = in.readInt();
          break;

        case 2:
          this.country = in.readString();
          break;

        case 3:
          this.state = in.readString();
          break;

        case 4:
          long size0 = in.readArrayStart();
          java.util.List<org.apache.avro.ipc.specific.Person> a0 = this.friends;
          if (a0 == null) {
            a0 = new SpecificData.Array<org.apache.avro.ipc.specific.Person>((int)size0, SCHEMA$.getField("friends").schema());
            this.friends = a0;
          } else a0.clear();
          SpecificData.Array<org.apache.avro.ipc.specific.Person> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<org.apache.avro.ipc.specific.Person>)a0 : null);
          for ( ; 0 < size0; size0 = in.arrayNext()) {
            for ( ; size0 != 0; size0--) {
              org.apache.avro.ipc.specific.Person e0 = (ga0 != null ? ga0.peek() : null);
              if (e0 == null) {
                e0 = new org.apache.avro.ipc.specific.Person();
              }
              e0.customDecode(in);
              a0.add(e0);
            }
          }
          break;

        case 5:
          long size1 = in.readArrayStart();
          java.util.List<java.lang.String> a1 = this.languages;
          if (a1 == null) {
            a1 = new SpecificData.Array<java.lang.String>((int)size1, SCHEMA$.getField("languages").schema());
            this.languages = a1;
          } else a1.clear();
          SpecificData.Array<java.lang.String> ga1 = (a1 instanceof SpecificData.Array ? (SpecificData.Array<java.lang.String>)a1 : null);
          for ( ; 0 < size1; size1 = in.arrayNext()) {
            for ( ; size1 != 0; size1--) {
              java.lang.String e1 = (ga1 != null ? ga1.peek() : null);
              e1 = in.readString();
              a1.add(e1);
            }
          }
          break;

        case 6:
          this.defaultPrivacy = org.apache.avro.ipc.specific.PrivacyType.values()[in.readEnum()];
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










