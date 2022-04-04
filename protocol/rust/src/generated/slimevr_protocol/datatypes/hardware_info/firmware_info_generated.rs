// automatically generated by the FlatBuffers compiler, do not modify
extern crate flatbuffers;
use std::mem;
use std::cmp::Ordering;
use self::flatbuffers::{EndianScalar, Follow};
use super::*;
pub enum FirmwareInfoOffset {}
#[derive(Copy, Clone, PartialEq)]

/// Mostly static info about the device's hardware/firmware.
pub struct FirmwareInfo<'a> {
  pub _tab: flatbuffers::Table<'a>,
}

impl<'a> flatbuffers::Follow<'a> for FirmwareInfo<'a> {
  type Inner = FirmwareInfo<'a>;
  #[inline]
  fn follow(buf: &'a [u8], loc: usize) -> Self::Inner {
    Self { _tab: flatbuffers::Table { buf, loc } }
  }
}

impl<'a> FirmwareInfo<'a> {
  pub const VT_MCU_ID: flatbuffers::VOffsetT = 4;
  pub const VT_IMU_IDS: flatbuffers::VOffsetT = 6;
  pub const VT_DISPLAY_NAME: flatbuffers::VOffsetT = 8;
  pub const VT_MODEL: flatbuffers::VOffsetT = 10;
  pub const VT_MANUFACTURER: flatbuffers::VOffsetT = 12;
  pub const VT_HARDWARE_REVISION: flatbuffers::VOffsetT = 14;
  pub const VT_FIRMWARE_VERSION: flatbuffers::VOffsetT = 16;
  pub const VT_MAC_ADDRESS: flatbuffers::VOffsetT = 18;

  #[inline]
  pub fn init_from_table(table: flatbuffers::Table<'a>) -> Self {
    FirmwareInfo { _tab: table }
  }
  #[allow(unused_mut)]
  pub fn create<'bldr: 'args, 'args: 'mut_bldr, 'mut_bldr>(
    _fbb: &'mut_bldr mut flatbuffers::FlatBufferBuilder<'bldr>,
    args: &'args FirmwareInfoArgs<'args>
  ) -> flatbuffers::WIPOffset<FirmwareInfo<'bldr>> {
    let mut builder = FirmwareInfoBuilder::new(_fbb);
    if let Some(x) = args.mac_address { builder.add_mac_address(x); }
    if let Some(x) = args.firmware_version { builder.add_firmware_version(x); }
    if let Some(x) = args.hardware_revision { builder.add_hardware_revision(x); }
    if let Some(x) = args.manufacturer { builder.add_manufacturer(x); }
    if let Some(x) = args.model { builder.add_model(x); }
    if let Some(x) = args.display_name { builder.add_display_name(x); }
    if let Some(x) = args.imu_ids { builder.add_imu_ids(x); }
    builder.add_mcu_id(args.mcu_id);
    builder.finish()
  }


  #[inline]
  pub fn mcu_id(&self) -> McuType {
    self._tab.get::<McuType>(FirmwareInfo::VT_MCU_ID, Some(McuType::Other)).unwrap()
  }
  /// The Imu types, enumerated in the same order that they are referred to in
  /// the firmware.
  #[inline]
  pub fn imu_ids(&self) -> Option<flatbuffers::Vector<'a, ImuType>> {
    self._tab.get::<flatbuffers::ForwardsUOffset<flatbuffers::Vector<'a, ImuType>>>(FirmwareInfo::VT_IMU_IDS, None)
  }
  /// A human-friendly name to display as the name of the device.
  #[inline]
  pub fn display_name(&self) -> Option<&'a str> {
    self._tab.get::<flatbuffers::ForwardsUOffset<&str>>(FirmwareInfo::VT_DISPLAY_NAME, None)
  }
  /// A human-friendly string for the device model.
  #[inline]
  pub fn model(&self) -> Option<&'a str> {
    self._tab.get::<flatbuffers::ForwardsUOffset<&str>>(FirmwareInfo::VT_MODEL, None)
  }
  /// A human-friendly string for the manufacturer of the device.
  #[inline]
  pub fn manufacturer(&self) -> Option<&'a str> {
    self._tab.get::<flatbuffers::ForwardsUOffset<&str>>(FirmwareInfo::VT_MANUFACTURER, None)
  }
  /// The hardware version of the device. For example, pcb version.
  #[inline]
  pub fn hardware_revision(&self) -> Option<&'a str> {
    self._tab.get::<flatbuffers::ForwardsUOffset<&str>>(FirmwareInfo::VT_HARDWARE_REVISION, None)
  }
  /// The version of the slimevr firmware that the device is running.
  #[inline]
  pub fn firmware_version(&self) -> Option<&'a str> {
    self._tab.get::<flatbuffers::ForwardsUOffset<&str>>(FirmwareInfo::VT_FIRMWARE_VERSION, None)
  }
  #[inline]
  pub fn mac_address(&self) -> Option<&'a MacAddress> {
    self._tab.get::<MacAddress>(FirmwareInfo::VT_MAC_ADDRESS, None)
  }
}

