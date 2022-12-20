public class End extends Listelement {

    Listelement getLeft() {
        return null;
    }

    Listelement getRight() {
        return null;
    }

    void print() {
        assert true;
    }

    Listelement insert(Dataelement data) {
        return new Node(data);
    }
}
