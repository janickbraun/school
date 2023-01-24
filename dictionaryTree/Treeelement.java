public abstract class Treeelement {
    abstract public Treeelement getLeft();
    abstract public Treeelement getRight();
    abstract public void print();
    abstract public Treeelement insert(Dataelement data);
    abstract public Treeelement search(String value);
    abstract public Dataelement getData();
    abstract public int getHeight();
    abstract public int getBalanceFactor();
    abstract public void setLeft(Treeelement node);
    abstract public void setRight(Treeelement node);
    abstract public void setHeight(int height);
    abstract public void setBalanceFactor(int factor);
    abstract public void inorder();
    abstract public void preorder();
    abstract public void postorder();
}
