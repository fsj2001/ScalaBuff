// Generated by ScalaBuff, the Scala Protocol Buffers compiler. DO NOT EDIT!
// source: imports.proto

package resources.generated

//import "simple.proto"

final case class UsesImport (
	`simpleTest`: SimpleTest = SimpleTest.defaultInstance
) extends com.google.protobuf.GeneratedMessageLite
	 with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[UsesImport] {



	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeMessage(1, `simpleTest`)
	}

	lazy val getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var size = 0
		size += computeMessageSize(1, `simpleTest`)

		size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): UsesImport = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __simpleTest: SimpleTest = SimpleTest.defaultInstance

		def __newMerged = UsesImport(
			__simpleTest
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 10 => __simpleTest = readMessage[SimpleTest](in, __simpleTest, _emptyRegistry)
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: UsesImport) = {
		UsesImport(
			m.`simpleTest`
		)
	}

	def getDefaultInstanceForType = UsesImport.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
}

object UsesImport {
	@reflect.BeanProperty val defaultInstance = new UsesImport()

	val SIMPLE_TEST_FIELD_NUMBER = 1

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: UsesImport) = defaultInstance.mergeFrom(prototype)

}

object Imports {
	def registerAllExtensions(registry: com.google.protobuf.ExtensionRegistryLite) {
	}

}
