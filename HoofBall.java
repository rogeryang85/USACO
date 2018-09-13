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
public class HoofBall {
    private static int [] list;
    private static boolean [] marked; 
    private static int start=0; 
    private static int end; 
    private static int ball;
    private static int numball=0; 
    private static int num=0; 
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in); 
        int N =input.nextInt(); 
        list = new int [N];
        end= list.length; 
        marked = new boolean [N];
        Arrays.sort(list);
            
    }
    public static void getCount()
    {
      
        if(num!=list.length)
        {
        while(true)
        {
            if(ball==0)
            {
                marked[ball]=true;
                num++; 
                ball++; 
            }
            else 
            {
                marked[ball]=true; 
                num++;
                if(list[ball-1]<=list[ball+1])
                {
                  ball--;
                  if(marked[ball])
                      break;
                }
                else
                {
                    ball++;
                    if(marked[ball])
                        break;
                }
                
            }
            
        }
        }
        if(num!=list.length)
        {
            while(true)
            {
                
            }
        }
            
    }
}
