public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");
        graph.addNode("E");
        graph.addNode("F");

        graph.addEdge("B", "D", 1);
        graph.addEdge("D", "A", 7);
        graph.addEdge("A", "E", 7);
        graph.addEdge("A", "D", 7);

        graph.printAdjacencyMatrix();


        System.out.print("\nDFS: ");
        graph.dfs("B");

    }
}