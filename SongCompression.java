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
import java.io.*; 
import java.util.*;
public class SongCompression {
    
   static PriorityQueue<Integer> diff  = new PriorityQueue<Integer>(new sort()); 
   static class sort implements Comparator<Integer> 
   {
       public int compare(Integer a, Integer b)
       {
           if(a==b)
               return 0; 
           else if(a<b)
               return 1; 
           else 
               return -1; 
       }
   }
    public static void main(String [] args) throws IOException
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(input.readLine()); 
        int N = Integer.parseInt(st.nextToken()); 
        int cap = Integer.parseInt(st.nextToken()); 
        long sum =0; 
        int answer=0; 
        for(int i=0; i<N; i++)
        {
            StringTokenizer temp = new StringTokenizer(input.readLine()); 
            int init = Integer.parseInt(temp.nextToken()); 
            int fin = Integer.parseInt(temp.nextToken()); 
            sum = sum + init; 
            diff.add(init - fin); 
            
        }
        while(sum>cap)
        {
            if(!diff.isEmpty())
                sum=sum-diff.poll(); 
            else
            {
                answer=-1; 
                break;
            }
            answer++; 
        }
        System.out.println(answer); 
        
    }
    
}
