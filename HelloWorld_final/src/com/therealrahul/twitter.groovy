def tweet = new Tweet("therealrahulp", "Hello, Twitter!")
tweet.addToRetweets()
tweet.addToFavorites()
println tweet

def tweet2 = new Tweet("thenotsorahulp", "Hello, Twitter - fake news!")
tweet2.addToRetweets()
tweet2.addToFavorites()
println tweet2