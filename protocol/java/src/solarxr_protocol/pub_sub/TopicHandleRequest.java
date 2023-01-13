// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.pub_sub;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

/**
 * Request to get the `FeatureHandle` from a `FeatureId`. This is useful for reducing
 * bandwidth, since `FeatureId` can be large.
 */
@javax.annotation.Generated(value="flatc")
@SuppressWarnings("unused")
public final class TopicHandleRequest extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_22_10_26(); }
  public static TopicHandleRequest getRootAsTopicHandleRequest(ByteBuffer _bb) { return getRootAsTopicHandleRequest(_bb, new TopicHandleRequest()); }
  public static TopicHandleRequest getRootAsTopicHandleRequest(ByteBuffer _bb, TopicHandleRequest obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public TopicHandleRequest __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public solarxr_protocol.pub_sub.TopicId id() { return id(new solarxr_protocol.pub_sub.TopicId()); }
  public solarxr_protocol.pub_sub.TopicId id(solarxr_protocol.pub_sub.TopicId obj) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createTopicHandleRequest(FlatBufferBuilder builder,
      int idOffset) {
    builder.startTable(1);
    TopicHandleRequest.addId(builder, idOffset);
    return TopicHandleRequest.endTopicHandleRequest(builder);
  }

  public static void startTopicHandleRequest(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addId(FlatBufferBuilder builder, int idOffset) { builder.addOffset(0, idOffset, 0); }
  public static int endTopicHandleRequest(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public TopicHandleRequest get(int j) { return get(new TopicHandleRequest(), j); }
    public TopicHandleRequest get(TopicHandleRequest obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public TopicHandleRequestT unpack() {
    TopicHandleRequestT _o = new TopicHandleRequestT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(TopicHandleRequestT _o) {
    if (id() != null) _o.setId(id().unpack());
    else _o.setId(null);
  }
  public static int pack(FlatBufferBuilder builder, TopicHandleRequestT _o) {
    if (_o == null) return 0;
    int _id = _o.getId() == null ? 0 : solarxr_protocol.pub_sub.TopicId.pack(builder, _o.getId());
    return createTopicHandleRequest(
      builder,
      _id);
  }
}

