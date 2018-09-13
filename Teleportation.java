/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usaco;

/*
ID: rogeryang85
LANG: JAVA
TASK: teleport
 */
import java.io.*;
import java.util.*;
import java.lang.Math; 
public class Teleportation {
    public static void main(String [] args) throws IOException
    {
      //   BufferedReader f = new BufferedReader(new FileReader("teleport.in"));
        // PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("teleport.out")));
//         StringTokenizer st = new StringTokenizer(f.readLine());
        Scanner sc = new Scanner(new File("teleport.in"));
        PrintWriter pw = new PrintWriter(new File("teleport.out"));
        int start = sc.nextInt(); 
        int end = sc.nextInt(); 
        int tele1= sc.nextInt(); 
        int tele2= sc.nextInt(); 
        int distance= Math.abs(start-end); 
        int teledistance1;
        int teledistance2;
        int teledistance; 
        teledistance1= Math.abs(start-tele1) + Math.abs(tele2-end); 
        teledistance2= Math.abs(start-tele2) + Math. abs(tele1-end); 
        if(teledistance2>=teledistance1)
        {
            teledistance= teledistance1; 
        }
        else
            teledistance= teledistance2; 
        if(teledistance>=distance)
            pw.println(distance);
        else 
            pw.println(teledistance);
        pw.close();
    }
}
