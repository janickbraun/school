public class List {
    Listelement start;
    List() {
        start = new End();
    }

    int getLength() {
        return start.getLength();
    }

    void insertFront(Dataelement data) {
        start = new Node(data, start);
    }

    void printInformation() {
        start.printInformation();
    }

    Dataelement search (String value) {
        return start.search(value);
    }

    void removeBack() {
        start = start.removeBack();
    }

    void insertBack(Dataelement data) {
        start = start.insertBack(data);
    }

    void removeFront() {
        if(!start.isEnd()) {
            start = start.getFollower();
        }
    }

    void insertSorted(Dataelement data) {
        start = start.insertSorted(data);
    }

    Listelement get(int index) {
        if(index >= 0 && index < this.getLength()) {
            return start.get(index, getLength());
        } else {
            return null;
        }
    }

    void removeValue(String value) {
        start = start.removeValue(value);
    }
}