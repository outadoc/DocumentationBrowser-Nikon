package fr.outadev.nikondocbrowser.docservices.dto

import org.simpleframework.xml.Element
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root

/**
 * Created by outadoc on 2017-06-11.
 */
@Root(name = "pi", strict = false)
class DocumentDTO {
    @field:Element(name = "fs", required = false)
    var id: Int? = null

    @field:ElementList(entry = "in", required = false, inline = true)
    var deviceNames: List<String>? = null

    @field:Element(name = "fn", required = false)
    var type: String? = null

    @field:Element(name = "cu", required = false)
    var contentsUrl: String? = null

    @field:Element(name = "su", required = false)
    var pageAndSearchInfoUrl: String? = null

    @field:Element(name = "tu", required = false)
    var coverPictureUrl: String? = null

    @field:Element(name = "fu", required = false)
    var pdfUrl: String? = null
}