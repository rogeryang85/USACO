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
import java.util.Scanner;

public class Lifeguard {
  private static lifeguardlol [] list;
    public static void main(String [] args)
    {
      Scanner input= new Scanner(System.in);
      int num = input.nextInt();
      list = new lifeguardlol[num];

      for(int i=0; i<num; i++)
      {
       int starttime = input.nextInt();
       int endtime = input.nextInt();
       list[i] = new lifeguardlol(starttime, endtime);
      }

     
      for(int i=0; i<list.length; i++)
      {
       for(int j=i+1; j<list.length; j++)
       {
        if(list[i].starttime==0&&list[i].endtime==0)
        {
            continue; 
        }
        if(list[i].endtime>list[j].starttime&&list[i].starttime<list[j].starttime&&list[i].endtime<list[j].endtime)
        {
       
         list[i].endtime=list[j].starttime;

        }
        else if(list[i].starttime>list[j].starttime&&list[i].starttime<list[j].endtime&&list[i].endtime>list[j].endtime)
        {
         list[i].starttime=list[j].endtime; 
         
        }
       else if(list[i].starttime>list[j].starttime&&list[j].endtime<list[i].endtime)
        {
        
         list[i].starttime=0;
         list[i].endtime=0;
        
        }
       else if(list[i].starttime==list[j].starttime&&list[i].endtime==list[j].endtime)
       {
        
         list[i].starttime=0;
         list[i].endtime=0; 
          
       }
       else if(list[i].starttime==list[j].starttime&&list[i].endtime!=list[j].endtime)
       {
         if(list[i].endtime>list[j].endtime)
         {
            
           list[j].starttime=0;
           list[j].endtime=0; 
           
         }
         else
         {
          
           list[i].starttime=0;
           list[i].endtime=0;  
        
         }
             
       }
       else if(list[i].starttime!=list[j].starttime&&list[i].endtime==list[j].endtime)
       {
         if(list[i].starttime<list[j].starttime)
         {
         
          list[j].starttime=0;
          list[j].endtime=0; 
          
         }
         else
         {
          
          list[i].starttime=0;
          list[i].endtime=0;   
          
         }

       }
       else if(list[i].starttime<list[j].starttime&&list[i].endtime>list[j].endtime)
       {
        
        list[j].starttime=0;
        list[j].endtime=0; 
        
       }
       else
       {
        list[i]=list[i]; 
       }
       }
       }
      
      int ayy = 1+ totaltime()-shortesttime();
      System.out.println(ayy);

    }
    public static int totaltime()
    {
     int total=0;
     for(int i=0; i<list.length; i++)
     total= total+ (list[i].endtime-list[i].starttime); 
     return total;
    }
    public static int shortesttime()
    {
      int shortest= list[0].endtime-list[0].starttime; 
      for(int i=1; i<list.length; i++)
      {
       if(list[i].endtime-list[i].starttime<shortest)
       {
         shortest=list[i].endtime-list[i].starttime;
       }
      }
      return shortest;
    }
}

    /* public static void selectionsort()
     {
      int i;
      int j;
      int index=0;
      for(i=0; i<list.length; i++)
      {
       lifeguardlol lowest= list[i];
       for(j=i+1; j<list.length; j++)
       {
        if(list[j].actualtime<lowest.actualtime)
        {
         lowest=list[j];
         index=j;
        }
       }
       swap(i, index);
      }
     }
     public static void swap(int a, int b)
     {
      lifeguardlol temp= list[a];
      list[a]= list[b];
      list[b]=temp;
     } */



