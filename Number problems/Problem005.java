/*Disarium number.
--------------------
A number is called Disarium number if the sum of its power of the positions from left to right is equal to the number.
Example:
11 + 32 + 53 = 1 + 9 + 125 = 135*/

import java.util.Scanner;
public class Problem005 {
    
    public static int IsDisariumNumber(int N){
        int Sum=0;
        String s=Integer.toString(N);
        for(int i=s.length();i>0;i--){
            int n=N%10;
            Sum=Sum+(int)Math.pow(n,i);
            N=N/10;
        }
       return Sum;
    }
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
     int N=sc.nextInt();
     
     int Sum=IsDisariumNumber(N);
     
     if(N==Sum){
        System.out.println("Disarium number");
     }
     else{
        System.out.println("Not Disarium number");   
     }
    }
}