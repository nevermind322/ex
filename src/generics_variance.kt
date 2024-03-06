class MyWrapper<out T>(val value : T) 

class MutableWrapper< T>(var value : T)



class Hider<in T>(val where : String){
    fun hide(obj : T){
        println("$obj hided in $where")
    }
}

open class Animal {
    open fun live(){
        println("Animal lives")
    }
}
class Cat : Animal()
{
    override fun live(){
        println("Cat lives")
    }
    
    fun meow(){
        println("meow")
    }
}

class Elephant : Animal(){
    
    override fun live(){
        println("Elephant lives")
    }
    
    fun makeWooo(){
        println("Woooo")
    }
}

fun main() {
    
    val cat  = Cat()
    val animal : Animal = cat
    cat.live()
    animal.live()
    cat.meow()
    
    val elephant = Elephant()
    
    val CatCage : MyWrapper<Cat> = MyWrapper(cat)
    val ElephantCage : MyWrapper<Elephant> = MyWrapper(elephant)
    
    val cage1 : MyWrapper<Animal> = CatCage
    val cage2 : MyWrapper<Animal> = ElephantCage
    
    cage1.value.live()
    cage2.value.live()
    
    //val mCage1 : MutableWrapper<Animal> = CatCage
    //val mCage2 : MutableWrapper<Animal> = ElephantCage
    //
    //mCage1.value = Elephant()
    //CatCage.value.meow()

    val CatHider1 : Hider<Cat> = Hider<Cat>("shelf")
    val ElephantHider1 : Hider<Elephant> = Hider<Elephant>("africa")
    val AnimalHider1 : Hider<Animal> = Hider<Animal>("zoo")
    
    val CatHider2 : Hider<Cat> = AnimalHider1
    val ElephantHider2 : Hider<Elephant>
	

   	AnimalHider1.hide(cat)
    AnimalHider1.hide(elephant)
    
    ElephantHider1.hide(elephant)
    CatHider1.hide(cat)
    
    CatHider2.hide(cat) 
    
    //val AnimalHider2 : Hider<Animal> = CatHider1
    //AnimalHider2.hide(cat)
	//AnimalHider2.hide(elephant) //->CatHider1.hide(elephant)
}
