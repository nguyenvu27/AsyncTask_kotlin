package com.example.asynctask

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnXuLy.setOnClickListener { XuLiCongViec().execute() }
    }

    inner class XuLiCongViec : AsyncTask<Void, String, String>() {

        override fun onPreExecute() {
            super.onPreExecute()
            txtNoiDung.text = "bắt đầu thực hiện \n"
        }

        override fun doInBackground(vararg params: Void?): String {
            for (cv in 1..5){
                publishProgress("Xong việc $cv \n")
            }

            return "Kết thúc công việc"
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
            txtNoiDung.append(result)
        }

        override fun onProgressUpdate(vararg values: String?) {
            super.onProgressUpdate(*values)
            txtNoiDung.append(values[0])
        }

    }
}
