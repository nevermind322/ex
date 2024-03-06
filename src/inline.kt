import kotlin.random.Random

inline fun inlined(f: () -> Unit, noinline g: () -> Unit) {
    f()
    val h = g
    h()
    f()
}

inline fun inlined2(crossinline f: () -> Unit, noinline g: () -> Unit) {
    f()
    val h = g
    h()
    f()
}

inline fun f(crossinline body: () -> Unit) {
    val f = Runnable { body() } // crossinline так как может завершить функцию, которая вызвала f
}
fun main() {
    inlined({
        println("1")
        //return - завершит main
    },
        {
            println("2")
            val n = Random.nextInt()
            if (n % 2 == 0)
                return@inlined
            else
                println("3")
        })

    inlined2({
        println("1")
        // return - нельзя так как crossinline
    },
        {
            println("2")
            val n = Random.nextInt()
            if (n % 2 == 0)
                return@inlined2
            else
                println("3")
        })

    println("main end")
}