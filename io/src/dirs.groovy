
// list all the directories in a given path
String dir = '/Users/rahulpillay/Desktop/Work'
//List hidden = []
//new File(dir).eachFile { file ->
//
//    if( file.isDirectory() ){
//        println file.name
//    }
//
//    if( file.isHidden() ) {
//        hidden << file.name
//    }
//
//}
//
//println hidden


//String groovyCourse = '/Users/rahulpillay/Desktop/Work'
//new File(groovyCourse).eachDir { subfolder ->                           // eachDir - nice way to access directories only and no need to check if a file is a ..
//    println subfolder                                                       // ... file and not a directory
//}


//def groovyCourseDir = new File('/Users/rahulpillay/Desktop/Work')            // gives us file size in bytes
//println groovyCourseDir.directorySize()


//create a new directory
//new File('dummy').mkdir()
//new File('one/two/three').mkdirs()

new File('dummy').deleteDir()
