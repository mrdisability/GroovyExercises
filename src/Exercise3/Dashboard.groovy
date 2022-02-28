package Exercise3

class Dashboard {
    static void main(String[] args) {
        def user = new User("Howard")
        println user

        // Add follower and course
        user.addCourse()
        user.addFollower()

        println user
    }
}
