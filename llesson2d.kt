fun main (){
    val marks : Int = 78

    if (marks >=0 && marks <= 20){
        
        println( "Below average")
    }
    else if (marks >=21 && marks<= 50){
            println("Average")
    }
    else if (marks >=51 && marks <=70){
            println("Above average")
    }
    else if (marks >=71 && marks <=100){
            println("Passed")
    }
    else{
        println("Enter valid marks")
    }
}