//if 
if( true ) 
    println "value is true"
    
// false | null | empty strings | empty collections
if( !false ) 
    println "value is false"
    
String name = "RP"
if( name ) 
    println "name has a value"
    
String last = ""
if( last )
    println "last has a a value"
    
// if/else 
def x = 5
if( x == 10){
    println "x is 10"
} else {
    println "x is NOT 10"
}

// classic while
def i = 1
while( i<=10 ) {
    println i
    i++ //incremental operator
}

// for in list
def list = [1, 2, 3, 4]
for( num in list ){
    println num
}

// closure
def list2 = [1, 2, 3, 4]
list2.each {println it} //it is a special keyword that helps groovy reference members of a list in an each statement

// switch - works way better than having tons of if statements
def myNumber = 1

switch(myNumber){
    case 1: 
        println "number is 1"
        break
    default: // catches numbers entered that are out of range
        println "we hit the default case" 
}
