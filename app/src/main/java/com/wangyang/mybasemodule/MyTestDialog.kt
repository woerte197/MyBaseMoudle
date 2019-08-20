package com.wangyang.mybasemodule

import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.wangyang.baselibrary.ui.dialog.BaseDialog

class MyTestDialog : BaseDialog() {


    fun newInstance(): MyTestDialog {
        val args = Bundle()
        val dialog = MyTestDialog()
        dialog.arguments = args
        return dialog
    }

    override fun setStyle(): Int {
        return R.style.AlertDialog_AppCompat
    }

    override fun setLayout(): Int {
        return R.layout.test
    }


    override fun initView(view: View) {
        view.findViewById<TextView>(R.id.dialog_title).setOnClickListener {

        }
    }
    override fun initBundle(savedInstanceState: Bundle?) {
    }

}