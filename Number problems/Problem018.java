/*Neon Number Program in Java
--------------------------------
A neon number is a number where the sum of digits of square of the number is equal to the number.
For example if the input number is 9, its square is 9*9 = 81 and sum of the digits is 9. i.e. 9 is a neon number
*/

import java.util.Scanner;
public class Problem018 {
    public static void isNeonNumber(int Num){
        int square=(int)Math.pow(Num,2);
        int sum=0;
        while(square!=0){
            int n=square%10;
            sum+=n;
            square=square/10;
        }
        if(Num==sum){
            System.out.println("Neon Number");
        }
        else{
            System.out.println("Not a Neon Number");
        }
    }
    
    
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int Num=sc.nextInt();
        
        isNeonNumber(Num);
      
    }
}