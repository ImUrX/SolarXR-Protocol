// automatically generated by the FlatBuffers compiler, do not modify
extern crate alloc;
extern crate flatbuffers;
use alloc::boxed::Box;
use alloc::string::{String, ToString};
use alloc::vec::Vec;
use core::mem;
use core::cmp::Ordering;
use self::flatbuffers::{EndianScalar, Follow};
use super::*;
pub enum PubSubHeaderOffset {}
#[derive(Copy, Clone, PartialEq)]

pub struct PubSubHeader<'a> {
  pub _tab: flatbuffers::Table<'a>,
}

impl<'a> flatbuffers::Follow<'a> for PubSubHeader<'a> {
  type Inner = PubSubHeader<'a>;
  #[inline]
  fn follow(buf: &'a [u8], loc: usize) -> Self::Inner {
    Self { _tab: flatbuffers::Table { buf, loc } }
  }
}

impl<'a> PubSubHeader<'a> {
  pub const VT_U_TYPE: flatbuffers::VOffsetT = 4;
  pub const VT_U: flatbuffers::VOffsetT = 6;

  #[inline]
  pub fn init_from_table(table: flatbuffers::Table<'a>) -> Self {
    PubSubHeader { _tab: table }
  }
  #[allow(unused_mut)]
  pub fn create<'bldr: 'args, 'args: 'mut_bldr, 'mut_bldr>(
    _fbb: &'mut_bldr mut flatbuffers::FlatBufferBuilder<'bldr>,
    args: &'args PubSubHeaderArgs
  ) -> flatbuffers::WIPOffset<PubSubHeader<'bldr>> {
    let mut builder = PubSubHeaderBuilder::new(_fbb);
    if let Some(x) = args.u { builder.add_u(x); }
    builder.add_u_type(args.u_type);
    builder.finish()
  }


  #[inline]
  pub fn u_type(&self) -> PubSubUnion {
    self._tab.get::<PubSubUnion>(PubSubHeader::VT_U_TYPE, Some(PubSubUnion::NONE)).unwrap()
  }
  #[inline]
  pub fn u(&self) -> Option<flatbuffers::Table<'a>> {
    self._tab.get::<flatbuffers::ForwardsUOffset<flatbuffers::Table<'a>>>(PubSubHeader::VT_U, None)
  }
  #[inline]
  #[allow(non_snake_case)]
  pub fn u_as_message(&self) -> Option<Message<'a>> {
    if self.u_type() == PubSubUnion::Message {
      self.u().map(Message::init_from_table)
    } else {
      None
    }
  }

  #[inline]
  #[allow(non_snake_case)]
  pub fn u_as_subscription_request(&self) -> Option<SubscriptionRequest<'a>> {
    if self.u_type() == PubSubUnion::SubscriptionRequest {
      self.u().map(SubscriptionRequest::init_from_table)
    } else {
      None
    }
  }

  #[inline]
  #[allow(non_snake_case)]
  pub fn u_as_topic_handle_request(&self) -> Option<TopicHandleRequest<'a>> {
    if self.u_type() == PubSubUnion::TopicHandleRequest {
      self.u().map(TopicHandleRequest::init_from_table)
    } else {
      None
    }
  }

  #[inline]
  #[allow(non_snake_case)]
  pub fn u_as_topic_mapping(&self) -> Option<TopicMapping<'a>> {
    if self.u_type() == PubSubUnion::TopicMapping {
      self.u().map(TopicMapping::init_from_table)
    } else {
      None
    }
  }

}

