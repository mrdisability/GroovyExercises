package Exercise3

class ASTTransformations {
    static void main(String[] args) {
        // @ToString
        def newTodo = new Todo("New Todo")
        println newTodo.toString()

        // @Immutable - dont need a constructor
        def immutableTodo = new ImmutableTodo("Immutable Todo", false)
        println immutableTodo
    }
}
