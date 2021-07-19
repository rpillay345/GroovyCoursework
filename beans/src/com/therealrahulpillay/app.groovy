package com.therealrahulpillay

//Employee emp = new Employee (first: "Rahul", last: "Pillay", email: "rpillay@csumb.edu" )

//println emp

//Employee emp = new Employee()
//emp.first = "Rahul"                             // employee. set first is what this is saying

//println emp.first                               // this gets it - we used a getter

DoubleBean db = new DoubleBean()
db.value = 100                                    // this is setting our value in the DoubleBean class to 100

println db.value                                   // this should give us 200 because we are getting the value of value which doubles it...
                                                   // ... in our DoubleBean class.

println db.@value                                   // this gives us the value of actual which is set = 100