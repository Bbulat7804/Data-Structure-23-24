package Q1Q2;

public class Edge<T extends Comparable, N extends Comparable> {
    Vertex<T,N> toVertex;
    N weight;
    
    public Edge(){
        toVertex = null;
        weight = null;
    }

    public Edge(Vertex<T, N> toVertex, N weight) {
        this.toVertex = toVertex;
        this.weight = weight;
    }
}
