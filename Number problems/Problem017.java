/*. Duck Number Program in Java.
---------------------------------
A Duck number is a number which has zeroes present in it, 
but there should be no zero present in the beginning of the number. For example 3210).
*/
import java.util.Scanner;
public class Problem017 {
    
    public static boolean isDuckNumber(int Num){
        while(Num!=0){
            if(Num%10==0)
                return true;
            Num=Num/10;
        }
        return false;
    }
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
     int Num=sc.nextInt();
     if(isDuckNumber(Num))
            System.out.println("Duck Number");
     else
         System.out.println("Not a Duck Number");
   }
}