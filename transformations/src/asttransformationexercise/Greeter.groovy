package asttransformationexercise

import groovy.transform.NullCheck
import static groovy.test.GroovyAssert.shouldFail

@groovy.transform.NullCheck
class Greeter {

    private String audience

    Greeter (String audience) {
        this.audience = audience.toLowerCase()
    }

    String  greeting(String salutation) {
        salutation.toUpperCase() + ' ' + audience
    }

}
