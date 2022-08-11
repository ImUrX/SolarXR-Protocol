// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';

import { ServerBoundMessage, unionToServerBoundMessage, unionListToServerBoundMessage } from '../../solarxr-protocol/device/server-bound-message';
import { IChooseYouRequest, IChooseYouRequestT } from '../../solarxr-protocol/device/commands/ichoose-you-request';
import { SetWifiRequest, SetWifiRequestT } from '../../solarxr-protocol/device/commands/set-wifi-request';
import { PollDataFeedRequest, PollDataFeedRequestT } from '../../solarxr-protocol/device/data-feed/poll-data-feed-request';
import { StartDataFeedRequest, StartDataFeedRequestT } from '../../solarxr-protocol/device/data-feed/start-data-feed-request';


export class ServerBoundMessageHeader {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
__init(i:number, bb:flatbuffers.ByteBuffer):ServerBoundMessageHeader {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

static getRootAsServerBoundMessageHeader(bb:flatbuffers.ByteBuffer, obj?:ServerBoundMessageHeader):ServerBoundMessageHeader {
  return (obj || new ServerBoundMessageHeader()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static getSizePrefixedRootAsServerBoundMessageHeader(bb:flatbuffers.ByteBuffer, obj?:ServerBoundMessageHeader):ServerBoundMessageHeader {
  bb.setPosition(bb.position() + flatbuffers.SIZE_PREFIX_LENGTH);
  return (obj || new ServerBoundMessageHeader()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

reqRepType():ServerBoundMessage {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? this.bb!.readUint8(this.bb_pos + offset) : ServerBoundMessage.NONE;
}

reqRep<T extends flatbuffers.Table>(obj:any):any|null {
  const offset = this.bb!.__offset(this.bb_pos, 6);
  return offset ? this.bb!.__union(obj, this.bb_pos + offset) : null;
}

static startServerBoundMessageHeader(builder:flatbuffers.Builder) {
  builder.startObject(2);
}

static addReqRepType(builder:flatbuffers.Builder, reqRepType:ServerBoundMessage) {
  builder.addFieldInt8(0, reqRepType, ServerBoundMessage.NONE);
}

static addReqRep(builder:flatbuffers.Builder, reqRepOffset:flatbuffers.Offset) {
  builder.addFieldOffset(1, reqRepOffset, 0);
}

static endServerBoundMessageHeader(builder:flatbuffers.Builder):flatbuffers.Offset {
  const offset = builder.endObject();
  return offset;
}

static createServerBoundMessageHeader(builder:flatbuffers.Builder, reqRepType:ServerBoundMessage, reqRepOffset:flatbuffers.Offset):flatbuffers.Offset {
  ServerBoundMessageHeader.startServerBoundMessageHeader(builder);
  ServerBoundMessageHeader.addReqRepType(builder, reqRepType);
  ServerBoundMessageHeader.addReqRep(builder, reqRepOffset);
  return ServerBoundMessageHeader.endServerBoundMessageHeader(builder);
}

unpack(): ServerBoundMessageHeaderT {
  return new ServerBoundMessageHeaderT(
    this.reqRepType(),
    (() => {
      let temp = unionToServerBoundMessage(this.reqRepType(), this.reqRep.bind(this));
      if(temp === null) { return null; }
      return temp.unpack()
  })()
  );
}


unpackTo(_o: ServerBoundMessageHeaderT): void {
  _o.reqRepType = this.reqRepType();
  _o.reqRep = (() => {
      let temp = unionToServerBoundMessage(this.reqRepType(), this.reqRep.bind(this));
      if(temp === null) { return null; }
      return temp.unpack()
  })();
}
}

export class ServerBoundMessageHeaderT {
constructor(
  public reqRepType: ServerBoundMessage = ServerBoundMessage.NONE,
  public reqRep: IChooseYouRequestT|PollDataFeedRequestT|SetWifiRequestT|StartDataFeedRequestT|null = null
){}


pack(builder:flatbuffers.Builder): flatbuffers.Offset {
  const reqRep = builder.createObjectOffset(this.reqRep);

  return ServerBoundMessageHeader.createServerBoundMessageHeader(builder,
    this.reqRepType,
    reqRep
  );
}
}