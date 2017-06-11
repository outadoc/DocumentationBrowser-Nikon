package fr.outadev.nikondocbrowser

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import fr.outadev.nikondocbrowser.docservices.DocumentServiceImpl
import org.jetbrains.anko.doAsync

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        doAsync {
            val ds = DocumentServiceImpl()
        }
    }
}
