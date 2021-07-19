
// create a new date - current date and time
Date today = new Date()
println today
println "--------------"

// create a new date as a specific date
Date bday = new Date("06/21/1983")
println bday
println bday.format("M-d-Y")
println "--------------"

// add and subtract

Date oneWeekFromToday = today.plus(7)
Date oneWeekAgo = today - 7
println oneWeekFromToday
println oneWeekAgo
println "--------------"

// downto and & upto
oneWeekFromToday.downto(today){   // start from oneweekago defined above and increment daily to today
    println it
}
println "--------------"

Range twoWeeks = oneWeekAgo..oneWeekFromToday // daily range from last week ago to one week from today
twoWeeks.each{
    println it
}
println "--------------"

// next & previous
Date newyear = new Date('01/01/2021')
println newyear.next()
println newyear.previous()
println "--------------"

