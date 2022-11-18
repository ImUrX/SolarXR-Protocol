// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';

import { TopicId, TopicIdT } from '../../solarxr-protocol/pub-sub/topic-id.js';


/**
 * Request to get the `FeatureHandle` from a `FeatureId`. This is useful for reducing
 * bandwidth, since `FeatureId` can be large.
 */
export class TopicHandleRequest implements flatbuffers.IUnpackableObject<TopicHandleRequestT> {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
  __init(i:number, bb:flatbuffers.ByteBuffer):TopicHandleRequest {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

static getRootAsTopicHandleRequest(bb:flatbuffers.ByteBuffer, obj?:TopicHandleRequest):TopicHandleRequest {
  return (obj || new TopicHandleRequest()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static getSizePrefixedRootAsTopicHandleRequest(bb:flatbuffers.ByteBuffer, obj?:TopicHandleRequest):TopicHandleRequest {
  bb.setPosition(bb.position() + flatbuffers.SIZE_PREFIX_LENGTH);
  return (obj || new TopicHandleRequest()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

id(obj?:TopicId):TopicId|null {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? (obj || new TopicId()).__init(this.bb!.__indirect(this.bb_pos + offset), this.bb!) : null;
}

static startTopicHandleRequest(builder:flatbuffers.Builder) {
  builder.startObject(1);
}

static addId(builder:flatbuffers.Builder, idOffset:flatbuffers.Offset) {
  builder.addFieldOffset(0, idOffset, 0);
}

static endTopicHandleRequest(builder:flatbuffers.Builder):flatbuffers.Offset {
  const offset = builder.endObject();
  return offset;
}

static createTopicHandleRequest(builder:flatbuffers.Builder, idOffset:flatbuffers.Offset):flatbuffers.Offset {
  TopicHandleRequest.startTopicHandleRequest(builder);
  TopicHandleRequest.addId(builder, idOffset);
  return TopicHandleRequest.endTopicHandleRequest(builder);
}

unpack(): TopicHandleRequestT {
  return new TopicHandleRequestT(
    (this.id() !== null ? this.id()!.unpack() : null)
  );
}


unpackTo(_o: TopicHandleRequestT): void {
  _o.id = (this.id() !== null ? this.id()!.unpack() : null);
}
}

export class TopicHandleRequestT implements flatbuffers.IGeneratedObject {
constructor(
  public id: TopicIdT|null = null
){}


pack(builder:flatbuffers.Builder): flatbuffers.Offset {
  const id = (this.id !== null ? this.id!.pack(builder) : 0);

  return TopicHandleRequest.createTopicHandleRequest(builder,
    id
  );
}
}