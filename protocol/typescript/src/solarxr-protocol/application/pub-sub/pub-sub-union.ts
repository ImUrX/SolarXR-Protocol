// automatically generated by the FlatBuffers compiler, do not modify

import { Message, MessageT } from '../../../solarxr-protocol/application/pub-sub/message';
import { SubscriptionRequest, SubscriptionRequestT } from '../../../solarxr-protocol/application/pub-sub/subscription-request';
import { TopicHandleRequest, TopicHandleRequestT } from '../../../solarxr-protocol/application/pub-sub/topic-handle-request';
import { TopicMapping, TopicMappingT } from '../../../solarxr-protocol/application/pub-sub/topic-mapping';


export enum PubSubUnion{
  NONE = 0,
  Message = 1,
  SubscriptionRequest = 2,
  TopicHandleRequest = 3,
  TopicMapping = 4
}

export function unionToPubSubUnion(
  type: PubSubUnion,
  accessor: (obj:Message|SubscriptionRequest|TopicHandleRequest|TopicMapping) => Message|SubscriptionRequest|TopicHandleRequest|TopicMapping|null
): Message|SubscriptionRequest|TopicHandleRequest|TopicMapping|null {
  switch(PubSubUnion[type]) {
    case 'NONE': return null; 
    case 'Message': return accessor(new Message())! as Message;
    case 'SubscriptionRequest': return accessor(new SubscriptionRequest())! as SubscriptionRequest;
    case 'TopicHandleRequest': return accessor(new TopicHandleRequest())! as TopicHandleRequest;
    case 'TopicMapping': return accessor(new TopicMapping())! as TopicMapping;
    default: return null;
  }
}

export function unionListToPubSubUnion(
  type: PubSubUnion, 
  accessor: (index: number, obj:Message|SubscriptionRequest|TopicHandleRequest|TopicMapping) => Message|SubscriptionRequest|TopicHandleRequest|TopicMapping|null, 
  index: number
): Message|SubscriptionRequest|TopicHandleRequest|TopicMapping|null {
  switch(PubSubUnion[type]) {
    case 'NONE': return null; 
    case 'Message': return accessor(index, new Message())! as Message;
    case 'SubscriptionRequest': return accessor(index, new SubscriptionRequest())! as SubscriptionRequest;
    case 'TopicHandleRequest': return accessor(index, new TopicHandleRequest())! as TopicHandleRequest;
    case 'TopicMapping': return accessor(index, new TopicMapping())! as TopicMapping;
    default: return null;
  }
}

