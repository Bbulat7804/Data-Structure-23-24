package Q3;

public class testerQ3 {
    public static void main(String[] args) {
        Graph<String> graph = new Graph();
        graph.addVertex("Xayne");
        graph.addVertex("Ivy");
        graph.addVertex("Hazim");
        graph.addVertex("Nazifah");
        graph.addEdge("Xayne","Ivy");
        graph.addUndirectedEdge("Hazim","Nazifah");
        graph.printEdges();
    }
}
