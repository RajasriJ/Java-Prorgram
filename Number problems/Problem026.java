/*Buzz Number Program in Java
A number is said to be Buzz Number if it ends with 7 or is divisible by 7. Example: 1007 is a Buzz Number.*/

import java.util.*;
public class Problem026{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        if(num%7==0 || num%10==7){
            System.out.println("Buzz Number");
        }
        else{
            System.out.println("Not an Buzz Number");
        }
        
     }
}