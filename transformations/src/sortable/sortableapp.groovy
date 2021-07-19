package sortable

Person p1 = new Person("Rahul","Pillay")
Person p2 = new Person("Van","Pillay")
Person p3 = new Person("Noah","Pillay")
Person p4 = new Person("Eden","Pillay")

def pillays = [p1, p2, p3, p4]

println pillays.toSorted()     // note that .toSorted() without @Sortable AST won't work here because Groovy sorts the iterable, ...
                                // ...assumes that the iterable elements are comparable and uses some way to determine the resulting order.
                                // .. Default sort: elements in the order they were listed in the defining class - in this case first and then last
                                // sorts by last because i changed the options in the class statements