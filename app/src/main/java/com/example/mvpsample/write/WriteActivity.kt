package com.example.mvpsample.write

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mvpsample.R
import com.example.mvpsample.datas.Todo
import kotlinx.android.synthetic.main.activity_write.*

//WriteView

class WriteActivity : AppCompatActivity(), WriteView {

    private val writePresenter : WritePresenter = WritePresenterImpl(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_write)

        submitButton.setOnClickListener {
            writePresenter.save(content.text.toString(), author.text.toString())
        }
    }

    override fun quitSuccess() {
        finish()
    }

    override fun showErrorToast(errMsg: String) {

        Toast.makeText(this, errMsg, Toast.LENGTH_LONG).show()
    }
}
