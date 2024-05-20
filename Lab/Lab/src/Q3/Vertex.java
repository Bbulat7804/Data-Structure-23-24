package Q3;

import Q1Q2.*;
import java.util.LinkedList;

public class Vertex<T extends Comparable> {
    T vertexInfo;
    int inDeg = 0;
    int outDeg = 0;
    LinkedList<Edge<T>> edges = new LinkedList();

    public Vertex(T vertexInfo) {
        this.vertexInfo = vertexInfo;
    }
}
