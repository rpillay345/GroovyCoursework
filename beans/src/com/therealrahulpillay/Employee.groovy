// This is a groovy bean - compare this with the JAVA bean EmployeeBean which has a lot more lines of code

package com.therealrahulpillay

@groovy.transform.ToString
class Employee implements Serializable {

    String first, last, email

    String fullName

    void setFullName(String name) {
        fullName = name
    }
    String getFullName() {
        "Full Name: ${fullName}"
    }
}
