def list = []                        // this is a list - it has no colons in it
def map = [:]                        // this is a map - it has a colon in it
println map
println map.getClass().getName()

def LinkedHashMap map = [:]          // this is legal since default type for maps is a linked hash map
println map.getClass().getName()     // NOTE: since maps can reference it's key values with a '.' map.class.name will not work because Groovy is trying to access the contents of the map

def Map map = [:]                    // this is legal since default type for maps is a map
println map.getClass().getName()

def person = [first:"Rahul", last:"Pillay", email:"rahul@colchiscapital.com"]
println person
println person.first                 // access the first key and print the value associated with that key 
println person.last

person.twitter = "@rahulthereal"     // we just added a key value pair to our map called person
println person

def twitter = [username="@therealrahul", 'email address':"rahul@colchiscapital.com"] // we need to explicitly tell Groovy that "email address"is a key

def emailKey = "EmailAddress"
def twitter2 = [username:"@therealrahul", (emailKey):"rahul@colchiscapital.com"]
println twitter2
println twitter2.size()                 // tells us the number of pairs in the mapping
println twitter2.sort()                 // sorts by keys

// for looping through twitter2
for( entry in twitter2 ) {              // prints each key value pair - loops through each one.
    println entry
}

for( key in twitter2.keySet()) {             // key set gives us a list of keys so this for loop will go through each key in twitter2
    println key
}

for( key in twitter2.keySet()) {             // print the value of key for each key in the twitter2 map - key name and value for them
    println "$key:${twitter2[key]}"
}

// each | eachWithIndex


