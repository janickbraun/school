public class Tree {
    private Treeelement root;
    private int nodeCount;
    public Tree() {
        root = new End();
        nodeCount = 0;
    }

    public void insert(Dataelement data) {
        if(this.contains(data)) return;
        root = root.insert(data);
        nodeCount++;
    }

    public int getHeight() {
        return root.getHeight();
    }

    public int getSize() {
        return nodeCount;
    }

    private boolean contains(Dataelement value) {
        return this.search(value.getValue()) != null;
    }

    public void print() {
        root.print();
    }

    public void deleteAll() {
        root = new End();
        nodeCount = 0;
    }

    Treeelement search(String value) {
        return root.search(value);
    }

}
