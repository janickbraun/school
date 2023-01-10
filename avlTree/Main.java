public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        for(int i = 1; i <= 26; i++) {
            tree.insert(new Patient(String.valueOf((char)(i + 64))));
        }

        System.out.println(tree.getHeight());
        System.out.println(tree.getSize());

        System.out.print("\n");
        tree.print();
    }
}