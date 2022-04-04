// automatically generated by the FlatBuffers compiler, do not modify

package slimevr_protocol.data_feed;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

public class DataFeedConfigT {
  private int minimumTimeSinceLast;
  private slimevr_protocol.data_feed.DeviceStatusMaskT dataMask;
  private boolean syntheticTrackers;

  public int getMinimumTimeSinceLast() { return minimumTimeSinceLast; }

  public void setMinimumTimeSinceLast(int minimumTimeSinceLast) { this.minimumTimeSinceLast = minimumTimeSinceLast; }

  public slimevr_protocol.data_feed.DeviceStatusMaskT getDataMask() { return dataMask; }

  public void setDataMask(slimevr_protocol.data_feed.DeviceStatusMaskT dataMask) { this.dataMask = dataMask; }

  public boolean getSyntheticTrackers() { return syntheticTrackers; }

  public void setSyntheticTrackers(boolean syntheticTrackers) { this.syntheticTrackers = syntheticTrackers; }


  public DataFeedConfigT() {
    this.minimumTimeSinceLast = 0;
    this.dataMask = null;
    this.syntheticTrackers = false;
  }
}
