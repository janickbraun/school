public class Node extends Listelement {
    Listelement left;
    Listelement right;
    Dataelement data;
    Node(Dataelement data) {
        this.left = new End();
        this.right = new End();
        this.data = data;
    }

    public void setLeft(Listelement left) {
        this.left = left;
    }

    public void setRight(Listelement right) {
        this.right = right;
    }

    public void setData(Dataelement data) {
        this.data = data;
    }

    Listelement getLeft() {
        return left;
    }

    Listelement getRight() {
        return right;
    }

    void print() {
        System.out.println(data.getValue());
        left.print();
        right.print();
    }

    Listelement insert(Dataelement data) {
        if(this.data.getValue().compareToIgnoreCase(data.getValue()) > 0) {
            setLeft(left.insert(data));
        } else {
            setRight(right.insert(data));
        }
        return this;
    }
}
