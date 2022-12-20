public class Tree {
    Listelement root;
    Tree() {
        root = new End();
    }

    void insert(Dataelement data) {
        root = root.insert(data);
    }

    void print() {
        root.print();
    }
}
