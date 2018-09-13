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
public class highestaverage {
   
    public static void main(String [] args)
    {
      Scanner input= new Scanner(System.in); 
      ArrayList<Integer> list = new ArrayList(); 
      ArrayList<Integer> temp = new ArrayList(); 
      
      int N= input.nextInt(); 
      for(int i=0; i<N; i++)
          list.add(input.nextInt()); 
       
      int answer=0; 
      int answerindex=0;
      for(int k=1; k<=N-2; k++)
      {
        for(int i=0; i<=k-1; i++)
            temp.add(list.get(i)); 
        trim(list, k); 
        if(getaverage(list)>answer)
        {
            answer= getaverage(list); 
            answerindex=k;
        }
        list.addAll(0, temp); 
        temp.clear(); 
      }
      System.out.println(answer + " " + answerindex);
     
      
    }
    public static void trim(ArrayList<Integer> list, int numoftrims)
    {
      for(int i=0; i<numoftrims; i++)
        list.remove(0);  
      
    }
    public static int getaverage(ArrayList<Integer> list)
    {
      int size = list.size(); 
      int average=0; 
      int smallest=list.get(0);
      int smallestindex; 
      for(int i=1; i<list.size(); i++)
      {
        if(list.get(i)<smallest)
            smallest=list.get(i); 
      }
      smallestindex= list.indexOf(smallest);
  
      for(int i=0; i<list.size(); i++)
      {
       if(i==smallestindex)
       continue ;
       average= average+list.get(i);
      }
       
      average=average/(size-1);  
      return average; 
    }
}
