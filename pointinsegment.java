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
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.*;
import java.util.*;
public class pointinsegment {
    
    public static void main(String [] args) throws IOException
    {
        Scanner input = new Scanner(System.in); 
   
        
        int answer =0;
        
        String str = input.nextLine();
        StringTokenizer st = new StringTokenizer(str); 
        int N = Integer.parseInt(st.nextToken()); 
        int M = Integer.parseInt(st.nextToken()); 
        boolean arr [] = new boolean [M]; 
        for(int i=0; i<arr.length; i++)
            arr[i]=false; 
        
        for(int i=0; i<N; i++)
        {
            StringTokenizer temp = new StringTokenizer(input.nextLine()); 
            int start = Integer.parseInt(temp.nextToken()); 
            int end = Integer.parseInt(temp.nextToken()); 
            for(int j=start-1; j<=end-1; j++)
                arr[j]=true;
        }
        for(int i=0; i<arr.length; i++)
        {
            if(!arr[i])
                answer++; 
       
                
        }
        int answers[] = new int [answer]; 
        int next=0; 
        for(int i=0; i<arr.length; i++)
        {
            if(!arr[i])
            {
                answers[next]=i; 
                next++; 
            }
                        
        }
        System.out.println(answer); 
        for(int i=0; i<answers.length; i++)
            System.out.print(answers[i]+1);
        
       
    }
    
    
}
