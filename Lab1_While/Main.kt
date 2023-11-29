fun fibonacci(maxNum: Long): Long{
    var t1 = 0L
    var t2 = 1L
    var sumFull = 0L

    print("Fibonacci sequence: ")
    while(t1 < maxNum){
        print("$t1, ")
        sumFull += t1

        val sum = t1 + t2
        t1 = t2
        t2 = sum
    }
    return sumFull
}

val fibonacciLambda = {maxNum: Long ->
    var t1 = 0L
    var t2 = 1L
    var sumFull = 0L

    print("Fibonacci sequence: ")
    while(t1 < maxNum){
        print("$t1, ")
        sumFull += t1

        val sum = t1 + t2
        t1 = t2
        t2 = sum
    }
    sumFull
}

fun main(args: Array<String>) {
    //DO NOT UNCOMMENT BOTH PARTS AT THE SAME TIME

    //=======================PART-1=======================
    val A0 = Point(5.0, 14.0)
    val B0 = Point(9.0, 1.0)
    println("Angle of A0 ${A0.AngleToX()}")
    println("Angle of B0 ${B0.AngleToX()}")

    //Using if, else
    if(A0.AngleToX() > B0.AngleToX()){
        println("A0 has bigger angle")
    }
    else {
        println("B0 has bigger angle")
    }

    //Using when
    val result = when(A0.AngleToX() > B0.AngleToX())
    {
        true -> "A0 has bigger angle"
        false -> "B0 has bigger angle"
    }
    println(result)


    println("Sum of fibonacci sequence = ${fibonacci(1000)}")
    println("Sum of fibonacci sequence using lambda = ${fibonacciLambda(1000)}")


    //=======================PART-2=======================
    /*val arithmetic = Arithmetic(2.0, 1.0, 1.0)
    val geometric = Geometric(2.0, 1.0, 1.0)

    println(geometric.type())
    println("This is sum of 5 = ${geometric.sum(5.0)}")
    println("This is 5th number = ${geometric.getByIndex(5.0)}")
    println("Current term is ${geometric.getTerm()}")
    geometric.nextTerm()
    println("Now current term is ${geometric.getTerm()}")

    println(arithmetic.type())
    println("This is sum of 5 = ${arithmetic.sum(5.0)}")
    println("This is 5th number = ${arithmetic.getByIndex(5.0)}")
    println("Current term is ${arithmetic.getTerm()}")
    arithmetic.nextTerm()
    println("Now current term is ${arithmetic.getTerm()}")*/
}