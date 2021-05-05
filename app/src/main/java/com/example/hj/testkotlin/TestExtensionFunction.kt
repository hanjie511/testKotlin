package com.example.hj.testkotlin

/**
 * 声明的一个顶层属性，顶层属性的作用是消除类似于定义在Java类中的static属性
 */
var myList= mutableListOf<String>();
/**
 * 声明的一个顶层函数，顶层属性的作用是消除类似于定义在Java类中的static方法
 */
fun printString(str:String?){
    println(str)
}

/**
 * 声明一个String类型的扩展函数,声明的扩展函数可以像在接收者类型中的成员一样使用this关键字，也可以省略不写
 * 扩展函数不会被重写
 */
fun String.getLastChar():Char{
    val lastIndex:Int=length;
    return get(lastIndex-1);
}
class TestExtensionFunction {
}