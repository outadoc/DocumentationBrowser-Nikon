package fr.outadev.nikondocbrowser.docservices

interface DocumentService {
    fun getAvailableDocuments(): List<Document>
    fun getAvailableDevices(): List<Device>
    fun getFullDocumentationForDevice(device: Device) : List<DocumentDetails>
}
