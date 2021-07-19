package com.therealrahulpillay

//Groovy supports the concept of methodMissing. This method differs from invokeMethod in that it is only ...
//...invoked in case of a failed method dispatch, when no method can be found for the given name and/or the given arguments
// InvokeMethod can be called for any method that we call whether it exists or not but methodMissing is only called when we can't find a method

class MyEmployee {

    def methodMissing(String name, def args){

        if( name != 'someMethod') {
            throw new MissingMethodException(name, args)  // we don't have to always catch all - we can be specific to keep throwing ...
                                                            // ...exceptions in some cases
        }

        println "Method Missing called on: $name"
        println "with arguments ${args}"
    }
}

MyEmployee emp = new MyEmployee()
emp.someMethod(1, 2, 3)                             // note that there is no method called someMethod but our methodMissing will catch it
emp.someOtherMethod(4, 5, 6)