/*Multiply Of Digit Program in Java
-------------------------------------
If a number=1234, then 1*2*3*4 ,Multiply of digit=24.
*/

import java.util.Scanner;
public class Problem019 {
    public static int Mul(int Num){
        int ans=1;
        while(Num!=0){
            int n=Num%10;
            ans*=n;
            Num=Num/10;
        }
        return ans;
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int Num=sc.nextInt();
      
      int ans=Mul(Num);
      System.out.println(ans);
    }
}