impl flatbuffers::Verifiable for FirmwareInfo<'_> {
  #[inline]
  fn run_verifier(
    v: &mut flatbuffers::Verifier, pos: usize
  ) -> Result<(), flatbuffers::InvalidFlatbuffer> {
    use self::flatbuffers::Verifiable;
    v.visit_table(pos)?
     .visit_field::<McuType>("mcu_id", Self::VT_MCU_ID, false)?
     .visit_field::<flatbuffers::ForwardsUOffset<flatbuffers::Vector<'_, ImuType>>>("imu_ids", Self::VT_IMU_IDS, false)?
     .visit_field::<flatbuffers::ForwardsUOffset<&str>>("display_name", Self::VT_DISPLAY_NAME, false)?
     .visit_field::<flatbuffers::ForwardsUOffset<&str>>("model", Self::VT_MODEL, false)?
     .visit_field::<flatbuffers::ForwardsUOffset<&str>>("manufacturer", Self::VT_MANUFACTURER, false)?
     .visit_field::<flatbuffers::ForwardsUOffset<&str>>("hardware_revision", Self::VT_HARDWARE_REVISION, false)?
     .visit_field::<flatbuffers::ForwardsUOffset<&str>>("firmware_version", Self::VT_FIRMWARE_VERSION, false)?
     .visit_field::<MacAddress>("mac_address", Self::VT_MAC_ADDRESS, false)?
     .finish();
    Ok(())
  }
}
pub struct FirmwareInfoArgs<'a> {
    pub mcu_id: McuType,
    pub imu_ids: Option<flatbuffers::WIPOffset<flatbuffers::Vector<'a, ImuType>>>,
    pub display_name: Option<flatbuffers::WIPOffset<&'a str>>,
    pub model: Option<flatbuffers::WIPOffset<&'a str>>,
    pub manufacturer: Option<flatbuffers::WIPOffset<&'a str>>,
    pub hardware_revision: Option<flatbuffers::WIPOffset<&'a str>>,
    pub firmware_version: Option<flatbuffers::WIPOffset<&'a str>>,
    pub mac_address: Option<&'a MacAddress>,
}
impl<'a> Default for FirmwareInfoArgs<'a> {
  #[inline]
  fn default() -> Self {
    FirmwareInfoArgs {
      mcu_id: McuType::Other,
      imu_ids: None,
      display_name: None,
      model: None,
      manufacturer: None,
      hardware_revision: None,
      firmware_version: None,
      mac_address: None,
    }
  }
}

pub struct FirmwareInfoBuilder<'a: 'b, 'b> {
  fbb_: &'b mut flatbuffers::FlatBufferBuilder<'a>,
  start_: flatbuffers::WIPOffset<flatbuffers::TableUnfinishedWIPOffset>,
}
impl<'a: 'b, 'b> FirmwareInfoBuilder<'a, 'b> {
  #[inline]
  pub fn add_mcu_id(&mut self, mcu_id: McuType) {
    self.fbb_.push_slot::<McuType>(FirmwareInfo::VT_MCU_ID, mcu_id, McuType::Other);
  }
  #[inline]
  pub fn add_imu_ids(&mut self, imu_ids: flatbuffers::WIPOffset<flatbuffers::Vector<'b , ImuType>>) {
    self.fbb_.push_slot_always::<flatbuffers::WIPOffset<_>>(FirmwareInfo::VT_IMU_IDS, imu_ids);
  }
  #[inline]
  pub fn add_display_name(&mut self, display_name: flatbuffers::WIPOffset<&'b  str>) {
    self.fbb_.push_slot_always::<flatbuffers::WIPOffset<_>>(FirmwareInfo::VT_DISPLAY_NAME, display_name);
  }
  #[inline]
  pub fn add_model(&mut self, model: flatbuffers::WIPOffset<&'b  str>) {
    self.fbb_.push_slot_always::<flatbuffers::WIPOffset<_>>(FirmwareInfo::VT_MODEL, model);
  }
  #[inline]
  pub fn add_manufacturer(&mut self, manufacturer: flatbuffers::WIPOffset<&'b  str>) {
    self.fbb_.push_slot_always::<flatbuffers::WIPOffset<_>>(FirmwareInfo::VT_MANUFACTURER, manufacturer);
  }
  #[inline]
  pub fn add_hardware_revision(&mut self, hardware_revision: flatbuffers::WIPOffset<&'b  str>) {
    self.fbb_.push_slot_always::<flatbuffers::WIPOffset<_>>(FirmwareInfo::VT_HARDWARE_REVISION, hardware_revision);
  }
  #[inline]
  pub fn add_firmware_version(&mut self, firmware_version: flatbuffers::WIPOffset<&'b  str>) {
    self.fbb_.push_slot_always::<flatbuffers::WIPOffset<_>>(FirmwareInfo::VT_FIRMWARE_VERSION, firmware_version);
  }
  #[inline]
  pub fn add_mac_address(&mut self, mac_address: &MacAddress) {
    self.fbb_.push_slot_always::<&MacAddress>(FirmwareInfo::VT_MAC_ADDRESS, mac_address);
  }
  #[inline]
  pub fn new(_fbb: &'b mut flatbuffers::FlatBufferBuilder<'a>) -> FirmwareInfoBuilder<'a, 'b> {
    let start = _fbb.start_table();
    FirmwareInfoBuilder {
      fbb_: _fbb,
      start_: start,
    }
  }
  #[inline]
  pub fn finish(self) -> flatbuffers::WIPOffset<FirmwareInfo<'a>> {
    let o = self.fbb_.end_table(self.start_);
    flatbuffers::WIPOffset::new(o.value())
  }
}

impl std::fmt::Debug for FirmwareInfo<'_> {
  fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
    let mut ds = f.debug_struct("FirmwareInfo");
      ds.field("mcu_id", &self.mcu_id());
      ds.field("imu_ids", &self.imu_ids());
      ds.field("display_name", &self.display_name());
      ds.field("model", &self.model());
      ds.field("manufacturer", &self.manufacturer());
      ds.field("hardware_revision", &self.hardware_revision());
      ds.field("firmware_version", &self.firmware_version());
      ds.field("mac_address", &self.mac_address());
      ds.finish()
  }
}