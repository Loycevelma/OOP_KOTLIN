fun main() {
var person=Human("Loyce",18,59)
    println(person.name)
    println(person.age)
    println(person.weight)
   println( person.eat(12))
    println(person.speak("Hi Everyone, you look nice"))
    println(person.birthday())
var qualities=Personality("Loyce Velma","Amondi",2020,"amondiloyce@gmail.com","0706387923")
    println(qualities.firstname)
    println(qualities.lastname) }
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int):Int{
        println("I am eating $foodWeight Kgs of food")
        weight= foodWeight+weight
        return weight
    }
    fun speak(speech:String):String{
        return speech
    }
    fun birthday():Int {
        age=age+1
        return age
    }
}
data class Personality(var firstname:String,var lastname:String,var password:Int,var email:String,var phonenumber:String){
}