// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.application.data_feed;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

public class DataFeedUpdateT {
  private solarxr_protocol.application.data_feed.device_data.DeviceDataT[] devices;
  private solarxr_protocol.application.data_feed.tracker.TrackerDataT[] syntheticTrackers;
  private solarxr_protocol.application.data_feed.BoneT[] bones;

  public solarxr_protocol.application.data_feed.device_data.DeviceDataT[] getDevices() { return devices; }

  public void setDevices(solarxr_protocol.application.data_feed.device_data.DeviceDataT[] devices) { this.devices = devices; }

  public solarxr_protocol.application.data_feed.tracker.TrackerDataT[] getSyntheticTrackers() { return syntheticTrackers; }

  public void setSyntheticTrackers(solarxr_protocol.application.data_feed.tracker.TrackerDataT[] syntheticTrackers) { this.syntheticTrackers = syntheticTrackers; }

  public solarxr_protocol.application.data_feed.BoneT[] getBones() { return bones; }

  public void setBones(solarxr_protocol.application.data_feed.BoneT[] bones) { this.bones = bones; }


  public DataFeedUpdateT() {
    this.devices = null;
    this.syntheticTrackers = null;
    this.bones = null;
  }
}
