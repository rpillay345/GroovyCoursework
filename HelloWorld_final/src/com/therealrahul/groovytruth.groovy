if( true ) {                            // true evaluates to true
    println "true"
}

// Boolean

assert true
assert !false 
assert false                           // this will give us an error because groovy is trying to evaluate to true

// Matcher

assert ('a' =~ /a/)                    // match for a
assert ('a' =~ /b/)                    // will give us an error because it wont match
assert !('a' =~ /b/)                    // opposite will work

// Collection

assert [1]                             // list is not empty - should evlauate to true
assert ![]                              // empty list should give us an error

// Map

assert [1:'one']
assert [:]                             // empty map should give us an error

// String 

assert 'a'
assert !''                             // empty string should give us an error

// Number 

assert 1
assert 3.5
assert 0                                // should evaluate to error 

// None of the above

assert new Object()
assert !null                             // null should evaluate to error
