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
        start.printInformation(getLength());
    }

    Dataelement search (String value) {
        return start.search(value);
    }
    
    void insertBeforeData(Dataelement data, String value) {
        start = start.insertBeforeData(data, value);
    }

    void sortBubble() {
        int moves = 1;
        while (moves != 0) {
            moves = 0;
            for (int i = 0; i < this.getLength() - 1; i++) {
                Listelement current = this.get(i);
                Listelement next = this.get(i + 1);
                if(current.getData().getKey().compareTo(next.getData().getKey()) > 0) {
                    moves++;
                    Listelement nextNext = get(i + 2);
                    Listelement previous = get(i - 1);
                    if(previous == null) {
                        start = next;
                        next.setFollower(current);
                        current.setFollower(nextNext);
                    } else {
                        current.setFollower(nextNext);
                        next.setFollower(current);
                        previous.setFollower(next);
                    }
                }
            }
        }

    }
    
    void searchBinary(String value) {
        sortBubble();
        int left = 0;
        int right = this.getLength() - 1;
        boolean found = false;

        while (left <= right && !found) {
            int middle = (left + right) / 2;
            if(value.compareToIgnoreCase(this.get(middle).getData().getKey()) < 0) {
                right = middle - 1;
            } else if (value.compareToIgnoreCase(this.get(middle).getData().getKey()) > 0) {
                left = middle + 1;
            } else {
                this.get(middle).printOwn();
                found = true;
            }
        }
        if(!found) {
            System.out.println(value +  " was not found in list!");
        }
    }

    void removeBack() {
        if(getLength() > 1) {
            get(getLength() - 2).setFollower(new End());
        } else {
            removeFront();
        }

    }

    void insertBack(Dataelement data) {
        start = start.insertBack(data);
    }

    void removeFront() {
        start = start.getFollower();
    }

    void insertSorted(Dataelement data) {
        start = start.insertSorted(data);
    }

    Listelement get(int index) {
        if(index >= 0 && index < this.getLength()) {
            return start.get(index, getLength());
        } else if(index >= this.getLength()) {
            return new End();
        } else {
            return null;
        }
    }

    void removeValue(String value) {
        start = start.removeValue(value);
    }
}