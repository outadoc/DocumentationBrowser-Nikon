package fr.outadev.nikondocbrowser.docservices

import java.net.URL

data class Document(val id: Int, val device: Device, val type: String, val coverPictureUrl: URL, val contentInfoUrl: URL, val pdfUrl: URL, val pageAndSearchInfoUrl: URL)
