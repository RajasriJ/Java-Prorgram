/*Niven Number.
-----------------
A number is said to be a Niven number or Harshad number if the number is divisible by the sum of the digits of the number.
For example, if the number is 18, the sum of the digits is 1+8=9 and
the number '18' is divisible by 9. Therefore, 18 is a niven number.
*/
import java.util.Scanner;
public class Problem016 {
    public static int isNivenNumber(int Num){
        int sum=0;
        while(Num!=0){
            int n=Num%10;
            sum=sum+n;
            Num=Num/10;
        }
        return sum;
    }
    
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int Num=sc.nextInt();
      
      int sum=isNivenNumber(Num);
      if(Num%sum==0)
          System.out.println("Niven Number");
      
      else
        System.out.println("Not a Niven Number");
    }
}