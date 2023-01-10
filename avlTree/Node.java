public class Node extends Treeelement {
    private Treeelement left;
    private Treeelement right;
    private Dataelement data;
    private int height;
    private int balanceFactor;
    public Node(Dataelement data) {
        this.left = new End();
        this.right = new End();
        this.data = data;
        this.height = 1;
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
    public void setHeight(int height) {
        this.height = height;
    }
    public void setBalanceFactor(int factor) {
        this.balanceFactor = factor;
    }
    public Dataelement getData() {
        return this.data;
    }
    public int getHeight() {
        return this.height;
    }
    public int getBalanceFactor() {
        return this.balanceFactor;
    }
    public Treeelement getLeft() {
        return this.left;
    }
    public Treeelement getRight() {
        return this.right;
    }

    /*public void print() {
        System.out.println(data.getValue());
        left.print();
        right.print();
    } */

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

    public Treeelement search(String value) {
        if(this.data.getValue().equals(value)) {
            return this;
        } else if (this.data.getValue().compareToIgnoreCase(value) > 0) {
            return left.search(value);
        } else {
            return right.search(value);
        }
    }

    public Treeelement insert(Dataelement data) {
        if(this.data.getValue().compareToIgnoreCase(data.getValue()) > 0) {
            setLeft(left.insert(data));
        } else {
            setRight(right.insert(data));
        }

        update(this);
        return balance(this);
        //return this;
    }

    private void update(Treeelement node) {
        int leftNodeHeight = (node.getLeft() == null) ? -1 : node.getLeft().getHeight();
        int rightNodeHeight = (node.getRight() == null) ? -1: node.getRight().getHeight();

        node.setHeight(1 + Math.max(leftNodeHeight, rightNodeHeight));
        node.setBalanceFactor(rightNodeHeight - leftNodeHeight);
    }

    private Treeelement balance(Treeelement node) {
        if(node.getBalanceFactor() == -2) {
            if(node.getLeft().getBalanceFactor() <= 0) {
                return leftLeftCase(node);
            }
            else  {
                return leftRightCase(node);
            }
        } else if(node.getBalanceFactor() == 2) {
            if(node.getRight().getBalanceFactor() >= 0) {
                return rightRightCase(node);
            }
            else {
                return rightLeftCase(node);
            }
        }
        return node;
    }

    private Treeelement leftLeftCase(Treeelement node) {
        return rightRotation(node);
    }

    private Treeelement leftRightCase(Treeelement node) {
        node.setLeft(leftRotation(node.getLeft()));
        return leftLeftCase(node);
    }

    private Treeelement rightRightCase(Treeelement node) {
        return leftRotation(node);
    }

    private Treeelement rightLeftCase(Treeelement node) {
        node.setRight(rightRotation(node.getRight()));
        return rightRightCase(node);
    }

    private Treeelement leftRotation(Treeelement node) {
        Treeelement newParent = node.getRight();
        node.setRight(newParent.getLeft());
        newParent.setLeft(node);
        update(node);
        update(newParent);
        return newParent;
    }

    private Treeelement rightRotation(Treeelement node) {
        Treeelement newParent = node.getLeft();
        node.setLeft(newParent.getRight());
        newParent.setRight(node);
        update(node);
        update(newParent);
        return newParent;
    }
}
