package Exercise4

class RegularExpressions2 {
    static void main(String[] args) {
        String slashy = /a\b/
        String url = $/http://threaldanvega.com/blog/$

        println slashy.class

        def pattern = ~/a\b/
        println pattern.class

        // Find | Match
        def text = "Being a Cleveland Sports Fan is no way to go through life" // true
        def p = ~/Cleveland Sports Fan/
        def finder = text =~ p
        def matcher = text ==~ p

        println finder
        println finder.size()
        println matcher
    }
}
