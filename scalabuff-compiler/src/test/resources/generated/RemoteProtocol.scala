// Generated by ScalaBuff, the Scala Protocol Buffers compiler. DO NOT EDIT!
// source: RemoteProtocol.proto

package akka.remote

final case class AkkaRemoteProtocol (
	`message`: Option[RemoteMessageProtocol] = None,
	`instruction`: Option[RemoteControlProtocol] = None
) extends com.google.protobuf.GeneratedMessageLite
	 with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[AkkaRemoteProtocol] {

	def setMessage(_f: RemoteMessageProtocol) = copy(`message` = _f)
	def setInstruction(_f: RemoteControlProtocol) = copy(`instruction` = _f)

	def clearMessage = copy(`message` = None)
	def clearInstruction = copy(`instruction` = None)

	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		if (`message`.isDefined) output.writeMessage(1, `message`.get)
		if (`instruction`.isDefined) output.writeMessage(2, `instruction`.get)
	}

	lazy val getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var size = 0
		if (`message`.isDefined) size += computeMessageSize(1, `message`.get)
		if (`instruction`.isDefined) size += computeMessageSize(2, `instruction`.get)

		size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): AkkaRemoteProtocol = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __message: Option[RemoteMessageProtocol] = `message`
		var __instruction: Option[RemoteControlProtocol] = `instruction`

		def __newMerged = AkkaRemoteProtocol(
			__message,
			__instruction
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 10 => __message = readMessage[RemoteMessageProtocol](in, __message.orElse({
				__message = RemoteMessageProtocol.defaultInstance
				__message
			}).get, _emptyRegistry)
			case 18 => __instruction = readMessage[RemoteControlProtocol](in, __instruction.orElse({
				__instruction = RemoteControlProtocol.defaultInstance
				__instruction
			}).get, _emptyRegistry)
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: AkkaRemoteProtocol) = {
		AkkaRemoteProtocol(
			m.`message`.orElse(`message`),
			m.`instruction`.orElse(`instruction`)
		)
	}

	def getDefaultInstanceForType = AkkaRemoteProtocol.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
}

object AkkaRemoteProtocol {
	@reflect.BeanProperty val defaultInstance = new AkkaRemoteProtocol()

	val MESSAGE_FIELD_NUMBER = 1
	val INSTRUCTION_FIELD_NUMBER = 2

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: AkkaRemoteProtocol) = defaultInstance.mergeFrom(prototype)

}
final case class RemoteMessageProtocol (
	`recipient`: ActorRefProtocol = ActorRefProtocol.defaultInstance,
	`message`: MessageProtocol = MessageProtocol.defaultInstance,
	`sender`: Option[ActorRefProtocol] = None,
	`metadata`: Vector[MetadataEntryProtocol] = Vector.empty[MetadataEntryProtocol]
) extends com.google.protobuf.GeneratedMessageLite
	 with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[RemoteMessageProtocol] {

	def setSender(_f: ActorRefProtocol) = copy(`sender` = _f)
	def setMetadata(_i: Int, _v: MetadataEntryProtocol) = copy(`metadata` = `metadata`.updated(_i, _v))
	def addMetadata(_f: MetadataEntryProtocol) = copy(`metadata` = `metadata` :+ _f)
	def addAllMetadata(_f: MetadataEntryProtocol*) = copy(`metadata` = `metadata` ++ _f)
	def addAllMetadata(_f: TraversableOnce[MetadataEntryProtocol]) = copy(`metadata` = `metadata` ++ _f)

	def clearSender = copy(`sender` = None)
	def clearMetadata = copy(`metadata` = Vector.empty[MetadataEntryProtocol])

	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeMessage(1, `recipient`)
		output.writeMessage(2, `message`)
		if (`sender`.isDefined) output.writeMessage(4, `sender`.get)
		for (_v <- `metadata`) output.writeMessage(5, _v)
	}

	lazy val getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var size = 0
		size += computeMessageSize(1, `recipient`)
		size += computeMessageSize(2, `message`)
		if (`sender`.isDefined) size += computeMessageSize(4, `sender`.get)
		for (_v <- `metadata`) size += computeMessageSize(5, _v)

		size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): RemoteMessageProtocol = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __recipient: ActorRefProtocol = ActorRefProtocol.defaultInstance
		var __message: MessageProtocol = MessageProtocol.defaultInstance
		var __sender: Option[ActorRefProtocol] = `sender`
		val __metadata: collection.mutable.Buffer[MetadataEntryProtocol] = `metadata`.toBuffer

		def __newMerged = RemoteMessageProtocol(
			__recipient,
			__message,
			__sender,
			Vector(__metadata: _*)
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 10 => __recipient = readMessage[ActorRefProtocol](in, __recipient, _emptyRegistry)
			case 18 => __message = readMessage[MessageProtocol](in, __message, _emptyRegistry)
			case 34 => __sender = readMessage[ActorRefProtocol](in, __sender.orElse({
				__sender = ActorRefProtocol.defaultInstance
				__sender
			}).get, _emptyRegistry)
			case 42 => __metadata += readMessage[MetadataEntryProtocol](in, MetadataEntryProtocol.defaultInstance, _emptyRegistry)
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: RemoteMessageProtocol) = {
		RemoteMessageProtocol(
			m.`recipient`,
			m.`message`,
			m.`sender`.orElse(`sender`),
			`metadata` ++ m.`metadata`
		)
	}

	def getDefaultInstanceForType = RemoteMessageProtocol.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
}

