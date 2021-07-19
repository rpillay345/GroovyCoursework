package asttransformationexercise

def instance = new Memoized()
println instance.sum(1, 2)
println instance.sum(1, 2)
println instance.sum(2, 3)
println instance.sum(2, 3)