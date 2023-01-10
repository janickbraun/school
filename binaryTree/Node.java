public class Node extends Treeelement {
    Treeelement left;
    Treeelement right;
    Dataelement data;
    Node(Dataelement data) {
        this.left = new End();
        this.right = new End();
        this.data = data;
    }

    public void setLeft(Treeelement left) {
        this.left = left;
    }

    public void setRight(Treeelement right) {
        this.right = right;
    }

    public void setData(Dataelement data) {
        this.data = data;
    }

    Dataelement getData() {
        return data;
    }

    Treeelement getLeft() {
        return left;
    }

    Treeelement getRight() {
        return right;
    }

    public void print() {
        print("", this, false);
    }

    public void print(String prefix, Treeelement n, boolean isLeft) {
        if (n.getData() != null) {
            System.out.println (prefix + (isLeft ? "|-- " : "\\-- ") + n.getData().getValue());
            print(prefix + (isLeft ? "|   " : "    "), n.getLeft(), true);
            print(prefix + (isLeft ? "|   " : "    "), n.getRight(), false);
        }
    }

    Treeelement insert(Dataelement data) {
        if(this.data.getValue().compareToIgnoreCase(data.getValue()) > 0) {
            setLeft(left.insert(data));
        } else {
            setRight(right.insert(data));
        }
        return this;
    }


}
