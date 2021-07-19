println "Please enter your favorite sports team"

String team
System.in.withReader { reader->
       team = reader.readLine()                     //something in java.lang called system - take in some input and withReader will give us the ability to ...
                                                        //...create a new reader
}
println "Your favorite team is:$team"

