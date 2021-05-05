package com.example.hj.testkotlin.testDelegation

import android.view.View
import android.widget.Button

/**
 * 测试类委托，让其实现View.OnClickListener接口；却不用实现该接口的方法或者有选择性的实现接口中的方法
 */
class MyClick(click:View.OnClickListener):View.OnClickListener by click{
    private val button:Button?=null;
    private fun setClick(){
        button?.setOnClickListener(this);
    }
}