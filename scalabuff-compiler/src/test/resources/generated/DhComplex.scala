// Generated by ScalaBuff, the Scala Protocol Buffers compiler. DO NOT EDIT!
// source: dh_complex.proto

package resources.generated

final case class Response (
	response: scala.collection.immutable.Seq[Response.VideoResult] = Vector.empty[Response.VideoResult]
) extends com.google.protobuf.GeneratedMessageLite
	with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[Response]
	with net.sandrogrzicic.scalabuff.Parser[Response] {

	def setResponse(_i: Int, _v: Response.VideoResult) = copy(response = response.updated(_i, _v))
	def addResponse(_f: Response.VideoResult) = copy(response = response :+ _f)
	def addAllResponse(_f: Response.VideoResult*) = copy(response = response ++ _f)
	def addAllResponse(_f: TraversableOnce[Response.VideoResult]) = copy(response = response ++ _f)

	def clearResponse = copy(response = Vector.empty[Response.VideoResult])

	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		for (_v <- response) output.writeMessage(1, _v)
	}

	def getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var __size = 0
		for (_v <- response) __size += computeMessageSize(1, _v)

		__size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): Response = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		val __response: scala.collection.mutable.Buffer[Response.VideoResult] = response.toBuffer

		def __newMerged = Response(
			Vector(__response: _*)
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 10 => __response += readMessage[Response.VideoResult](in, Response.VideoResult.defaultInstance, _emptyRegistry)
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: Response) = {
		Response(
			response ++ m.response
		)
	}

	def getDefaultInstanceForType = Response.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = mergeFrom(cis, er)
	override def getParserForType = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
	def toJson(indent: Int = 0): String = {
		val indent0 = "\n" + ("\t" * indent)
		val (indent1, indent2) = (indent0 + "\t", indent0 + "\t\t")
		val sb = StringBuilder.newBuilder
		sb
			.append("{")
			sb.append(indent1).append("\"response\": [").append(indent2).append(`response`.map(_.toJson(indent + 1)).mkString(", " + indent2)).append(indent1).append(']').append(',')
		if (sb.last.equals(',')) sb.length -= 1
		sb.append(indent0).append("}")
		sb.toString()
	}

}

object Response {
	@scala.beans.BeanProperty val defaultInstance = new Response()

	def parseFrom(data: Array[Byte]): Response = defaultInstance.mergeFrom(data)
	def parseFrom(data: Array[Byte], offset: Int, length: Int): Response = defaultInstance.mergeFrom(data, offset, length)
	def parseFrom(byteString: com.google.protobuf.ByteString): Response = defaultInstance.mergeFrom(byteString)
	def parseFrom(stream: java.io.InputStream): Response = defaultInstance.mergeFrom(stream)
	def parseDelimitedFrom(stream: java.io.InputStream): Option[Response] = defaultInstance.mergeDelimitedFromStream(stream)

