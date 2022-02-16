/*Special Number Program in Java
----------------------------------
A number is said to be special number when the sum of factorial of its digits is equal to the number itself. Example- 145 is a Special Number as 1!+4!+5!=145.
A number is said to be Krishnamurthy Number when the sum of factorial of its digits is equal to the number itself. Example- 145 is a Krishnamurthy Number as 1!+4!+5!=145.
*/

import java.util.Scanner;
public class Problem013 {
    
    public static int Factorial(int n){
        if(n<2){
            return 1;
        }
        else{
            return Factorial(n-1)*n;
        }
    }
    public static int isSpecialNumber(int Num){
        int Sum=0;
        while(Num!=0){
            int n=Num%10;
            Sum+=Factorial(n);
            Num=Num/10;
        }
        return Sum;
    }
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int Num=sc.nextInt();
       int Sum=isSpecialNumber(Num);
       if(Sum==Num){
           System.out.println("Special Number");
       }
       else{
           System.out.println("Not a Special Number");
       }
    }
}