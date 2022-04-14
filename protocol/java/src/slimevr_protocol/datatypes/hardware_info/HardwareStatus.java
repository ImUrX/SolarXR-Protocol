// automatically generated by the FlatBuffers compiler, do not modify

package slimevr_protocol.datatypes.hardware_info;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

/**
 * Mostly-dynamic status info about a tracked device's firmware
 */
@SuppressWarnings("unused")
public final class HardwareStatus extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static HardwareStatus getRootAsHardwareStatus(ByteBuffer _bb) { return getRootAsHardwareStatus(_bb, new HardwareStatus()); }
  public static HardwareStatus getRootAsHardwareStatus(ByteBuffer _bb, HardwareStatus obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public HardwareStatus __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public boolean hasErrorStatus() { return 0 != __offset(4); }
  public int errorStatus() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean hasTps() { return 0 != __offset(6); }
  public int tps() { int o = __offset(6); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean hasPing() { return 0 != __offset(8); }
  public int ping() { int o = __offset(8); return o != 0 ? bb.getShort(o + bb_pos) & 0xFFFF : 0; }
  /**
   * “Received Signal Strength Indicator" between device and wifi adapter in dBm
   */
  public boolean hasRssi() { return 0 != __offset(10); }
  public short rssi() { int o = __offset(10); return o != 0 ? bb.getShort(o + bb_pos) : 0; }
  /**
   * Temperature in degrees celsius
   */
  public boolean hasMcuTemp() { return 0 != __offset(12); }
  public float mcuTemp() { int o = __offset(12); return o != 0 ? bb.getFloat(o + bb_pos) : 0f; }
  public boolean hasBatteryVoltage() { return 0 != __offset(14); }
  public float batteryVoltage() { int o = __offset(14); return o != 0 ? bb.getFloat(o + bb_pos) : 0f; }
  public boolean hasBatteryPctEstimate() { return 0 != __offset(16); }
  public int batteryPctEstimate() { int o = __offset(16); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public slimevr_protocol.datatypes.LogData logData() { return logData(new slimevr_protocol.datatypes.LogData()); }
  public slimevr_protocol.datatypes.LogData logData(slimevr_protocol.datatypes.LogData obj) { int o = __offset(18); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createHardwareStatus(FlatBufferBuilder builder,
      int errorStatus,
      int tps,
      int ping,
      short rssi,
      float mcuTemp,
      float batteryVoltage,
      int batteryPctEstimate,
      int logDataOffset) {
    builder.startTable(8);
    HardwareStatus.addLogData(builder, logDataOffset);
    HardwareStatus.addBatteryVoltage(builder, batteryVoltage);
    HardwareStatus.addMcuTemp(builder, mcuTemp);
    HardwareStatus.addRssi(builder, rssi);
    HardwareStatus.addPing(builder, ping);
    HardwareStatus.addBatteryPctEstimate(builder, batteryPctEstimate);
    HardwareStatus.addTps(builder, tps);
    HardwareStatus.addErrorStatus(builder, errorStatus);
    return HardwareStatus.endHardwareStatus(builder);
  }

  public static void startHardwareStatus(FlatBufferBuilder builder) { builder.startTable(8); }
  public static void addErrorStatus(FlatBufferBuilder builder, int errorStatus) { builder.addByte(0, (byte) errorStatus, (byte) 0); }
  public static void addTps(FlatBufferBuilder builder, int tps) { builder.addByte(1, (byte) tps, (byte) 0); }
  public static void addPing(FlatBufferBuilder builder, int ping) { builder.addShort(2, (short) ping, (short) 0); }
  public static void addRssi(FlatBufferBuilder builder, short rssi) { builder.addShort(3, rssi, 0); }
  public static void addMcuTemp(FlatBufferBuilder builder, float mcuTemp) { builder.addFloat(4, mcuTemp, 0f); }
  public static void addBatteryVoltage(FlatBufferBuilder builder, float batteryVoltage) { builder.addFloat(5, batteryVoltage, 0f); }
  public static void addBatteryPctEstimate(FlatBufferBuilder builder, int batteryPctEstimate) { builder.addByte(6, (byte) batteryPctEstimate, (byte) 0); }
  public static void addLogData(FlatBufferBuilder builder, int logDataOffset) { builder.addOffset(7, logDataOffset, 0); }
  public static int endHardwareStatus(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public HardwareStatus get(int j) { return get(new HardwareStatus(), j); }
    public HardwareStatus get(HardwareStatus obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public HardwareStatusT unpack() {
    HardwareStatusT _o = new HardwareStatusT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(HardwareStatusT _o) {
    Integer _oErrorStatus = hasErrorStatus() ? errorStatus() : null;
    _o.setErrorStatus(_oErrorStatus);
    Integer _oTps = hasTps() ? tps() : null;
    _o.setTps(_oTps);
    Integer _oPing = hasPing() ? ping() : null;
    _o.setPing(_oPing);
    Short _oRssi = hasRssi() ? rssi() : null;
    _o.setRssi(_oRssi);
    Float _oMcuTemp = hasMcuTemp() ? mcuTemp() : null;
    _o.setMcuTemp(_oMcuTemp);
    Float _oBatteryVoltage = hasBatteryVoltage() ? batteryVoltage() : null;
    _o.setBatteryVoltage(_oBatteryVoltage);
    Integer _oBatteryPctEstimate = hasBatteryPctEstimate() ? batteryPctEstimate() : null;
    _o.setBatteryPctEstimate(_oBatteryPctEstimate);
    if (logData() != null) _o.setLogData(logData().unpack());
    else _o.setLogData(null);
  }
  public static int pack(FlatBufferBuilder builder, HardwareStatusT _o) {
    if (_o == null) return 0;
    int _log_data = _o.getLogData() == null ? 0 : slimevr_protocol.datatypes.LogData.pack(builder, _o.getLogData());
    return createHardwareStatus(
      builder,
      _o.getErrorStatus(),
      _o.getTps(),
      _o.getPing(),
      _o.getRssi(),
      _o.getMcuTemp(),
      _o.getBatteryVoltage(),
      _o.getBatteryPctEstimate(),
      _log_data);
  }
}