	val RESPONSE_FIELD_NUMBER = 1

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: Response) = defaultInstance.mergeFrom(prototype)

	final case class Rendition (
		profileKey: Option[String] = None,
		data: Option[String] = None,
		property: scala.collection.immutable.Seq[Rendition.Property] = Vector.empty[Rendition.Property]
	) extends com.google.protobuf.GeneratedMessageLite
		with com.google.protobuf.MessageLite.Builder
		with net.sandrogrzicic.scalabuff.Message[Rendition]
		with net.sandrogrzicic.scalabuff.Parser[Rendition] {

		def setProfileKey(_f: String) = copy(profileKey = Some(_f))
		def setData(_f: String) = copy(data = Some(_f))
		def setProperty(_i: Int, _v: Rendition.Property) = copy(property = property.updated(_i, _v))
		def addProperty(_f: Rendition.Property) = copy(property = property :+ _f)
		def addAllProperty(_f: Rendition.Property*) = copy(property = property ++ _f)
		def addAllProperty(_f: TraversableOnce[Rendition.Property]) = copy(property = property ++ _f)

		def clearProfileKey = copy(profileKey = None)
		def clearData = copy(data = None)
		def clearProperty = copy(property = Vector.empty[Rendition.Property])

		def writeTo(output: com.google.protobuf.CodedOutputStream) {
			if (profileKey.isDefined) output.writeString(1, profileKey.get)
			if (data.isDefined) output.writeString(2, data.get)
			for (_v <- property) output.writeMessage(3, _v)
		}

		def getSerializedSize = {
			import com.google.protobuf.CodedOutputStream._
			var __size = 0
			if (profileKey.isDefined) __size += computeStringSize(1, profileKey.get)
			if (data.isDefined) __size += computeStringSize(2, data.get)
			for (_v <- property) __size += computeMessageSize(3, _v)

			__size
		}

		def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): Rendition = {
			import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
			var __profileKey: Option[String] = profileKey
			var __data: Option[String] = data
			val __property: scala.collection.mutable.Buffer[Rendition.Property] = property.toBuffer

			def __newMerged = Rendition(
				__profileKey,
				__data,
				Vector(__property: _*)
			)
			while (true) in.readTag match {
				case 0 => return __newMerged
				case 10 => __profileKey = Some(in.readString())
				case 18 => __data = Some(in.readString())
				case 26 => __property += readMessage[Rendition.Property](in, Rendition.Property.defaultInstance, _emptyRegistry)
				case default => if (!in.skipField(default)) return __newMerged
			}
			null
		}

		def mergeFrom(m: Rendition) = {
			Rendition(
				m.profileKey.orElse(profileKey),
				m.data.orElse(data),
				property ++ m.property
			)
		}

		def getDefaultInstanceForType = Rendition.defaultInstance
		def clear = getDefaultInstanceForType
		def isInitialized = true
		def build = this
		def buildPartial = this
		def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = mergeFrom(cis, er)
		override def getParserForType = this
		def newBuilderForType = getDefaultInstanceForType
		def toBuilder = this
		def toJson(indent: Int = 0): String = {
			val indent0 = "\n" + ("\t" * indent)
			val (indent1, indent2) = (indent0 + "\t", indent0 + "\t\t")
			val sb = StringBuilder.newBuilder
			sb
				.append("{")
				if (`profileKey`.isDefined) { sb.append(indent1).append("\"profileKey\": ").append("\"").append(`profileKey`.get).append("\"").append(',') }
				if (`data`.isDefined) { sb.append(indent1).append("\"data\": ").append("\"").append(`data`.get).append("\"").append(',') }
				sb.append(indent1).append("\"property\": [").append(indent2).append(`property`.map(_.toJson(indent + 1)).mkString(", " + indent2)).append(indent1).append(']').append(',')
			if (sb.last.equals(',')) sb.length -= 1
			sb.append(indent0).append("}")
			sb.toString()
		}

	}

	object Rendition {
		@scala.beans.BeanProperty val defaultInstance = new Rendition()

		def parseFrom(data: Array[Byte]): Rendition = defaultInstance.mergeFrom(data)
		def parseFrom(data: Array[Byte], offset: Int, length: Int): Rendition = defaultInstance.mergeFrom(data, offset, length)
		def parseFrom(byteString: com.google.protobuf.ByteString): Rendition = defaultInstance.mergeFrom(byteString)
		def parseFrom(stream: java.io.InputStream): Rendition = defaultInstance.mergeFrom(stream)
		def parseDelimitedFrom(stream: java.io.InputStream): Option[Rendition] = defaultInstance.mergeDelimitedFromStream(stream)

		val PROFILE_KEY_FIELD_NUMBER = 1
		val DATA_FIELD_NUMBER = 2
		val PROPERTY_FIELD_NUMBER = 3

		def newBuilder = defaultInstance.newBuilderForType
		def newBuilder(prototype: Rendition) = defaultInstance.mergeFrom(prototype)

		final case class Property (
			key: Property.Key.EnumVal = Property.Key._UNINITIALIZED,
			value: String = ""
		) extends com.google.protobuf.GeneratedMessageLite
			with com.google.protobuf.MessageLite.Builder
			with net.sandrogrzicic.scalabuff.Message[Property]
			with net.sandrogrzicic.scalabuff.Parser[Property] {



			def writeTo(output: com.google.protobuf.CodedOutputStream) {
				output.writeEnum(1, key)
				output.writeString(2, value)
			}

			def getSerializedSize = {
				import com.google.protobuf.CodedOutputStream._
				var __size = 0
				__size += computeEnumSize(1, key)
				__size += computeStringSize(2, value)

				__size
			}

			def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): Property = {
				import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
				var __key: Property.Key.EnumVal = Property.Key._UNINITIALIZED
				var __value: String = ""

				def __newMerged = Property(
					__key,
					__value
				)
				while (true) in.readTag match {
					case 0 => return __newMerged
					case 8 => __key = Property.Key.valueOf(in.readEnum())
					case 18 => __value = in.readString()
					case default => if (!in.skipField(default)) return __newMerged
				}
				null
			}

			def mergeFrom(m: Property) = {
				Property(
					m.key,
					m.value
				)
			}

			def getDefaultInstanceForType = Property.defaultInstance
			def clear = getDefaultInstanceForType
			def isInitialized = true
			def build = this
			def buildPartial = this
			def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = mergeFrom(cis, er)
			override def getParserForType = this
			def newBuilderForType = getDefaultInstanceForType
			def toBuilder = this
			def toJson(indent: Int = 0): String = {
				val indent0 = "\n" + ("\t" * indent)
				val (indent1, indent2) = (indent0 + "\t", indent0 + "\t\t")
				val sb = StringBuilder.newBuilder
				sb
					.append("{")
					sb.append(indent1).append("\"key\": ").append("\"").append(`key`).append("\"").append(',')
					sb.append(indent1).append("\"value\": ").append("\"").append(`value`).append("\"").append(',')
				if (sb.last.equals(',')) sb.length -= 1
				sb.append(indent0).append("}")
				sb.toString()
			}

		}

		object Property {
			@scala.beans.BeanProperty val defaultInstance = new Property()

			def parseFrom(data: Array[Byte]): Property = defaultInstance.mergeFrom(data)
			def parseFrom(data: Array[Byte], offset: Int, length: Int): Property = defaultInstance.mergeFrom(data, offset, length)
			def parseFrom(byteString: com.google.protobuf.ByteString): Property = defaultInstance.mergeFrom(byteString)
			def parseFrom(stream: java.io.InputStream): Property = defaultInstance.mergeFrom(stream)
			def parseDelimitedFrom(stream: java.io.InputStream): Option[Property] = defaultInstance.mergeDelimitedFromStream(stream)

			val KEY_FIELD_NUMBER = 1
			val VALUE_FIELD_NUMBER = 2

			def newBuilder = defaultInstance.newBuilderForType
			def newBuilder(prototype: Property) = defaultInstance.mergeFrom(prototype)

			object Key extends net.sandrogrzicic.scalabuff.Enum {
				sealed trait EnumVal extends Value
				val _UNINITIALIZED = new EnumVal { val name = "UNINITIALIZED ENUM VALUE"; val id = -1 }

				val UNDEFINED = new EnumVal { val name = "UNDEFINED"; val id = 0 }
				val BANDWIDTH = new EnumVal { val name = "BANDWIDTH"; val id = 1 }
				val RESOLUTION = new EnumVal { val name = "RESOLUTION"; val id = 2 }
				val CODECS = new EnumVal { val name = "CODECS"; val id = 3 }

				val UNDEFINED_VALUE = 0
				val BANDWIDTH_VALUE = 1
				val RESOLUTION_VALUE = 2
				val CODECS_VALUE = 3

				def valueOf(id: Int) = id match {
					case 0 => UNDEFINED
					case 1 => BANDWIDTH
					case 2 => RESOLUTION
					case 3 => CODECS
					case _default => throw new net.sandrogrzicic.scalabuff.UnknownEnumException(_default)
				}
				val internalGetValueMap = new com.google.protobuf.Internal.EnumLiteMap[EnumVal] {
					def findValueByNumber(id: Int): EnumVal = valueOf(id)
				}
			}

		}
	}
	final case class Video (
		identifier: Option[String] = None,
		assetKey: Option[String] = None,
		duration: Option[Float] = None,
		renditions: scala.collection.immutable.Seq[Rendition] = Vector.empty[Rendition]
	) extends com.google.protobuf.GeneratedMessageLite
		with com.google.protobuf.MessageLite.Builder
		with net.sandrogrzicic.scalabuff.Message[Video]
		with net.sandrogrzicic.scalabuff.Parser[Video] {

		def setIdentifier(_f: String) = copy(identifier = Some(_f))
		def setAssetKey(_f: String) = copy(assetKey = Some(_f))
		def setDuration(_f: Float) = copy(duration = Some(_f))
		def setRenditions(_i: Int, _v: Rendition) = copy(renditions = renditions.updated(_i, _v))
		def addRenditions(_f: Rendition) = copy(renditions = renditions :+ _f)
		def addAllRenditions(_f: Rendition*) = copy(renditions = renditions ++ _f)
		def addAllRenditions(_f: TraversableOnce[Rendition]) = copy(renditions = renditions ++ _f)

		def clearIdentifier = copy(identifier = None)
		def clearAssetKey = copy(assetKey = None)
		def clearDuration = copy(duration = None)
		def clearRenditions = copy(renditions = Vector.empty[Rendition])

		def writeTo(output: com.google.protobuf.CodedOutputStream) {
			if (identifier.isDefined) output.writeString(1, identifier.get)
			if (assetKey.isDefined) output.writeString(2, assetKey.get)
			if (duration.isDefined) output.writeFloat(3, duration.get)
			for (_v <- renditions) output.writeMessage(4, _v)
		}

		def getSerializedSize = {
			import com.google.protobuf.CodedOutputStream._
			var __size = 0
			if (identifier.isDefined) __size += computeStringSize(1, identifier.get)
			if (assetKey.isDefined) __size += computeStringSize(2, assetKey.get)
			if (duration.isDefined) __size += computeFloatSize(3, duration.get)
			for (_v <- renditions) __size += computeMessageSize(4, _v)

			__size
		}

		def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): Video = {
			import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
			var __identifier: Option[String] = identifier
			var __assetKey: Option[String] = assetKey
			var __duration: Option[Float] = duration
			val __renditions: scala.collection.mutable.Buffer[Rendition] = renditions.toBuffer

			def __newMerged = Video(
				__identifier,
				__assetKey,
				__duration,
				Vector(__renditions: _*)
			)
			while (true) in.readTag match {
				case 0 => return __newMerged
				case 10 => __identifier = Some(in.readString())
				case 18 => __assetKey = Some(in.readString())
				case 29 => __duration = Some(in.readFloat())
				case 34 => __renditions += readMessage[Rendition](in, Rendition.defaultInstance, _emptyRegistry)
				case default => if (!in.skipField(default)) return __newMerged
			}
			null
		}

		def mergeFrom(m: Video) = {
			Video(
				m.identifier.orElse(identifier),
				m.assetKey.orElse(assetKey),
				m.duration.orElse(duration),
				renditions ++ m.renditions
			)
		}

		def getDefaultInstanceForType = Video.defaultInstance
		def clear = getDefaultInstanceForType
		def isInitialized = true
		def build = this
		def buildPartial = this
		def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = mergeFrom(cis, er)
		override def getParserForType = this
		def newBuilderForType = getDefaultInstanceForType
		def toBuilder = this
		def toJson(indent: Int = 0): String = {
			val indent0 = "\n" + ("\t" * indent)
			val (indent1, indent2) = (indent0 + "\t", indent0 + "\t\t")
			val sb = StringBuilder.newBuilder
			sb
				.append("{")
				if (`identifier`.isDefined) { sb.append(indent1).append("\"identifier\": ").append("\"").append(`identifier`.get).append("\"").append(',') }
				if (`assetKey`.isDefined) { sb.append(indent1).append("\"assetKey\": ").append("\"").append(`assetKey`.get).append("\"").append(',') }
				if (`duration`.isDefined) { sb.append(indent1).append("\"duration\": ").append("\"").append(`duration`.get).append("\"").append(',') }
				sb.append(indent1).append("\"renditions\": [").append(indent2).append(`renditions`.map(_.toJson(indent + 1)).mkString(", " + indent2)).append(indent1).append(']').append(',')
			if (sb.last.equals(',')) sb.length -= 1
			sb.append(indent0).append("}")
			sb.toString()
		}

	}

	object Video {
		@scala.beans.BeanProperty val defaultInstance = new Video()

		def parseFrom(data: Array[Byte]): Video = defaultInstance.mergeFrom(data)
		def parseFrom(data: Array[Byte], offset: Int, length: Int): Video = defaultInstance.mergeFrom(data, offset, length)
		def parseFrom(byteString: com.google.protobuf.ByteString): Video = defaultInstance.mergeFrom(byteString)
		def parseFrom(stream: java.io.InputStream): Video = defaultInstance.mergeFrom(stream)
		def parseDelimitedFrom(stream: java.io.InputStream): Option[Video] = defaultInstance.mergeDelimitedFromStream(stream)

		val IDENTIFIER_FIELD_NUMBER = 1
		val ASSET_KEY_FIELD_NUMBER = 2
		val DURATION_FIELD_NUMBER = 3
		val RENDITIONS_FIELD_NUMBER = 4

		def newBuilder = defaultInstance.newBuilderForType
		def newBuilder(prototype: Video) = defaultInstance.mergeFrom(prototype)

	}
	final case class VideoFailure (
		assetKey: Option[String] = None,
		reason: scala.collection.immutable.Seq[String] = Vector.empty[String],
		cause: Option[VideoFailure.Cause.EnumVal] = None
	) extends com.google.protobuf.GeneratedMessageLite
		with com.google.protobuf.MessageLite.Builder
		with net.sandrogrzicic.scalabuff.Message[VideoFailure]
		with net.sandrogrzicic.scalabuff.Parser[VideoFailure] {

		def setAssetKey(_f: String) = copy(assetKey = Some(_f))
		def setReason(_i: Int, _v: String) = copy(reason = reason.updated(_i, _v))
		def addReason(_f: String) = copy(reason = reason :+ _f)
		def addAllReason(_f: String*) = copy(reason = reason ++ _f)
		def addAllReason(_f: TraversableOnce[String]) = copy(reason = reason ++ _f)
		def setCause(_f: VideoFailure.Cause.EnumVal) = copy(cause = Some(_f))

		def clearAssetKey = copy(assetKey = None)
		def clearReason = copy(reason = Vector.empty[String])
		def clearCause = copy(cause = None)

		def writeTo(output: com.google.protobuf.CodedOutputStream) {
			if (assetKey.isDefined) output.writeString(1, assetKey.get)
			for (_v <- reason) output.writeString(2, _v)
			if (cause.isDefined) output.writeEnum(3, cause.get)
		}

		def getSerializedSize = {
			import com.google.protobuf.CodedOutputStream._
			var __size = 0
			if (assetKey.isDefined) __size += computeStringSize(1, assetKey.get)
			for (_v <- reason) __size += computeStringSize(2, _v)
			if (cause.isDefined) __size += computeEnumSize(3, cause.get)

			__size
		}

		def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): VideoFailure = {
			import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
			var __assetKey: Option[String] = assetKey
			val __reason: scala.collection.mutable.Buffer[String] = reason.toBuffer
			var __cause: Option[VideoFailure.Cause.EnumVal] = cause

			def __newMerged = VideoFailure(
				__assetKey,
				Vector(__reason: _*),
				__cause
			)
			while (true) in.readTag match {
				case 0 => return __newMerged
				case 10 => __assetKey = Some(in.readString())
				case 18 => __reason += in.readString()
				case 24 => __cause = Some(VideoFailure.Cause.valueOf(in.readEnum()))
				case default => if (!in.skipField(default)) return __newMerged
			}
			null
		}

		def mergeFrom(m: VideoFailure) = {
			VideoFailure(
				m.assetKey.orElse(assetKey),
				reason ++ m.reason,
				m.cause.orElse(cause)
			)
		}

		def getDefaultInstanceForType = VideoFailure.defaultInstance
		def clear = getDefaultInstanceForType
		def isInitialized = true
		def build = this
		def buildPartial = this
		def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = mergeFrom(cis, er)
		override def getParserForType = this
		def newBuilderForType = getDefaultInstanceForType
		def toBuilder = this
		def toJson(indent: Int = 0): String = {
			val indent0 = "\n" + ("\t" * indent)
			val (indent1, indent2) = (indent0 + "\t", indent0 + "\t\t")
			val sb = StringBuilder.newBuilder
			sb
				.append("{")
				if (`assetKey`.isDefined) { sb.append(indent1).append("\"assetKey\": ").append("\"").append(`assetKey`.get).append("\"").append(',') }
				sb.append(indent1).append("\"reason\": [").append(indent2).append(`reason`.map("\"" + _ + "\"").mkString(", " + indent2)).append(indent1).append(']').append(',')
				if (`cause`.isDefined) { sb.append(indent1).append("\"cause\": ").append("\"").append(`cause`.get).append("\"").append(',') }
			if (sb.last.equals(',')) sb.length -= 1
			sb.append(indent0).append("}")
			sb.toString()
		}

	}

	object VideoFailure {
		@scala.beans.BeanProperty val defaultInstance = new VideoFailure()

		def parseFrom(data: Array[Byte]): VideoFailure = defaultInstance.mergeFrom(data)
		def parseFrom(data: Array[Byte], offset: Int, length: Int): VideoFailure = defaultInstance.mergeFrom(data, offset, length)
		def parseFrom(byteString: com.google.protobuf.ByteString): VideoFailure = defaultInstance.mergeFrom(byteString)
		def parseFrom(stream: java.io.InputStream): VideoFailure = defaultInstance.mergeFrom(stream)
		def parseDelimitedFrom(stream: java.io.InputStream): Option[VideoFailure] = defaultInstance.mergeDelimitedFromStream(stream)

		val ASSET_KEY_FIELD_NUMBER = 1
		val REASON_FIELD_NUMBER = 2
		val CAUSE_FIELD_NUMBER = 3

		def newBuilder = defaultInstance.newBuilderForType
		def newBuilder(prototype: VideoFailure) = defaultInstance.mergeFrom(prototype)

		object Cause extends net.sandrogrzicic.scalabuff.Enum {
			sealed trait EnumVal extends Value
			val _UNINITIALIZED = new EnumVal { val name = "UNINITIALIZED ENUM VALUE"; val id = -1 }

			val UNEXPECTED = new EnumVal { val name = "UNEXPECTED"; val id = 1 }
			val ASSET_NOT_FOUND = new EnumVal { val name = "ASSET_NOT_FOUND"; val id = 2 }
			val UNKNOWN_ACCOUNT = new EnumVal { val name = "UNKNOWN_ACCOUNT"; val id = 3 }
			val TIMEOUT = new EnumVal { val name = "TIMEOUT"; val id = 4 }
			val DATABASE_ERROR = new EnumVal { val name = "DATABASE_ERROR"; val id = 5 }

			val UNEXPECTED_VALUE = 1
			val ASSET_NOT_FOUND_VALUE = 2
			val UNKNOWN_ACCOUNT_VALUE = 3
			val TIMEOUT_VALUE = 4
			val DATABASE_ERROR_VALUE = 5

			def valueOf(id: Int) = id match {
				case 1 => UNEXPECTED
				case 2 => ASSET_NOT_FOUND
				case 3 => UNKNOWN_ACCOUNT
				case 4 => TIMEOUT
				case 5 => DATABASE_ERROR
				case _default => throw new net.sandrogrzicic.scalabuff.UnknownEnumException(_default)
			}
			val internalGetValueMap = new com.google.protobuf.Internal.EnumLiteMap[EnumVal] {
				def findValueByNumber(id: Int): EnumVal = valueOf(id)
			}
		}

	}
	final case class VideoResult (
		success: Option[Video] = None,
		failure: Option[VideoFailure] = None
	) extends com.google.protobuf.GeneratedMessageLite
		with com.google.protobuf.MessageLite.Builder
		with net.sandrogrzicic.scalabuff.Message[VideoResult]
		with net.sandrogrzicic.scalabuff.Parser[VideoResult] {

		def setSuccess(_f: Video) = copy(success = Some(_f))
		def setFailure(_f: VideoFailure) = copy(failure = Some(_f))

		def clearSuccess = copy(success = None)
		def clearFailure = copy(failure = None)

		def writeTo(output: com.google.protobuf.CodedOutputStream) {
			if (success.isDefined) output.writeMessage(1, success.get)
			if (failure.isDefined) output.writeMessage(2, failure.get)
		}

		def getSerializedSize = {
			import com.google.protobuf.CodedOutputStream._
			var __size = 0
			if (success.isDefined) __size += computeMessageSize(1, success.get)
			if (failure.isDefined) __size += computeMessageSize(2, failure.get)

			__size
		}

		def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): VideoResult = {
			import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
			var __success: Option[Video] = success
			var __failure: Option[VideoFailure] = failure

			def __newMerged = VideoResult(
				__success,
				__failure
			)
			while (true) in.readTag match {
				case 0 => return __newMerged
				case 10 => __success = Some(readMessage[Video](in, __success.orElse({
					__success = Video.defaultInstance
					__success
				}).get, _emptyRegistry))
				case 18 => __failure = Some(readMessage[VideoFailure](in, __failure.orElse({
					__failure = VideoFailure.defaultInstance
					__failure
				}).get, _emptyRegistry))
				case default => if (!in.skipField(default)) return __newMerged
			}
			null
		}

		def mergeFrom(m: VideoResult) = {
			VideoResult(
				m.success.orElse(success),
				m.failure.orElse(failure)
			)
		}

		def getDefaultInstanceForType = VideoResult.defaultInstance
		def clear = getDefaultInstanceForType
		def isInitialized = true
		def build = this
		def buildPartial = this
		def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = mergeFrom(cis, er)
		override def getParserForType = this
		def newBuilderForType = getDefaultInstanceForType
		def toBuilder = this
		def toJson(indent: Int = 0): String = {
			val indent0 = "\n" + ("\t" * indent)
			val (indent1, indent2) = (indent0 + "\t", indent0 + "\t\t")
			val sb = StringBuilder.newBuilder
			sb
				.append("{")
				if (`success`.isDefined) { sb.append(indent1).append("\"success\": ").append(`success`.get.toJson(indent + 1)).append(',') }
				if (`failure`.isDefined) { sb.append(indent1).append("\"failure\": ").append(`failure`.get.toJson(indent + 1)).append(',') }
			if (sb.last.equals(',')) sb.length -= 1
			sb.append(indent0).append("}")
			sb.toString()
		}

	}

	object VideoResult {
		@scala.beans.BeanProperty val defaultInstance = new VideoResult()

		def parseFrom(data: Array[Byte]): VideoResult = defaultInstance.mergeFrom(data)
		def parseFrom(data: Array[Byte], offset: Int, length: Int): VideoResult = defaultInstance.mergeFrom(data, offset, length)
		def parseFrom(byteString: com.google.protobuf.ByteString): VideoResult = defaultInstance.mergeFrom(byteString)
		def parseFrom(stream: java.io.InputStream): VideoResult = defaultInstance.mergeFrom(stream)
		def parseDelimitedFrom(stream: java.io.InputStream): Option[VideoResult] = defaultInstance.mergeDelimitedFromStream(stream)

		val SUCCESS_FIELD_NUMBER = 1
		val FAILURE_FIELD_NUMBER = 2

		def newBuilder = defaultInstance.newBuilderForType
		def newBuilder(prototype: VideoResult) = defaultInstance.mergeFrom(prototype)

	}
}

object DhComplex {
	def registerAllExtensions(registry: com.google.protobuf.ExtensionRegistryLite) {
	}

	private val fromBinaryHintMap = collection.immutable.HashMap[String, Array[Byte] ⇒ com.google.protobuf.GeneratedMessageLite](
		 "Response" -> (bytes ⇒ Response.parseFrom(bytes))
	)

	def deserializePayload(payload: Array[Byte], payloadType: String): com.google.protobuf.GeneratedMessageLite = {
		fromBinaryHintMap.get(payloadType) match {
			case Some(f) ⇒ f(payload)
			case None    ⇒ throw new IllegalArgumentException(s"unimplemented deserialization of message payload of type [${payloadType}]")
		}
	}
}
