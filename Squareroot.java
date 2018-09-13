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
import java.lang.Math; 
public class Squareroot {
    public static void main(String [] args)
    {
      Scanner input = new Scanner(System.in); 
      int n= input.nextInt();
      double [] list = new double [n];
      for(int i=0; i<list.length; i++)
      list[i]=input.nextDouble(); 
      double answer=0; 
      for(int i=0; i<list.length; i++)
      {
        if(Math.floor(Math.sqrt(list[i]))==Math.sqrt(list[i]))
        continue; 
        else
        {
          if(list[i]>answer)
              answer=list[i]; 
        }
      }
     int a = (int)answer; 
     System.out.println(a); 
    }
    
}
