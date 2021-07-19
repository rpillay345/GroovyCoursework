// Java Sample Pattern

import java.util.regex.*; 
Pattern pattern = Pattern.compile("a\\\\c") //when using a backslah we need 4 of them in Java to escape the one slash 
println pattern
println pattern.class

// What patterns will look like in Groovy

String slashy = / a\b/ //this is a slashy string where quotes are not needed
String url = $/http://therealrahulpillay.com/blog/$ //except with urls we will need a $ to escape and end the string

println slashy.class

def pattern = ~/a\b/
println pattern.class

// Find | Match

def text = "Being a Cleveland Sports Fan is no way to go through life" 
def pattern = ~/Cleveland Sports Fan/
def finder = text =~ pattern // In the text 'text' can you find the pattern 'pattern'
def matcher = text ==~ pattern

println finder
println finder.size() //in our finder how many did you find?
println matcher //did we match the pattern - looking for an exact pattern

def text2 = "Cleveland Sports Fan"
def pattern2 = ~/Cleveland Sports Fan/
def matcher2 = text2 ==~ pattern2 //looking for an exact match which we should return as a True

println matcher2

if( matcher2 ) { // do something - a boolean expression makes it powerful to use}

def text3 = "Being a Cleveland Sports Fan is no way to go through life"
def pattern3 = ~/Cleveland/ 

text3 = text3.replaceFirst(pattern3, "Buffalo") //replace the first instance of pattern 'Cleveland' with 'Buffalo'
println text3

def text4 = "Being a Cleveland Sports Fan is no way to go through life in Cleveland because Cleveland is sad"
def pattern4 = ~/Cleveland/ 

text4 = text4.replaceAll(pattern4, "Buffalo") //replace all instances of pattern 'Cleveland' with 'Buffalo'
println text4
