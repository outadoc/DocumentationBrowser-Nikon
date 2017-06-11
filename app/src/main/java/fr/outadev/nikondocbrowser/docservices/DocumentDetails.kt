package fr.outadev.nikondocbrowser.docservices

import java.io.File

/**
 * Information for a specific document, that has to be downloaded first from the
 * URLs stored in Document
 */
data class DocumentDetails(val document: Document, val indexPage: Int, val tocPage: Int, val pageAssociations: Map<Int, Int>, val pdf: File)