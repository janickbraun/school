public class Tree {
    Treeelement root;
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
