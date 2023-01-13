// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@javax.annotation.Generated(value="flatc")
@SuppressWarnings("unused")
public final class HeartbeatRequest extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_22_10_26(); }
  public static HeartbeatRequest getRootAsHeartbeatRequest(ByteBuffer _bb) { return getRootAsHeartbeatRequest(_bb, new HeartbeatRequest()); }
  public static HeartbeatRequest getRootAsHeartbeatRequest(ByteBuffer _bb, HeartbeatRequest obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public HeartbeatRequest __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }


  public static void startHeartbeatRequest(FlatBufferBuilder builder) { builder.startTable(0); }
  public static int endHeartbeatRequest(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public HeartbeatRequest get(int j) { return get(new HeartbeatRequest(), j); }
    public HeartbeatRequest get(HeartbeatRequest obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public HeartbeatRequestT unpack() {
    HeartbeatRequestT _o = new HeartbeatRequestT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(HeartbeatRequestT _o) {
  }
  public static int pack(FlatBufferBuilder builder, HeartbeatRequestT _o) {
    if (_o == null) return 0;
    startHeartbeatRequest(builder);
    return endHeartbeatRequest(builder);
  }
}

