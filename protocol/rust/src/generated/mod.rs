// Automatically generated by the Flatbuffers compiler. Do not modify.
pub mod slimevr_protocol {
  use super::*;
  pub mod data_feed {
    use super::*;
    mod poll_data_feed_generated;
    pub use self::poll_data_feed_generated::*;
    mod data_feed_request_generated;
    pub use self::data_feed_request_generated::*;
    mod data_feed_update_generated;
    pub use self::data_feed_update_generated::*;
    mod data_feed_config_generated;
    pub use self::data_feed_config_generated::*;
    mod device_status_mask_generated;
    pub use self::device_status_mask_generated::*;
    mod device_status_generated;
    pub use self::device_status_generated::*;
  } // data_feed
  pub mod datatypes {
    use super::*;
    pub mod hardware_info {
      use super::*;
      mod mcu_type_generated;
      pub use self::mcu_type_generated::*;
      mod imu_type_generated;
      pub use self::imu_type_generated::*;
      mod mac_address_generated;
      pub use self::mac_address_generated::*;
      mod firmware_info_generated;
      pub use self::firmware_info_generated::*;
      mod firmware_info_mask_generated;
      pub use self::firmware_info_mask_generated::*;
      mod firmware_status_generated;
      pub use self::firmware_status_generated::*;
      mod firmware_status_mask_generated;
      pub use self::firmware_status_mask_generated::*;
    } // hardware_info
    pub mod math {
      use super::*;
      mod quat_generated;
      pub use self::quat_generated::*;
      mod vec_3f_generated;
      pub use self::vec_3f_generated::*;
    } // math
    pub mod tracker {
      use super::*;
      mod tracker_status_generated;
      pub use self::tracker_status_generated::*;
      mod tracker_status_mask_generated;
      pub use self::tracker_status_mask_generated::*;
    } // tracker
    mod firmware_error_code_generated;
    pub use self::firmware_error_code_generated::*;
    mod filtering_type_generated;
    pub use self::filtering_type_generated::*;
    mod tracker_role_generated;
    pub use self::tracker_role_generated::*;
    mod acknowledgement_generated;
    pub use self::acknowledgement_generated::*;
    mod log_data_generated;
    pub use self::log_data_generated::*;
  } // datatypes
  pub mod rpc {
    use super::*;
    mod heartbeat_request_generated;
    pub use self::heartbeat_request_generated::*;
    mod reset_request_generated;
    pub use self::reset_request_generated::*;
    mod assign_tracker_request_generated;
    pub use self::assign_tracker_request_generated::*;
    mod settings_request_generated;
    pub use self::settings_request_generated::*;
    mod settings_response_generated;
    pub use self::settings_response_generated::*;
    mod change_settings_request_generated;
    pub use self::change_settings_request_generated::*;
    mod steam_vrtrackers_setting_generated;
    pub use self::steam_vrtrackers_setting_generated::*;
    mod filtering_settings_generated;
    pub use self::filtering_settings_generated::*;
  } // rpc
  mod inbound_union_generated;
  pub use self::inbound_union_generated::*;
  mod outbound_union_generated;
  pub use self::outbound_union_generated::*;
  mod inbound_packet_generated;
  pub use self::inbound_packet_generated::*;
  mod outbound_packet_generated;
  pub use self::outbound_packet_generated::*;
} // slimevr_protocol