public class End extends Listelement {
    int getLength () {
        return 0;
    }

    void setFollower(Listelement follower) {
        assert true;
    }

    void printInformation(int totalLength) {
        assert true;
    }

    Dataelement getData() {
        return null;
    }

    Listelement get(int index, int totalLength) {
        return null;
    }

    Listelement getFollower() {
        return this;
    }

    Listelement removeValue(String value) {
        return this;
    }

    Listelement insertSorted(Dataelement data) {
        return insertBack(data);
    }

    Listelement insertBack(Dataelement data) {
        return new Node(data, this);
    }

    void removeDataelement() {
        assert true;
    }

    Dataelement search(String value) {
        return null;
    }

    void printOwn() {
        assert true;
    }

}