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
public class walking {
    
    static long dist; 
    static long houses; 
    static long moves;
    static int answer; 
    static ArrayList<Value> sequence= new ArrayList<Value>(); 
    static class Value
    {
        long value; 
        public Value(long a)
        {
            value=a;
        }
    }
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in); 
        StringTokenizer st = new StringTokenizer(input.nextLine()); 
        houses= Integer.parseInt(st.nextToken()); 
        moves = Integer.parseInt(st.nextToken()); 
        dist = Integer.parseInt(st.nextToken()); 
        long current =1; 
        if(dist%moves==0)
        {
            if(houses-1>=(dist/moves))
                answer= 1; 
            else 
                answer= 0; 
        }
        else
        {
            long avg = dist/moves; 
            if(houses-1>=avg+1)
                answer= 1; 
            if(houses-1<=avg)
                answer= 0; 
        }
   
    }
    
}
