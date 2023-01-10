public class End extends Treeelement {

    Treeelement getLeft() {
        return null;
    }

    Treeelement getRight() {
        return null;
    }

    Treeelement insert(Dataelement data) {
        return new Node(data);
    }

    Dataelement getData() {
        return null;
    }

    public void print() {
        print("", this, false);
    }

    public void print(String prefix, Treeelement n, boolean isLeft) {
        assert true;
    }
}
