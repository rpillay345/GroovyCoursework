def log = { type, Date createdOn, String msg ->             // closure passing 3 arguments
    println "$createdOn [$type] - $msg"                     // simply print the 3 arguments this way
} 

log("Debug", new Date(), "This is my first debug statement and things are looking up and up...")

        // BUT WHAT IF WE WANTED TO CREATE MULTIPLE LOG MESSAGES - THIS COULD GET VERY REPETITIVE 
log("Debug", new Date(), "This is my second debug statement and things are looking up and up...")
log("Debug", new Date(), "This is my third debug statement and things are looking up and up...")
log("Debug", new Date(), "This is my fourth debug statement and things are looking up and up...")
log("Debug", new Date(), "This is my fifth debug statement and things are looking up and up...")
log("Debug", new Date(), "This is my sixth debug statement and things are looking up and up...")
log("Debug", new Date(), "This is my seventh debug statement and things are looking up and up...")

def debugLog = log.curry("Debug")                            // the curry method allows us to take less arguments and utilize an already existing closure to bring ...
                                                             //...in arguments that are consistent - in this case bring in "Debug"
debugLog(new Date(), "This is another debug statement")      // passing 2 new arguments to an already existing closure
debugLog(new Date(), "This is one more")

def todayDebugLog = log.curry("Debug", new Date())            // utilizing 2 consistent items in an already existing closure
todayDebugLog("This is a new message")

// right curry

def crazyPersonLog = log.rcurry("Why am I logging this way")    // rcurry helps us replace the original closure's furthest right argument - in this instance...
crazyPersonLog("ERROR", new Date())                             // ... the message

// index based currying

def typeMsgLog = log.ncurry(1, new Date())                      // index curry uses 0 index rule .. 0 - type, 1 - createdOn, etc. this will keep date unchanged
typeMsgLog("Error", "This is using ncurry")                     // replace type and message; only index 1 and index 2 is replaced since 1 is kept consistent