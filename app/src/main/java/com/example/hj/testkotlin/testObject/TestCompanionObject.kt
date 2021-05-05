package com.example.hj.testkotlin.testObject

/**
 * 伴生对象：使用companion object表示。它的作用：由于顶层函数不能访问类的private成员，我们又需要在没有类实例的情况下调用但是需要
 * 访问类内部的函数，可以将其写成那个类中的object声明的成员，并用companion标记。
 *
 */
class TestCompanionObject {
    companion object{
        fun bar(){
            print("companion object call")
        }
    }
}

/**
 * 伴生对象可以当作普通对象使用。
 * 我们可以为伴生对象命名，它还可以实现一个接口或者有扩展函数或属性。
 */
class TestCompanionObject1 private constructor(val userName:String){
    companion object{
        fun bar(username:String):TestCompanionObject1{
            return TestCompanionObject1(username);
        }
    }
}
fun main(){
   // TestCompanionObject.bar()
    println(TestCompanionObject1.bar("jack").userName)
}