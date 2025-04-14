// function to calculate sum 
fun main (){
    add( num1= 10 , num2=20)
    sub(num3=79 , num4 =46)
    multiply(num5=4 , num6=3)
}

fun add (num1:Int , num2:Int){
    val sum= num1 + num2
    println("The sum is $sum")
}

fun sub (num3:Int , num4:Int){
    val diff = num3-num4
    println("The diffrence is $diff")
}

fun multiply (num5:Int , num6:Int){
    val ans =num5*num6
    println("The answer is $ans")
}