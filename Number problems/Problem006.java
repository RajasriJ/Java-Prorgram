/*Twisted Prime Number
------------------------
A number is called a twisted prime number if it is a prime number and reverse of this number is also a prime number.*/

import java.util.Scanner;
public class Problem006 {
    
    public static boolean IsPrime(int Num){
       boolean flag=false;
       for(int i=2;i<Num/2;i++){
           if(Num%i==0){
               flag=true;
               break;
           }
       }
       return flag;
      }
    
    public static int Twisted(int Num){
        int rev=0;
        while(Num!=0){
            int n=Num%10;
            rev=(rev*10)+n;
            Num=Num/10;
        }
        return rev;
    }
    
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int Num=sc.nextInt();
       boolean flag1=IsPrime(Num);
       if(!flag1){
           int rev=Twisted(Num);
           boolean flag2=IsPrime(rev);
           
           if(!flag2){
               System.out.println("Twisted Prime Number");
           }
           else{
               System.out.println("Not a Twisted Prime Number");
           }
       }
       else{
           System.out.println("Not a Twisted Prime Number");
       }
    }
}