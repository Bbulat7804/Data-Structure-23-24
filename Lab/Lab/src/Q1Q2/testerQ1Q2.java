package Q1Q2;

public class testerQ1Q2 {
    public static void main(String[] args) {
        WeightedGraph<String,Integer> graph = new WeightedGraph();
        graph.addVertex("Xayne");
        graph.addVertex("Hani");
        graph.addVertex("Nazifah");
        graph.addVertex("Hazim");
        graph.addEdge("Hazim", "Xayne",20);
        graph.addUndirectedEdge("Hazim", "Nazifah",30);
        graph.addEdge("Hani", "Xayne",27);
        //graph.removeEdge("Hazim","Nazifah");
        graph.printEdges();
    }
}
