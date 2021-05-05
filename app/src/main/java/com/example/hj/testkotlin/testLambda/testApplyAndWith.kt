package com.example.hj.testkotlin.testLambda

import kotlin.text.StringBuilder

/**
 * 带接受者的lambda:with和apply函数。
 * with函数：如果我们要对同一个对象执行多次操作，而不需要反复把对象的名称写出来。
 * apply函数：和with函数的功能一样，只是它返回的接收者对象而with函数返回的是lambda的执行结果。
 */
class testApplyAndWith {
    fun alphabet():String{
        val stringBuilder=StringBuilder();
        return with(stringBuilder){
            for(letter in 'A'..'Z'){
                append(letter)
            }
            append("\nNow I know the alphabet!")
            toString();
        }
    }
    fun alphabet1()=StringBuilder().apply {
        for(letter in 'A'..'Z'){
            append(letter);
        }
        append("\nNow I know the alphabet!")
    }.toString();
}