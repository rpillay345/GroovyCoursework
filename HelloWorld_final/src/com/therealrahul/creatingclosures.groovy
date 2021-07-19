def c = { }                         // this is how we create a closure

println c.class.name
println c instanceof Closure

def sayHello = { name ->            // anything after the "->" is now in the closure body: Closures are objects that can be passed around 
    println "Hello, $name"          // because this is a closure "name" is an argument (mentioned before the "->" that can be passed into the closure 
}

sayHello('Dan')

List nums = [1, 4, 7,  30, 2]
nums.each({
    println it                       // by default if there are no arguments passed into a closure there's a special reserve keyword called "it" which means current 
                                     // element we are working with 
})

List nums = [1, 4, 7,  30, 2]
nums.each({ num ->
    println num                       // instead of using it - we passed the num argument and we can achieve the same results. 
})

//closures are objects and last param 

def timesTen(num, closure) {         // this method can take a number and a closure
      closure(num * 10)  
} 
timesTen(10, { println it })            // anytime we pass a closure into a method - the last argument has a special idiomatic way to print it out
timesTen(4) { println it }              // we can remove the braces outside of the method call
timesTen(2.88) { 
    println it 
}                                       // we can remove the braces outside of the method call and clean up the syntax

10.times { 
    println it                          // look at the Numbers gdk documentation and times method - it takes closures: http://groovy-lang.org/gdk.html
}

import java.util.Random                // importing the random utility
Random rand = new Random()             // method rand will have a new random number everytime it's called

3.times {                              // iterate 3 times over this closure starting from zero
    println rand.nextInt()             // closure passes the random operetor into the method 3 times
} 


