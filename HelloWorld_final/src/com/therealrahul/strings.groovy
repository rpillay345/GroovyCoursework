// Working with Strings in Groovy

// Java ::
char c = 'c'
println c.class

String str = "this is a string"
println str.class

// Groovy ::

def c2 = 'c'
println c2.class

def str2 = 'this is a string' 
println str2.class

// string interpolation
// this is Java ------ 
String name = "Dan"
String msg = "Hello " + name + "..."
println msg

// this is Groovy
String msg2 = "Hello ${name}"  /// this is where double quotes become important in Groovy
println msg2

String msg3 = 'Hello ${name}'  // will not work - this is a string not a call
println msg3

String msg4 = "We can evaluate expressions here: ${1 + 1}" // we can evaluate inside of double quotes

// multiline strings: requires 3 consecutive single quotes or double quotes 
def aLargeMsg = '''
A 
Msg 
goes 
here


'''

def aLargeMsg2 = """
A 
Msg 
goes 
here
and 
keeps going 
to ${1 + 1}

"""

// dollar slashy: allows us to escape characters within the dollar slashes

def folder = $/C:\groovy\dan\foo\bar/$
println folder



