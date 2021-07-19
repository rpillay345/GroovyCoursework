// each & eachWithIndex

List favNums = [2, 1, 14, 18, 22, 0]

for(num in favNums) {                                 // utilizing a for each mehod to print each element
    println num
} 

favNums.each {println it}                             // -or- we could use a closure to accomplish the same thing

for ( int i=0; i<favNums.size(); i++ ){               // this is how we used to do it without closures if wanting to print index and value from list
    println "$i:${favNums[i]}"
}

favNums.eachWithIndex { num, idx ->                   // with closures the above objective completely changes - note that i am passing 2 arguments value and index
    println "$idx:$num"                               // print arguments 
}

// findAll 

List days = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"]        // creating a list

List weekend = days.findAll {                         // using a findAll method which allows closures in lists
    it.startsWith("S")                                // starts with is a method allowed for strings and since our list has a collection of strings we can use this
}

println days
println weekend

List nums2 = [1, 13, 9, 22, 74, 8]                    // create a list of numbers and print a subset where members are less than 14
List numsLessThan14 = nums2.findAll { n -> 
    n < 14 
} 

println numsLessThan14

// collect

List nums = [1, 2, 3, 7, 2, 8, 2, 4, 6]

List numsTimesTen = []                                // create an empty list called numesTimesTen
nums.each { num ->                                    // use an each loop to add a multiple of 10 of each member of nums to numTimesTen 
    numsTimesTen << num * 10                          // recall << is an add to list method 
}
println nums 
println numsTimesTen

List newTimesTen = nums.collect { num ->             // on the other hand we can use a closure and a collect method to simple collect each member of nums list...
    num * 10                                         // ...and multiply by 10
}

println newTimesTen

