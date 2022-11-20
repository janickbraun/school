public class Node extends Listelement {
    public Listelement follower;
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

    Listelement get(int index, int totalLength) {
        int finalIndex = Math.abs((getLength() - 1)-(totalLength - 1));

        if(finalIndex == index) {
            return this;
        } else {
            return follower.get(index, totalLength);
        }
    }

    Listelement insertBack(Dataelement data) {
        follower = follower.insertBack(data);
        return this;
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
            follower=follower.insertSorted(data);
            return this;
        }
    }

    int getLength() {
        return follower.getLength() + 1;
    }

    void printInformation(int totalLength) {
        System.out.print(Math.abs((getLength() - 1)-(totalLength - 1)) + " - "); data.printInformation();
        follower.printInformation(totalLength);
    }

    void printOwn() {
        data.printInformation();
    }
}