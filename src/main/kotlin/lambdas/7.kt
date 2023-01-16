package lambdas

fun main(){
    var counter = 0
    val incrementCounter :() -> Unit ={
        counter += 1
    }

    incrementCounter()
    incrementCounter()
    incrementCounter()
    incrementCounter()
    incrementCounter()
    println(counter)

    fun countingLambda(): () -> Int{
        var counter = 0
        val incrementCounter: () -> Int  = {
            counter += 1
            counter
        }
        return incrementCounter
    }

    val counter1 = countingLambda()
    val counter2 = countingLambda()

    println(counter1())
    println(counter2())

    println(counter2)
    println(counter2)
    println(counter2)
    println(counter2)
}
