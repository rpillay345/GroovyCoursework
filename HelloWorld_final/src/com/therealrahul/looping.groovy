// Looping - looping over something multiple times! 
// -------------------------------------------------

// while - while something is TRUE we want Groovy to do something

List numbers = [1, 2, 3]
while ( numbers ) {                 // if we didn't put any conditions in here than this would be an infinite loop because numbers never changes - keeps going
    // do something
    numbers.remove(0)               // remove the 0th element while there exists a non null in numbers. 
} 
assert numbers == []               // we know that eventually this will be true after the while loop hits a dead end

// for - give me a variable and use the in keyword and then give me something I can iterate over and then use that in a method body to perform some ...
// ...kind of logic

for ( variable in iterable ) { 
    
} 

List nums = [1, 2, 3]

for ( Integer i in nums ) { 
    println i
}

for ( Integer i in 1..10 ) {       // note that for loops' syntax looks very similar to a closure but it's not a syntax  
    println i
}

// return/break/continue

// return
String getFoo() { 
    return "foo"                          // the last line of any expression is supposed to return that expression - we don't need to explicityly say 'return'
} 

String getFoo() { 
    "foo"                                  // the last line of any expression is supposed to return that expression - we don't need to explicityly say 'return'
} 

// break
Integer a = 2
while ( true ) {     // infinite loop 
    a++              // a = a+ 1 so in the first iteration a = 2
    break            // this means that after the first iteration break out of this For loop
}
assert a == 3        // based on our comments above we know this is true

if ( a == 2 ) { 
    println "true"
} 
else println "false"

switch ( a ) { 
    case 2: println "yeah baby it's 2"
    break
    default: println "defaulting out"
} 

// continue

for (String s in 'a'..'z') { 
    if ( s == 'a') continue             // if the condition is met then continue on with the loop - do not evaluate any of the other expressions below
    println s                           // printing everything but a since at a the continue statement keeps us moving forward with the for loop ...
    if ( s > 'b' ) break                // .. without evaluating the println statement
} 