impl flatbuffers::Verifiable for PubSubHeader<'_> {
  #[inline]
  fn run_verifier(
    v: &mut flatbuffers::Verifier, pos: usize
  ) -> Result<(), flatbuffers::InvalidFlatbuffer> {
    use self::flatbuffers::Verifiable;
    v.visit_table(pos)?
     .visit_union::<PubSubUnion, _>("u_type", Self::VT_U_TYPE, "u", Self::VT_U, false, |key, v, pos| {
        match key {
          PubSubUnion::Message => v.verify_union_variant::<flatbuffers::ForwardsUOffset<Message>>("PubSubUnion::Message", pos),
          PubSubUnion::SubscriptionRequest => v.verify_union_variant::<flatbuffers::ForwardsUOffset<SubscriptionRequest>>("PubSubUnion::SubscriptionRequest", pos),
          PubSubUnion::TopicHandleRequest => v.verify_union_variant::<flatbuffers::ForwardsUOffset<TopicHandleRequest>>("PubSubUnion::TopicHandleRequest", pos),
          PubSubUnion::TopicMapping => v.verify_union_variant::<flatbuffers::ForwardsUOffset<TopicMapping>>("PubSubUnion::TopicMapping", pos),
          _ => Ok(()),
        }
     })?
     .finish();
    Ok(())
  }
}
pub struct PubSubHeaderArgs {
    pub u_type: PubSubUnion,
    pub u: Option<flatbuffers::WIPOffset<flatbuffers::UnionWIPOffset>>,
}
impl<'a> Default for PubSubHeaderArgs {
  #[inline]
  fn default() -> Self {
    PubSubHeaderArgs {
      u_type: PubSubUnion::NONE,
      u: None,
    }
  }
}

pub struct PubSubHeaderBuilder<'a: 'b, 'b> {
  fbb_: &'b mut flatbuffers::FlatBufferBuilder<'a>,
  start_: flatbuffers::WIPOffset<flatbuffers::TableUnfinishedWIPOffset>,
}
impl<'a: 'b, 'b> PubSubHeaderBuilder<'a, 'b> {
  #[inline]
  pub fn add_u_type(&mut self, u_type: PubSubUnion) {
    self.fbb_.push_slot::<PubSubUnion>(PubSubHeader::VT_U_TYPE, u_type, PubSubUnion::NONE);
  }
  #[inline]
  pub fn add_u(&mut self, u: flatbuffers::WIPOffset<flatbuffers::UnionWIPOffset>) {
    self.fbb_.push_slot_always::<flatbuffers::WIPOffset<_>>(PubSubHeader::VT_U, u);
  }
  #[inline]
  pub fn new(_fbb: &'b mut flatbuffers::FlatBufferBuilder<'a>) -> PubSubHeaderBuilder<'a, 'b> {
    let start = _fbb.start_table();
    PubSubHeaderBuilder {
      fbb_: _fbb,
      start_: start,
    }
  }
  #[inline]
  pub fn finish(self) -> flatbuffers::WIPOffset<PubSubHeader<'a>> {
    let o = self.fbb_.end_table(self.start_);
    flatbuffers::WIPOffset::new(o.value())
  }
}

impl core::fmt::Debug for PubSubHeader<'_> {
  fn fmt(&self, f: &mut core::fmt::Formatter<'_>) -> core::fmt::Result {
    let mut ds = f.debug_struct("PubSubHeader");
      ds.field("u_type", &self.u_type());
      match self.u_type() {
        PubSubUnion::Message => {
          if let Some(x) = self.u_as_message() {
            ds.field("u", &x)
          } else {
            ds.field("u", &"InvalidFlatbuffer: Union discriminant does not match value.")
          }
        },
        PubSubUnion::SubscriptionRequest => {
          if let Some(x) = self.u_as_subscription_request() {
            ds.field("u", &x)
          } else {
            ds.field("u", &"InvalidFlatbuffer: Union discriminant does not match value.")
          }
        },
        PubSubUnion::TopicHandleRequest => {
          if let Some(x) = self.u_as_topic_handle_request() {
            ds.field("u", &x)
          } else {
            ds.field("u", &"InvalidFlatbuffer: Union discriminant does not match value.")
          }
        },
        PubSubUnion::TopicMapping => {
          if let Some(x) = self.u_as_topic_mapping() {
            ds.field("u", &x)
          } else {
            ds.field("u", &"InvalidFlatbuffer: Union discriminant does not match value.")
          }
        },
        _ => {
          let x: Option<()> = None;
          ds.field("u", &x)
        },
      };
      ds.finish()
  }
}
