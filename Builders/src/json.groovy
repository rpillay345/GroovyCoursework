import groovy.json.JsonBuilder

JsonBuilder builder = new JsonBuilder()

builder.books {

    book {                                      // elements inside of a json data structure need to have unique keys so we wouldn't be able to create another...
        title "The 4 Hours Work Week"       //...book instance with the same name "book"
        isbn "978-0-3307-46535-1"
        author (first: "Timothy", last: "Feriss", twitter: "@tferiss")
        related "The 4 Hours Body", "The 3 Hours Chef"
    }

}
println builder.toString()

println builder.toPrettyString() // prints in a nice json format

new File("data/books.json").write(builder.toPrettyString())         // writes to the path specified