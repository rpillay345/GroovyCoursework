import groovy.xml.MarkupBuilder

// Markup Builder works for xml and html - refer to documentation

FileWriter writer = new FileWriter('html/about.html')               //writing the file out
MarkupBuilder builder = new MarkupBuilder(writer)                           // from default printing we used option to write file - writer

List courses = [
        [id:1, name: "Apache Groovy"],
        [id:2, name: "Spring Boot"]
        ]

builder.html {

    head {
        title "About Rahul Pillay"
        description "This is an about me page"
        keywords "Rahul Pillay, Groovy, Sas, Spring"
    }
    body {
        h1 "About Me"
        p "This is a bunch of text about me..."
        section {
            h2 "Course"
            table {
                tr {                                // table
                    th "id"
                    th "name"
                }
                courses.each { course ->
                    tr{
                        td course.id                // replacing our manual data with code - calling in courses
                        td course.name
                    }

                }
            }

        }


    }
}