object RemoteMessageProtocol {
	@reflect.BeanProperty val defaultInstance = new RemoteMessageProtocol()

	val RECIPIENT_FIELD_NUMBER = 1
	val MESSAGE_FIELD_NUMBER = 2
	val SENDER_FIELD_NUMBER = 4
	val METADATA_FIELD_NUMBER = 5

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: RemoteMessageProtocol) = defaultInstance.mergeFrom(prototype)

}
final case class RemoteControlProtocol (
	`commandType`: CommandType.EnumVal = CommandType._UNINITIALIZED,
	`cookie`: Option[String] = None,
	`origin`: Option[AddressProtocol] = None
) extends com.google.protobuf.GeneratedMessageLite
	 with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[RemoteControlProtocol] {

	def setCookie(_f: String) = copy(`cookie` = _f)
	def setOrigin(_f: AddressProtocol) = copy(`origin` = _f)

	def clearCookie = copy(`cookie` = None)
	def clearOrigin = copy(`origin` = None)

	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeEnum(1, `commandType`)
		if (`cookie`.isDefined) output.writeString(2, `cookie`.get)
		if (`origin`.isDefined) output.writeMessage(3, `origin`.get)
	}

	lazy val getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var size = 0
		size += computeEnumSize(1, `commandType`)
		if (`cookie`.isDefined) size += computeStringSize(2, `cookie`.get)
		if (`origin`.isDefined) size += computeMessageSize(3, `origin`.get)

		size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): RemoteControlProtocol = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __commandType: CommandType.EnumVal = CommandType._UNINITIALIZED
		var __cookie: Option[String] = `cookie`
		var __origin: Option[AddressProtocol] = `origin`

		def __newMerged = RemoteControlProtocol(
			__commandType,
			__cookie,
			__origin
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 8 => __commandType = CommandType.valueOf(in.readEnum())
			case 18 => __cookie = in.readString()
			case 26 => __origin = readMessage[AddressProtocol](in, __origin.orElse({
				__origin = AddressProtocol.defaultInstance
				__origin
			}).get, _emptyRegistry)
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: RemoteControlProtocol) = {
		RemoteControlProtocol(
			m.`commandType`,
			m.`cookie`.orElse(`cookie`),
			m.`origin`.orElse(`origin`)
		)
	}

	def getDefaultInstanceForType = RemoteControlProtocol.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
}

