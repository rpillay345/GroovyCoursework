import groovy.transform.*

@ToString
@Sortable

class Person  { 

    String first
    String last


} 

def p1 = new Person(first:"Rahul", last:"Pillay")
def p2 = new Person(first:"Van", last:"Pillay")

def people = [p1, p2]
println people

def sorted = people.sort(false) //sorts in order of properties - our properties are first and last - this is only called because we used the @sortable ast transformation
println sorted