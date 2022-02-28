/*Circular Prime Program in Java
--------------------------------
A circular prime is a prime number with the property that the number generated at each intermediate step when cyclically permuting its digits will be prime.
For example, 1193 is a circular prime, since 1931, 9311 and 3119 all are also prime.
*/

import java.util.Scanner;
public class Problem015 {
    public static void isCircularPrime(int Num){
        boolean flag=true;
        int digit=(int)(Math.log10(Num)+1);
        int r=0;
        for(int i=1;i<=digit;i++){
            r=Num%10;
            Num=Num/10;
            Num=(r*(int)Math.pow(10,digit-1)+Num);
            if(!isPrime(Num)){
                flag=false;
                break;
            }
        }
        if(flag)
        {
            System.out.println("Circular Prime");
        }
        else
        {
            System.out.println("Not Circular Prime");
        }
    }
    
    public static boolean isPrime(int Num){
        boolean flag=true;
        for(int i=2;i<Num;i++){
            if(Num%2==0){
                flag=false;
                break;
            }
        }
        return flag;
    }
    
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int Num=sc.nextInt();
      
      isCircularPrime(Num);
    }
}