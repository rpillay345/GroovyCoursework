/******   Section 5 Exercise: *******/
/*
Ranges: 

If you are new to Java or Groovy the idea of an Enum might be new.
     An Enum is a collection of constant values. We can use this collection of constants to create ranges. 
     I want you to do some reading up on enum's and create an enum for days of the week. ex Sunday, Monday, etc...

    Create a range from that enum
    Print the size of the Range
    Use the contains method to see if Wednesday is in that Range
    Print the from element of this range
    Print the to element of this range
*/

enum days {                                      //create days enumerator
    sunday, 
    monday,
    tuesday,
    wednesday,
    thursday,
    friday,
    saturday
} 

println days.values()*.name()                    // print enumarator days' keys

Range r = days.sunday..days.saturday             // create a range from days' keys
println r.size()                                // print size of range r                               
//assert r.contains("wednesday")                   // asserting that r contains wednesday
println r.from
println r.to

/*
Lists

Create a list days (Sun - Sat)
Print out the list
Print the size of the list
Remove Saturday from the list
Add Saturday back by appending it to the list
Print out the Wednesday using its index
*/

List days = ['sunday', 'monday', 'tuesday', 'wednesday', 'thursday', 'friday', 'saturday']
println days
println days.class
println days.size()
days2 = days - 'saturday'
println days2
days2 << 'saturday'
println days2
println days2[3]


/*
Maps

Create a map of days of the week
1: Sunday, 2:Monday, etc...
Print out the map
Print out the class name of the map
Print the size of the map
Is there a method that would easily print out all of the days (values)? 
Without closures you may have to look at the Java API for LinkedHashMap
*/

Map maps = [1:"sunday", 2:"monday", 3:"tuesday", 4:"wednesday", 5:"thursday", 6:"friday", 7:"saturday"]        // note that the 1, 2, 3...,7 is still a string value
println maps
println maps.getClass().getName()
println maps.size()
println maps.values()