object RemoteControlProtocol {
	@reflect.BeanProperty val defaultInstance = new RemoteControlProtocol()

	val COMMANDTYPE_FIELD_NUMBER = 1
	val COOKIE_FIELD_NUMBER = 2
	val ORIGIN_FIELD_NUMBER = 3

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: RemoteControlProtocol) = defaultInstance.mergeFrom(prototype)

}
object CommandType extends net.sandrogrzicic.scalabuff.Enum {
	sealed trait EnumVal extends Value
	val _UNINITIALIZED = new EnumVal { val name = "UNINITIALIZED ENUM VALUE"; val id = -1 }

	val CONNECT = new EnumVal { val name = "CONNECT"; val id = 1 }
	val SHUTDOWN = new EnumVal { val name = "SHUTDOWN"; val id = 2 }
	val HEARTBEAT = new EnumVal { val name = "HEARTBEAT"; val id = 3 }

	val CONNECT_VALUE = 1
	val SHUTDOWN_VALUE = 2
	val HEARTBEAT_VALUE = 3

	def valueOf(id: Int) = id match {
		case 1 => CONNECT
		case 2 => SHUTDOWN
		case 3 => HEARTBEAT
		case _default => throw new net.sandrogrzicic.scalabuff.UnknownEnumException(_default)
	}
	val internalGetValueMap = new com.google.protobuf.Internal.EnumLiteMap[EnumVal] {
		def findValueByNumber(id: Int): EnumVal = valueOf(id)
	}
}
final case class ActorRefProtocol (
	`path`: String = ""
) extends com.google.protobuf.GeneratedMessageLite
	 with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[ActorRefProtocol] {



	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeString(1, `path`)
	}

	lazy val getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var size = 0
		size += computeStringSize(1, `path`)

		size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): ActorRefProtocol = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __path: String = ""

		def __newMerged = ActorRefProtocol(
			__path
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 10 => __path = in.readString()
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: ActorRefProtocol) = {
		ActorRefProtocol(
			m.`path`
		)
	}

	def getDefaultInstanceForType = ActorRefProtocol.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
}

object ActorRefProtocol {
	@reflect.BeanProperty val defaultInstance = new ActorRefProtocol()

	val PATH_FIELD_NUMBER = 1

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: ActorRefProtocol) = defaultInstance.mergeFrom(prototype)

}
final case class MessageProtocol (
	`message`: com.google.protobuf.ByteString = com.google.protobuf.ByteString.EMPTY,
	`serializerId`: Int = 0,
	`messageManifest`: Option[com.google.protobuf.ByteString] = None
) extends com.google.protobuf.GeneratedMessageLite
	 with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[MessageProtocol] {

	def setMessageManifest(_f: com.google.protobuf.ByteString) = copy(`messageManifest` = _f)

	def clearMessageManifest = copy(`messageManifest` = None)

	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeBytes(1, `message`)
		output.writeInt32(2, `serializerId`)
		if (`messageManifest`.isDefined) output.writeBytes(3, `messageManifest`.get)
	}

	lazy val getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var size = 0
		size += computeBytesSize(1, `message`)
		size += computeInt32Size(2, `serializerId`)
		if (`messageManifest`.isDefined) size += computeBytesSize(3, `messageManifest`.get)

		size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): MessageProtocol = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __message: com.google.protobuf.ByteString = com.google.protobuf.ByteString.EMPTY
		var __serializerId: Int = 0
		var __messageManifest: Option[com.google.protobuf.ByteString] = `messageManifest`

		def __newMerged = MessageProtocol(
			__message,
			__serializerId,
			__messageManifest
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 10 => __message = in.readBytes()
			case 16 => __serializerId = in.readInt32()
			case 26 => __messageManifest = in.readBytes()
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: MessageProtocol) = {
		MessageProtocol(
			m.`message`,
			m.`serializerId`,
			m.`messageManifest`.orElse(`messageManifest`)
		)
	}

	def getDefaultInstanceForType = MessageProtocol.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
}

