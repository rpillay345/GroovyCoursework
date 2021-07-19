package com.whatmakesaclassexercise

Tweet2 tweet = new Tweet2(handle: "",hashtag: "#love" , message: "can't wait to love my wife @ therealmumu",
        tweeter: "RP-ME" )

tweet.display()

tweet.favorite("@therealdanvega")
tweet.favorite("@ther")
tweet.retweet("@therealdanvega")

println tweet.getFavorites()
println tweet.getRetweet()
