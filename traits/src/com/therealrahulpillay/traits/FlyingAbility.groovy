package com.therealrahulpillay.traits

trait FlyingAbility {

    String fly(){
        "I'm flying"
    }
    abstract String foo()

    private String bar(){               // this is a private method and wont be required when classes call this trait
        "bar"
    }
}