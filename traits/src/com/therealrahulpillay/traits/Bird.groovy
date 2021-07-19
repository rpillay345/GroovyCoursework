package com.therealrahulpillay.traits

class Bird implements FlyingAbility, SpeakingAbility {            // keyword implements is used to implement trait called FlyingAbility
    @Override

    String foo(){                                                  // now that this is a required abstract method as found in ...
        return null                                                // ... FlyingAbility trait

    }

}
