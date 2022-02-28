package Exercise3

import groovy.transform.Immutable
import groovy.transform.ToString

@Immutable
@ToString
class ImmutableTodo {
    String text
    Boolean isCompleted
}

// @Immutable instruct the compiler to execute the necessary transformations to add the necessary getters,
// constructors, equals, hashCode and other helper methods that are typically written when creating immutable classes
// with the defined properties
