// Exceptions
// --------------------------------------------
/*
public void foo() throws Exception {             // this is how you would need to write an exception in JAVA
    throw new Exception()                
}
*/

def foo() {                                      // Groovy 
    throw new Exception("Foo Exception")
} 

List log = []

try { 
    foo()                                        
} catch(Exception e) {                           // In case foo throws an exception - I want to catch that exception and assign it to e
    log << e.message                             // add e message to log list
} finally {                                      // finally block will run no matter what we do in the end
    log << 'finally'
}

println log

// Java 7 introduced a multi catch syntax

try { 
    // do stuff
} catch( FileNotFoundException | NullPointerException e) { 
    println e.class.name
    println e.message
} 