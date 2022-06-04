/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author Ricardo
 */
public class Edge {
    
    public final double infinity = 999999; 
    public Vertex p1;
    public Vertex p2;
    private double weight;
    
    public Edge(){
    
    }
    public Edge(Vertex p1, Vertex p2, double weight) {
        this.p1 = p1;
        this.p2 = p2;
        this.weight = weight;
    }
    
    public void setWeight(double weight){
        
        this.weight = weight;
    }
    
    public double getWeight(){
        return weight;
    }
    
    public Edge getEdgewithMinimumDistance(Vertex v1, ArrayList<Vertex> vertices, int counter){
        
        double dm = infinity, d; 
        Vertex v2 = new Vertex();
        int x1, y1, x2, y2;
        for(Vertex v: vertices){
               x1 = v1.getData().x;
               y1 = v1.getData().y;
               x2 = v.getData().x;
               y2 = v.getData().y;
               
              d = Math.sqrt(Math.pow((double) (x1 - x2) , (double)2) + Math.pow((double) (y1 - y2) , (double)2));
              
              if(d<dm){ dm = d; v2 = v ;}
              counter++;
        }
        
        
        return new Edge(v1, v2, dm);
    
    }
}
    

