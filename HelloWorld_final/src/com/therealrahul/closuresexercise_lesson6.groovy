/*
    lesson 6: Closures
    Locate the class groovy.lang.Closure and spend a few minutes looking through documentation.
*/

/*Create a Method that accepts a closure as an argument
    - Create a closure that performs some action
    - Call the method and pass the closure to it.
*/
def nTimes4 =  ({ n ->
     n * 4
    })

def sTimes6 = ({ s ->
     s * 6
     })
     
def twoClosures = { r ->
     sTimes6(nTimes4(r))        
}

twoClosures(7)

/*
Create a list and use them each to iterate over each item in the list and print it out
    - Hint - You can use the implicit it or use your own variable
*/
List s = [1, 3, 5, 7, 9, 't', 'r', 'collection', 7, 8, 11]
s.each({ member ->
    println member
})

/*
Create a map of data and iterate over it using each method. 
    - This method can take a closure that accepts 1 or 2 arguments. 
    - Use 2 arguments and print out the key and value on each line.
*/

Map themes = [sunday:'church', 
              monday:'9 hours', 
              tuesday:'meetings', 
              wednesday:'productive 9 hours', 
              thursday:'wrap up', 
              friday:'build dream home', 
              saturday:'family & grill'
              ]

themes.each({
    println it
})

def valueResult = themes.findResult { if (it.value  == 'build dream home') return "Wow I found ${it.key}:${it.value}" }
println valueResult

Map themesEdited = themes.findAll { key, value -> 
        key.endsWith("day")
}

themesEdited.each({
    println it
})

/*
Demonstrate the use of curry and try to come up with an example different from the one we used in the lecture. 
*/

def boys = { String name, String sex, String favColor, Date dob -> 
    println "$name is a $sex and loves $favColor. He was born on $dob"
}

boys("Rahul", "male", "blue", new Date().copyWith(year: 1983, month: Calendar.JUNE, dayOfMonth: 21, hourOfDay: 14, minute: 0, second: 0))

def sons = boys.ncurry(1, "male")
sons("Noah", "blue", new Date().copyWith(year: 2018, month: Calendar.DECEMBER, dayOfMonth: 14, hourOfDay: 7, minute: 0, second: 0))
sons("Eden", "green", new Date().copyWith(year: 2020, month: Calendar.NOVEMBER, dayOfMonth: 21, hourOfDay: 21, minute: 0, second: 0))

/*
In the following exercises we are going to explore the GDK to find some methods that take closures and learn how to use them. 
Hint - I would narrow your search to java.util.Collection, java.lang.Iterable & java.util.List
*/


/*
Search for the find and findAll methods.
    - What is the difference between the two? 
    - Write some code to show how they both work.
*/

// the find method finds the first value matching the closure condition while the findAll method finds all values matching the closure condition
def list = [1,2,3]
def listGt2 = list.find { it > 1 }
println listGt2

def listAllGt2 = list.findAll { it > 1 }
println listAllGt2


/*
Search for the any and every methods.
    - What is the difference between the two? 
    - Write some code to show how they both work. 
*/

// any iterates over the contents of an iterable, and checks if true for atleast one element while every will return a true if true for all elements

List people = [
        [name: 'Jane', city:'New York'], 
        [name: 'John', city:'Cleveland'], 
        [name: 'Mary', city:'New York'],
        [name: 'Dan', city:'Cleveland'],
        [name: 'Tom', city:'New York'],
        [name: 'Frank', city:'New York'],
        [name: 'Jason', city:'Colorado']
]

println people.find { person -> 
    person.city == 'Cleveland'
}


println people.findAll { person -> 
    person.city == 'Cleveland'
}

println people.any { person -> 
    person.city == 'Colorado'
}

println people.every { person -> 
    person.city == 'Colorado'
}


/*
Search for the method groupBy that accepts a closure
    - What does this method do? 
    - Write an example of how to use this method.
*/

// Sorts all Iterable members into groups determined by the supplied mapping closure.

def peopleByCity = people.groupBy { person ->                    // sorting by city in the order the data was read in
    person.city
}
def newyorkers = peopleByCity["New York"]
def clevelanders = peopleByCity.Cleveland

newyorkers.each { 
    println it
}

clevelanders.each { 
    println it
}