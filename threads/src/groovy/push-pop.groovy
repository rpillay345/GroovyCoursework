package groovy

List numbers = []

// push
10.times {
    println "push\t: ${it}"
    numbers << it
}

println numbers


// pop
for( i in 9..0 ) {
    println "pop\t: ${i}"
    numbers.pop()
}

println numbers

// but what if we wanted to do this concurrently! The way it's set up above is a top down appraoch.




