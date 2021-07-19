package equals

import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode(excludes = ["email"])
class Person {

    String first, last, email

}