// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.data_feed;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@javax.annotation.Generated(value="flatc")
@SuppressWarnings("unused")
public final class DataFeedMessageHeader extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_22_10_26(); }
  public static DataFeedMessageHeader getRootAsDataFeedMessageHeader(ByteBuffer _bb) { return getRootAsDataFeedMessageHeader(_bb, new DataFeedMessageHeader()); }
  public static DataFeedMessageHeader getRootAsDataFeedMessageHeader(ByteBuffer _bb, DataFeedMessageHeader obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public DataFeedMessageHeader __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public byte messageType() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public Table message(Table obj) { int o = __offset(6); return o != 0 ? __union(obj, o + bb_pos) : null; }

  public static int createDataFeedMessageHeader(FlatBufferBuilder builder,
      byte messageType,
      int messageOffset) {
    builder.startTable(2);
    DataFeedMessageHeader.addMessage(builder, messageOffset);
    DataFeedMessageHeader.addMessageType(builder, messageType);
    return DataFeedMessageHeader.endDataFeedMessageHeader(builder);
  }

  public static void startDataFeedMessageHeader(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addMessageType(FlatBufferBuilder builder, byte messageType) { builder.addByte(0, messageType, 0); }
  public static void addMessage(FlatBufferBuilder builder, int messageOffset) { builder.addOffset(1, messageOffset, 0); }
  public static int endDataFeedMessageHeader(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public DataFeedMessageHeader get(int j) { return get(new DataFeedMessageHeader(), j); }
    public DataFeedMessageHeader get(DataFeedMessageHeader obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public DataFeedMessageHeaderT unpack() {
    DataFeedMessageHeaderT _o = new DataFeedMessageHeaderT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(DataFeedMessageHeaderT _o) {
    solarxr_protocol.data_feed.DataFeedMessageUnion _oMessage = new solarxr_protocol.data_feed.DataFeedMessageUnion();
    byte _oMessageType = messageType();
    _oMessage.setType(_oMessageType);
    Table _oMessageValue;
    switch (_oMessageType) {
      case solarxr_protocol.data_feed.DataFeedMessage.PollDataFeed:
        _oMessageValue = message(new solarxr_protocol.data_feed.PollDataFeed());
        _oMessage.setValue(_oMessageValue != null ? ((solarxr_protocol.data_feed.PollDataFeed) _oMessageValue).unpack() : null);
        break;
      case solarxr_protocol.data_feed.DataFeedMessage.StartDataFeed:
        _oMessageValue = message(new solarxr_protocol.data_feed.StartDataFeed());
        _oMessage.setValue(_oMessageValue != null ? ((solarxr_protocol.data_feed.StartDataFeed) _oMessageValue).unpack() : null);
        break;
      case solarxr_protocol.data_feed.DataFeedMessage.DataFeedUpdate:
        _oMessageValue = message(new solarxr_protocol.data_feed.DataFeedUpdate());
        _oMessage.setValue(_oMessageValue != null ? ((solarxr_protocol.data_feed.DataFeedUpdate) _oMessageValue).unpack() : null);
        break;
      case solarxr_protocol.data_feed.DataFeedMessage.DataFeedConfig:
        _oMessageValue = message(new solarxr_protocol.data_feed.DataFeedConfig());
        _oMessage.setValue(_oMessageValue != null ? ((solarxr_protocol.data_feed.DataFeedConfig) _oMessageValue).unpack() : null);
        break;
      default: break;
    }
    _o.setMessage(_oMessage);
  }
  public static int pack(FlatBufferBuilder builder, DataFeedMessageHeaderT _o) {
    if (_o == null) return 0;
    byte _messageType = _o.getMessage() == null ? solarxr_protocol.data_feed.DataFeedMessage.NONE : _o.getMessage().getType();
    int _message = _o.getMessage() == null ? 0 : solarxr_protocol.data_feed.DataFeedMessageUnion.pack(builder, _o.getMessage());
    return createDataFeedMessageHeader(
      builder,
      _messageType,
      _message);
  }
}

