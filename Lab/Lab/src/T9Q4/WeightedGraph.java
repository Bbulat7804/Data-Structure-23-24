package T9Q4;

import java.util.ArrayList;
import java.util.LinkedList;

public class WeightedGraph <T extends Comparable, N extends Comparable>{
    LinkedList<Vertex<T,N>> graph = new LinkedList();    
    
    public int getSize(){
        return graph.size();
    }
    
    public boolean hasVertex(T vertex){
        for(int i=0 ; i<graph.size() ; i++){
            if(graph.get(i).vertexInfo.equals(vertex))
                return true;
        }
        return false;
    }
    
    public int getIndeg(T vertex){
        if(hasVertex(vertex)){
            for(int i=0 ; i<graph.size() ; i++){
                if(graph.get(i).vertexInfo.equals(vertex))
                    return graph.get(i).inDeg;
            }
        }
        return -1;
    }
    
    public int getOutdeg(T vertex){
        if(hasVertex(vertex)){
            for(int i=0 ; i<graph.size() ; i++){
                if(graph.get(i).vertexInfo.equals(vertex))
                    return graph.get(i).outDeg;
            }
        }
        return -1;
    }
    
    public boolean addVertex(T vertex){
        if(hasVertex(vertex))
            return false;
        Vertex<T,N> newV = new Vertex(vertex);
        graph.add(newV);
        return true;
    }
    
    public int getIndex(T vertex){
        if(hasVertex(vertex)){
            for(int i=0 ; i<graph.size() ; i++){
                if(graph.get(i).vertexInfo.equals(vertex))
                    return i;
            }
        }
        return -1;
    }
    
    public ArrayList<T> getAllVertexObject(){
        ArrayList<T> list = new ArrayList();
        for(int i=0 ; i<graph.size() ; i++){
            list.add(graph.get(i).vertexInfo);
        }
        return list;
    }
    
    public T getVertex(int pos){
        return graph.get(pos).vertexInfo;
    }
    
    public boolean hasEdge(T source, T destination){
        if(hasVertex(source) && hasVertex(destination)){
            LinkedList<Edge<T,N>> edgeList = graph.get(getIndex(source)).edges;
            for(int i=0 ; i<edgeList.size() ; i++){
                if(edgeList.get(i).toVertex1.vertexInfo.equals(destination))
                    return true;
            }
        }
        return false;
    }
    
    public boolean addEdge(T source, T destination, N weight){
        if(!hasVertex(source) || !hasVertex(destination)){
            return false;
        }
        
        LinkedList<Edge<T,N>> edgeList = graph.get(getIndex(source)).edges;
        Vertex<T,N> toVertex = graph.get(getIndex(destination));
        Vertex<T,N> fromVertex = graph.get(getIndex(source));
        Edge<T,N> newEdge = new Edge(toVertex, weight);
        
        edgeList.addFirst(newEdge);
        toVertex.inDeg++;
        fromVertex.outDeg++;
        return true;
    }
    
    public N getEdgeWeight(T source, T destination){
        if(hasEdge(source, destination)){
            LinkedList<Edge<T,N>> edgeList = graph.get(getIndex(source)).edges;
            for(int i=0 ; i<edgeList.size() ; i++){
                if(edgeList.get(i).toVertex1.vertexInfo.equals(destination))
                    return edgeList.get(i).weight;
            }
        }
        return null;
    }
    
    public ArrayList<T> getNeighbours(T vertex){
        if(!hasVertex(vertex))
            return null;
        
        ArrayList<T> neighbours = new ArrayList();
        LinkedList<Edge<T,N>> edgeList = graph.get(getIndex(vertex)).edges;
        for(int i=0 ; i<edgeList.size() ; i++){
            neighbours.add(edgeList.get(i).toVertex1.vertexInfo);
        }
        return neighbours;
    }
    
    public void printEdges(){
        LinkedList<Edge<T,N>> edgeList = new LinkedList();
        System.out.println("Print Edges : ");
        for(int i=0 ; i<graph.size() ; i++){
            System.out.print("# " + graph.get(i).vertexInfo + " : " );
            edgeList = graph.get(i).edges;
            for(int j=0 ; j<edgeList.size() ; j++){
                System.out.print("[" + graph.get(i).vertexInfo + "," + edgeList.get(j).toVertex1.vertexInfo + "] ");
            }
            System.out.println();   
        }
    }
}
