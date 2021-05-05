package com.example.hj.testkotlin

import java.util.*
import kotlin.collections.ArrayList
class TestClass {
}

/**
 * 测试kotlin的空安全
 */
fun testConvert(){
    var str:String?=null;
    str=null;
    val a:Int?=str as? Int;//安全转化：as?,如果转换的类型不是目标类型则会返回null.
    println("a:"+a);

    val b:Int=str?.length?:-1;//elvis表达式: ?:,其作用是若表达式前的值不为null,则将其返回，若为null，则返回表达式后面的值。
    println("str.length:"+b);
}

/**
 * 测试kotlin的字符串模板
 */
fun testStringFormat(){
    val a:Int=2;
    val b:Int=3;
    val c= intArrayOf(1,2,3);
    val str1="this number is $a";//单个字符串模板使用。在字符串中要引用的值前面加上$符号，它等价与Java中的"Hell,"+name+""
    val str2:String="the value is:${a+b}";//复杂的字符串模板引用，在字符串中使用${},我们可以在{}中进行复杂的逻辑运算。
    val str3:String="the value is:${c[2]}";
    println(str1);
    println(str2);
    println(str3);
}

/**
 * 测试kotlin的区间
 */
fun testRange(){
    val a=1..10;//表示[1,10]的离散区间
    val b=1 until 10;//表示[1,10)的离散区间
    val c='a'..'z';//表示[a,z]的离散区间
    val d=1f..10f;//表示[1f,10f]的float连续区间，即该区间的值可以是1.0、1，02，1.21，1.3等没有固定步长的值。
    val f=1.0..10.0;//表示[1.0,10.0]的double连续区间，即该区间的值可以是1.0、1，02，1.21，1.3等没有固定步长的值。
    val intRange=1..10 step 2;//step表示步长关键字，它只对离散区间有用，表示区间的值每次变化多少。
    val g=10 downTo 1;//申明一个递减区间
    a.forEach{//区间的遍历，只对离散型区间有用
        print(" $it")
    }
    if (2 in a){//in关键字表示值是否在区间a中
        println(2 in a)
    }
    if(3 !in a){//!in关键字用来判断值不在区间中。
        println(3 !in a);
    }
}

/**
 * 测试kotlin的集合
 */
fun testCollection(){
    /**
     * kotlin中的集合类型完全复用java的集合类型，kotlin只是将集合分为可变集合和不可变集合
     * 可变集合在创建后还能进行添加和删除操作，不可变集合在创建完成后只能进行读取操作。
     * 集合的读写和数组的读写方式方式一样。
     */
    val map= mapOf("name" to "jack","age" to 20);//不可变map
    val mutableMap= mutableMapOf<String,Any>();//可变map
    mutableMap["name"]="rose";//map的添加
    mutableMap["age"]=20;//map的添加
    val name:String?=mutableMap["name"] as? String;//map的读取
    val age:Int?= mutableMap["age"] as? Int;//map的读取
    mutableMap.entries.forEach(){//map的遍历
        println("key:${it.key}");
        println("value:${it.value}");
    }

    val list= listOf<String>("jack","rose");//不可变的list
    val mutableList=ArrayList<String>();//可变的list
    val mutableList1=LinkedList<String>();//可变的list
    mutableList+="rose";//集合的添加
    mutableList[0]="jack";//集合的修改
    val name1:String=mutableList[0];
    println("name1:$name1");
}

/**
 * 测试给函数参数设置默认值
 * 给参数设置默认值的好处：在调用函数时不用给每个参数都传参，
 *不想传的参数可以省略，
 * 在传参时可以不按照参数在函数中的顺序传参
 * 这样我们就可以在类中只写一个构造方法了，而不像Java的类中存在多个构造方法。
 */
fun joinToString(collect:Int=0,separator:String=",",prefix:String="",postFix:String=""){
    println("collect:$collect");
    println("separator:$separator");
    println("prefix:$prefix");
    println("postFix:$postFix");
}

/**
 * 测试可变长参数，可变参数用vararg关键字修饰。
 * 参数args是对应参数类型的数组
 */
fun testVararg(vararg args:String, num:Int){
    args.iterator().forEach { println(it) }
}

/**
 * 测试三重双引号字符，其作用是避免转义字符，我可以在字符串中直接使用特殊字符而不要使用转移字符。
 */
fun testTripeQuote(){
    val str="""c:\user\yole\kotlin-book"""
    print("$str")
}
fun main(){
  //  testConvert();
  //  testStringFormat()
   // testRange()
  //  testCollection()
//    joinToString();
//    joinToString(postFix = "jpg",separator ="-",collect = 67);
//    myList.add("123");
//    myList.add("321");
//    myList.forEach(){
//        println(it)
//    }
 //   print("123".getLastChar())
  //  testVararg("12","32","13","23",num=0);
    testTripeQuote()
}


