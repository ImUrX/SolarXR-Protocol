// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';

import { HzF32, HzF32T } from '../../../../solarxr-protocol/datatypes/hz-f32';
import { ImuType } from '../../../../solarxr-protocol/datatypes/hardware-info/imu-type';


export class TrackerInfo {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
__init(i:number, bb:flatbuffers.ByteBuffer):TrackerInfo {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

static getRootAsTrackerInfo(bb:flatbuffers.ByteBuffer, obj?:TrackerInfo):TrackerInfo {
  return (obj || new TrackerInfo()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static getSizePrefixedRootAsTrackerInfo(bb:flatbuffers.ByteBuffer, obj?:TrackerInfo):TrackerInfo {
  bb.setPosition(bb.position() + flatbuffers.SIZE_PREFIX_LENGTH);
  return (obj || new TrackerInfo()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

imuType():ImuType {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? this.bb!.readUint16(this.bb_pos + offset) : ImuType.Other;
}

/**
 * average samples per second
 */
pollRate(obj?:HzF32):HzF32|null {
  const offset = this.bb!.__offset(this.bb_pos, 6);
  return offset ? (obj || new HzF32()).__init(this.bb_pos + offset, this.bb!) : null;
}

static startTrackerInfo(builder:flatbuffers.Builder) {
  builder.startObject(2);
}

static addImuType(builder:flatbuffers.Builder, imuType:ImuType) {
  builder.addFieldInt16(0, imuType, ImuType.Other);
}

static addPollRate(builder:flatbuffers.Builder, pollRateOffset:flatbuffers.Offset) {
  builder.addFieldStruct(1, pollRateOffset, 0);
}

static endTrackerInfo(builder:flatbuffers.Builder):flatbuffers.Offset {
  const offset = builder.endObject();
  return offset;
}


unpack(): TrackerInfoT {
  return new TrackerInfoT(
    this.imuType(),
    (this.pollRate() !== null ? this.pollRate()!.unpack() : null)
  );
}


unpackTo(_o: TrackerInfoT): void {
  _o.imuType = this.imuType();
  _o.pollRate = (this.pollRate() !== null ? this.pollRate()!.unpack() : null);
}
}

export class TrackerInfoT {
constructor(
  public imuType: ImuType = ImuType.Other,
  public pollRate: HzF32T|null = null
){}


pack(builder:flatbuffers.Builder): flatbuffers.Offset {
  TrackerInfo.startTrackerInfo(builder);
  TrackerInfo.addImuType(builder, this.imuType);
  TrackerInfo.addPollRate(builder, (this.pollRate !== null ? this.pollRate!.pack(builder) : 0));

  return TrackerInfo.endTrackerInfo(builder);
}
}