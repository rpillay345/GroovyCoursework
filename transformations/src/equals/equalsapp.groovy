package equals

Person p1 = new Person(first:"Dan",last: "Vega",email: "danvega@gmail.com")
Person p2 = new Person(first:"Dan",last: "Vega",email: "danvega@gmail.com")

assert p1 == p2                 // this code won't know what equals means unless you tell it what equals means
