package Tugas;

class Node {
    private String question;
    private String answer;
    private Node next;

    public Node(String question, String answer) {
        this.question = question;
        this.answer = answer;
        this.next = null;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
