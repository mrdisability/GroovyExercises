package Exercise4

class RegularExpressions {
    static void main(String[] args) {

        def text = "Cleveland Sports Fan"
        // ~ Creates a pattern
        def pattern = ~/Cleveland Sports Fan/
        // Returns a boolean
        def matcher = text ==~ pattern

        println matcher

        if (matcher) {
            def t = "Being a Cleveland Sports Fan is no way to go through life" // true
            def p = ~/Cleveland/

            text = t.replaceFirst(p, "Buffalo")
            println text
        }
    }
}
