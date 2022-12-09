public class Main {
    public static void main(String[] args) {
        List list = new List();
        list.insertBack(new Patient("X"));
        list.insertBack(new Patient("B"));
        list.insertBack(new Patient("Z"));
        list.insertBack(new Patient("F"));
        list.insertBack(new Patient("B"));
        list.insertBack(new Patient("A"));
        list.insertBack(new Patient("A"));

        list.sortBubble();
        list.printInformation();

        list.searchBinary("A");

        /*
        Stack:
        Stack stack = new Stack();
        stack.push(new Patient("Kalle"));
        stack.printInformation();
        stack.pop();
        stack.printInformation();
         */

    }
}