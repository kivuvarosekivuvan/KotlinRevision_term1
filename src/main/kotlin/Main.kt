import kotlin.random.Random
import kotlin.random.nextInt

fun main(args: Array<String>) {
    school()
    println(nameAndage("Rose",22))
    println(strings("AkiraChix"))
    myName("Rose")
}


fun school(){
    var sch="Akirachix"
    print(sch[0])
    print(sch[2])
    print(sch[3])
    println()}


fun nameAndage(name:String, age:Int):String {
    var statement = "Hi, my name is $name and I am $age years old"
    return statement
}


fun strings(word:String):Int {
    return word.length
}


fun myName(name:String){
    if(name.equals("Rose")){
        println("That's me!")
    } else
        println("I don't know who that is")}
}


/** Determine if 'a' is less than 15 and b is more than 15. **/
//fun isFifteenBetween(val a: Int, val b: Int) {
//    if((a < 15) && (b > 15)) { return(true) }
//    else { return(false) }
//}


fun foo(arg: Boolean): String {
    when (arg) {
        true -> return "Truth"
        false -> return "Falsehood"
    }
}


//23rd Feb
fun main2(){
    var numArray=arrayOf(12,9,56,9,32)
    print(numArray[0])
    print(numArray[4])
    println()
}

fun main3(){
 val friends= arrayOf("Mercy", "Myres", "Nicole", "Judy")
    println(friends.contentToString())
    println(friends.get(2))
    println({"$friends[2] $friends[3]"})
    friends.set(1,"Treasure")or friends[1]="Treasure"
}


fun main4() {
    val friends = arrayOf("Mercy", "Myres", "Nicole", "Judy")
    var friends2=friends.plus("Joy")
    println(friends2.contentToString())
    val newFriends =arrayOf("sarah","Koko")
    println(friends2.plus(newFriends))


//    SWAPPING ELEMENTS

    var firstName=friends[0]
    friends[0]=friends[3]
    friends[3]=firstName

//    FINDING A INDEX WHEN HAVING THE ELEMENT
    println(friends.indexOf("Myres"))
}


//fun main5(){
    var volume=cuboid(6,7,8)
    println("The volume of a cuboid is: $volume")
    var surfaceArea=cuboid(6, 7, 8)
    println(" The surfaceArea of a cuboid is: $surfaceArea")
}


fun cuboid(W:Int, H:Int, L:Int):Int{
    var volume= W* H* L
    var surfaceArea=2*((L*W)+(W*H)+(L*H))
    return surfaceArea
}


//     CLASSES
fun main6(){
  var all= Cuboid(6, 7, 8)
    var y=all.volume()
   println("The surface area of a cuboid is: $y")
    var x=all.sarea()
    println("The surface area of a cuboid is: $x")
}


class Cuboid(var w:Int, var l:Int, var h:Int){
   fun volume():Int{
       var v= w* l* h
       return v
   }
    fun sarea():Int{
        var surfaceArea=2*((l*w)+(w*h)+(l*h))
        return surfaceArea
    }


   fun main7(){
       rich()
   }


fun rich() {
    var money = "My name is Rose Kivuva and I love my country"
    var words = money.split("\\s+".toRegex())
    println(words)}


fun main8(){
    //WHILE LOOP
    var i = 0
    while (i < 5) {
        println(i)    //prints in a vertical way
        i++
    }
     //LOOP OVER A RANGE FROM O-10
    for (i in 0..10) {           //prints in horizontal
        print(" $i")
    }

        val chars = ('a'..'f')
        val me = chars.iterator()
        println(chars)           //prints in vertical
    while(me.hasNext())
    { var p=me.next()
        println(p)
    }



    //lENGTH OF ARRAY
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    println(cars.size)
    var mee="pepe"
    println(mee.replace('p' to 'P'))

    //TYPE CONVERSIONS
    var value1 = 20
    val state: String= value1.toString()
    println(value1)
}


fun main9(){
   println(mixed(arrayOf("Rose",250F,true,20, 30.00,22.08,15)))
    space()
    println( get("Rose", "Me"))
    println(min.calo(arrayOf(22,44,77,7,1,4,5,2,7)))
}


//write a function that takes in an array of mixed types
//and returns the sum of all
//the decimal elements
fun mixed(mixx:Array<Any>):Double{
 var sum=0.00
    for (x in mixx){                                          // ADDING DECIMAL NUMBERS
    if(x is Double || x is Float){
    sum += x.toString().toDouble()
    }
}
    return sum
}
////Write and call a function that takes in a string and splits it into all the
////characters that constitute it. Your function should print out this output.
fun space(){
    var state="M:o:m:b:a:s:a"
    var p=" : "                                                   //SPLITTING STRINGS
    println(state.split(p))
}

////Write and invoke a function that takes in any 2 strings and returns the first
////character of the longer string or the first character of the first string if they are
////equal in length.
fun get(str1:String, str2:String):Char {
    if (str1.length >= str2.length ) {
    return str1[0]
    }
    else {
        return str2[0]
    }
}

////Write and invoke one function that takes in an array of integers and returns
////these 3 values: smallest, largest and average of all the elements
class Logs(var min:Int, var max:Int, var avg:Double){
    fun calo(num:Array<Int>):Logs{
        val min=num.min()
        val max=num.max()
        val aveg=num.average()
        val p=Logs(min,max,aveg)
        return p
    }
}

fun main(){
    println(arr(arrayOf("Rose", "Myres", "Amos")))
}
//. Write and call a function that takes in an array of strings, joins them all into
//one string and returns it.
fun arr(name:Array<String>):String{
    var x=" "
    for(i in name){
        x+= i
    }
    return x
}

//To check if an array is a given number
fun main(args: Array<String>) {

    val num = intArrayOf(1, 2, 3, 4, 5)
    val toFind = 3
    var found = false
    for (n in num) {
        if (n == toFind) {
            found = true
            break
        }
    }

    if (found)
        println("$toFind is found.")
    else
        println("$toFind is not found.")

    println(convert(23.0))

    diceRoll(20)
    random(1..10)
}

//Write the program to canvert celcius to fanhrenit   0 degree= 32 fahnreint  formula=celcius * 1.8 + 32

fun convert(temp:Double):Double{
    var change= (temp *1.8) + 32
    return change
}

/* Question 5
Write a program that simulates a dice roll.
The user should be prompted to enter the number of sides on the dice, and then the program should randomly generate a number between 1 and the number of sides.
The program should then print out the result of the roll.
 */

fun diceRoll(diceSides: Int){
    val result = Random.nextInt(1, diceSides) + 1
    println("The result of the roll is: $result")
}

fun random(guess:IntRange):Int{
    var randomNum=guess.random()        //The user does not have to enter anything THis is better for generating a winner
    return randomNum
}

//Replacing all instances of a character in a string
fun replacing(){
    var words="Rose is learning kotlin now"
    var target="o"
     var str=words.replace(target, "u")

}    }
























//
//}
////       SWAPPING ELEMENTS
//fun main(){
//    var many= arrayOf("Rose","Myres", "Maiko",22)
//    var him=many[2]
//    many[2]=many[0]
//    many[0]=him
//    println(many.indexOf ("Maiko"))
//    println(many.indexOf("Rose"))
//    println(many.get(2))
//}










































































