import java.util.*

fun main()  {
    string("Akirachix", "banana", "sneakers", "Tabby")
    country()
    numbers()
    var names=names("tabitha","aluel","athok")
    println(Arrays.toString(names))

}
fun string(school:String, fruit:String, shoes:String, name:String) {
    var names = arrayOf(school,fruit,shoes,name)
    println(Arrays.toString(names))

}
fun country() {
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    println(cities[0].capitalize()+" "+ cities[1].capitalize()+" "+cities[2].capitalize()+" "+cities[3].capitalize())
}
fun numbers() {
    var numberArray= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    val sum= numberArray[2] + numberArray[5]
    println(sum)
    println(numberArray.indexOf(158))
    var sortedNumbers=numberArray.sortedArray()
    println(Arrays.toString(sortedNumbers))}
fun names(name1:String, name2:String, name3:String):Array<String>{
    var stringArray= arrayOf(name1,name2,name3)
    return stringArray



}

