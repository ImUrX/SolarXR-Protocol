// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';



export class StringTable {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
__init(i:number, bb:flatbuffers.ByteBuffer):StringTable {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

static getRootAsStringTable(bb:flatbuffers.ByteBuffer, obj?:StringTable):StringTable {
  return (obj || new StringTable()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static getSizePrefixedRootAsStringTable(bb:flatbuffers.ByteBuffer, obj?:StringTable):StringTable {
  bb.setPosition(bb.position() + flatbuffers.SIZE_PREFIX_LENGTH);
  return (obj || new StringTable()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

s():string|null
s(optionalEncoding:flatbuffers.Encoding):string|Uint8Array|null
s(optionalEncoding?:any):string|Uint8Array|null {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? this.bb!.__string(this.bb_pos + offset, optionalEncoding) : null;
}

static startStringTable(builder:flatbuffers.Builder) {
  builder.startObject(1);
}

static addS(builder:flatbuffers.Builder, sOffset:flatbuffers.Offset) {
  builder.addFieldOffset(0, sOffset, 0);
}

static endStringTable(builder:flatbuffers.Builder):flatbuffers.Offset {
  const offset = builder.endObject();
  return offset;
}

static createStringTable(builder:flatbuffers.Builder, sOffset:flatbuffers.Offset):flatbuffers.Offset {
  StringTable.startStringTable(builder);
  StringTable.addS(builder, sOffset);
  return StringTable.endStringTable(builder);
}

unpack(): StringTableT {
  return new StringTableT(
    this.s()
  );
}


unpackTo(_o: StringTableT): void {
  _o.s = this.s();
}
}

export class StringTableT {
constructor(
  public s: string|Uint8Array|null = null
){}


pack(builder:flatbuffers.Builder): flatbuffers.Offset {
  const s = (this.s !== null ? builder.createString(this.s!) : 0);

  return StringTable.createStringTable(builder,
    s
  );
}
}
