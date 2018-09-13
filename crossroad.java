package usaco;



/*
ID: rogeryang85
LANG: JAVA
TASK: crossroad 
*/
import java.util.*;
import java.io.*; 
public class crossroad {
    public static void main(String [] args) throws IOException 
    {
        Scanner input = new Scanner(new FileReader("crossroad.in")); 
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("crossroad.out"))); 
        int observations= Integer.parseInt(input.nextLine()); 
        int [] state  = new int [10];
        int crossings=0;
        for(int i=0; i<state.length; i++)
        {
            state[i]=-1; 
        }
        for(int i=0; i<observations; i++)
        {
            StringTokenizer st = new StringTokenizer(input.nextLine());
            int id= Integer.parseInt(st.nextToken()); 
            int current = Integer.parseInt(st.nextToken()); 
            if(state[id-1]==-1)
            {
             state[id-1]=current;    
            }
            else if(state[id-1]==0)
            {
              if(current==1)
              {
                  state[id-1]=1; 
                  crossings++; 
              }
            }
            else
            {
                if(current==0)
                {
                    state[id-1]=0;
                    crossings++;
                }
            }
        }
        out.println(crossings);
        out.close();
    }
}
