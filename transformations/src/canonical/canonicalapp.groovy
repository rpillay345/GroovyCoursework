package canonical

Person p1 = new Person ("Rahul", "Pillay", "rpillay@csumb.edu")
Person p2 = new Person ("Rahul", "Pillay", "rpillay@csumb=.edu")

assert p1 == p2
println p2.toString()