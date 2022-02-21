/*Automorphic Number Program in Java
An Automorphic number is a number whose square “ends” in the same digits as the number itself. 
Examples: 5*5 = 25, 6*6 = 36, 25*25 = 625*/

import java.util.*;
public class Problem025{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        int sum=0;
        sum=num*num;
      
        
        String s=Integer.toString(num);//for finding a number of digit.
      
        int temp=0;
        String check="";
        for(int i=0;i<s.length();i++){//for getting a last n  digits.
            temp=sum%10;
            check=temp+""+check;
            sum=sum/10;
        }
        
         if(num==Integer.parseInt(check)){
                System.out.println("Automorphic Number");
            }
        else{
                System.out.println("Not an Automorphic Number");
            }
     
        
        
    }
}