interface Base {
    
    fun g()
    
    fun f()
    
}

class Der1 : Base {
    override fun g() {
        println("g from der1")
    }
    
    override fun f() {
        println("f from der1")
    }
}

class Der2( private val proxy : Base) : Base by proxy {
    
    override fun g() {
        println("g from der2")
    }
    
} 


fun main() {
    
    
    val der1 = Der1()
    val der2 = Der2(der1)
    
    der2.f()
    der2.g()
}
