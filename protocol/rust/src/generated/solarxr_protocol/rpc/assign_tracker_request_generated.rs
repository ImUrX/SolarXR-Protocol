// automatically generated by the FlatBuffers compiler, do not modify
extern crate flatbuffers;
use std::mem;
use std::cmp::Ordering;
use self::flatbuffers::{EndianScalar, Follow};
use super::*;
pub enum AssignTrackerRequestOffset {}
#[derive(Copy, Clone, PartialEq)]

pub struct AssignTrackerRequest<'a> {
  pub _tab: flatbuffers::Table<'a>,
}

impl<'a> flatbuffers::Follow<'a> for AssignTrackerRequest<'a> {
  type Inner = AssignTrackerRequest<'a>;
  #[inline]
  fn follow(buf: &'a [u8], loc: usize) -> Self::Inner {
    Self { _tab: flatbuffers::Table { buf, loc } }
  }
}

impl<'a> AssignTrackerRequest<'a> {
  pub const VT_TRACKER_ID: flatbuffers::VOffsetT = 4;
  pub const VT_BODY_POSITION: flatbuffers::VOffsetT = 6;
  pub const VT_MOUNTING_ROTATION: flatbuffers::VOffsetT = 8;

  #[inline]
  pub fn init_from_table(table: flatbuffers::Table<'a>) -> Self {
    AssignTrackerRequest { _tab: table }
  }
  #[allow(unused_mut)]
  pub fn create<'bldr: 'args, 'args: 'mut_bldr, 'mut_bldr>(
    _fbb: &'mut_bldr mut flatbuffers::FlatBufferBuilder<'bldr>,
    args: &'args AssignTrackerRequestArgs<'args>
  ) -> flatbuffers::WIPOffset<AssignTrackerRequest<'bldr>> {
    let mut builder = AssignTrackerRequestBuilder::new(_fbb);
    if let Some(x) = args.mounting_rotation { builder.add_mounting_rotation(x); }
    if let Some(x) = args.tracker_id { builder.add_tracker_id(x); }
    builder.add_body_position(args.body_position);
    builder.finish()
  }


  #[inline]
  pub fn tracker_id(&self) -> Option<super::datatypes::TrackerId<'a>> {
    self._tab.get::<flatbuffers::ForwardsUOffset<super::datatypes::TrackerId>>(AssignTrackerRequest::VT_TRACKER_ID, None)
  }
  #[inline]
  pub fn body_position(&self) -> super::datatypes::BodyPart {
    self._tab.get::<super::datatypes::BodyPart>(AssignTrackerRequest::VT_BODY_POSITION, Some(super::datatypes::BodyPart::NONE)).unwrap()
  }
  #[inline]
  pub fn mounting_rotation(&self) -> Option<&'a super::datatypes::math::Quat> {
    self._tab.get::<super::datatypes::math::Quat>(AssignTrackerRequest::VT_MOUNTING_ROTATION, None)
  }
}

impl flatbuffers::Verifiable for AssignTrackerRequest<'_> {
  #[inline]
  fn run_verifier(
    v: &mut flatbuffers::Verifier, pos: usize
  ) -> Result<(), flatbuffers::InvalidFlatbuffer> {
    use self::flatbuffers::Verifiable;
    v.visit_table(pos)?
     .visit_field::<flatbuffers::ForwardsUOffset<super::datatypes::TrackerId>>("tracker_id", Self::VT_TRACKER_ID, false)?
     .visit_field::<super::datatypes::BodyPart>("body_position", Self::VT_BODY_POSITION, false)?
     .visit_field::<super::datatypes::math::Quat>("mounting_rotation", Self::VT_MOUNTING_ROTATION, false)?
     .finish();
    Ok(())
  }
}
pub struct AssignTrackerRequestArgs<'a> {
    pub tracker_id: Option<flatbuffers::WIPOffset<super::datatypes::TrackerId<'a>>>,
    pub body_position: super::datatypes::BodyPart,
    pub mounting_rotation: Option<&'a super::datatypes::math::Quat>,
}
impl<'a> Default for AssignTrackerRequestArgs<'a> {
  #[inline]
  fn default() -> Self {
    AssignTrackerRequestArgs {
      tracker_id: None,
      body_position: super::datatypes::BodyPart::NONE,
      mounting_rotation: None,
    }
  }
}

pub struct AssignTrackerRequestBuilder<'a: 'b, 'b> {
  fbb_: &'b mut flatbuffers::FlatBufferBuilder<'a>,
  start_: flatbuffers::WIPOffset<flatbuffers::TableUnfinishedWIPOffset>,
}
impl<'a: 'b, 'b> AssignTrackerRequestBuilder<'a, 'b> {
  #[inline]
  pub fn add_tracker_id(&mut self, tracker_id: flatbuffers::WIPOffset<super::datatypes::TrackerId<'b >>) {
    self.fbb_.push_slot_always::<flatbuffers::WIPOffset<super::datatypes::TrackerId>>(AssignTrackerRequest::VT_TRACKER_ID, tracker_id);
  }
  #[inline]
  pub fn add_body_position(&mut self, body_position: super::datatypes::BodyPart) {
    self.fbb_.push_slot::<super::datatypes::BodyPart>(AssignTrackerRequest::VT_BODY_POSITION, body_position, super::datatypes::BodyPart::NONE);
  }
  #[inline]
  pub fn add_mounting_rotation(&mut self, mounting_rotation: &super::datatypes::math::Quat) {
    self.fbb_.push_slot_always::<&super::datatypes::math::Quat>(AssignTrackerRequest::VT_MOUNTING_ROTATION, mounting_rotation);
  }
  #[inline]
  pub fn new(_fbb: &'b mut flatbuffers::FlatBufferBuilder<'a>) -> AssignTrackerRequestBuilder<'a, 'b> {
    let start = _fbb.start_table();
    AssignTrackerRequestBuilder {
      fbb_: _fbb,
      start_: start,
    }
  }
  #[inline]
  pub fn finish(self) -> flatbuffers::WIPOffset<AssignTrackerRequest<'a>> {
    let o = self.fbb_.end_table(self.start_);
    flatbuffers::WIPOffset::new(o.value())
  }
}

impl std::fmt::Debug for AssignTrackerRequest<'_> {
  fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
    let mut ds = f.debug_struct("AssignTrackerRequest");
      ds.field("tracker_id", &self.tracker_id());
      ds.field("body_position", &self.body_position());
      ds.field("mounting_rotation", &self.mounting_rotation());
      ds.finish()
  }
}