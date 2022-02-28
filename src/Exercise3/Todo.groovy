package Exercise3

import groovy.transform.ToString

@ToString
class Todo {
    String text
    Boolean isCompleted

    // Generate constructor, getter and setters

    public Todo(String text) {
        this.text = text
        this.isCompleted = false
    }

    String getText() {
        return text
    }

    void setText(String text) {
        this.text = text
    }

    Boolean getIsCompleted() {
        return isCompleted
    }

    void setIsCompleted(Boolean isCompleted) {
        this.isCompleted = isCompleted
    }

    // Can generate toString() or add @ToString ast transformation
//    @Override
//    public String toString() {
//        return "Todo{" +
//                "text='" + text + '\'' +
//                ", isCompleted=" + isCompleted +
//                '}';
//    }
}
