// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.datatypes;

/**
 * Used for filtering tracker rotations in software
 */
@SuppressWarnings("unused")
public final class FilteringType {
  private FilteringType() { }
  public static final int NONE = 0;
  public static final int SMOOTHING = 1;
  public static final int PREDICTION = 2;

  public static final String[] names = { "NONE", "SMOOTHING", "PREDICTION", };

  public static String name(int e) { return names[e]; }
}

