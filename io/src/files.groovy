// create a new file

//def file = new File ('dummy.txt')
//file.write("This is some text")

// new File("dummy.txt").text = "..."

//file.append("I am some more text\n")


// Read lines from file
//List lines = file.readLines()
//lines.each{ line ->
 //   println line
//}

// List all files in a directory

//String dir = '/Users/rahulpillay/Desktop/Work'
//new File(dir).eachFileRecurse {file->
//if (file.isFile() ) {                       // check to see if it is a file
//        println file.name
//    }
//}


// show me all files with name that ends with groovy
new File ('.').eachFile {file->
    if (file.name.endsWith ('.groovy') ) {
        println file.name
    }
}