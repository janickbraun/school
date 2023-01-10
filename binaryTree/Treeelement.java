public abstract class Treeelement {
    abstract Treeelement getLeft();
    abstract Treeelement getRight();
    abstract void print();

    abstract Treeelement insert(Dataelement data);

    abstract Dataelement getData();
}
