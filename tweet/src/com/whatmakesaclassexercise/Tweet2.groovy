package com.whatmakesaclassexercise

@groovy.transform.Canonical
class Tweet2 {

    String handle, hashtag, message, tweeter
    Date createdOn = new Date()

    private List favorites = []    // private lists don't have getters and setters generated for me
    private List retweets = []
    private List mentions = []

    void favorite(String tweeter) {
        favorites << tweeter
    }

    List getFavorites(){
        favorites                   // last line of this method is what will get returned
    }

    void retweet(String tweeter) {
        retweets << tweeter
    }

    List getRetweet(){
        retweets
    }

    List getMentions() {
        String pattern = /\B@[a-z0-9_-]+/           // regex pattern - I could call this pattern with the same name in
        message.findAll(pattern)                    // another local List because in classes these are very specific to the method
    }

        def display() {
        println "$tweeter sent a message on $createdOn. $tweeter's message was $message." +
                "$tweeter promoted #$hashtag and has a handle of $handle."

    }

}
