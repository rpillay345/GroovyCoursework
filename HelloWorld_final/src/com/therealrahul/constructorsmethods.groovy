@groovy.transform.ToString
class Person { 
    
    String first, last
    
    // constructor 
    
    Person(String fullName) { 
        List parts = fullName.split(' ')                // split fullName on space delimeter
        first = parts[0]                                // we are assigning the field called first the value of parts[0]
        last = parts[1]                                 // we are assigning the field called last the value of parts[1]
        println "$first and $last"
    } 
    
    
    // methods
    
    public void foo(String a, String b) {              // This is how you would call methods in a class in JAVA
        // do stuff
    } 
        
    String getFullNAme(){                              // This is how you do it in Groovy
        "$first $last"
    }
    
    def bar(){                                         // we don't care what is returned - even a void
        
    } 
    
    static String doGoodWork(){                        // we can have a static method
        print "doing good work..."
    }   
    
   // List someMethod( List numbers [1, 2, 3], Boolean canAccessAll = false) {  // this is a mehod argument within my class Person. It takes in a list and always returns a list - [1, 2, 3] is my default list
        
   // } 
    
    def concat(String... args) {                         // this is called var args - we can supply as many arguments as we need
        println args.length                              // tell us how many arguments was passed
    } 
} 

// Person p = new Person() - when we call this then we are implicitly calling a zero arg constructor

//Person p = new Person(first:"Rahul", last:"Pillay")        // default constructor
Person p = new Person("Rahul Pillay") 
//println p

Person.doGoodWork()
p.concat('a', 'b', 'c', 'd')
