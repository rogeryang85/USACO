/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usaco;

/**
 *
 * @author roger
 */
import java.util.*;
public class newbarn {
    
    
    class Edge{
        int v1; 
        int other; 
        int weight;
        Edge(int v1, int v2, int weight)
        {
            this.v1= v1; 
            other= v2; 
            this.weight= weight;
        }
    }
    class Graph{
       ArrayList<ArrayList<Edge>> graph = new ArrayList<ArrayList<Edge>>();
       
       public void insertVertex(int v1, int v2, int weight)
       {
           Edge temp = new Edge(v1, v2, weight); 
           graph.get(v1).add(temp); 
           graph.add(v2, new ArrayList<Edge>()); 
           graph.get(v2).add(temp); 
       }
    }
    
}
