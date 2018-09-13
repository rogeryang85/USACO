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
public class PROB_Your_Ride_Is_Here {
    static class member{
        public String name; 
        public member(String s)
        {
            name=s; 
        }
    }
  public static void main(String [] args)  
    {
       ArrayList<member> list  = new ArrayList<member>(); 
       member m1 = new member("cock");
       list.add(m1); 
       System.out.println(list.contains(m1));
    }

}
