package typechecked

import groovy.transform.TypeChecked

@TypeChecked                            // will TypeCheck the entire class and won't compile this class - can be used for individual methods
class Person {
    String firstName, lastName

    String getFullName() {
        "$firstName $lastName"          // this will compile fine even though we mispelled if we didn't include the @TypeChecked
    }

}
