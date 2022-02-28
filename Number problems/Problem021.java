/*Happy Number Program in Java.
-----------------------------------
A happy number is a natural number in a given number base that eventually reaches 1 when iterated over the perfect digital invariant function for.
Those numbers that do not end in 1 are -unhappy numbers.
*/

import java.util.Scanner;
public class Problem021 {
     public static boolean isHappyNumber(int Num){
          int Sum=0;
          while(Num!=0){
            int n=Num%10;
            Sum=Sum+(int)Math.pow(n,2);
            Num=Num/10;
            if(Num==0){
                int digit=(int)(Math.log10(Sum)+1);
                if(digit>1){
                   Num=Sum;
                   Sum=0; 
                }
                else{
                    if(Sum==1){
                       return true;
                    }
                }
            }
          }
           return false;
     }    
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
     int Num=sc.nextInt();
    if(isHappyNumber(Num))
        System.out.println("Happy Number");
    else
        System.out.println("Not a Happy Number");
    }
}