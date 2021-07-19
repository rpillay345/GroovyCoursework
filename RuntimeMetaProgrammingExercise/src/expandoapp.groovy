// Expando
// Create an Expando Class
// Add some properties and methods to it
// Knowing that a class's metaclass is an expando to create your own class and add properties and methods to it.

class Homework {

    def addTwonums = {
        int x, int y -> println(x + y)
    }

}

def home = new Homework()
home.addTwonums(1, 2)

Expando e = new Expando()                       // the expando class is a dynamically expandable bean - allows us to add properties and ...
e.name = 'Rahul'                                // ...methods to it.
e.writeCode = { ->
    println "$name likes to write code..."
}
e.writeCode()
e.plan = 'blah'
