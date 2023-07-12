class Robot(val name:String) {

    fun ringAlarm(time: Int,dayAlarm: String) {
        when (dayAlarm) {
            "SUNDAY", "SATURDAY" -> println("its a weekend, get a proper sleep :)")
            else -> println("its a weekday and time : $time 'o clock .Wake up bro !!")
        }
    }

    fun takeBath( temp: Int) = println("Water boiled to $temp ,go for bath")

    fun pack( dayP: String) {
        val books = listOf("Maths", "Physics", "Chemistry", "Biology", "CS", "PHE", "English")
        when (dayP) {
            "SUNDAY" -> println("Enjoy bro! its a Funday")
            "MONDAY", "FRIDAY", "WEDNESDAY" -> println("Books for today : ${books[0]},${books[1]},${books[2]}")
            "TUESDAY", "THURSDAY" -> println("Books for today : ${books[3]},${books[4]},${books[5]}")
            "SATURDAY" -> println("Book for today : ${books[6]}")
            else -> println("Invalid Day")
        }
    }

    fun ironing( cloth1: String,  cloth2: String) {
        val items = listOf("Trouser", "Shirt", "Tshirt", "Pant", "Jeans", "Hoodie")

        if (items.contains(cloth1)) {
            if (items.contains(cloth2)) {
                println("Your wardrobe is ready")
            } else {
                println("you dont have selected lower cloth")
            }
        } else {
            println("you dont have selected upper cloth")
        }
    }

    fun meal() {
        val bf = listOf("EGG", "MILK", "CORNFLAKES", "PARATHA")
        val lunch = listOf("RAJMA", "TAMATAR", "AALU", "PANEER")
        println("Breakfast for today : ${bf.random()}")
        println("Lunch for today : ${lunch.random()}")
    }

    fun coffeeday(cf: Coffee) {
        if(cf.Milk==true){
            println("Your coffee with ${cf.spoonsSugar} spoons sugar is ready")
        }
        else{
            println("Your black coffee with ${cf.spoonsSugar} spoons sugar is ready")
        }

    }
}

data class Coffee(val Milk:Boolean, val spoonsSugar:Int)

fun main(){
    val r=Robot("Aman")
    r.ringAlarm(7,"SUNDAY")
    r.takeBath(30)
    r.meal()
    r.coffeeday(Coffee(true,2))
    r.ironing("Shirt","Pant")
    r.pack("FRIDAY")
}
