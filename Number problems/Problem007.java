/*Reverse Integer
------------------
Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1],
then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
*/

import java.util.Scanner;

public class Problem007 {
 
   
    public static  int reverse(int x) {

       long rev=0;

        while(x!=0){

           rev=(rev*10)+(x%10);

           x=x/10;

         }

        if(rev<=Integer.MAX_VALUE  && rev>=Integer.MIN_VALUE){

            return (int)rev;

        }

        else{

            return 0;

        }

    }

    public static void main(String args[]) {

     Scanner sc=new Scanner(System.in);

     int x=sc.nextInt();

     int rev=reverse(x);

     System.out.println(rev);

    }

}