import groovy.xml.MarkupBuilder

MarkupBuilder builder = new MarkupBuilder()
builder.omitEmptyAttributes = true              // from documentation - options
builder.omitNullAttributes = true

builder.sports {                                // note that sports is not a defined method yet markupbuilder is doing some sort of a
                                                // missing method invoke type of lesson we did on "OOP" section
    sport(id:1){
        name "Baseball"
    }
    sport(id:2) {
        name "Football"
    }
    sport(id:3){
        name "Basketball"
    }
    sport(id:4) {
        name "Hockey"
    }
    sport(id:null, foo:'') {
        name ""
    }
}
