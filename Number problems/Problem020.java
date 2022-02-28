/*Least Common Multiple(LCM)
-----------------------------
->found the maximum number
->set as the lcm(more possibility)
->otherwise increasing the maximum value.*/

import java.util.Scanner;
public class Problem020 {
    public static void LCM(int n1,int n2){
        int max=(n1>n2)?n1:n2;
        int lcm=0;
        while(true){
            if(max%n1==0 && max%n2==0){
                lcm=max;
                break;
            }
            max++;
        }
    System.out.println("LCD "+lcm);
    }
    
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      
      LCM(n1,n2);
    }
}