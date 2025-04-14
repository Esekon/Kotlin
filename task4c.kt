fun main (){
    bmi(weight=59 , height=2)
    marks(marks = 30)
}
fun bmi (weight:Int , height:Int){
    val BMI=weight/(height*height)
    println("The bmi is $BMI")
}


fun marks (marks:Int){
  
    when (marks){
        in 0..20->println("You have $marks : Below average")
        in 21..50 -> println("You have $marks : Average")
        in 51..70 ->println("You have $marks : Above average")
        in 71..100->println("You have $marks :Passed")
        else ->println("Enter valid marks")
    }  
}
