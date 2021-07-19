// MetaClass Demo - In this lecture we look at how the MOP works; hooking in and using property and missing methods

/*
Expando e = new Expando()                       // the expando class is a dynamically expandable bean - allows us to add properties and ...
e.name = 'Rahul'                                // ...methods to it.
e.writeCode = { ->
       println "$name likes to write code..."
}
e.writeCode()
*/


class Developer2 {

}
// per instance - this happens in a per instance basis - if we created a new instance of developer it wont work
Developer2 rahul = new Developer2()
rahul.metaClass.name = 'Rahul'                   // rahul.metaClass is just like calling a getter and then setting a name class to it
rahul.metaClass.writeCode = { ->
       println "$name likes to write code..."
}
rahul.writeCode()

// every instance - manipulating the metaclass for every instance
String.metaClass.shout = {  ->                     // adding a new method shout to metaclass of string
       toUpperCase()
}
println "hello, Rahul".shout()