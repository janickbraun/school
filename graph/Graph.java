import java.util.ArrayList;

class Graph {
    ArrayList<ArrayList<Integer>> adjacencyMatrix;
    ArrayList<Node> nodes;
    public Graph() {
        adjacencyMatrix = new ArrayList<ArrayList<Integer>>();
        nodes = new ArrayList<Node>();
    }

    public void addNode(String value) {
        for (Node node: nodes) {
            if (node.getValue().equals(value)) {
                System.out.println("Node could not be created due to duplication");
                return;
            }
        }
        Node node = new Node(value);
        nodes.add(node);
        for (ArrayList<Integer> l: adjacencyMatrix) {
            l.add(0);
        }
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < nodes.size(); i++) {
            temp.add(0);
        }
        adjacencyMatrix.add(temp);
    }

    public void test() {
        ArrayList<Integer> temp = adjacencyMatrix.get(1);
        for (int i: temp) {
            System.out.println(i);
        }
    }

    public void dfs(String root) {
        int start = getIndexOfNode(root);
        if(start == -1) {
            System.out.println("Root was not found");
            return;
        }
        boolean[] isVisited = new boolean[getSize()];
        dfsRecursive(start, isVisited);
    }

    private void dfsRecursive(int current, boolean[] isVisited) {
        isVisited[current] = true;
        System.out.print(nodes.get(current).getValue() + " ");
        ArrayList<Integer> temp = adjacencyMatrix.get(current);
        for (int i = 0; i < temp.size(); i++) {
            if(temp.get(i) != 0 && !isVisited[i]) {
                dfsRecursive(i, isVisited);
            }
        }
    }

    public void deleteNode(String value) {
        int index = getIndexOfNode(value);
        if (index == -1) {
            System.out.println("Node was not found");
            return;
        }

        adjacencyMatrix.remove(index);
        nodes.remove(index);
        for (int i = 0; i < nodes.size(); i++) {
            adjacencyMatrix.get(i).remove(index);
        }

    }

    public void addEdge(String src, String dest, int weight) {
        int srcIndex = getIndexOfNode(src);
        int destIndex = getIndexOfNode(dest);
        if (srcIndex == -1 || destIndex == -1) {
            System.out.println("Edge could not be created");
            return;
        }
        adjacencyMatrix.get(srcIndex).set(destIndex, weight);
    }

    public int getSize() {
        return nodes.size();
    }

    public int getEdgesCount() {
        int count = 0;
        for (ArrayList<Integer> list : adjacencyMatrix) {
            for (Integer i : list) {
                if(i != 0) {
                    count++;
                }
            }
        }
        return count;
    }

    private int getIndexOfNode(String value) {
        for (int i = 0; i < nodes.size(); i++) {
            if(nodes.get(i).getValue().equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public void printInformation() {
        System.out.println("\nInformation:");
        System.out.println("Nodes: " + getSize());
        System.out.println("Edges: " + getEdgesCount());
    }
    public void printAdjacencyMatrix() {
        System.out.print("\nAdjacency Matrix:\n ");
        for (Node node : nodes) {
            System.out.print(" " + node.getValue());
        }
        System.out.println();
        for (int i = 0; i < adjacencyMatrix.size(); i++) {
            System.out.print(nodes.get(i).getValue() + " ");
            for (int j = 0; j < getSize(); j++) {
                System.out.print(adjacencyMatrix.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}