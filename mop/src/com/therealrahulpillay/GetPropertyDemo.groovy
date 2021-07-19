package com.therealrahulpillay

// Every read access to a property can be intercepted by overriding the getProperty() method of the current object

class PropertyDemo {

    def prop1 = "prop1"
    def prop2 = "prop2"
    def prop3 = "prop3"

    def getProperty(String name) {
        println "getProperty() called with argument $name"      // overrides the getters but next line calls the getters

        if ( metaClass.hasProperty(this, name) ) {
            return metaClass.getProperty(this, name)
        } else {
            println "let's do something fun with this property"
            return "party time"
        }
    }

}

def pd = new PropertyDemo()
println pd.prop1
println pd.prop2
println pd.prop3
println pd.prop4                    // wont produce
