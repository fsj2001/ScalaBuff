// Generated by ScalaBuff, the Scala Protocol Buffers compiler. DO NOT EDIT!
// source: dataTypes.proto

package resources.generated

final case class DataTypes (
	`varint1`: Int = 0,
	`varint2`: Option[Long] = None,
	`varint3`: Option[Int] = None,
	`varint4`: Long = 0L,
	`varint5`: Option[Int] = None,
	`varint6`: Option[Long] = None,
	`varint7`: Option[Boolean] = None,
	`f64bit1`: Option[Long] = None,
	`f64bit2`: Option[Long] = None,
	`f64bit3`: Option[Double] = None,
	`lengthDelim1`: Option[String] = None,
	`lengthDelim2`: Option[com.google.protobuf.ByteString] = None,
	`lengthDelim3`: Option[DataTypes.Varint8Enum.EnumVal] = None,
	`lengthDelim4`: Vector[Int] = Vector.empty[Int],
	`lengthDelim5`: Vector[Int] = Vector.empty[Int],
	`f32bit1`: Option[Int] = None,
	`f32bit2`: Option[Int] = None,
	`f32bit3`: Option[Float] = None
) extends com.google.protobuf.GeneratedMessageLite
	 with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[DataTypes] {

	def setVarint2(_f: Long) = copy(`varint2` = _f)
	def setVarint3(_f: Int) = copy(`varint3` = _f)
	def setVarint5(_f: Int) = copy(`varint5` = _f)
	def setVarint6(_f: Long) = copy(`varint6` = _f)
	def setVarint7(_f: Boolean) = copy(`varint7` = _f)
	def setF64bit1(_f: Long) = copy(`f64bit1` = _f)
	def setF64bit2(_f: Long) = copy(`f64bit2` = _f)
	def setF64bit3(_f: Double) = copy(`f64bit3` = _f)
	def setLengthDelim1(_f: String) = copy(`lengthDelim1` = _f)
	def setLengthDelim2(_f: com.google.protobuf.ByteString) = copy(`lengthDelim2` = _f)
	def setLengthDelim3(_f: DataTypes.Varint8Enum.EnumVal) = copy(`lengthDelim3` = _f)
	def setLengthDelim4(_i: Int, _v: Int) = copy(`lengthDelim4` = `lengthDelim4`.updated(_i, _v))
	def addLengthDelim4(_f: Int) = copy(`lengthDelim4` = `lengthDelim4` :+ _f)
	def addAllLengthDelim4(_f: Int*) = copy(`lengthDelim4` = `lengthDelim4` ++ _f)
	def addAllLengthDelim4(_f: TraversableOnce[Int]) = copy(`lengthDelim4` = `lengthDelim4` ++ _f)
	def setLengthDelim5(_i: Int, _v: Int) = copy(`lengthDelim5` = `lengthDelim5`.updated(_i, _v))
	def addLengthDelim5(_f: Int) = copy(`lengthDelim5` = `lengthDelim5` :+ _f)
	def addAllLengthDelim5(_f: Int*) = copy(`lengthDelim5` = `lengthDelim5` ++ _f)
	def addAllLengthDelim5(_f: TraversableOnce[Int]) = copy(`lengthDelim5` = `lengthDelim5` ++ _f)
	def setF32bit1(_f: Int) = copy(`f32bit1` = _f)
	def setF32bit2(_f: Int) = copy(`f32bit2` = _f)
	def setF32bit3(_f: Float) = copy(`f32bit3` = _f)

	def clearVarint2 = copy(`varint2` = None)
	def clearVarint3 = copy(`varint3` = None)
	def clearVarint5 = copy(`varint5` = None)
	def clearVarint6 = copy(`varint6` = None)
	def clearVarint7 = copy(`varint7` = None)
	def clearF64bit1 = copy(`f64bit1` = None)
	def clearF64bit2 = copy(`f64bit2` = None)
	def clearF64bit3 = copy(`f64bit3` = None)
	def clearLengthDelim1 = copy(`lengthDelim1` = None)
	def clearLengthDelim2 = copy(`lengthDelim2` = None)
	def clearLengthDelim3 = copy(`lengthDelim3` = None)
	def clearLengthDelim4 = copy(`lengthDelim4` = Vector.empty[Int])
	def clearLengthDelim5 = copy(`lengthDelim5` = Vector.empty[Int])
	def clearF32bit1 = copy(`f32bit1` = None)
	def clearF32bit2 = copy(`f32bit2` = None)
	def clearF32bit3 = copy(`f32bit3` = None)

	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeInt32(1, `varint1`)
		if (`varint2`.isDefined) output.writeInt64(2, `varint2`.get)
		if (`varint3`.isDefined) output.writeUInt32(3, `varint3`.get)
		output.writeUInt64(4, `varint4`)
		if (`varint5`.isDefined) output.writeSInt32(5, `varint5`.get)
		if (`varint6`.isDefined) output.writeSInt64(6, `varint6`.get)
		if (`varint7`.isDefined) output.writeBool(7, `varint7`.get)
		if (`f64bit1`.isDefined) output.writeFixed64(100, `f64bit1`.get)
		if (`f64bit2`.isDefined) output.writeSFixed64(101, `f64bit2`.get)
		if (`f64bit3`.isDefined) output.writeDouble(102, `f64bit3`.get)
		if (`lengthDelim1`.isDefined) output.writeString(200, `lengthDelim1`.get)
		if (`lengthDelim2`.isDefined) output.writeBytes(201, `lengthDelim2`.get)
		if (`lengthDelim3`.isDefined) output.writeEnum(202, `lengthDelim3`.get)
		for (_v <- `lengthDelim4`) output.writeInt32(204, _v)
		for (_v <- `lengthDelim5`) output.writeInt32(203, _v)
		if (`f32bit1`.isDefined) output.writeFixed32(500, `f32bit1`.get)
		if (`f32bit2`.isDefined) output.writeSFixed32(501, `f32bit2`.get)
		if (`f32bit3`.isDefined) output.writeFloat(502, `f32bit3`.get)
	}

	lazy val getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var size = 0
		size += computeInt32Size(1, `varint1`)
		if (`varint2`.isDefined) size += computeInt64Size(2, `varint2`.get)
		if (`varint3`.isDefined) size += computeUInt32Size(3, `varint3`.get)
		size += computeUInt64Size(4, `varint4`)
		if (`varint5`.isDefined) size += computeSInt32Size(5, `varint5`.get)
		if (`varint6`.isDefined) size += computeSInt64Size(6, `varint6`.get)
		if (`varint7`.isDefined) size += computeBoolSize(7, `varint7`.get)
		if (`f64bit1`.isDefined) size += computeFixed64Size(100, `f64bit1`.get)
		if (`f64bit2`.isDefined) size += computeSFixed64Size(101, `f64bit2`.get)
		if (`f64bit3`.isDefined) size += computeDoubleSize(102, `f64bit3`.get)
		if (`lengthDelim1`.isDefined) size += computeStringSize(200, `lengthDelim1`.get)
		if (`lengthDelim2`.isDefined) size += computeBytesSize(201, `lengthDelim2`.get)
		if (`lengthDelim3`.isDefined) size += computeEnumSize(202, `lengthDelim3`.get)
		for (_v <- `lengthDelim4`) size += computeInt32Size(204, _v)
		for (_v <- `lengthDelim5`) size += computeInt32Size(203, _v)
		if (`f32bit1`.isDefined) size += computeFixed32Size(500, `f32bit1`.get)
		if (`f32bit2`.isDefined) size += computeSFixed32Size(501, `f32bit2`.get)
		if (`f32bit3`.isDefined) size += computeFloatSize(502, `f32bit3`.get)

		size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): DataTypes = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __varint1: Int = 0
		var __varint2: Option[Long] = `varint2`
		var __varint3: Option[Int] = `varint3`
		var __varint4: Long = 0L
		var __varint5: Option[Int] = `varint5`
		var __varint6: Option[Long] = `varint6`
		var __varint7: Option[Boolean] = `varint7`
		var __f64bit1: Option[Long] = `f64bit1`
		var __f64bit2: Option[Long] = `f64bit2`
		var __f64bit3: Option[Double] = `f64bit3`
		var __lengthDelim1: Option[String] = `lengthDelim1`
		var __lengthDelim2: Option[com.google.protobuf.ByteString] = `lengthDelim2`
		var __lengthDelim3: Option[DataTypes.Varint8Enum.EnumVal] = `lengthDelim3`
		val __lengthDelim4: collection.mutable.Buffer[Int] = `lengthDelim4`.toBuffer
		val __lengthDelim5: collection.mutable.Buffer[Int] = `lengthDelim5`.toBuffer
		var __f32bit1: Option[Int] = `f32bit1`
		var __f32bit2: Option[Int] = `f32bit2`
		var __f32bit3: Option[Float] = `f32bit3`

		def __newMerged = DataTypes(
			__varint1,
			__varint2,
			__varint3,
			__varint4,
			__varint5,
			__varint6,
			__varint7,
			__f64bit1,
			__f64bit2,
			__f64bit3,
			__lengthDelim1,
			__lengthDelim2,
			__lengthDelim3,
			Vector(__lengthDelim4: _*),
			Vector(__lengthDelim5: _*),
			__f32bit1,
			__f32bit2,
			__f32bit3
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 8 => __varint1 = in.readInt32()
			case 16 => __varint2 = in.readInt64()
			case 24 => __varint3 = in.readUInt32()
			case 32 => __varint4 = in.readUInt64()
			case 40 => __varint5 = in.readSInt32()
			case 48 => __varint6 = in.readSInt64()
			case 56 => __varint7 = in.readBool()
			case 801 => __f64bit1 = in.readFixed64()
			case 809 => __f64bit2 = in.readSFixed64()
			case 817 => __f64bit3 = in.readDouble()
			case 1602 => __lengthDelim1 = in.readString()
			case 1610 => __lengthDelim2 = in.readBytes()
			case 1616 => __lengthDelim3 = DataTypes.Varint8Enum.valueOf(in.readEnum())
			case 1632 => __lengthDelim4 += in.readInt32()
			case 1624 => __lengthDelim5 += in.readInt32()
			case 4005 => __f32bit1 = in.readFixed32()
			case 4013 => __f32bit2 = in.readSFixed32()
			case 4021 => __f32bit3 = in.readFloat()
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: DataTypes) = {
		DataTypes(
			m.`varint1`,
			m.`varint2`.orElse(`varint2`),
			m.`varint3`.orElse(`varint3`),
			m.`varint4`,
			m.`varint5`.orElse(`varint5`),
			m.`varint6`.orElse(`varint6`),
			m.`varint7`.orElse(`varint7`),
			m.`f64bit1`.orElse(`f64bit1`),
			m.`f64bit2`.orElse(`f64bit2`),
			m.`f64bit3`.orElse(`f64bit3`),
			m.`lengthDelim1`.orElse(`lengthDelim1`),
			m.`lengthDelim2`.orElse(`lengthDelim2`),
			m.`lengthDelim3`.orElse(`lengthDelim3`),
			`lengthDelim4` ++ m.`lengthDelim4`,
			`lengthDelim5` ++ m.`lengthDelim5`,
			m.`f32bit1`.orElse(`f32bit1`),
			m.`f32bit2`.orElse(`f32bit2`),
			m.`f32bit3`.orElse(`f32bit3`)
		)
	}

	def getDefaultInstanceForType = DataTypes.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
}

