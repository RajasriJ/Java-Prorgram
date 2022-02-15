/*Twin Prime Program in Java
-----------------------------
A twin prime is a prime number that is either 2 less or 2 more than another prime number—for example,
either member of the twin prime pair (41, 43). In other words, a twin prime is a prime that has a prime gap of two.
*/

import java.util.Scanner;
public class Problem11 {
    public static boolean isPrime(int n){
        boolean flag=true;
        for(int i=2;i<n/2;i++){
            if(n%i==0){
               flag=false;
               break;
            }
        }
        return flag;
    }
    
    public static void IsTwinPrime(int Num1,int Num2){
    
        if(isPrime(Num1) && isPrime(Num2) && ((Num1-Num2)==2 || (Num2-Num1)==2)){
            System.out.println("Twin Prime");
        }
        else{
            System.out.println("Not a Twin Prime");
        }
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int Num1=sc.nextInt();
      int Num2=sc.nextInt();
      
      IsTwinPrime(Num1,Num2);
    }
}