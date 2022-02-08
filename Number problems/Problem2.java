/*
Perfect Number
-----------------
A perfect number is a positive integer that is equal to the sum of its positive divisors,
excluding the number itself. For instance, 6 has divisors 1, 2 and 3,
and 1 + 2 + 3 = 6, so 6 is a perfect number.
*/

import java.util.Scanner;
public class Problem2 {
    
    public static int IsPerfectOrNot(int Num){
        int Sum=0;
        for(int i=1;i<=Num/2;i++){
           if(Num%i==0){
              Sum+=i;
           }
        }
        return Sum;
    }
    
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);//Read a input from user.
      int Num=sc.nextInt();
      
      int Sum=IsPerfectOrNot(Num);
      if(Num==Sum){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not a perfect Number");
        }
      
    }
}