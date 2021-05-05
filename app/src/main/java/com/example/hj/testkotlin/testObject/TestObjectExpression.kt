package com.example.hj.testkotlin.testObject

import android.text.Editable
import android.text.TextWatcher
import android.widget.TextView

/**
 * 匿名对象用来代替Java中的匿名内部类，匿名对象不是单例的，每次对象表达式被执行都会创建一个新的object实例.
 * kotlin可以在匿名对象中访问非final的变量，而Java只能在匿名内部类中访问final修饰的变量。、
 * 可以为匿名对象分配一个名字，并将其存储在一个变量中。
 */
class TestObjectExpression {
    val textView:TextView?=null;
    private fun setTextWatcher(){
        textView?.addTextChangedListener(object:TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                TODO("Not yet implemented")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                TODO("Not yet implemented")
            }

            override fun afterTextChanged(s: Editable?) {
                TODO("Not yet implemented")
            }

        });
        val textWatcher=object:TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                TODO("Not yet implemented")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                TODO("Not yet implemented")
            }

            override fun afterTextChanged(s: Editable?) {
                TODO("Not yet implemented")
            }

        };
    }
}