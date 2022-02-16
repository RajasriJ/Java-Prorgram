/*Digit to Word Program in Java
Example:
Enter number=1234
Digit=1234
Words=One Two Three Four
*/
import java.util.Scanner;
public class Problem014 {
    
    public static void DigitToWord(int Num){
      String s=Integer.toString(Num);
      for(int i=0;i<s.length();i++){
        switch(s.charAt(i)){
            case '1':
                System.out.print("One ");
                break;
            case '2':
                System.out.print("Two ");
                break;
            case '3':
                System.out.print("Three ");
                break;
            case '4':
                System.out.print("Four ");
                break;
            case '5':
                System.out.print("Five ");
                break;
            case '6':
                System.out.print("Six ");
                break;
            case '7':
                System.out.print("Seven ");
                break;
            case '8':
                System.out.print("Eight ");
                break;
             case '9':
                System.out.print("Nine ");
                break;
             case '0':
                System.out.print("Zero ");
                break;
        }
      }
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int Num=sc.nextInt();
      
      DigitToWord(Num);
    }
}