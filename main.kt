open class Animal(val name:String,val color:String) {
    fun eat()=println("I eats")
}
class Dog(name:String,color:String):kt1(name,color)
class Cat(name:String,color:String):kt1(name,color)
fun main(){
    val dog=Dog("labrador","black")
    val cat=Cat("pussy","white")
    dog.eat()
    cat.eat()
}