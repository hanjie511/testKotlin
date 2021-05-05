package com.example.hj.testkotlin.testLambda

/**
 * 使用序列操作集合不会创建任何中间集合，这样可以显著的提升处理集合的效率。
 * 序列对集合的中间操作是惰性的。例如处理完第一个元素的filter和map操作后，才会紧接着去处理第二个元素的filter和map操作。
 * 在惰性求值的过程中，只要有一个元素满足惰性求值条件，则整个求值过程将会结束，后面的元素将不会进行处理。
 * 使用asSquence()方法可以将任意集合转换为序列。
 * 调用toList方法可以将序列转换为集合。
 */
fun testSequence(){
    val list= listOf<Int>(1,2,3,4,5);
    println("${list.asSequence().map { it*it }.find { it>4 }}");
}
fun main(){
    testSequence()
}