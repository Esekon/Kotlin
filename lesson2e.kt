 fun main(){
    var marks : Int =79

    when (marks){
        in 0..20->println("You have $marks : Below average")
        in 21..50 -> println("You have $marks : Average")
        in 51..70 ->println("You have $marks : Above average")
        else ->println("You have $marks :Passed")
    }  
 }