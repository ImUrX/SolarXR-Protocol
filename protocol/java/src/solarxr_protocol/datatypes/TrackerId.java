// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.datatypes;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class TrackerId extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static TrackerId getRootAsTrackerId(ByteBuffer _bb) { return getRootAsTrackerId(_bb, new TrackerId()); }
  public static TrackerId getRootAsTrackerId(ByteBuffer _bb, TrackerId obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public TrackerId __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  /**
   * The device the tracker is associated with. If there is no hardware device it is
   * associated with, this should be `null`.
   */
  public solarxr_protocol.datatypes.DeviceId deviceId() { return deviceId(new solarxr_protocol.datatypes.DeviceId()); }
  public solarxr_protocol.datatypes.DeviceId deviceId(solarxr_protocol.datatypes.DeviceId obj) { int o = __offset(4); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  /**
   * There are possibly multiple trackers per device. This identifies which one.
   */
  public int trackerNum() { int o = __offset(6); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }

  public static void startTrackerId(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addDeviceId(FlatBufferBuilder builder, int deviceIdOffset) { builder.addStruct(0, deviceIdOffset, 0); }
  public static void addTrackerNum(FlatBufferBuilder builder, int trackerNum) { builder.addByte(1, (byte) trackerNum, (byte) 0); }
  public static int endTrackerId(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public TrackerId get(int j) { return get(new TrackerId(), j); }
    public TrackerId get(TrackerId obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public TrackerIdT unpack() {
    TrackerIdT _o = new TrackerIdT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(TrackerIdT _o) {
    if (deviceId() != null) deviceId().unpackTo(_o.getDeviceId());
    else _o.setDeviceId(null);
    int _oTrackerNum = trackerNum();
    _o.setTrackerNum(_oTrackerNum);
  }
  public static int pack(FlatBufferBuilder builder, TrackerIdT _o) {
    if (_o == null) return 0;
    startTrackerId(builder);
    addDeviceId(builder, solarxr_protocol.datatypes.DeviceId.pack(builder, _o.getDeviceId()));
    addTrackerNum(builder, _o.getTrackerNum());
    return endTrackerId(builder);
  }
}

