public class End extends Treeelement {
    public Treeelement getLeft() {
        return null;
    }
    public Treeelement getRight() {
        return null;
    }

    public void print() {
        print("", this, false);
    }

    public void print(String prefix, Treeelement n, boolean isLeft) {
        assert true;
    }

    public void preorder() {
        assert true;
    }

    public void inorder() {
        assert true;
    }

    public void postorder() {
        assert true;
    }

    public Treeelement insert(Dataelement data) {
        return new Node(data);
    }

    public Treeelement search(String value) {
        return null;
    }

    public Dataelement getData() {
        return null;
    }

    public int getHeight() {
        return 0;
    }

    public int getBalanceFactor() {
        return 0;
    }

    public void setLeft(Treeelement node) {}
    public void setRight(Treeelement node) {}
    public void setHeight(int height) {}
    public void setBalanceFactor(int factor) {}
}
