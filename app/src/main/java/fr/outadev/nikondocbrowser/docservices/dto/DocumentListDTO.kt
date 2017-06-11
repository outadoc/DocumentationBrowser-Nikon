package fr.outadev.nikondocbrowser.docservices.dto

import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root

/**
 * Created by outadoc on 2017-06-11.
 */
@Root(name = "di")
class DocumentListDTO {
    @field:ElementList(name = "fl", entry = "pi")
    var documents: List<DocumentDTO>? = null
}
