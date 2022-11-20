public abstract class Listelement {
    abstract int getLength();
    abstract void printInformation(int totalLength);
    abstract Dataelement getData();
    abstract void setFollower(Listelement follower);
    abstract Dataelement search(String value);
    abstract Listelement getFollower();
    abstract Listelement insertBack(Dataelement data);
    abstract Listelement removeValue(String value);
    abstract Listelement insertSorted(Dataelement data);
    abstract Listelement get(int index, int totalLength);
    abstract void printOwn();
}