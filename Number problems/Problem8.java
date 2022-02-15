/*Tech Number Program
------------------------
A tech number can be tech number if its digits are even and the number of digits split into two number from middle then add these number
if the added number’s square would be the same with the number it will called a Tech Number.
If the number is split in two equal halves,then the square of sum of these halves is equal to the number itself.
Write a program to generate and print all four digits tech numbers.
Note: If number of digits is not even then it is not a tech number.
Example:
2025 => 20+25 => 552 => 2025
*/

import java.util.Scanner;
public class Problem8 {
    
    public static void IsTechNumber(int Num){
        String s=Integer.toString(Num);
        if(s.length()%2==0){
            int mid=s.length()/2;
            int Sum=Integer.parseInt(s.substring(0,mid))+Integer.parseInt(s.substring(mid,s.length()));
            if((int)Math.pow(Sum,2)==Num){
                System.out.println("Tech Number");
            }
            else{
                System.out.println("Not an Tech Number");
            }
        }
        else{
            System.out.println("Not an Tech Number");
        }
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int Num=sc.nextInt();
      IsTechNumber(Num);
    }
}