package models;

import java.util.LinkedList;
import java.util.List;
public class Tester {

    public final int infinity = 99999;

    public List<Vertex> generateDataSet(int N) {
        int x, y, lim = (N/16)*50;
        List<Vertex> dataset = new LinkedList<>();
        
        for (int i = 0; i < N; i++) {

            Vertex vertex = new Vertex();
            Data data;
            do {
                x = (int) (Math.random() * (lim * 2 + 1) - lim);
                y = (int) (Math.random() * (lim * 2 + 1) - lim);
                
            } while (isThisInDS(x, dataset, "x") && isThisInDS(y, dataset, "y"));
            
            data = new Data(x,y);
            
            vertex.setData(data);
            
            dataset.add(vertex);
          
        }

        return dataset;
    }

    public boolean isThisInDS(int coor, List<Vertex> DS, String axis) {
        boolean exist = false;
        int coorcmp = infinity;

        for (Vertex v : DS) {
            if (axis.equals("x")) {
                coorcmp = v.getData().x;
            } else if (axis.equals("y")) {
                coorcmp = v.getData().y;
            }

            if (coorcmp == coor) {

                exist = true;

            }
        }

        return exist;

    }

    public  List<FakeVertex> getAdj(Graph graph){
        
       List<FakeVertex> adjlist = new LinkedList<>();
       List<FakeVertex> neighbors = new LinkedList<>();
       double distance;
       int x1, y1, x2, y2;
       for(Vertex vertex: graph.vertices){
           
          FakeVertex vert = new FakeVertex(vertex);
          
          for(Vertex ve: graph.vertices){
               
               FakeVertex vert2 = new FakeVertex(ve);
               
               x1 = vertex.getData().x;
               y1 = vertex.getData().y;
               x2 = ve.getData().x;
               y2 = ve.getData().y;
              
              distance = Math.sqrt(Math.pow((double) (x1 - x2) , (double)2) + Math.pow((double) (y1 - y2) , (double)2));
              
              vert2.weight = distance;
              
              neighbors.add(vert2);
          
            }
          vert.neighbors = neighbors; 
          adjlist.add(vert);
       
       }
       
       return adjlist;
    
    }
    
    public void drawTheGraph(){
        
        
    
    
    
    }
    
    public String toString(List<Vertex> dataset){
    
        String strdataset = "{";
        
        for(Vertex vertex: dataset){
            
           strdataset += "("+vertex.getData().x + "," + vertex.getData().y +")";
        
        }
        
        strdataset += "}";
        
        
        return strdataset;
    
    }
    
    
}
