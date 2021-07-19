import groovy.xml.MarkupBuilder

// Markup Builder works for xml and html - refer to documentation

FileWriter writer = new FileWriter('html/booksexercise.html')               //writing the file out
MarkupBuilder builder = new MarkupBuilder(writer)                          // from default printing we used option to write file - writer

List books = [
        [ isbn: "978-1935182443", title: "Groovy in Action 2nd Edition",author: "Dierk Koenig",price: 50.58 ],
        [ isbn: "978-1935182948", title: "Making Java Groovy",author: "Ken Kousen",price: 33.96 ],
        [ isbn: "978-1937785307", title: "Programming Groovy 2: Dynamic Productivity for the Java Developer",author: "Venkat Subramaniam",price: 28.92 ]
]


builder.html {

    head {
        title("My Favorite Books")
    }
    body {
        h1("My Favorite Books")
        table {
            tr {
                th("ISBN")
                th("Title")
                th("Author")
                th("Price")
            }
            books.each { book ->
                tr {
                    td(book.isbn)
                    td(book.title)
                    td(book.author)
                    td(book.price)
                }
            }
        }
    }
}
