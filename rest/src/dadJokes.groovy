

import groovyx.net.http.ContentType
import groovyx.net.http.RESTClient

@Grab('org.codehaus.groovy.modules.http-builder:http-builder:0.7.1')

String base = 'https://icanhazdadjoke.com/'

def dadJoke = new RESTClient (base)
//def params = [firstName: "Rahul", lastName: "Pillay"]

dadJoke.contentType = ContentType.JSON
dadJoke.get( path: 'https://icanhazdadjoke.com/') { response, json ->
    println response.status
    println json
}