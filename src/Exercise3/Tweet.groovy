package Exercise3

import groovy.transform.ToString

@ToString
class Tweet {
    // text, author, likes
    String text
    String author

    // Initialise likes = 0
    Integer likes = 0

    public Tweet(String text, String author) {
        this.text = text
        this.author = author
    }

    // Can generate using Generate... -> Getter and Setter (Constructor)

    // Methods to change properties
    void changeAuthor(String author) {
        this.author = author
    }

    void likeTweet() {
        likes += 1
    }
}
// Groovyc: Invalid duplicate class definition of class Exercise3.Tweet : The source /Users/loveking/Desktop/My Stuff/Foster Moore/Exercises/src/Exercise3/Tweet.groovy contains at least two definitions of the class Exercise3.Tweet.
// One of the classes is an explicit generated class using the class statement, the other is a class generated from the script body based on the file name. Solutions are to change the file name or to change the class name.
//Tweet tweet = new Tweet()
//println tweet
