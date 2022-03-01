package Exercise3

class Twitter {
    static void main(String[] args) {
        Tweet tweet = new Tweet("New Tweet", "King Ioane")
        // Add @ToString to Tweet class
        println tweet.toString()

        // Change author
        tweet.changeAuthor("King")
        println tweet.toString()

        // Like tweet
        tweet.likeTweet()
        println tweet.toString()
    }
}
