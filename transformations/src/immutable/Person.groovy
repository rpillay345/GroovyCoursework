package immutable

// The @Immutable meta-annotation corresponds to adding the following annotations: ToString, EqualsAndHashCode, ImmutableBase,
// ImmutableOptions, PropertyOptions, TupleConstructor, MapConstructor and KnownImmutable. Together these annotations instruct
// the compiler to execute the necessary transformations to add the necessary getters, constructors, equals, hashCode and other
// helper methods that are typically written when creating immutable classes with the defined properties.

import groovy.transform.Immutable
import groovy.transform.ToString

@ToString
@Immutable          // make sure it's the groovy.transform one
class Person {

    String first
    String last

}