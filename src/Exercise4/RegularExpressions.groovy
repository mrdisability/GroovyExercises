package Exercise4

class RegularExpressions {
    static void main(String[] args) {

        def text = "Cleveland Sports Fan"
        def pattern = ~/Cleveland Sports Fan/
        def matcher = text ==~ pattern

        println matcher

        if (matcher) { // do something }
            // ----------------------------------------------------------------------------------

            def t = "Being a Cleveland Sports Fan is no way to go through life" // true
            def p = ~/Cleveland/

            text = t.replaceFirst(p, "Buffalo")
            println text
        }
    }
}