object DataTypes {
	@reflect.BeanProperty val defaultInstance = new DataTypes()

	val VARINT1_FIELD_NUMBER = 1
	val VARINT2_FIELD_NUMBER = 2
	val VARINT3_FIELD_NUMBER = 3
	val VARINT4_FIELD_NUMBER = 4
	val VARINT5_FIELD_NUMBER = 5
	val VARINT6_FIELD_NUMBER = 6
	val VARINT7_FIELD_NUMBER = 7
	val F64BIT1_FIELD_NUMBER = 100
	val F64BIT2_FIELD_NUMBER = 101
	val F64BIT3_FIELD_NUMBER = 102
	val LENGTH_DELIM1_FIELD_NUMBER = 200
	val LENGTH_DELIM2_FIELD_NUMBER = 201
	val LENGTH_DELIM3_FIELD_NUMBER = 202
	val LENGTH_DELIM4_FIELD_NUMBER = 204
	val LENGTH_DELIM5_FIELD_NUMBER = 203
	val F32BIT1_FIELD_NUMBER = 500
	val F32BIT2_FIELD_NUMBER = 501
	val F32BIT3_FIELD_NUMBER = 502

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: DataTypes) = defaultInstance.mergeFrom(prototype)

	object Varint8Enum extends net.sandrogrzicic.scalabuff.Enum {
		sealed trait EnumVal extends Value
		val _UNINITIALIZED = new EnumVal { val name = "UNINITIALIZED ENUM VALUE"; val id = -1 }

		val ENUM_ZERO = new EnumVal { val name = "ENUM_ZERO"; val id = 0 }
		val ENUM_ONE = new EnumVal { val name = "ENUM_ONE"; val id = 1 }

		val ENUM_ZERO_VALUE = 0
		val ENUM_ONE_VALUE = 1

		def valueOf(id: Int) = id match {
			case 0 => ENUM_ZERO
			case 1 => ENUM_ONE
			case _default => throw new net.sandrogrzicic.scalabuff.UnknownEnumException(_default)
		}
		val internalGetValueMap = new com.google.protobuf.Internal.EnumLiteMap[EnumVal] {
			def findValueByNumber(id: Int): EnumVal = valueOf(id)
		}
	}

}

object DataTypesTest {
	def registerAllExtensions(registry: com.google.protobuf.ExtensionRegistryLite) {
	}

}
