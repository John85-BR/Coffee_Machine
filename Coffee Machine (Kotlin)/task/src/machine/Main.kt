package machine

class CoffeeMachine(_water: Int = 400, _milk: Int = 540, _grams: Int = 120, _cups: Int = 9, _money: Int = 550){

    var water = _water
    var milk = _milk
    var grams = _grams
    var cups = _cups
    var money = _money
    
    fun printMachine(){
        println("The coffee machine has:")
        println("$water ml of water")
        println("$milk ml of milk")
        println("$grams g of coffee beans")
        println("$cups disposable cups")
        println("\$$money of money")
    }

    fun buy(bop: String){
        if (bop == "1"){
    
            if(water>=250 && grams >= 16){
                println("I have enough resources, making you a coffee!")
                water -= 250
                grams -= 16
                money += 4
                cups-=1
            } else {
                var word = ""
                word += if (water < 250) " water" else ""
                word += if (grams < 16) " grams" else ""
                println("Sorry, not enough$word!")
            }
    
                    
        } else if(bop == "2") {
    
            if(water>=350 && milk >= 75 && grams>=20){
                println("I have enough resources, making you a coffee!")
                water -= 350
                milk -= 75
                grams -= 20
                money += 7
                cups-=1
            } else {
                var word = ""
                word += if (water < 350) " water" else ""
                word += if (milk < 75) " milk" else ""
                word += if (grams < 20) " grams" else ""
                println("Sorry, not enough$word!")
             }
                   
        } else if(bop == "3" ) {
    
            if(water>=200 && milk >= 100 && grams>= 12){
                println("I have enough resources, making you a coffee!")
                water -= 200
                milk -= 100
                grams -= 12
                money += 6
                cups-=1
            } else {
                var word = ""
                word += if (water < 200) " water" else ""
                word += if (milk < 100) " milk" else ""
                word += if (grams < 12) " grams" else ""
                println("Sorry, not enough$word!")
            }
        } 
    }
    

    fun fill(){
        println("Write how many ml of water you want to add:")
        water += readln().toInt()
        println("Write how many ml of milk you want to add:")
        milk += readln().toInt()
        println("Write how many grams of coffee beans you want to add:")
        grams  += readln().toInt()
        println("Write how many disposable cups you want to add:")
        cups += readln().toInt()
    }

    fun take(){
        print("I gave you \$$money")
        money = 0
    }
    
}



fun main() {

    val coffeeMachine = CoffeeMachine()

    while(true){
        println("Write action (buy, fill, take, remaining, exit):")
        val op = readln()

        when(op){
            "buy" -> {
                println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:")
                val bop = readln()
                if (bop == "back"){
                continue
                } else {
                    coffeeMachine.buy(bop)
                }
            }
            "fill" -> {
                coffeeMachine.fill()
            }
            "take" -> {
                coffeeMachine.take()
            }
    
            "remaining" -> {
                coffeeMachine.printMachine()
            }
    
            "exit" -> {
                break
            }
            
        }
    }
}
