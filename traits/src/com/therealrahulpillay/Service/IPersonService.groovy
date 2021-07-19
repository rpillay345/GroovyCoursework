package com.therealrahulpillay.Service

public interface IPersonService {                         // JAVA language

    default public void doSomething () {                  // JAVA 8s default method allows us to do this in interfaces...
        System.out.println("doing something ...");        // ... note that this wasn't possible in the interfaces exercise
    }
}