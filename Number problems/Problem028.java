/*Check Leap Year or Not*/

import java.util.Scanner;
public class problem028 {
    
    public static boolean isLeapYear(int year){
        if((year%400==0) && ((year%4==0) || (year%100!=0))){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int year=sc.nextInt();
      
     if(isLeapYear(year)){
         System.out.println("Leap year");
     }
     else{
         System.out.println("Not a Leap Year");
     }
    }
}