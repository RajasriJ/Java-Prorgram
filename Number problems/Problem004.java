/*Magic Number
Magic number is the if the sum of its digits recursively are calculated till a single digit If the single digit is 1 then the number is a magic number.
Magic number is very similar with Happy Number.
Example- 226 is said to be a magic number
2+2+6=10 sum of digits is 10 then again 1+0=1 now we get a single digit number is 1.
if we single digit number will now 1 them it would not a magic number.
*/
import java.util.Scanner;
public class Problem004 {
   
    public static void IsMagicNumber(int Num){
        int Sum=0;
        
       while(Num!=0){
          Sum+=Num%10;
          Num=Num/10;
          String s=Integer.toString(Sum);
          if(Num==0 && s.length()!=1){
              Num=Sum;
              Sum=0;
          }
        }
        if(Sum==1){
            System.out.println("Magic Number");
        }
        else{
            System.out.println("Not a Magic Number");
        }
        
    }
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
     int Num=sc.nextInt();
     
     IsMagicNumber(Num);
    }
}