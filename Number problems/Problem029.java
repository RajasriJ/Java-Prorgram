/*Find nCr & nPr – Using Function
---------------------------------
Example: enter value of n 12,enter value of r 6.The value of 12p6 is : 665280.0 The value of 12c6 is : 924.0
*/

import java.util.Scanner;
public class Problem029 {
    
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    
   
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter value of n: ");
     int n=sc.nextInt();
     
     System.out.println("Enter value of r: ");
     int r=sc.nextInt();
     
     int per=factorial(n)/factorial(n-r);
     int comb = factorial(n) / (factorial(r) * factorial(n-r));
     
     System.out.println(per);
     System.out.println(comb);
    }
}