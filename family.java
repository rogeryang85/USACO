/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usaco;

/*
ID: rogeryang85
LANG: JAVA
TASK: family
 */
import java.util.*;
import java.io.*; 
public class family {
    static class member{
        public member sibling; 
        public member mother; 
        public String name; 
        public member child1; 
        public member child2; 
        public member(String s)
        {
            name=s;
        }
    }
    private static String name1; 
    private static String name2; 
    private static ArrayList<member> list; 
    public static void main(String [] args) throws IOException
    {
        Scanner input = new Scanner(System.in); 
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("family.out"))); 
        list = new ArrayList<member>(); 
        StringTokenizer st = new StringTokenizer(input.nextLine()); 
        int N = Integer.parseInt(st.nextToken()); 
        name1 = st.nextToken();
        name2= st.nextToken(); 
        for(int i=0; i<N; i++)
        {
            StringTokenizer token = new StringTokenizer(input.nextLine()); 
            String temp1= token.nextToken(); 
            String temp2= token.nextToken();
            member m1=null; 
            member m2=null; 
            for(int j=0; j<list.size(); j++)
            {
                if(list.get(j).name.equals(temp1))
                    m1=list.get(j); 
                if(list.get(j).name.equals(temp2))
                    m2=list.get(j); 
            }
            if(m1==null)
            {
                m1=new member(temp1); 
                list.add(m1);
            }
            if(m2==null)
            {
                m2=new member(temp2);
                list.add(m2);
            }
            m2.mother=m1; 
            if(m1.child1==null)
            {
                m1.child1=m2;
                m2.sibling=null; 
             
            }
            else    
            {
                m1.child2=m2; 
                m1.child1.sibling=m1.child2; 
                m1.child2.sibling=m1.child1; 
            }
        }
        int indexof1=-1; 
        int indexof2=-1; 
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i).name.equals(name1))
                indexof1=i; 
            if(list.get(i).name.equals(name2))
                indexof2=i; 
        }
        if(indexof2!=-1&&indexof1!=-1)
        {
            boolean onleft=false; 
            boolean found=false; 
            member start = list.get(indexof1); 
            member end = list.get(indexof2); 
            member current = start; 
            int generation=0; 
            while(true)
            {
                if(current==end)
                {
                    onleft=true;
                    found=true; 
                    break;
                }
                else
                {
                    if(current.mother==null)
                        break; 
                    current=current.mother; 
                    generation++;
                }
            }
            if(!onleft)
            {
                generation=0; 
                current=start.sibling; 
                while(true)
                {
                    if(current==end)
                    {
                      onleft=false; 
                      found=true; 
                      break; 
                    }
                    else
                    {
                        if(current.mother==null||current.mother.sibling==null)
                            break; 
                  
                        current=current.mother.sibling; 
                        generation++; 
                    }
                }
            }
            if(found==true)
            {
                if(onleft)
                {
                    if(generation==1)
                        System.out.println(name2 + " is the mother of "+ name1);
                    else if(generation==2)
                        System.out.println(name2 + " is the grandmother of "+name1);
                    else
                    {
                        int numofg=generation-2; 
                        StringBuilder s = new StringBuilder("grandmother");
                        for(int i=1; i<=numofg; i++)
                        {
                          s.insert(0, "great-"); 
                        }
                        System.out.println(s.toString()); 
                 }
                        
                }
                else
                {
                    if(generation==0)
                        System.out.println(name2 + " is the sibling of "+ name1);
                    else 
                    {
                        int numofg=generation-1; 
                        StringBuilder s = new StringBuilder("aunt"); 
                        for(int i=1; i<=numofg; i++)
                        {
                            s.insert(0, "great-"); 
                        }
                        System.out.println(s.toString());
                    }
                }
            }
            else
            {
                System.out.println("COUSINS");
            }
        }
        else
            System.out.println("NOT RELATED");
        
       
    
    }
}
