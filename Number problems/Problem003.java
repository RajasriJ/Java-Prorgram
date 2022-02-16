/*Pronic Number Program in Java
----------------------------------
A number is said to be a pronic number if product of two consecutive integers is equal to the number, is called a pronic number.
Example- 42 is said to be a pronic number
42=6×7, here 6 and 7 are consecutive integers*/


import java.util.Scanner;
import java.util.ArrayList;

public class Problem003 {
    
    public static void IsPronicNumber(int Num){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        boolean flag=false;
        for(int i=1;i<=Num;i++){
          if(Num%i==0){
             arr.add(i);
             System.out.println(i);
          }
        }
        for(int i=0,j=1;j<arr.size();i++,j++){
            if(arr.get(i)+1==arr.get(j) && arr.get(i)*arr.get(j)==Num){
                System.out.println("Pronic Number");
                flag=true;
                break;
            }
        }
        if(Num==0){
            System.out.println("Pronic Number");
        }
        else if(flag==false){
            System.out.println("Not a Pronic Number");
        }
    }
    
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int Num=sc.nextInt();
     
        IsPronicNumber(Num);
     }
}
