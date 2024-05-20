package Q1Q2;

import java.util.LinkedList;

public class Vertex<T extends Comparable, N extends Comparable> {
    T vertexInfo;
    int inDeg = 0;
    int outDeg = 0;
    LinkedList<Edge<T,N>> edges = new LinkedList();

    public Vertex(T vertexInfo) {
        this.vertexInfo = vertexInfo;
    }
    
    
}
