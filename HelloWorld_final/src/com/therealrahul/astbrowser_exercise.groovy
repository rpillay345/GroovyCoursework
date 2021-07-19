 import groovy.transform.ToString

 @ToString(includeNames=true)
 class Person {
     String name
     List likes
     private boolean active = false
 }
