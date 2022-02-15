/*Unique Number Program in Java
--------------------------------
A number is said to be unique , if the digits in it are not repeated. for example, 12345 is a unique number. 123445 is not a unique number.
*/
import java.util.Scanner;
public class Problem9 {
    
    public static void IsUnique(int Num){
        String s=Integer.toString(Num);
        boolean flag=false;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)!=s.charAt(j)){
                    flag=true;
                }
               else{
                    System.out.println("Not an Unique Number");
                    flag=false;
                    break;
               }
            }
            if(flag==true){
                continue;
            }
            else{
                break;
            }
        }
        if(flag==true){
            System.out.println("Unique Number");
        }
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int Num=sc.nextInt();
      
      IsUnique(Num);
    }
}