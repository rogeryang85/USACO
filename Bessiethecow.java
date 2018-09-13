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
import java.io.*; 
public class Bessiethecow {
 
    public static void main(String [] args) throws IOException 
    {
      BufferedReader f = new BufferedReader(new FileReader("billboard.in"));
      PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("billboard.out"))); 
      
      StringTokenizer st = new StringTokenizer(f.readLine());
      int lawnx1= Integer.parseInt(st.nextToken()); 
      int lawny1=Integer.parseInt(st.nextToken());
      int lawnx2= Integer.parseInt(st.nextToken());
      int lawny2= Integer.parseInt(st.nextToken());
      StringTokenizer st1= new StringTokenizer(f.readLine());
      int cowx1= Integer.parseInt(st1.nextToken());
      int cowy1= Integer.parseInt(st1.nextToken()); 
      int cowx2= Integer.parseInt(st1.nextToken());
      int cowy2= Integer.parseInt(st1.nextToken());
      
      
      
      
     /* int lawnx1= input.nextInt();
       int lawny1= input.nextInt();
       int lawnx2= input.nextInt();
       int lawny2= input.nextInt();
      
       int cowx1= input.nextInt();
       int cowy1= input.nextInt();
       int cowx2= input.nextInt();
       int cowy2= input.nextInt(); */ 
      
     
       int totalarea; 
       if(lawnx1==cowx1&&lawny1==cowy1&&lawnx2==cowx2&&lawny2==cowy2)
       totalarea=0;
        
        
       else if((cowx2-cowx1)>=(lawnx2-lawnx1)&&cowx1<=lawnx1&&cowx2>=lawnx2)
       {
        if((cowy1<=lawny1))
        {
         if(cowy2>=lawny2)
         totalarea=0; 
         else
         totalarea=Math.abs((lawnx2-lawnx1))*Math.abs((lawny2-cowy2));
         
        }
        else 
        {
         if(cowy2>=lawny2)
         totalarea=Math.abs((lawnx2-lawnx1))*Math.abs((cowy1-lawny1)); 
         else
         totalarea=Math.abs((lawnx2-lawnx1))*Math.abs((lawny2-lawny1));
          
        }
       }
       else if((cowy2-cowy1)>=(lawny2-lawny1)&&cowy1<=lawny1&&cowy2>=lawny2)
       {
         if(cowx1<=lawnx1)
         {
           if(cowx2>=lawnx2)
           totalarea=0;
         
           else 
          totalarea=Math.abs((lawny2-lawny1))*Math.abs((lawnx2-cowx2));
           
         }
         else 
         {
          if(cowx2>=lawnx2)
          totalarea= Math.abs((lawny2-lawny1))*Math.abs((cowx1-lawnx1)); 
          else
          totalarea= Math.abs((lawny2-lawny1))*Math.abs((lawnx2-lawnx1)); 
          
         }
       }
       else
       totalarea=Math.abs((lawnx2-lawnx1))*Math.abs((lawny2-lawny1));
       out.println(totalarea);
       out.close();
      }
    }

