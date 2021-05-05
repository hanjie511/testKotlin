package com.example.hj.testkotlin.testLambda

import android.view.View
import android.widget.Button

/**
 * 函数式接口或者SAM接口：我们称只有一个抽象方法的接口为函数式接口或者是SAM接口。
 * 如Java中的Runnable和Callable这样的函数式接口
 */
class TestSAMInterface {
    val button: Button?=null;
    fun setClick(){
        button?.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                TODO("Not yet implemented")
            }

        });
        /**、
         * 在kotlin中我们可以使用lambda表达式来代替上面用对象表达式创建的匿名对象——函数式接口：
         */
        button?.setOnClickListener { view ->

        }
    }
}