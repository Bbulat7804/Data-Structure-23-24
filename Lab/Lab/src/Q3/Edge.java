package Q3;

import Q1Q2.*;

public class Edge<T extends Comparable> {
    Vertex<T> toVertex;
    
    public Edge(){
        toVertex = null;
    }

    public Edge(Vertex<T> toVertex) {
        this.toVertex = toVertex;
    }
}
