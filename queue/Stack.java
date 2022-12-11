public class Stack {
    List stack;
    Stack() {
        stack = new List();
    }

    public void push(Dataelement data) {
        stack.insertBack(data);
    }

    public void pop() {
        stack.removeBack();
    }

    public void printInformation() {
        stack.printInformation();
    }
}