object MessageProtocol {
	@reflect.BeanProperty val defaultInstance = new MessageProtocol()

	val MESSAGE_FIELD_NUMBER = 1
	val SERIALIZERID_FIELD_NUMBER = 2
	val MESSAGEMANIFEST_FIELD_NUMBER = 3

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: MessageProtocol) = defaultInstance.mergeFrom(prototype)

}
final case class MetadataEntryProtocol (
	`key`: String = "",
	`value`: com.google.protobuf.ByteString = com.google.protobuf.ByteString.EMPTY
) extends com.google.protobuf.GeneratedMessageLite
	 with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[MetadataEntryProtocol] {



	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeString(1, `key`)
		output.writeBytes(2, `value`)
	}

	lazy val getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var size = 0
		size += computeStringSize(1, `key`)
		size += computeBytesSize(2, `value`)

		size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): MetadataEntryProtocol = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __key: String = ""
		var __value: com.google.protobuf.ByteString = com.google.protobuf.ByteString.EMPTY

		def __newMerged = MetadataEntryProtocol(
			__key,
			__value
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 10 => __key = in.readString()
			case 18 => __value = in.readBytes()
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: MetadataEntryProtocol) = {
		MetadataEntryProtocol(
			m.`key`,
			m.`value`
		)
	}

	def getDefaultInstanceForType = MetadataEntryProtocol.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
}

object MetadataEntryProtocol {
	@reflect.BeanProperty val defaultInstance = new MetadataEntryProtocol()

	val KEY_FIELD_NUMBER = 1
	val VALUE_FIELD_NUMBER = 2

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: MetadataEntryProtocol) = defaultInstance.mergeFrom(prototype)

}
final case class AddressProtocol (
	`system`: String = "",
	`hostname`: String = "",
	`port`: Int = 0
) extends com.google.protobuf.GeneratedMessageLite
	 with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[AddressProtocol] {



	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeString(1, `system`)
		output.writeString(2, `hostname`)
		output.writeUInt32(3, `port`)
	}

	lazy val getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var size = 0
		size += computeStringSize(1, `system`)
		size += computeStringSize(2, `hostname`)
		size += computeUInt32Size(3, `port`)

		size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): AddressProtocol = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __system: String = ""
		var __hostname: String = ""
		var __port: Int = 0

		def __newMerged = AddressProtocol(
			__system,
			__hostname,
			__port
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 10 => __system = in.readString()
			case 18 => __hostname = in.readString()
			case 24 => __port = in.readUInt32()
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: AddressProtocol) = {
		AddressProtocol(
			m.`system`,
			m.`hostname`,
			m.`port`
		)
	}

	def getDefaultInstanceForType = AddressProtocol.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
}

object AddressProtocol {
	@reflect.BeanProperty val defaultInstance = new AddressProtocol()

