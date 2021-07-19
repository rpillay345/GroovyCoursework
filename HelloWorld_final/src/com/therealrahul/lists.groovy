def nums = []                            // creates a nums list with nothing in it
List nums = []                           // also declared this way
ArrayList nums = []                      // also declared this way                 

def nums2 = [1, 2, 3, 4, 5, 6, 7, 8, 9] 
println nums2
println nums2.class.name

def nums3 = [1, 2, 3, 4, 5, 6, 7, 8, 9] as LinkedList
println nums3
println nums3.class.name

def nums4 = [1, 2, 3, 4, 5, 6, 7, 8, 9] 
println nums4
println nums4.class.name

nums4.push(4)                        //push 4 to beginning of list
println nums4

nums4[0] = 77                        //put 77 at position 0 and overwrite whats already there
println nums4
println nums4 +[3, 4, 6]             // according to the documentation this always creates a new list but does not touch the old list

println nums4                        // original list was not touched

nums4.removeLast()
println nums4

nums4.removeAt(2)
println nums4

nums4.pop()
println nums4

def nums5 = nums4 - 7                //removes the number 7 - member removal
println nums5 

nums6 = nums5 + ['a', 4, 4]           // add a, 4, and 4 to the list
println nums6

println nums6[0]                     // give me 0th value of the nums6 list
println nums6.getAt(2..5)            // print the range of values from index 2 to 5

nums6 = []                            // clears the list

for( x in nums5 ) {                    // for all values in nums5 print them 1 by 1 
    println x
} 

nums5 << ['a','b','cc','d']            // adding a list to the nums list and since these are all objects groovy can have lists within lists
nums5 << [1, 2, 3, 10, 11, 15, 17]
println nums5

// flatten

println nums5.flatten()                // will take all the elements in the newly created lists and move it into nums5 

// unique
println nums5.unique()                 // print all the unique elements of the list

def numbers = [1,2,3,4,6,8,10,10,8,4,2,3,1,2,3,4,6,8,10,10,10] as Set            // Sets do not have duplicates so printing will remove the dups
println numbers
println numbers.class.name

def numbers2 = [1,2,3,4,6,8,10,10,8,4,2,3,1,2,3,4,6,8,10,10,10] as SortedSet            // Sets do not have duplicates so printing will remove the dups
println numbers2
println numbers2.class.name
