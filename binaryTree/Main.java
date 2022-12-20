public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(new Patient("f"));
        tree.insert(new Patient("a"));
        tree.insert(new Patient("z"));
        tree.insert(new Patient("zz"));
        tree.print();
    }
}