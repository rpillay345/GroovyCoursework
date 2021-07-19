// implicit parameter
def foo = {            
    println it        // if nothing is passed in and we are expecting something - it will still run: implicit params always uses the keyword "it"
} 

foo('rp')

def noparams = { ->                // this is a good way to make sure our closure will not take any arguments
    println "no params..."
} 

noparams(1)

def sayHello = { first, last ->        // takes in the first and last as arguments - multiple arguments separated by a comma
    println "Hello, $first $last"
}

sayHello ("Rahul", "Pillay")

def sayHello2 = { String first, String last ->             // stating property type for first and last name - this is how arguments are taken in
    println "Hello, $first $last"                          // this is how arguments are presented back
} 

sayHello2 ("Rahul", "Pillay")

def greet = { String name, String greeting ->              
    println "$greeting, $name"
}

greet("RP", "Hello")

// default values 
def greet2 = { String name, String greeting = "Howdy" ->     // assigning a default value for greeting             
    println "$greeting, $name"
}

greet2("RP")
greet2("RP", "Hello")
greet2("Hello", "RP")

// var-arg
def concat = { String... args ->                             // this means we can pass as many arguments as we want to this closure
    args.join('')
} 

println concat('abc', 'def', '128jjk')

def someMethod(Closure c) { 
    println "..."
    println c.maximumNumberOfParameters                      // lists the maximum number of parameters
    println c.parameterTypes                                 // total number of parameters
} 

def someClosure = { int x, int y -> 
    x + y
}
someMethod(someClosure)