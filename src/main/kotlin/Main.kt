import java.lang.IllegalArgumentException

fun main(args: Array<String>) {
    Singleton.increment()
    Singleton.increment()
    Singleton.print()

    /*val simpleClass = SimpleClass()
    val other = SimpleClass(1)*/
    /*val simpleClass = SimpleClass("Den")
    println(simpleClass)*/
    val simpleClass = SimpleClass()

    val nested = KotlinClass.NestedKotlin(5)
    nested.print()



}



object Singleton{
    private var x=0
    fun increment(){
        x++
    }
    fun print(){
        print(x)
    }

}

/*
class SimpleClass(private val data: Int = 0) {
    // одновременно обЪявление класса и конструктор
}*/
/*
class SimpleClass {
    private val data: Int
    constructor(text:String=""):this(text.length)
    constructor(number:Int){
        data=number
    }
}*/

class SimpleClass{
    constructor(){
        println("constructor call")
    }
    init {
        println("init Kotlin SimpleClass")
    }
}

class KotlinClass{
    class NestedKotlin(private val i:Int){
        fun print(){
            print("hello from nested")
            print(i)
        }
    }
}

fun max(a: Int, b: Int): Int = if (a > b) a else b

/*fun checkNumber(x:Int){
    if (x>0){
        print("positive")
    }else if (x<0){
        print("Negative")
    }else{
        print("zero")
    }
}*/
fun checkNumber(x:Int){
    when {
        x>0 -> print("positive")
        x<0 -> print("Negative")
        else -> print("zero")
    }
}

fun convertGrade(grade:Int){
    when(grade){
        5-> print("A")
        4-> print("B")
        3-> print("C")
        2-> print("D")
        1-> print("E")
        else->throw IllegalArgumentException("unknown grade")
    }
}


fun convertGradeNew(grade:Int) = when(grade){
    5-> print("A")
    4-> print("B")
    3-> print("C")
    2,1-> print("D")
    else->throw IllegalArgumentException("unknown grade")
}

fun checkNumberNew(x:Int){
    when(x){
        in 1..100-> print("Positive")
        in -101..-1-> print("negative")
        else -> print("out of range")
    }
}

fun check(x:Any) = when(x){
    is String -> print(x.isEmpty())
    is Int -> print(x+1)
    else -> print("unknown type")
}

fun checkNew(x:Any){
    print((x as String).isEmpty())
}