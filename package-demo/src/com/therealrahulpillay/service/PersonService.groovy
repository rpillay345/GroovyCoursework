package com.therealrahulpillay.service

class PersonService implements IPhoneService {
     @Override
    Person find() {
            Person p = new Person( first: "Rahul", last:"Pillay")
            return p
     }

    @Override
    List<Person> findAll() {
        Person p1 = new Person(first: "Rahul", last:"Pillay")
        Person p2 = new Person(first: "Van", last:"Pillay")
        [ p1, p2 ]


    }
}
