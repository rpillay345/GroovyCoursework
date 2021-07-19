package toString

import groovy.transform.ToString

@ToString(includeNames = true, excludes = ["email"])       // The compiler will do what we manully tried to do below in the commented section - in () is how you include options
class Person {

    String first, last, email

    // this block of code will always need to be updated when we make any changes to code. best thing to do is do an @toString
    /*@Override
    public String toString() {
        return "Person{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

     */
    ////////////////////////^^^^^^^^^^



}
