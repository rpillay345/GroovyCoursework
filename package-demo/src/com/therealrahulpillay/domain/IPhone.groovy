package com.therealrahulpillay.domain

@groovy.transform.ToString()
class IPhone extends Phone {            // Iphone uses all the properties of the Phone class with the extends ...
                                        // ...clause
    String iosVersion

    def homeButtonPress (){

    }

    def airPlay (){

    }
    @override                           // override powerOn method being inherited from Phone class
    def powerOn (){                     // note that powerOn method already exists and IntelliJ is trying to warn...
                                        // ...us of it - we need to override

    }
}
