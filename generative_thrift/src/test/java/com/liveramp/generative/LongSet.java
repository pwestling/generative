package com.liveramp.generative;

/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;

public class LongSet implements org.apache.thrift.TBase<LongSet, LongSet._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("LongSet");

  private static final org.apache.thrift.protocol.TField LONGS_FIELD_DESC = new org.apache.thrift.protocol.TField("longs", org.apache.thrift.protocol.TType.SET, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new LongSetStandardSchemeFactory());
    schemes.put(TupleScheme.class, new LongSetTupleSchemeFactory());
  }

  private Set<Long> longs; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LONGS((short)1, "longs");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // LONGS
          return LONGS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LONGS, new org.apache.thrift.meta_data.FieldMetaData("longs", org.apache.thrift.TFieldRequirementType.REQUIRED,
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET,
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(LongSet.class, metaDataMap);
  }

  public LongSet() {
  }

  public LongSet(
      Set<Long> longs)
  {
    this();
    this.longs = longs;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LongSet(LongSet other) {
    if (other.is_set_longs()) {
      Set<Long> __this__longs = new HashSet<Long>();
      for (Long other_element : other.longs) {
        __this__longs.add(other_element);
      }
      this.longs = __this__longs;
    }
  }

  public LongSet deepCopy() {
    return new LongSet(this);
  }

  @Override
  public void clear() {
    this.longs = null;
  }

  public int get_longs_size() {
    return (this.longs == null) ? 0 : this.longs.size();
  }

  public java.util.Iterator<Long> get_longs_iterator() {
    return (this.longs == null) ? null : this.longs.iterator();
  }

  public void add_to_longs(long elem) {
    if (this.longs == null) {
      this.longs = new HashSet<Long>();
    }
    this.longs.add(elem);
  }

  public Set<Long> get_longs() {
    return this.longs;
  }

  public LongSet set_longs(Set<Long> longs) {
    this.longs = longs;
    return this;
  }

  public void unset_longs() {
    this.longs = null;
  }

  /** Returns true if field longs is set (has been assigned a value) and false otherwise */
  public boolean is_set_longs() {
    return this.longs != null;
  }

  public void set_longs_isSet(boolean value) {
    if (!value) {
      this.longs = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
      case LONGS:
        if (value == null) {
          unset_longs();
        } else {
          set_longs((Set<Long>)value);
        }
        break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
      case LONGS:
        return get_longs();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
      case LONGS:
        return is_set_longs();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LongSet)
      return this.equals((LongSet)that);
    return false;
  }

  public boolean equals(LongSet that) {
    if (that == null)
      return false;

    boolean this_present_longs = true && this.is_set_longs();
    boolean that_present_longs = true && that.is_set_longs();
    if (this_present_longs || that_present_longs) {
      if (!(this_present_longs && that_present_longs))
        return false;
      if (!this.longs.equals(that.longs))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_longs = true && (is_set_longs());
    builder.append(present_longs);
    if (present_longs)
      builder.append(longs);

    return builder.toHashCode();
  }

  public int compareTo(LongSet other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    LongSet typedOther = (LongSet)other;

    lastComparison = Boolean.valueOf(is_set_longs()).compareTo(typedOther.is_set_longs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_longs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.longs, typedOther.longs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("LongSet(");
    boolean first = true;

    sb.append("longs:");
    if (this.longs == null) {
      sb.append("null");
    } else {
      sb.append(this.longs);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (longs == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'longs' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class LongSetStandardSchemeFactory implements SchemeFactory {
    public LongSetStandardScheme getScheme() {
      return new LongSetStandardScheme();
    }
  }

  private static class LongSetStandardScheme extends StandardScheme<LongSet> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, LongSet struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
          break;
        }
        switch (schemeField.id) {
          case 1: // LONGS
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set32 = iprot.readSetBegin();
                struct.longs = new HashSet<Long>(2*_set32.size);
                for (int _i33 = 0; _i33 < _set32.size; ++_i33)
                {
                  long _elem34; // required
                  _elem34 = iprot.readI64();
                  struct.longs.add(_elem34);
                }
                iprot.readSetEnd();
              }
              struct.set_longs_isSet(true);
            } else {
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, LongSet struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.longs != null) {
        oprot.writeFieldBegin(LONGS_FIELD_DESC);
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I64, struct.longs.size()));
          for (long _iter35 : struct.longs)
          {
            oprot.writeI64(_iter35);
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LongSetTupleSchemeFactory implements SchemeFactory {
    public LongSetTupleScheme getScheme() {
      return new LongSetTupleScheme();
    }
  }

  private static class LongSetTupleScheme extends TupleScheme<LongSet> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, LongSet struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.longs.size());
        for (long _iter36 : struct.longs)
        {
          oprot.writeI64(_iter36);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, LongSet struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TSet _set37 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I64, iprot.readI32());
        struct.longs = new HashSet<Long>(2*_set37.size);
        for (int _i38 = 0; _i38 < _set37.size; ++_i38)
        {
          long _elem39; // required
          _elem39 = iprot.readI64();
          struct.longs.add(_elem39);
        }
      }
      struct.set_longs_isSet(true);
    }
  }

}

