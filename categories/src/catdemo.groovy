/*String.metaClass.shout { ->
        toUpperCase()
}
println "Hellow, World".shout()

*/

use(StringCategory){
        println "Hellow, World!".shout()                        // this is the only way you can call this ...
}

// calling it this way won't work since it's only available in a use(...Category) class
println "Hellow, World!".shout()                                // Won't work
