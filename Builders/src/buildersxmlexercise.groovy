

import groovy.xml.MarkupBuilder

MarkupBuilder builder = new MarkupBuilder()
builder.omitEmptyAttributes = true              // from documentation - options
builder.omitNullAttributes = true

builder.books {
    book (isbn:978-1935182443) {
        title  "Groovy in Action 2nd Edition"
        author "Deirk Koenig"
        price "50.58"
    }
    book (isbn:978-1935182948){
        title  "Making Java Groovy"
        author "Ken Jousen"
        price "33.96"
    }
    book (isbn:978-1937785307){
        title  "Programming Groovy 2: Dynamic Productivity for the Java Developer"
        author "Venkat Subramaniam"
        price "28.92"
    }
}