// MetaClass Demo - In this lecture we look at how the MOP works; hooking in and using property and missing methods

class Developer {


}

Developer Rahul = new Developer()
//println "Hello Rahul..."                        // note the red break point - happens by clicking on the code line column...
                                                // ... helps us to stop the execution of the program right at this line so ...
                                                // ... that we can use the debugger to understand what's going on inside our program.

Expando e = new Expando()                       // the expando class is a dynamically expandable bean - allows us to add properties and ...
e.name = 'Rahul'                                // ...methods to it.
e.writeCode = { ->
       println "$name likes to write code..."
}
e.writeCode()

