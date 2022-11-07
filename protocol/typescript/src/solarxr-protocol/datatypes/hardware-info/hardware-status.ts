// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';

import { FirmwareErrorCode } from '../../../solarxr-protocol/datatypes/firmware-error-code';
import { LogData, LogDataT } from '../../../solarxr-protocol/datatypes/log-data';


/**
 * Mostly-dynamic status info about a tracked device's firmware
 */
export class HardwareStatus {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
__init(i:number, bb:flatbuffers.ByteBuffer):HardwareStatus {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

static getRootAsHardwareStatus(bb:flatbuffers.ByteBuffer, obj?:HardwareStatus):HardwareStatus {
  return (obj || new HardwareStatus()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static getSizePrefixedRootAsHardwareStatus(bb:flatbuffers.ByteBuffer, obj?:HardwareStatus):HardwareStatus {
  bb.setPosition(bb.position() + flatbuffers.SIZE_PREFIX_LENGTH);
  return (obj || new HardwareStatus()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

errorStatus():FirmwareErrorCode|null {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? this.bb!.readUint8(this.bb_pos + offset) : null;
}

tps():number|null {
  const offset = this.bb!.__offset(this.bb_pos, 6);
  return offset ? this.bb!.readUint8(this.bb_pos + offset) : null;
}

ping():number|null {
  const offset = this.bb!.__offset(this.bb_pos, 8);
  return offset ? this.bb!.readUint16(this.bb_pos + offset) : null;
}

/**
 * “Received Signal Strength Indicator" between device and wifi adapter in dBm
 */
rssi():number|null {
  const offset = this.bb!.__offset(this.bb_pos, 10);
  return offset ? this.bb!.readInt16(this.bb_pos + offset) : null;
}

/**
 * Temperature in degrees celsius
 */
mcuTemp():number|null {
  const offset = this.bb!.__offset(this.bb_pos, 12);
  return offset ? this.bb!.readFloat32(this.bb_pos + offset) : null;
}

batteryVoltage():number|null {
  const offset = this.bb!.__offset(this.bb_pos, 14);
  return offset ? this.bb!.readFloat32(this.bb_pos + offset) : null;
}

batteryPctEstimate():number|null {
  const offset = this.bb!.__offset(this.bb_pos, 16);
  return offset ? this.bb!.readUint8(this.bb_pos + offset) : null;
}

logData(obj?:LogData):LogData|null {
  const offset = this.bb!.__offset(this.bb_pos, 18);
  return offset ? (obj || new LogData()).__init(this.bb!.__indirect(this.bb_pos + offset), this.bb!) : null;
}

static startHardwareStatus(builder:flatbuffers.Builder) {
  builder.startObject(8);
}

static addErrorStatus(builder:flatbuffers.Builder, errorStatus:FirmwareErrorCode) {
  builder.addFieldInt8(0, errorStatus, 0);
}

static addTps(builder:flatbuffers.Builder, tps:number) {
  builder.addFieldInt8(1, tps, 0);
}

static addPing(builder:flatbuffers.Builder, ping:number) {
  builder.addFieldInt16(2, ping, 0);
}

static addRssi(builder:flatbuffers.Builder, rssi:number) {
  builder.addFieldInt16(3, rssi, 0);
}

static addMcuTemp(builder:flatbuffers.Builder, mcuTemp:number) {
  builder.addFieldFloat32(4, mcuTemp, 0);
}

static addBatteryVoltage(builder:flatbuffers.Builder, batteryVoltage:number) {
  builder.addFieldFloat32(5, batteryVoltage, 0);
}

static addBatteryPctEstimate(builder:flatbuffers.Builder, batteryPctEstimate:number) {
  builder.addFieldInt8(6, batteryPctEstimate, 0);
}

static addLogData(builder:flatbuffers.Builder, logDataOffset:flatbuffers.Offset) {
  builder.addFieldOffset(7, logDataOffset, 0);
}

static endHardwareStatus(builder:flatbuffers.Builder):flatbuffers.Offset {
  const offset = builder.endObject();
  return offset;
}


unpack(): HardwareStatusT {
  return new HardwareStatusT(
    this.errorStatus(),
    this.tps(),
    this.ping(),
    this.rssi(),
    this.mcuTemp(),
    this.batteryVoltage(),
    this.batteryPctEstimate(),
    (this.logData() !== null ? this.logData()!.unpack() : null)
  );
}


unpackTo(_o: HardwareStatusT): void {
  _o.errorStatus = this.errorStatus();
  _o.tps = this.tps();
  _o.ping = this.ping();
  _o.rssi = this.rssi();
  _o.mcuTemp = this.mcuTemp();
  _o.batteryVoltage = this.batteryVoltage();
  _o.batteryPctEstimate = this.batteryPctEstimate();
  _o.logData = (this.logData() !== null ? this.logData()!.unpack() : null);
}
}

export class HardwareStatusT {
constructor(
  public errorStatus: FirmwareErrorCode|null = null,
  public tps: number|null = null,
  public ping: number|null = null,
  public rssi: number|null = null,
  public mcuTemp: number|null = null,
  public batteryVoltage: number|null = null,
  public batteryPctEstimate: number|null = null,
  public logData: LogDataT|null = null
){}


pack(builder:flatbuffers.Builder): flatbuffers.Offset {
  const logData = (this.logData !== null ? this.logData!.pack(builder) : 0);

  HardwareStatus.startHardwareStatus(builder);
  if (this.errorStatus !== null)
    HardwareStatus.addErrorStatus(builder, this.errorStatus);
  if (this.tps !== null)
    HardwareStatus.addTps(builder, this.tps);
  if (this.ping !== null)
    HardwareStatus.addPing(builder, this.ping);
  if (this.rssi !== null)
    HardwareStatus.addRssi(builder, this.rssi);
  if (this.mcuTemp !== null)
    HardwareStatus.addMcuTemp(builder, this.mcuTemp);
  if (this.batteryVoltage !== null)
    HardwareStatus.addBatteryVoltage(builder, this.batteryVoltage);
  if (this.batteryPctEstimate !== null)
    HardwareStatus.addBatteryPctEstimate(builder, this.batteryPctEstimate);
  HardwareStatus.addLogData(builder, logData);

  return HardwareStatus.endHardwareStatus(builder);
}
}
