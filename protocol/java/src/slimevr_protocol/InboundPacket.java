// automatically generated by the FlatBuffers compiler, do not modify

package slimevr_protocol;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class InboundPacket extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static InboundPacket getRootAsInboundPacket(ByteBuffer _bb) { return getRootAsInboundPacket(_bb, new InboundPacket()); }
  public static InboundPacket getRootAsInboundPacket(ByteBuffer _bb, InboundPacket obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public InboundPacket __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public boolean acknowledgeMe() { int o = __offset(4); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public byte packetType() { int o = __offset(6); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public Table packet(Table obj) { int o = __offset(8); return o != 0 ? __union(obj, o + bb_pos) : null; }

  public static int createInboundPacket(FlatBufferBuilder builder,
      boolean acknowledgeMe,
      byte packetType,
      int packetOffset) {
    builder.startTable(3);
    InboundPacket.addPacket(builder, packetOffset);
    InboundPacket.addPacketType(builder, packetType);
    InboundPacket.addAcknowledgeMe(builder, acknowledgeMe);
    return InboundPacket.endInboundPacket(builder);
  }

  public static void startInboundPacket(FlatBufferBuilder builder) { builder.startTable(3); }
  public static void addAcknowledgeMe(FlatBufferBuilder builder, boolean acknowledgeMe) { builder.addBoolean(0, acknowledgeMe, false); }
  public static void addPacketType(FlatBufferBuilder builder, byte packetType) { builder.addByte(1, packetType, 0); }
  public static void addPacket(FlatBufferBuilder builder, int packetOffset) { builder.addOffset(2, packetOffset, 0); }
  public static int endInboundPacket(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public InboundPacket get(int j) { return get(new InboundPacket(), j); }
    public InboundPacket get(InboundPacket obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public InboundPacketT unpack() {
    InboundPacketT _o = new InboundPacketT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(InboundPacketT _o) {
    boolean _oAcknowledgeMe = acknowledgeMe();
    _o.setAcknowledgeMe(_oAcknowledgeMe);
    slimevr_protocol.InboundUnionUnion _oPacket = new slimevr_protocol.InboundUnionUnion();
    byte _oPacketType = packetType();
    _oPacket.setType(_oPacketType);
    Table _oPacketValue;
    switch (_oPacketType) {
      case slimevr_protocol.InboundUnion.slimevr_protocol_rpc_HeartbeatRequest:
        _oPacketValue = packet(new slimevr_protocol.rpc.HeartbeatRequest());
        _oPacket.setValue(_oPacketValue != null ? ((slimevr_protocol.rpc.HeartbeatRequest) _oPacketValue).unpack() : null);
        break;
      case slimevr_protocol.InboundUnion.slimevr_protocol_rpc_ResetRequest:
        _oPacketValue = packet(new slimevr_protocol.rpc.ResetRequest());
        _oPacket.setValue(_oPacketValue != null ? ((slimevr_protocol.rpc.ResetRequest) _oPacketValue).unpack() : null);
        break;
      case slimevr_protocol.InboundUnion.slimevr_protocol_rpc_AssignTrackerRequest:
        _oPacketValue = packet(new slimevr_protocol.rpc.AssignTrackerRequest());
        _oPacket.setValue(_oPacketValue != null ? ((slimevr_protocol.rpc.AssignTrackerRequest) _oPacketValue).unpack() : null);
        break;
      case slimevr_protocol.InboundUnion.slimevr_protocol_rpc_SettingsRequest:
        _oPacketValue = packet(new slimevr_protocol.rpc.SettingsRequest());
        _oPacket.setValue(_oPacketValue != null ? ((slimevr_protocol.rpc.SettingsRequest) _oPacketValue).unpack() : null);
        break;
      case slimevr_protocol.InboundUnion.slimevr_protocol_rpc_ChangeSettingsRequest:
        _oPacketValue = packet(new slimevr_protocol.rpc.ChangeSettingsRequest());
        _oPacket.setValue(_oPacketValue != null ? ((slimevr_protocol.rpc.ChangeSettingsRequest) _oPacketValue).unpack() : null);
        break;
      case slimevr_protocol.InboundUnion.slimevr_protocol_data_feed_PollDataFeed:
        _oPacketValue = packet(new slimevr_protocol.data_feed.PollDataFeed());
        _oPacket.setValue(_oPacketValue != null ? ((slimevr_protocol.data_feed.PollDataFeed) _oPacketValue).unpack() : null);
        break;
      case slimevr_protocol.InboundUnion.slimevr_protocol_data_feed_DataFeedRequest:
        _oPacketValue = packet(new slimevr_protocol.data_feed.DataFeedRequest());
        _oPacket.setValue(_oPacketValue != null ? ((slimevr_protocol.data_feed.DataFeedRequest) _oPacketValue).unpack() : null);
        break;
      case slimevr_protocol.InboundUnion.slimevr_protocol_data_feed_DataFeedUpdate:
        _oPacketValue = packet(new slimevr_protocol.data_feed.DataFeedUpdate());
        _oPacket.setValue(_oPacketValue != null ? ((slimevr_protocol.data_feed.DataFeedUpdate) _oPacketValue).unpack() : null);
        break;
      default: break;
    }
    _o.setPacket(_oPacket);
  }
  public static int pack(FlatBufferBuilder builder, InboundPacketT _o) {
    if (_o == null) return 0;
    byte _packetType = _o.getPacket() == null ? slimevr_protocol.InboundUnion.NONE : _o.getPacket().getType();
    int _packet = _o.getPacket() == null ? 0 : slimevr_protocol.InboundUnionUnion.pack(builder, _o.getPacket());
    return createInboundPacket(
      builder,
      _o.getAcknowledgeMe(),
      _packetType,
      _packet);
  }
}
