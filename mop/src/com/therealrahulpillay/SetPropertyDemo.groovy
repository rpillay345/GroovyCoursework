package com.therealrahulpillay

// You can intercept write access to properties by overriding the setProperty() method:

class POGO {

    String property

    void setProperty(String name, Object value) {       // setProperty is an object in the interface groovy object
        this.@"$name" = 'overridden'                    // getting field access by @"$name"
    }

}

def pogo = new POGO()
pogo.property = 'a'

assert pogo.property == 'overridden'