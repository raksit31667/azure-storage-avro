/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Microsoft.ServiceBus.Messaging;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class EventData extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4383884401906365320L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EventData\",\"namespace\":\"Microsoft.ServiceBus.Messaging\",\"fields\":[{\"name\":\"SequenceNumber\",\"type\":\"long\"},{\"name\":\"Offset\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"EnqueuedTimeUtc\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"SystemProperties\",\"type\":{\"type\":\"map\",\"values\":[\"long\",\"double\",{\"type\":\"string\",\"avro.java.string\":\"String\"},\"bytes\"],\"avro.java.string\":\"String\"}},{\"name\":\"Properties\",\"type\":{\"type\":\"map\",\"values\":[\"long\",\"double\",{\"type\":\"string\",\"avro.java.string\":\"String\"},\"bytes\"],\"avro.java.string\":\"String\"}},{\"name\":\"Body\",\"type\":[\"null\",\"bytes\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public long SequenceNumber;
  @Deprecated public java.lang.String Offset;
  @Deprecated public java.lang.String EnqueuedTimeUtc;
  @Deprecated public java.util.Map<java.lang.String,java.lang.Object> SystemProperties;
  @Deprecated public java.util.Map<java.lang.String,java.lang.Object> Properties;
  @Deprecated public java.nio.ByteBuffer Body;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public EventData() {}

  /**
   * All-args constructor.
   * @param SequenceNumber The new value for SequenceNumber
   * @param Offset The new value for Offset
   * @param EnqueuedTimeUtc The new value for EnqueuedTimeUtc
   * @param SystemProperties The new value for SystemProperties
   * @param Properties The new value for Properties
   * @param Body The new value for Body
   */
  public EventData(java.lang.Long SequenceNumber, java.lang.String Offset, java.lang.String EnqueuedTimeUtc, java.util.Map<java.lang.String,java.lang.Object> SystemProperties, java.util.Map<java.lang.String,java.lang.Object> Properties, java.nio.ByteBuffer Body) {
    this.SequenceNumber = SequenceNumber;
    this.Offset = Offset;
    this.EnqueuedTimeUtc = EnqueuedTimeUtc;
    this.SystemProperties = SystemProperties;
    this.Properties = Properties;
    this.Body = Body;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
      case 0: return SequenceNumber;
      case 1: return Offset;
      case 2: return EnqueuedTimeUtc;
      case 3: return SystemProperties;
      case 4: return Properties;
      case 5: return Body;
      default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
      case 0: SequenceNumber = (java.lang.Long)value$; break;
      case 1: Offset = (java.lang.String)value$; break;
      case 2: EnqueuedTimeUtc = (java.lang.String)value$; break;
      case 3: SystemProperties = (java.util.Map<java.lang.String,java.lang.Object>)value$; break;
      case 4: Properties = (java.util.Map<java.lang.String,java.lang.Object>)value$; break;
      case 5: Body = (java.nio.ByteBuffer)value$; break;
      default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'SequenceNumber' field.
   * @return The value of the 'SequenceNumber' field.
   */
  public java.lang.Long getSequenceNumber() {
    return SequenceNumber;
  }

  /**
   * Sets the value of the 'SequenceNumber' field.
   * @param value the value to set.
   */
  public void setSequenceNumber(java.lang.Long value) {
    this.SequenceNumber = value;
  }

  /**
   * Gets the value of the 'Offset' field.
   * @return The value of the 'Offset' field.
   */
  public java.lang.String getOffset() {
    return Offset;
  }

  /**
   * Sets the value of the 'Offset' field.
   * @param value the value to set.
   */
  public void setOffset(java.lang.String value) {
    this.Offset = value;
  }

  /**
   * Gets the value of the 'EnqueuedTimeUtc' field.
   * @return The value of the 'EnqueuedTimeUtc' field.
   */
  public java.lang.String getEnqueuedTimeUtc() {
    return EnqueuedTimeUtc;
  }

  /**
   * Sets the value of the 'EnqueuedTimeUtc' field.
   * @param value the value to set.
   */
  public void setEnqueuedTimeUtc(java.lang.String value) {
    this.EnqueuedTimeUtc = value;
  }

  /**
   * Gets the value of the 'SystemProperties' field.
   * @return The value of the 'SystemProperties' field.
   */
  public java.util.Map<java.lang.String,java.lang.Object> getSystemProperties() {
    return SystemProperties;
  }

  /**
   * Sets the value of the 'SystemProperties' field.
   * @param value the value to set.
   */
  public void setSystemProperties(java.util.Map<java.lang.String,java.lang.Object> value) {
    this.SystemProperties = value;
  }

  /**
   * Gets the value of the 'Properties' field.
   * @return The value of the 'Properties' field.
   */
  public java.util.Map<java.lang.String,java.lang.Object> getProperties() {
    return Properties;
  }

  /**
   * Sets the value of the 'Properties' field.
   * @param value the value to set.
   */
  public void setProperties(java.util.Map<java.lang.String,java.lang.Object> value) {
    this.Properties = value;
  }

  /**
   * Gets the value of the 'Body' field.
   * @return The value of the 'Body' field.
   */
  public java.nio.ByteBuffer getBody() {
    return Body;
  }

  /**
   * Sets the value of the 'Body' field.
   * @param value the value to set.
   */
  public void setBody(java.nio.ByteBuffer value) {
    this.Body = value;
  }

  /**
   * Creates a new EventData RecordBuilder.
   * @return A new EventData RecordBuilder
   */
  public static Microsoft.ServiceBus.Messaging.EventData.Builder newBuilder() {
    return new Microsoft.ServiceBus.Messaging.EventData.Builder();
  }

  /**
   * Creates a new EventData RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new EventData RecordBuilder
   */
  public static Microsoft.ServiceBus.Messaging.EventData.Builder newBuilder(Microsoft.ServiceBus.Messaging.EventData.Builder other) {
    return new Microsoft.ServiceBus.Messaging.EventData.Builder(other);
  }

  /**
   * Creates a new EventData RecordBuilder by copying an existing EventData instance.
   * @param other The existing instance to copy.
   * @return A new EventData RecordBuilder
   */
  public static Microsoft.ServiceBus.Messaging.EventData.Builder newBuilder(Microsoft.ServiceBus.Messaging.EventData other) {
    return new Microsoft.ServiceBus.Messaging.EventData.Builder(other);
  }

  /**
   * RecordBuilder for EventData instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EventData>
      implements org.apache.avro.data.RecordBuilder<EventData> {

    private long SequenceNumber;
    private java.lang.String Offset;
    private java.lang.String EnqueuedTimeUtc;
    private java.util.Map<java.lang.String,java.lang.Object> SystemProperties;
    private java.util.Map<java.lang.String,java.lang.Object> Properties;
    private java.nio.ByteBuffer Body;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Microsoft.ServiceBus.Messaging.EventData.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.SequenceNumber)) {
        this.SequenceNumber = data().deepCopy(fields()[0].schema(), other.SequenceNumber);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.Offset)) {
        this.Offset = data().deepCopy(fields()[1].schema(), other.Offset);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.EnqueuedTimeUtc)) {
        this.EnqueuedTimeUtc = data().deepCopy(fields()[2].schema(), other.EnqueuedTimeUtc);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.SystemProperties)) {
        this.SystemProperties = data().deepCopy(fields()[3].schema(), other.SystemProperties);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.Properties)) {
        this.Properties = data().deepCopy(fields()[4].schema(), other.Properties);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.Body)) {
        this.Body = data().deepCopy(fields()[5].schema(), other.Body);
        fieldSetFlags()[5] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing EventData instance
     * @param other The existing instance to copy.
     */
    private Builder(Microsoft.ServiceBus.Messaging.EventData other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.SequenceNumber)) {
        this.SequenceNumber = data().deepCopy(fields()[0].schema(), other.SequenceNumber);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.Offset)) {
        this.Offset = data().deepCopy(fields()[1].schema(), other.Offset);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.EnqueuedTimeUtc)) {
        this.EnqueuedTimeUtc = data().deepCopy(fields()[2].schema(), other.EnqueuedTimeUtc);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.SystemProperties)) {
        this.SystemProperties = data().deepCopy(fields()[3].schema(), other.SystemProperties);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.Properties)) {
        this.Properties = data().deepCopy(fields()[4].schema(), other.Properties);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.Body)) {
        this.Body = data().deepCopy(fields()[5].schema(), other.Body);
        fieldSetFlags()[5] = true;
      }
    }

    /**
     * Gets the value of the 'SequenceNumber' field.
     * @return The value.
     */
    public java.lang.Long getSequenceNumber() {
      return SequenceNumber;
    }

    /**
     * Sets the value of the 'SequenceNumber' field.
     * @param value The value of 'SequenceNumber'.
     * @return This builder.
     */
    public Microsoft.ServiceBus.Messaging.EventData.Builder setSequenceNumber(long value) {
      validate(fields()[0], value);
      this.SequenceNumber = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
     * Checks whether the 'SequenceNumber' field has been set.
     * @return True if the 'SequenceNumber' field has been set, false otherwise.
     */
    public boolean hasSequenceNumber() {
      return fieldSetFlags()[0];
    }


    /**
     * Clears the value of the 'SequenceNumber' field.
     * @return This builder.
     */
    public Microsoft.ServiceBus.Messaging.EventData.Builder clearSequenceNumber() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
     * Gets the value of the 'Offset' field.
     * @return The value.
     */
    public java.lang.String getOffset() {
      return Offset;
    }

    /**
     * Sets the value of the 'Offset' field.
     * @param value The value of 'Offset'.
     * @return This builder.
     */
    public Microsoft.ServiceBus.Messaging.EventData.Builder setOffset(java.lang.String value) {
      validate(fields()[1], value);
      this.Offset = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
     * Checks whether the 'Offset' field has been set.
     * @return True if the 'Offset' field has been set, false otherwise.
     */
    public boolean hasOffset() {
      return fieldSetFlags()[1];
    }


    /**
     * Clears the value of the 'Offset' field.
     * @return This builder.
     */
    public Microsoft.ServiceBus.Messaging.EventData.Builder clearOffset() {
      Offset = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
     * Gets the value of the 'EnqueuedTimeUtc' field.
     * @return The value.
     */
    public java.lang.String getEnqueuedTimeUtc() {
      return EnqueuedTimeUtc;
    }

    /**
     * Sets the value of the 'EnqueuedTimeUtc' field.
     * @param value The value of 'EnqueuedTimeUtc'.
     * @return This builder.
     */
    public Microsoft.ServiceBus.Messaging.EventData.Builder setEnqueuedTimeUtc(java.lang.String value) {
      validate(fields()[2], value);
      this.EnqueuedTimeUtc = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
     * Checks whether the 'EnqueuedTimeUtc' field has been set.
     * @return True if the 'EnqueuedTimeUtc' field has been set, false otherwise.
     */
    public boolean hasEnqueuedTimeUtc() {
      return fieldSetFlags()[2];
    }


    /**
     * Clears the value of the 'EnqueuedTimeUtc' field.
     * @return This builder.
     */
    public Microsoft.ServiceBus.Messaging.EventData.Builder clearEnqueuedTimeUtc() {
      EnqueuedTimeUtc = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
     * Gets the value of the 'SystemProperties' field.
     * @return The value.
     */
    public java.util.Map<java.lang.String,java.lang.Object> getSystemProperties() {
      return SystemProperties;
    }

    /**
     * Sets the value of the 'SystemProperties' field.
     * @param value The value of 'SystemProperties'.
     * @return This builder.
     */
    public Microsoft.ServiceBus.Messaging.EventData.Builder setSystemProperties(java.util.Map<java.lang.String,java.lang.Object> value) {
      validate(fields()[3], value);
      this.SystemProperties = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
     * Checks whether the 'SystemProperties' field has been set.
     * @return True if the 'SystemProperties' field has been set, false otherwise.
     */
    public boolean hasSystemProperties() {
      return fieldSetFlags()[3];
    }


    /**
     * Clears the value of the 'SystemProperties' field.
     * @return This builder.
     */
    public Microsoft.ServiceBus.Messaging.EventData.Builder clearSystemProperties() {
      SystemProperties = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
     * Gets the value of the 'Properties' field.
     * @return The value.
     */
    public java.util.Map<java.lang.String,java.lang.Object> getProperties() {
      return Properties;
    }

    /**
     * Sets the value of the 'Properties' field.
     * @param value The value of 'Properties'.
     * @return This builder.
     */
    public Microsoft.ServiceBus.Messaging.EventData.Builder setProperties(java.util.Map<java.lang.String,java.lang.Object> value) {
      validate(fields()[4], value);
      this.Properties = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
     * Checks whether the 'Properties' field has been set.
     * @return True if the 'Properties' field has been set, false otherwise.
     */
    public boolean hasProperties() {
      return fieldSetFlags()[4];
    }


    /**
     * Clears the value of the 'Properties' field.
     * @return This builder.
     */
    public Microsoft.ServiceBus.Messaging.EventData.Builder clearProperties() {
      Properties = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
     * Gets the value of the 'Body' field.
     * @return The value.
     */
    public java.nio.ByteBuffer getBody() {
      return Body;
    }

    /**
     * Sets the value of the 'Body' field.
     * @param value The value of 'Body'.
     * @return This builder.
     */
    public Microsoft.ServiceBus.Messaging.EventData.Builder setBody(java.nio.ByteBuffer value) {
      validate(fields()[5], value);
      this.Body = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
     * Checks whether the 'Body' field has been set.
     * @return True if the 'Body' field has been set, false otherwise.
     */
    public boolean hasBody() {
      return fieldSetFlags()[5];
    }


    /**
     * Clears the value of the 'Body' field.
     * @return This builder.
     */
    public Microsoft.ServiceBus.Messaging.EventData.Builder clearBody() {
      Body = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public EventData build() {
      try {
        EventData record = new EventData();
        record.SequenceNumber = fieldSetFlags()[0] ? this.SequenceNumber : (java.lang.Long) defaultValue(fields()[0]);
        record.Offset = fieldSetFlags()[1] ? this.Offset : (java.lang.String) defaultValue(fields()[1]);
        record.EnqueuedTimeUtc = fieldSetFlags()[2] ? this.EnqueuedTimeUtc : (java.lang.String) defaultValue(fields()[2]);
        record.SystemProperties = fieldSetFlags()[3] ? this.SystemProperties : (java.util.Map<java.lang.String,java.lang.Object>) defaultValue(fields()[3]);
        record.Properties = fieldSetFlags()[4] ? this.Properties : (java.util.Map<java.lang.String,java.lang.Object>) defaultValue(fields()[4]);
        record.Body = fieldSetFlags()[5] ? this.Body : (java.nio.ByteBuffer) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
      WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
      throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
      READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
      throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
