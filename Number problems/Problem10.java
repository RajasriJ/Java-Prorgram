/*Printing Primes
------------------
Printing prime numbers Upto N terms.
*/
import java.util.Scanner;
public class Problem10 {
    
    public static void PrintingPrimes(int range){
        for(int i=2;i<=range;i++){
            if(IsPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    
    public static boolean IsPrime(int n){
       for (int i = 2; i <= n/2; i++) {  
           if (n % i == 0) {  
               return false;  
           }  
       } 
       return true; 
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int range=sc.nextInt();
      
      PrintingPrimes(range);
    }
}