	val SYSTEM_FIELD_NUMBER = 1
	val HOSTNAME_FIELD_NUMBER = 2
	val PORT_FIELD_NUMBER = 3

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: AddressProtocol) = defaultInstance.mergeFrom(prototype)

}
final case class DaemonMsgCreateProtocol (
	`props`: PropsProtocol = PropsProtocol.defaultInstance,
	`deploy`: DeployProtocol = DeployProtocol.defaultInstance,
	`path`: String = "",
	`supervisor`: ActorRefProtocol = ActorRefProtocol.defaultInstance
) extends com.google.protobuf.GeneratedMessageLite
	 with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[DaemonMsgCreateProtocol] {



	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeMessage(1, `props`)
		output.writeMessage(2, `deploy`)
		output.writeString(3, `path`)
		output.writeMessage(4, `supervisor`)
	}

	lazy val getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var size = 0
		size += computeMessageSize(1, `props`)
		size += computeMessageSize(2, `deploy`)
		size += computeStringSize(3, `path`)
		size += computeMessageSize(4, `supervisor`)

		size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): DaemonMsgCreateProtocol = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __props: PropsProtocol = PropsProtocol.defaultInstance
		var __deploy: DeployProtocol = DeployProtocol.defaultInstance
		var __path: String = ""
		var __supervisor: ActorRefProtocol = ActorRefProtocol.defaultInstance

		def __newMerged = DaemonMsgCreateProtocol(
			__props,
			__deploy,
			__path,
			__supervisor
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 10 => __props = readMessage[PropsProtocol](in, __props, _emptyRegistry)
			case 18 => __deploy = readMessage[DeployProtocol](in, __deploy, _emptyRegistry)
			case 26 => __path = in.readString()
			case 34 => __supervisor = readMessage[ActorRefProtocol](in, __supervisor, _emptyRegistry)
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: DaemonMsgCreateProtocol) = {
		DaemonMsgCreateProtocol(
			m.`props`,
			m.`deploy`,
			m.`path`,
			m.`supervisor`
		)
	}

	def getDefaultInstanceForType = DaemonMsgCreateProtocol.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
}

object DaemonMsgCreateProtocol {
	@reflect.BeanProperty val defaultInstance = new DaemonMsgCreateProtocol()

	val PROPS_FIELD_NUMBER = 1
	val DEPLOY_FIELD_NUMBER = 2
	val PATH_FIELD_NUMBER = 3
	val SUPERVISOR_FIELD_NUMBER = 4

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: DaemonMsgCreateProtocol) = defaultInstance.mergeFrom(prototype)

}
final case class PropsProtocol (
	`dispatcher`: String = "",
	`deploy`: DeployProtocol = DeployProtocol.defaultInstance,
	`fromClassCreator`: Option[String] = None,
	`creator`: Option[com.google.protobuf.ByteString] = None,
	`routerConfig`: Option[com.google.protobuf.ByteString] = None
) extends com.google.protobuf.GeneratedMessageLite
	 with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[PropsProtocol] {

	def setFromClassCreator(_f: String) = copy(`fromClassCreator` = _f)
	def setCreator(_f: com.google.protobuf.ByteString) = copy(`creator` = _f)
	def setRouterConfig(_f: com.google.protobuf.ByteString) = copy(`routerConfig` = _f)

	def clearFromClassCreator = copy(`fromClassCreator` = None)
	def clearCreator = copy(`creator` = None)
	def clearRouterConfig = copy(`routerConfig` = None)

	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeString(1, `dispatcher`)
		output.writeMessage(2, `deploy`)
		if (`fromClassCreator`.isDefined) output.writeString(3, `fromClassCreator`.get)
		if (`creator`.isDefined) output.writeBytes(4, `creator`.get)
		if (`routerConfig`.isDefined) output.writeBytes(5, `routerConfig`.get)
	}

	lazy val getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var size = 0
		size += computeStringSize(1, `dispatcher`)
		size += computeMessageSize(2, `deploy`)
		if (`fromClassCreator`.isDefined) size += computeStringSize(3, `fromClassCreator`.get)
		if (`creator`.isDefined) size += computeBytesSize(4, `creator`.get)
		if (`routerConfig`.isDefined) size += computeBytesSize(5, `routerConfig`.get)

		size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): PropsProtocol = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __dispatcher: String = ""
		var __deploy: DeployProtocol = DeployProtocol.defaultInstance
		var __fromClassCreator: Option[String] = `fromClassCreator`
		var __creator: Option[com.google.protobuf.ByteString] = `creator`
		var __routerConfig: Option[com.google.protobuf.ByteString] = `routerConfig`

		def __newMerged = PropsProtocol(
			__dispatcher,
			__deploy,
			__fromClassCreator,
			__creator,
			__routerConfig
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 10 => __dispatcher = in.readString()
			case 18 => __deploy = readMessage[DeployProtocol](in, __deploy, _emptyRegistry)
			case 26 => __fromClassCreator = in.readString()
			case 34 => __creator = in.readBytes()
			case 42 => __routerConfig = in.readBytes()
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: PropsProtocol) = {
		PropsProtocol(
			m.`dispatcher`,
			m.`deploy`,
			m.`fromClassCreator`.orElse(`fromClassCreator`),
			m.`creator`.orElse(`creator`),
			m.`routerConfig`.orElse(`routerConfig`)
		)
	}

	def getDefaultInstanceForType = PropsProtocol.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
}

