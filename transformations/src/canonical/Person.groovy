package canonical

import groovy.transform.Canonical

@Canonical                          // wraps @ToString, @EqualsAndHash, and @Tuple into 1 - excluding and including options will need to be ...
class Person {                      // ...individually specified for each.

    String first, last, email

}
