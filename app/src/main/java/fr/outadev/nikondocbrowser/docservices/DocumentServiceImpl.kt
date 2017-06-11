package fr.outadev.nikondocbrowser.docservices

import com.github.kittinunf.fuel.core.FuelManager
import com.github.kittinunf.fuel.core.HttpException
import com.github.kittinunf.fuel.httpGet
import fr.outadev.nikondocbrowser.docservices.dto.DocumentDTO
import fr.outadev.nikondocbrowser.docservices.dto.DocumentListDTO
import org.simpleframework.xml.core.Persister

class DocumentServiceImpl : DocumentService {

    private val cache: List<DocumentDTO> by lazy {
        fetchDocumentsFromService()
    }

    private val serializer: Persister = Persister()

    init {
        FuelManager.instance.basePath = "http://app.nikonimglib.com/mv2/en/xml"
    }

    private fun fetchDocumentsFromService(): List<DocumentDTO> {
        val client = "/pdf_list_en.xml".httpGet().responseString()

        when(client.second.httpStatusCode) {
            200 -> {
                when (client.third.component1()) {
                    null -> throw HttpException(client.second.httpStatusCode, "Empty response data")
                    else -> {
                        val stringRes = client.third.component1()!!
                        val res: DocumentListDTO = serializer.read(DocumentListDTO::class.java, stringRes)
                        return res.documents!!
                    }
                }
            }
            else -> throw HttpException(client.second.httpStatusCode, "Error while loading data from Nikon")
        }
    }

    override fun getAvailableDocuments(): List<Document> {
        TODO()
    }

    override fun getAvailableDevices(): List<Device> {
        TODO()
    }

    override fun getFullDocumentationForDevice(device: Device): List<DocumentDetails> {
        TODO()
    }
}