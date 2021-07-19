
import groovy.json.JsonSlurper

JsonSlurper slurper = new JsonSlurper()
def json = slurper.parse(new File('data/books.json'))

println json.books.currentBook
println json.books.currentBook.title
println json.books.currentBook.author.twitter
println json.books.currentBook.related