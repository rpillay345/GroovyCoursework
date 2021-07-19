package com.therealrahulpillay

// Groovy supports the concept of propertyMissing for intercepting otherwise failing property resolution attempts.

class Foo {

    def propertyMissing(String name) {
        "caught missing property: $name"
    }

}

println new Foo().bar           // calling a property called "bar" which propertyMissing method will catch in Foo class