object PropsProtocol {
	@reflect.BeanProperty val defaultInstance = new PropsProtocol()

	val DISPATCHER_FIELD_NUMBER = 1
	val DEPLOY_FIELD_NUMBER = 2
	val FROMCLASSCREATOR_FIELD_NUMBER = 3
	val CREATOR_FIELD_NUMBER = 4
	val ROUTERCONFIG_FIELD_NUMBER = 5

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: PropsProtocol) = defaultInstance.mergeFrom(prototype)

}
final case class DeployProtocol (
	`path`: String = "",
	`config`: Option[com.google.protobuf.ByteString] = None,
	`routerConfig`: Option[com.google.protobuf.ByteString] = None,
	`scope`: Option[com.google.protobuf.ByteString] = None
) extends com.google.protobuf.GeneratedMessageLite
	 with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[DeployProtocol] {

	def setConfig(_f: com.google.protobuf.ByteString) = copy(`config` = _f)
	def setRouterConfig(_f: com.google.protobuf.ByteString) = copy(`routerConfig` = _f)
	def setScope(_f: com.google.protobuf.ByteString) = copy(`scope` = _f)

	def clearConfig = copy(`config` = None)
	def clearRouterConfig = copy(`routerConfig` = None)
	def clearScope = copy(`scope` = None)

	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeString(1, `path`)
		if (`config`.isDefined) output.writeBytes(2, `config`.get)
		if (`routerConfig`.isDefined) output.writeBytes(3, `routerConfig`.get)
		if (`scope`.isDefined) output.writeBytes(4, `scope`.get)
	}

	lazy val getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var size = 0
		size += computeStringSize(1, `path`)
		if (`config`.isDefined) size += computeBytesSize(2, `config`.get)
		if (`routerConfig`.isDefined) size += computeBytesSize(3, `routerConfig`.get)
		if (`scope`.isDefined) size += computeBytesSize(4, `scope`.get)

		size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): DeployProtocol = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __path: String = ""
		var __config: Option[com.google.protobuf.ByteString] = `config`
		var __routerConfig: Option[com.google.protobuf.ByteString] = `routerConfig`
		var __scope: Option[com.google.protobuf.ByteString] = `scope`

		def __newMerged = DeployProtocol(
			__path,
			__config,
			__routerConfig,
			__scope
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 10 => __path = in.readString()
			case 18 => __config = in.readBytes()
			case 26 => __routerConfig = in.readBytes()
			case 34 => __scope = in.readBytes()
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: DeployProtocol) = {
		DeployProtocol(
			m.`path`,
			m.`config`.orElse(`config`),
			m.`routerConfig`.orElse(`routerConfig`),
			m.`scope`.orElse(`scope`)
		)
	}

	def getDefaultInstanceForType = DeployProtocol.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
}

object DeployProtocol {
	@reflect.BeanProperty val defaultInstance = new DeployProtocol()

	val PATH_FIELD_NUMBER = 1
	val CONFIG_FIELD_NUMBER = 2
	val ROUTERCONFIG_FIELD_NUMBER = 3
	val SCOPE_FIELD_NUMBER = 4

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: DeployProtocol) = defaultInstance.mergeFrom(prototype)

}

object RemoteProtocol {
	def registerAllExtensions(registry: com.google.protobuf.ExtensionRegistryLite) {
	}

}
