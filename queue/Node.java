public class Node extends Listelement {
    Listelement follower;
    Dataelement data;

    Node (Dataelement data, Listelement follower) {
        this.data=data;
        this.follower=follower;
    }

    Dataelement getData() {
        return this.data;
    }

    Listelement getFollower() {
        return this.follower;
    }

    void setFollower(Listelement node){
        this.follower=node;
    }

    Dataelement search (String value) {
        if (data.isSameKey(value)) {
            return data;
        } else {
            return follower.search(value);
        }
    }

    Listelement removeBack() {
        if (follower.isEnd()) {
            return follower;
        } else {
            follower = follower.removeBack();
            return this;
        }
    }

    Listelement get(int index, int totalLength) {
        int finalIndex = Math.abs((getLength() - 1)-(totalLength - 1));

        if(finalIndex == index) {
            return this;
        } else {
            return follower.get(index, totalLength);
        }
    }

    void insertBack(Dataelement data) {
        if(follower.isEnd()){
            follower = new Node(data, follower);
        } else {
            follower.insertBack(data);
        }
    }

    Listelement removeValue(String value) {
        if (data.isSameKey(value)) {
            return follower;
        } else {
            follower = follower.removeValue(value);
            return this;
        }
    }

    Listelement insertSorted(Dataelement data) {
        if (data.isKeyHigher(data.getKey())) {
            return new Node(data, this);
        } else {
            if (follower.isEnd()) {
                insertBack(data);
            } else {
                follower=follower.insertSorted(data);
            }
            return this;
        }
    }

    boolean isEnd() {
        return false;
    }

    int getLength() {
        return follower.getLength() + 1;
    }

    void printInformation() {
        data.printInformation();
        follower.printInformation();
    }

    void printOwn() {
        data.printInformation();
    }
}
