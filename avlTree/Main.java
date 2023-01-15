public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        for(int i = 1; i <= 26; i++) {
            tree.insert(new Patient(String.valueOf((char)(i + 64))));
        }

        System.out.print("Höhe: "); System.out.println(tree.getHeight());
        System.out.print("Größe: "); System.out.println(tree.getSize());

        System.out.print("\n");

        tree.print();

        System.out.print("\n");

        System.out.print("Preorder: "); tree.preorder();
        System.out.print("Postorder: "); tree.postorder();
        System.out.print("Inorder: "); tree.inorder();

    }
}