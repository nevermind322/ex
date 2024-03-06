class Client(val name : String, var money : Double = 0.0){
    var order : String? = null
    fun makeRequest(nameOfProduct : String){
        if (this !in Dealer.BlackArray ) {
            if (Dealer.IsInStock(nameOfProduct)) {
                order = nameOfProduct
                Dealer.makeDeal(this)
            }
            else{
                println("Product $nameOfProduct is out of stock")
            }
        }
        else {
            println("Error: this client is in blacklist")
        }
    }
}

class Product(val name : String, var price : Double?)

object Dealer{
    fun addProduct(name: String,price: Double? = null) {
        ProductArray += Product(name, price)
    }
    fun changePrice(product : Product?, newPrice : Double){
        if (product != null ) product.price = newPrice
    }

    var BlackArray = emptyArray<Client>()
    var ProductArray = emptyArray<Product>()
    fun IsInStock(searchedName : String) : Boolean{
        for (i in ProductArray){
            if(i.name == searchedName && i.price != null) return true
        }
        return false
    }
    fun makeDeal(client: Client){
        if (ProductArray.find{ it.name == client.order }!!.price as Double <= client.money){
            println("Product ${client.order} is sold to ${client.name}")
        }
        else{
            BlackArray += client
        }
    }
}




