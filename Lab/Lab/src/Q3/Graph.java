package Q3;

import Q1Q2.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Graph <T extends Comparable>{
    LinkedList<Vertex<T>> graph = new LinkedList();    
    
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
        Vertex<T> newV = new Vertex(vertex);
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
            LinkedList<Edge<T>> edgeList = graph.get(getIndex(source)).edges;
            for(int i=0 ; i<edgeList.size() ; i++){
                if(edgeList.get(i).toVertex.vertexInfo.equals(destination))
                    return true;
            }
        }
        return false;
    }
    
    public boolean addEdge(T source, T destination){
        if(!hasVertex(source) || !hasVertex(destination)){
            return false;
        }
        
        LinkedList<Edge<T>> edgeList = graph.get(getIndex(source)).edges;
        Vertex<T> toVertex = graph.get(getIndex(destination));
        Vertex<T> fromVertex = graph.get(getIndex(source));
        Edge<T> newEdge = new Edge(toVertex);
        
        edgeList.addFirst(newEdge);
        toVertex.inDeg++;
        fromVertex.outDeg++;
        return true;
    }
    
    public ArrayList<T> getNeighbours(T vertex){
        if(!hasVertex(vertex))
            return null;
        
        ArrayList<T> neighbours = new ArrayList();
        LinkedList<Edge<T>> edgeList = graph.get(getIndex(vertex)).edges;
        for(int i=0 ; i<edgeList.size() ; i++){
            neighbours.add(edgeList.get(i).toVertex.vertexInfo);
        }
        return neighbours;
    }
    
    public void printEdges(){
        LinkedList<Edge<T>> edgeList = new LinkedList();
        System.out.println("Print Edges : ");
        for(int i=0 ; i<graph.size() ; i++){
            System.out.print("# " + graph.get(i).vertexInfo + " : " );
            edgeList = graph.get(i).edges;
            for(int j=0 ; j<edgeList.size() ; j++){
                System.out.print("[" + graph.get(i).vertexInfo + "," + edgeList.get(j).toVertex.vertexInfo + "] ");
            }
            System.out.println();   
        }
    }
    
    public boolean addUndirectedEdge(T v1Name, T v2Name){
        if(!hasVertex(v1Name) || !hasVertex(v2Name)){
            return false;
        }
        
        Vertex<T> v1 = graph.get(getIndex(v1Name));
        Vertex<T> v2 = graph.get(getIndex(v2Name));
        LinkedList<Edge<T>> edgeList1 = v1.edges;
        LinkedList<Edge<T>> edgeList2 = v2.edges;
        Edge<T> newEdge1 = new Edge(v2);
        Edge<T> newEdge2 = new Edge(v1);
        
        edgeList1.addFirst(newEdge1);
        edgeList2.addFirst(newEdge2);
        v1.inDeg++;
        v1.outDeg++;
        v2.inDeg++;
        v2.outDeg++;
        return true;
    }
    
    public boolean removeEdge(T source, T destination){
        if(!hasEdge(source,destination))
            return false;
        Vertex<T> fromVertex = graph.get(getIndex(source));
        Vertex<T> toVertex = graph.get(getIndex(destination));
        LinkedList<Edge<T>> edgeList = fromVertex.edges;
        for(int i=0 ; i<edgeList.size() ; i++){
            if(edgeList.get(i).toVertex.vertexInfo.equals(destination)){
                edgeList.remove(i);
                break;
            }                        
        }
        fromVertex.outDeg--;
        toVertex.inDeg--;
        return true;
    }
}
