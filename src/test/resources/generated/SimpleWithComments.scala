// Generated by ScalaBuff, the Scala protocol buffer compiler. DO NOT EDIT!
// source: simpleWithComments.proto

object SimpleWithComments {
	trait SimpleRequestOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {

		def hasQuery: Boolean
		def getQuery: String

		def hasPageNumber: Boolean
		def getPageNumber: Int

		def hasResultsPerPage: Boolean
		def getResultsPerPage: Int

	}

	case class SimpleRequest() extends com.google.protobuf.GeneratedMessageLite with SimpleRequestOrBuilder {
	}


	def registerAllExtensions(registry: com.google.protobuf.ExtensionRegistryLite) {
	}

}