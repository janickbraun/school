public abstract class Listelement {
    abstract int getLength();
    abstract void printInformation();
    abstract Dataelement search(String value);
    abstract boolean isEnd();
    abstract Listelement removeBack();
    abstract Listelement getFollower();
    abstract void insertBack(Dataelement data);
    abstract Listelement removeValue(String value);
    abstract Listelement insertSorted(Dataelement data);
    abstract Listelement get(int index, int totalLength);
    abstract void printOwn();
}
