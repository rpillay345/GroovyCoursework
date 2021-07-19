@Grapes (
    @Grab(group='org.apache.commons',module='commons-lang3',version='3.12.0') //this tells Groovy that our script depends on this
)

import org.apache.commons.lang3.text.WordUtils

String name = "Rahul Pillay" 
WordUtils wordutils = new WordUtils()

println wordUtils.initials(name)