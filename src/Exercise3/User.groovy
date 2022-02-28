package Exercise3

import groovy.transform.ToString

@ToString
class User {
    String name
    Date joinedDate
    Integer followers
    Integer courses

    public User(String name) {
        this.name = name
        // The date now
        this.joinedDate = new Date()
        this.followers = 0
        this.courses = 0
    }

    // void - no return type
    void addFollower() {
        followers += 1
    }

    void addCourse() {
        courses += 1
    }
}
