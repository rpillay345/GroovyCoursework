package sortable

import groovy.transform.Canonical


import groovy.transform.Sortable // Note that without this we would need to do the following steps ourselves if we wanted our data sorted:

/*
The generated Groovy class will:
implement the Comparable interface
have a compareTo method based on the first, last and born properties (priority ordering will be according to the ordering of property definition, highest first, unless 'includes' is used; in which case, priority will be according to the order given in the includes list)
have three Comparator methods named comparatorByFirst, comparatorByLast and comparatorByBorn
sort by natural order by default, reversed natural order can be specified
 */

@Canonical
@Sortable(includes = ['last'])
class Person {

    String first, last

}
