// Generated by ScalaBuff, the Scala Protocol Buffers compiler. DO NOT EDIT!
// source: multi_two.proto

package resources.generated

final case class MultiMessageTwo (
	requiredField: Int = 0,
	optionalField: Option[Float] = None,
	repeatedField: scala.collection.immutable.Seq[String] = Vector.empty[String],
	`type`: Option[Int] = Some(100),
	int32Default: Option[Int] = Some(100),
	stringDefault: Option[String] = Some("somestring")
) extends com.google.protobuf.GeneratedMessageLite
	with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[MultiMessageTwo]
	with net.sandrogrzicic.scalabuff.Parser[MultiMessageTwo] {

	def setOptionalField(_f: Float) = copy(optionalField = Some(_f))
	def setRepeatedField(_i: Int, _v: String) = copy(repeatedField = repeatedField.updated(_i, _v))
	def addRepeatedField(_f: String) = copy(repeatedField = repeatedField :+ _f)
	def addAllRepeatedField(_f: String*) = copy(repeatedField = repeatedField ++ _f)
	def addAllRepeatedField(_f: TraversableOnce[String]) = copy(repeatedField = repeatedField ++ _f)
	def setType(_f: Int) = copy(`type` = Some(_f))
	def setInt32Default(_f: Int) = copy(int32Default = Some(_f))
	def setStringDefault(_f: String) = copy(stringDefault = Some(_f))

	def clearOptionalField = copy(optionalField = None)
	def clearRepeatedField = copy(repeatedField = Vector.empty[String])
	def clearType = copy(`type` = None)
	def clearInt32Default = copy(int32Default = None)
	def clearStringDefault = copy(stringDefault = None)

	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeInt32(1, requiredField)
		if (optionalField.isDefined) output.writeFloat(2, optionalField.get)
		for (_v <- repeatedField) output.writeString(3, _v)
		if (`type`.isDefined) output.writeInt32(4, `type`.get)
		if (int32Default.isDefined) output.writeInt32(5, int32Default.get)
		if (stringDefault.isDefined) output.writeString(6, stringDefault.get)
	}

	def getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var __size = 0
		__size += computeInt32Size(1, requiredField)
		if (optionalField.isDefined) __size += computeFloatSize(2, optionalField.get)
		for (_v <- repeatedField) __size += computeStringSize(3, _v)
		if (`type`.isDefined) __size += computeInt32Size(4, `type`.get)
		if (int32Default.isDefined) __size += computeInt32Size(5, int32Default.get)
		if (stringDefault.isDefined) __size += computeStringSize(6, stringDefault.get)

		__size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): MultiMessageTwo = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __requiredField: Int = 0
		var __optionalField: Option[Float] = optionalField
		val __repeatedField: scala.collection.mutable.Buffer[String] = repeatedField.toBuffer
		var __type: Option[Int] = `type`
		var __int32Default: Option[Int] = int32Default
		var __stringDefault: Option[String] = stringDefault

		def __newMerged = MultiMessageTwo(
			__requiredField,
			__optionalField,
			Vector(__repeatedField: _*),
			__type,
			__int32Default,
			__stringDefault
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 8 => __requiredField = in.readInt32()
			case 21 => __optionalField = Some(in.readFloat())
			case 26 => __repeatedField += in.readString()
			case 32 => __type = Some(in.readInt32())
			case 40 => __int32Default = Some(in.readInt32())
			case 50 => __stringDefault = Some(in.readString())
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: MultiMessageTwo) = {
		MultiMessageTwo(
			m.requiredField,
			m.optionalField.orElse(optionalField),
			repeatedField ++ m.repeatedField,
			m.`type`.orElse(`type`),
			m.int32Default.orElse(int32Default),
			m.stringDefault.orElse(stringDefault)
		)
	}

	def getDefaultInstanceForType = MultiMessageTwo.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = mergeFrom(cis, er)
	override def getParserForType = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
	def toJson(indent: Int = 0): String = "ScalaBuff JSON generation not enabled. Use --generate_json_method to enable."
}

object MultiMessageTwo {
	@scala.beans.BeanProperty val defaultInstance = new MultiMessageTwo()

	def parseFrom(data: Array[Byte]): MultiMessageTwo = defaultInstance.mergeFrom(data)
	def parseFrom(data: Array[Byte], offset: Int, length: Int): MultiMessageTwo = defaultInstance.mergeFrom(data, offset, length)
	def parseFrom(byteString: com.google.protobuf.ByteString): MultiMessageTwo = defaultInstance.mergeFrom(byteString)
	def parseFrom(stream: java.io.InputStream): MultiMessageTwo = defaultInstance.mergeFrom(stream)
	def parseDelimitedFrom(stream: java.io.InputStream): Option[MultiMessageTwo] = defaultInstance.mergeDelimitedFromStream(stream)

	val REQUIRED_FIELD_FIELD_NUMBER = 1
	val OPTIONAL_FIELD_FIELD_NUMBER = 2
	val REPEATED_FIELD_FIELD_NUMBER = 3
	val TYPE_FIELD_NUMBER = 4
	val INT32DEFAULT_FIELD_NUMBER = 5
	val STRINGDEFAULT_FIELD_NUMBER = 6

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: MultiMessageTwo) = defaultInstance.mergeFrom(prototype)

}

object MultiTwo {
	def registerAllExtensions(registry: com.google.protobuf.ExtensionRegistryLite) {
	}

	private val fromBinaryHintMap = collection.immutable.HashMap[String, Array[Byte] ⇒ com.google.protobuf.GeneratedMessageLite](
		 "MultiMessageTwo" -> (bytes ⇒ MultiMessageTwo.parseFrom(bytes))
	)

	def deserializePayload(payload: Array[Byte], payloadType: String): com.google.protobuf.GeneratedMessageLite = {
		fromBinaryHintMap.get(payloadType) match {
			case Some(f) ⇒ f(payload)
			case None    ⇒ throw new IllegalArgumentException(s"unimplemented deserialization of message payload of type [${payloadType}]")
		}
	}
}
