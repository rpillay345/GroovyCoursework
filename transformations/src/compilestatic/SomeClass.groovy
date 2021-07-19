package compilestatic

import groovy.transform.CompileStatic
import groovy.transform.TypeCheckingMode


// This will let the Groovy compiler use compile time checks in the style of Java then perform static compilation,
// thus bypassing the Groovy meta object protocol. When a class is annotated, all methods, properties, files, inner
// classes, etc. of the annotated class will be type checked. When a method is annotated, static compilation applies
// only to items (closures and anonymous inner classes) within the method.

@CompileStatic
class SomeClass {

    String foo(){
        "foo"
    }

    String bar(){
        "bar"
    }

    @CompileStatic(TypeCheckingMode.SKIP)   //skip this method within
    void noReturn(){

    }

}