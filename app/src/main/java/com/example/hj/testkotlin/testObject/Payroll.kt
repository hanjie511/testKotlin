package com.example.hj.testkotlin.testObject

/**
 * object声明是kotlin中创建单例的唯一方式。
 * 直接声明一个object,与类一样，oject声明可以包含属性、方法、初始化语句块声明，唯一不允许的就是构造方法（主构造和从构造方法）。
 * object声明在定义的时候就立即创建了，不需要在代码的其他地方调用构造方法。
 * object声明允许我们使用对象名.字符的方式来调用方法和访问属性。
 * object声明同样可以继承自类和接口。
 */
object Payroll {
    val allEmployees= arrayListOf<String>();
    fun calculateSalary(){
        for(str in allEmployees){
            println(str)
        }
    }
}

/**
 * 在类中也可以声明object，这样的object同样的只有一个单一实例，尽管这个类可以有不同的实例，但是声明的object只会有一个。
 */
 class TestObject{
    object Payroll1{
        val allEmployees= arrayListOf<String>();
        fun calculateSalary(){
            for(str in allEmployees){
                println(str)
            }
        }
    }
}
fun main(){
    Payroll.allEmployees.add("jack");
    Payroll.allEmployees.add("rose");
    Payroll.calculateSalary()
}