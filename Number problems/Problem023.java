/*Greates Common Devicer(GCD)
------------------------------
->found the minimum
->set these minimum as a gcd for checking(highest possibility)
->otherwise decrese the minimum value until the gcd will get.*/

import java.util.Scanner;
public class Problem023{
    public static void GCD(int n1,int n2){
        int min=(n1<n2)?n1:n2;
        int gcd=0;
        while(min>=2){
            if(n1%min==0 && n2%min==0){
                gcd=min;
                break;
            }
            min--;
        }
    System.out.println("GCD "+gcd);
    }
    
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      
      GCD(n1,n2);
    }
}