package models;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {

    public ArrayList<Vertex> vertices = new ArrayList<>();
    // adjacency list 
    List<FakeVertex> adjlist = new LinkedList<>();

    public List<FakeVertex> getNeighbors(Vertex vertex) {

        List<FakeVertex> neighbors = new LinkedList<>();

        for (FakeVertex fv : adjlist) {
            if (fv.vertex.getData().equals(vertex.getData())) {
                neighbors = fv.neighbors;
            }
        }

        return neighbors;

    }

    public ArrayList<Edge> applyPRIM(Vertex vertex, int counter) {
       // ArrayList<Edge> MST = new ArrayList<>();
        ArrayList<Vertex> nonVisited = vertices;
        ArrayList<Vertex> visited = new ArrayList<>();
        // agregate the neightbors into the visited vertices 
        

        return PRIM(vertex, counter, nonVisited);

    }

    public ArrayList<Edge> PRIM(Vertex vertex, int counter, ArrayList<Vertex> nonVisited) {
        counter++;
        ArrayList<Edge> MST = new ArrayList<>();
        
        if (!nonVisited.isEmpty()) {
    
            Edge edge = new Edge();
            nonVisited.remove(vertex);
            
            edge.getEdgewithMinimumDistance(vertex, nonVisited, counter);
            
            PRIM(edge.p2, counter, nonVisited);
            MST.add(edge);

        } 
               
         return MST;
        
        

        

    }

}
