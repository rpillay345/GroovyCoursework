import groovy.xml.XmlSlurper

/*
def xml = '''
    <sports>
        <sport>
            <name>Football</name>
        </sport>
    </sports>
'''

def sports = new XmlSlurper().parseText(xml)

println sports.getClass().getName()
println sports.sport.name
*/

def sports = new XmlSlurper().parse('data/sports.xml')          // how to read in and parse an xml file
println sports
println sports.sport[2].name            // get me the third element in the xml list - what's the name?

