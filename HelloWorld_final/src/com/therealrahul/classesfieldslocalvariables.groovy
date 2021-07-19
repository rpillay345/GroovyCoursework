class Person {                                     // by default every class is public
    String firstName, lastName                     // firstName field - when we don't give it an access modifier than groovy sets gitters and headers for us.- also we can set multiple fields
    def dob                                        // we don't have to set type up front - maybe we do this later
    // private String firstName                    This would not set gitters and headers for us because we have explicitly said that this fiels is private
    
    // private | protected | public
    protected String f1, f2, f3                    
    private Date createdOn = new Date()            // initializing createdOn to today's date
    
    static welcomeMsg = 'Hello'                    // static field - allows us to call this on a class without identifying a Class element - or a new person
    public static final String WELCOME_MSG = 'HELLO'  // this is a constant - a final static field cannot be changed: all uppsercase usually! 

    // local variables
    def foo() { 
        String msg = "Hello"                        // Note that msg is local variable to the method foo - we will not be able to call msg in the Person class because msg is local to foo method
        String firstName = "Dan"                    // this firstname is locally scoped to foo method - it won't collide with our firstName in Person class
        println "$msg, $firstName"
    } 

} 

println Person.welcomeMsg
println Person.WELCOME_MSG

def person = new Person()
println person.foo()