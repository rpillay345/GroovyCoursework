//Create a class and implement each of the following methods from the GroovyObject Interface
// - invokeMethod - getProperty - setProperty

// Dan's answer
Developer developer = new Developer(first: "Dan",last: "Vega",email: "danvega@gmail.com")
developer.writeCode("Groovy")
println developer.first
developer.languages = ["Groovy","Java"]
//

class InvokeDemo {

    def prop1 = "prop1"
    def invokeMethod(String name,Object args){
        return "called invokeMethod $name $args"
    }

    def test() {
        return "method exists"
    }

    def getProperty(String name){
        println "getProperty() called with argument $name"
    }

}

def invokeDemo = new InvokeDemo()

assert invokeDemo.test() == 'method exists'
assert invokeDemo.someMethod() == 'called invokeMethod someMethod []'

println invokeDemo.prop1

