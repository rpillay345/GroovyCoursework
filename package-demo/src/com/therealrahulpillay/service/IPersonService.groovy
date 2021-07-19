package com.therealrahulpillay.service

import com.therealrahulpillay.domain.Person

interface IPersonService {                              // what we are saying with this Interface is that - If you ...
        Person find()                                   // want to implement this interface than you must provide me...
                                                        // an implementation of the find method and the find all method
        List<Person> findAll ()

}