package immutable

Person p = new Person(first: "Rahul", last: "Pillay")
println p.toString()

p.first = "Andy"        // this will throw an error because immutable makes it final class