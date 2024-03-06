interface Base {
    
    fun g()
    
    fun f()
    
}

class Der1(val name : String) : Base {

    override fun g() {
        println("g from $name")
    }
    
    override fun f() {
        println("f from $name")
    }
}

class Der2(  proxy : Base) : Base by proxy {
    
    override fun g() {
        println("g from der2")
    }
    
} 


fun main() {
    
    
    val der1 = Der1("foo")
    val der2 = Der2(der1)
    
    der2.f()
    der2.g()
}
