// Intercept - Cache - Invoke

class Developer {

    List languages = []

    def methodMissing(String name, args){

        println "${name}() method was called..."

        if( name.startsWith('write') ) {
            String language = name.split("write")[1]

            if( languages.contains(language) ) {
                def impl = { Object[] theArgs ->
                    println "I like to write code  in $language"
                }
                getMetaClass()."$name" = impl
                return impl(args)
            }
        }
    }

}


Developer rahul = new Developer()
rahul.languages << "Groovy"
rahul.languages << "Java"
println rahul.metaClass.methods.size()
rahul.writeGroovy()
rahul.writeGroovy()
rahul.writeGroovy()
println rahul.metaClass.methods.size()
rahul.writeJava()
rahul.writeJava()
println rahul.metaClass.methods.size()