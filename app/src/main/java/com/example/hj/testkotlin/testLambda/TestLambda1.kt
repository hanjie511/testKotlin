package com.example.hj.testkotlin.testLambda

import com.example.hj.testkotlin.testDelegation.Person
import com.example.hj.testkotlin.testDelegation.Student
data class People(val name:String,val age:Int){

}
data class Book(val name:String,val author:List<String>){

}
/**
 * lambda编程提供给集合的函数式API
 */
/**
 * filter函数：遍历集合并选出应用给定lambda后会返回true的那些元素。
 * 该函数在操作完成后会返回一个新的集合，他会移除不满足条件的元素。
 */
fun testFilter(){
    val list= listOf<Int>(1,2,3,4,5,6);
    val newList=list.filter { it%2==0 }
    println("$newList")
}
/**
 * map函数：对集合中的每一个元素应用给定的函数。。
 * 该函数在操作完成后会返回一个新的集合，他不会移除元素，只会改变集合中的每个元素。
 * 可以使用map对集合中的对应元素显示的项进行过滤
 */
fun testMap(){
    val list= listOf<Int>(1,2,3,4);
    val newList=list.map { it*it };
    println("$newList");
    val list1= listOf<People>(People("jack",20), People("rose",18));
    val newList1=list1.map { it.name }
    println("$newList1");
}

/**
 * 将filter和map结合起来使用
 */
fun testFilterAndMap(){
    val list1= listOf<People>(People("jack",20), People("rose",18), People("jason",22));
    val newList1=list1.filter { it.age>18 }.map{it.name};
    println("$newList1")
}

/**
 * 我们可以使用对map也进行filter和map操作
 */
fun testMapFilterAndMap(){
    val map= mapOf<String,Any>("name" to "jack","age" to 20);
    println("${map.filterKeys { it=="name" }}");
    println("${map.mapKeys { it.key.toUpperCase() }}");
}
/**
 * lambda的判断表达式
 * all函数：判断集合中的所有元素是否都满足给定的判断式。
 * any函数：判断集合中的元素是否至少有一个满足给定的判断式
 * count函数：计算集合中有多少个元素满足给定的判断式
 * find函数：在集合中找到一个满足给定判断式的元素，如果有多个元素满足则只返回第一个元素，若没有，则返回null。
 */
fun testJudgeExpression(){
    val list= listOf<People>(People("jack",20), People("rose",18), People("jason",22));
    println("${list.all { it.age>18 }}");
    println("${list.any { it.age>24 }}");
    println("${list.count { it.age>=20 }}");
    println("${list.find { it.age>=18 }.toString()}");
}

/**
 * groupBy函数：把列表转换成分组的map,其中map的key是分组时的条件的值，value是分组后，满足分组条件的各个元素组成的新的集合。
 */
fun testGroupBy(){
    val list= listOf<People>(People("jack",20), People("rose",18), People("jason",22));
    val map=list.groupBy { it.age };//按年龄分组
    println(map);
}

/**
 * flatten函数：将多个集合合并成一个集合
 * flatMap函数：先对集合中的元素做变换然后再将变换后的元素合并成一个集合
 */
fun testFlattenAndFlatMap(){
    val books= listOf<Book>(Book("呐喊", listOf("张三","李四")),Book("彷徨", listOf("张三","罗六","王五","李四")))
    println("${books.flatMap { it.author}.toSet() }")
    val numberSets = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(1, 2))
    println(numberSets.flatten())
}
fun main(){
  //  testFilter();
  //  testMap()
  //  testFilterAndMap()
  //  testJudgeExpression()
  //  testGroupBy()
  //  testMapFilterAndMap()
  //  testFlattenAndFlatMap()
}