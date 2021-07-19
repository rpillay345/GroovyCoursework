for( int x = 1; x <= 10; ++x) {                //for integer x initialized at 1 as long as x <= 10 increment x by value of 1
    println x
} 

println "" 

for( int y = 10; y >= 1; --y) {                // for integer y initialized at 10 as long as y >= 1 decrease y by value of 1
    println y
}

def letters = ['a', 'b', 'c']
for( int i = 0;  i < letters.size(); ++i) {    //letters.size() will give me length of the array
    println letters[i]                                //since i is a list we need to use this nomenclature 
}