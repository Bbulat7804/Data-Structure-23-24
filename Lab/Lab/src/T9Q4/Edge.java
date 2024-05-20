package T9Q4;

public class Edge<T extends Comparable, N extends Comparable> {
    Vertex<T,N> toVertex1;
    N weight;
    
    public Edge(){
        toVertex1 = null;
        weight = null;
    }

    public Edge(Vertex<T, N> toVertex1, N weight) {
        this.toVertex1 = toVertex1;
        this.weight = weight;
    }
}
