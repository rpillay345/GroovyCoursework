def x = 10 // what we are saying here "we don't care what type 'x' is but the initial value we want it to hold is 10
x.getClass().getName()

x = "RP" // now we can redefine x and Groovy will know to convert it
x.getClass().getName()

y = 9
y.class

y = "blah blah"
y.class