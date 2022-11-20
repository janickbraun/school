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

        //TODO insert sorted

        list.printInformation();

        list.sortLinear();

        list.printInformation();
    }
}