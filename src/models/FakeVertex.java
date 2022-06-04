/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Ricardo
 */
public class FakeVertex {
    
    public Vertex vertex;
    public double weight;
    List<FakeVertex> neighbors;
    
    public FakeVertex(Vertex vertex){    
        this.vertex = vertex;
        neighbors = new LinkedList<>();
    }
    
    
    
}
