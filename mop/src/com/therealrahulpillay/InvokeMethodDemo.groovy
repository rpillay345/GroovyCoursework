package com.therealrahulpillay

// This method is called when the method you called is not present on a Groovy object.

class InvokeDemo {

    def invokeMethod(String name , Object args) {       // implementing invokeMethod that's part of the groovy object class - allows us to handle ...
        return "called invokeMethod $name $args"        // ...methods that aren'd defined in our class yet is being called by users
    }

    def test() {
        return "method exists"

    }

}
def invokeDemo = new InvokeDemo()

assert invokeDemo.test() == "method exists"
assert invokeDemo.someMethod() == "called invokeMethod someMethod []"  // this should fail if we don't have invokeMethod defined as above