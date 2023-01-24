import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        try {
            File file = new File("words.txt");
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                String[] words = data.split(" :: ");
                String de = words[0];
                String en = words[1];
                tree.insert(new Word(de, en));
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.print("Höhe: "); System.out.println(tree.getHeight());
        System.out.print("Größe: "); System.out.println(tree.getSize());
        System.out.print("\n");

        /*

        System.out.print("\n");

        tree.print();

        System.out.print("\n");

        //System.out.print("Preorder: "); tree.preorder();
        //System.out.print("Postorder: "); tree.postorder();
        //System.out.print("Inorder: "); tree.inorder();

         */

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welches deutsche Wort soll übersetzt werden? ");
            String search = scanner.nextLine();

            if (Objects.equals(search, "exit")) {
                break;
            }

            try {
                System.out.println(search + " auf Englisch: " + tree.search(search).getData().getEn() + "\n");
            } catch(NullPointerException e) {
                System.out.println(search + " konnte leider nicht gefunden werden.\n");
            }
        }

    }
}