package com.example.hj.testkotlin.testDelegation

/**
 * 测试类委托,类委托使用by关键字
 */
class TestPerson(student:Person,val name:String,val age:Int):Person by student{
    override fun eat() {
        print("$name eating")
    }
}

fun main(){
    val testDelegation=TestPerson(Student(),"jack",20);
    testDelegation.eat()
}