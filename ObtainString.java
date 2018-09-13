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
public class ObtainString {
    
   static char change []; 
   static char goal [];
   static ArrayList<Integer> sequence = new ArrayList<Integer>(); 
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in); 
        int N = Integer.parseInt(input.nextLine()); 
        String s = input.nextLine(); 
        String t = input.nextLine(); 
        change = s.toCharArray(); 
        goal  = t.toCharArray(); 
        int answer =0; 
        
        for(int i=change.length-1; i>=0; i--)
        {
            if(change[i]!=goal[i])
            {
                for(int j=i; j>=0; j--)
                {
                    if(j==0&&change[j]!=goal[i])
                    {
                        answer=-1; 
                    }
                    if(change[j]==goal[i])
                    {
                        Swap(j, i); 
                        break; 
                    }
                    
                    
                }
            }
            
        }
        if(answer==-1)
        {
            System.out.println(-1); 
        }
        else
        {
            System.out.println(sequence.size());
            for(int i=0; i<sequence.size(); i++)
            {
                System.out.print(sequence.get(i)+1+" "); 
            }
        }
    }
    public static void miniSwap(int i)
    {
        char temp = change[i]; 
        change[i] = change[i+1]; 
        change[i+1] = temp; 
        sequence.add(i); 

    }
    public static void Swap(int i, int j)
    {
        int pointer = i; 
        while(pointer!=j)
        {
            miniSwap(pointer); 
            pointer++; 
        }
    }
   
    
}
