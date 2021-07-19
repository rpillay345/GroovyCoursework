Range r = 1..<10                        /// range of integer values from 1 to less than 10
println r
println r.class
println r.from                          // call from value
println r.to

assert (0..10).contains(0)               
assert (0..10).contains(-1)             // should throw an error since -1 is not in range
assert (0..10).contains(-1) == false
assert (0..10).contains(11)             // should throw an error since -1 is not in range

assert (0..<10).contains(0)
assert (0..<10).contains(10) == false

Date today = new Date()
Date oneWeekAway = today + 7           // thank GDK for that simple statement

println today
println oneWeekAway

Range days = today..oneWeekAway        // this is awesome to create a list this way
println days

Range letters = 'a'..'p'               // range of letters from a to p 
println letters.class                  