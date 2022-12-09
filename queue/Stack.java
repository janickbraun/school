public class Stack {
    List list;
    Stack() {
        list = new List();
    }

    public void push(Dataelement data) {
        list.insertBack(data);
    }

    public void pop() {
        list.removeBack();
    }

    public void printInformation() {
        list.printInformation();
    }
}
