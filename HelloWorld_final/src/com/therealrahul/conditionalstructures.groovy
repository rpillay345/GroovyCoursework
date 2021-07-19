// if( boolean expression ) { //logic }

 if ( true ) {
     println "true"
}

if ( true ) 
     println "true"                // this will also work without "{}" when there's only one line of logic
     
def age = 35
if ( age >= 35) { 
    println "can run for president"
}

if ( false ) {
    println "true"
} else { 
    println "false"
}

def yourage = 18
if ( yourage >=21 ) {
    println "buy beer"
} else {
    println "no beer for you"
}

def someage = 2
if ( someage >= 21 && someage < 35 ) { 
    println "buy some beer"
} else if ( someage >= 35 ) { 
    println "run for president or buy beer"
} else {
    println "uh oh under 21..."
} 

//---------------------------------------------
// ternary operator (expression) ? true : false

def name = 'Dan'
def isitdan = (name.toUpperCase() == 'DAN') ? 'YES' : 'NO'                // evaluate the expresson on the left of the '?' - if true than result is YES ...
println isitdan                                                           // ...if false then result is NO

def msg                                                                   // create a null variable msg
def output = ( msg != null ) ? msg : "default message..."                

def elvisOutput = msg ?: 'default message...'                             // elvis operator shorthand saying if msg evalutes to true then use it - if not then use...
                                                                          // ... 'default message'
println msg
println output
println elvisOutput                                                                          
                                                            
//---------------------------------------------
// switch statement - Note that switch statements in Groovy is very different than switch statement in JAVA

def num = 2

switch ( num ) {                                                          // Inside of our switch statements we have cases and these cases are what we are going...
     case 1: println "1"                                                  // ...try and to do to try and match what we are switching on - in this case '5'
     break                                                                // break allows us to break from going to the next statement if the last condition is ...
     case 2: println "2"                                                  // ...met
     break
     default : println "default"                                          // default case comes with all switch statement - note that if a condition is met when a..
}                                                                         // ...default is included then a met condition means that groovy passes it on to the next..
                                                                          // ...line. 
                                                                          
                                                                          

def num2 = 12                                                             // here we can start asking switch to tell us an array of things ...

switch ( num2 ) {                                                          
     case 1: println "1"                                                  
     break                                                               
     case 2: println "2"                                                  
     break
     case [1, 2, 12] : println "in my special list"                       // tell me if it's in a list
     break
     case 1..4 : println "in my range of 1-3"                             // tell me if it's in a range
     break
     case Integer: println "integer greater than 4"                       // tell me if it's an integer
     break
     case Float: println "$num2 is a float"                               // tell me if it's a float
     break
     default : println "default"                                          
}                                                                         


// in 

def validAges = 18..35 
def someAge = 19 
println someAge in validAges                                               // tells us if 19 is in the range of valid ages 18-35
                                                                           