/*Spy Number Program in Java
------------------------------
A spy number is a number where the sum of its digits equals the product of its digits. 
For example, 1124 is a spy number, the sum of its digits is 1+1+2+4=8 and the product of its digits is 1*1*2*4=8.
*/

import java.util.Scanner;
public class Problem012 {
    
    public static void IsSpyNumber(int Num){
        String s=Integer.toString(Num);
        int Sum=0,Mul=1;
        for(int i=0;i<s.length();i++){
            int n=Num%10;
            Sum=Sum+n;
            Mul=Mul*n;
            Num=Num/10;
        }
        if(Sum==Mul){
            System.out.println("Spy Number");
        }
        else{
            System.out.println("Not Spy Number");   
        }
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int Num=sc.nextInt();
      
      IsSpyNumber(Num);
    }
}