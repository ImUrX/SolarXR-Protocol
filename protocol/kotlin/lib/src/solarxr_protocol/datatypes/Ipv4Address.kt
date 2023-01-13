// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.datatypes

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

/**
 * The 4 bytes of an ip address are stored in 32 bits in big endian order.
 * We will switch over to fixed size arrays when they are supported better.
 */
@Suppress("unused")
class Ipv4Address : Struct() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : Ipv4Address {
        __init(_i, _bb)
        return this
    }
    val addr : UInt get() = bb.getInt(bb_pos + 0).toUInt()
    companion object {
        fun createIpv4Address(builder: FlatBufferBuilder, addr: UInt) : Int {
            builder.prep(4, 4)
            builder.putInt(addr.toInt())
            return builder.offset()
        }
    }
}