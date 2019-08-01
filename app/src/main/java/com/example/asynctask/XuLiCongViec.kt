//package com.example.asynctask
//
//import android.os.AsyncTask
//import kotlinx.android.synthetic.main.activity_main.*
//
//class XuLiCongViec : AsyncTask<Void, String, String>() {
//
//    override fun onPreExecute() {
//        super.onPreExecute()
//        txtNoiDung.text = "bắt đầu thực hiện \n"
//    }
//
//    override fun doInBackground(vararg params: Void?): String {
//
//        return "Kết thúc công việc"
//    }
//
//    override fun onPostExecute(result: String?) {
//        super.onPostExecute(result)
//        txtNoiDung.append(result)
//    }
//
//}
//
//}