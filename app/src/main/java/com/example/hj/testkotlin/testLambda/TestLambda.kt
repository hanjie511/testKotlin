package com.example.hj.testkotlin.testLambda

/**
 * 测试lambda编程
 */
fun testLambda1(num:Int):Int{
   return num;
}
class TestLambda(var name:String) {
    val myName:String=name;
     fun testLambda(){
        println("name:$name");
    }
}


fun main(){
    /**
    * lambda成员引用，用::符号表示,用双冒号把类名称和我们要引用的成员（一个方法或者一个属性）名称隔开。
     * 不管引用的是函数还是属性，都不要在成员引用的名称后面加括号。
     * 引用顶层函数或属性直接以::开头。
    */
    val number=::testLambda1;
    println(number(3));
    /**
     * 类实例的延迟初始化
     */
    val testLambda=::TestLambda;
    val testLambda1=testLambda("jack");
    println(testLambda1.myName);
    println(testLambda1.testLambda());
}