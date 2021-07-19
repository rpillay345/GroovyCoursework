package asttransformationexercise

class Memoized {

@groovy.transform.Memoized

    int sum(int n1, int n2) {
        println "$n1 + $n2 = ${n1 + n2}"
        n1 + n2
    }

}
