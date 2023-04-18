/* Question 1
*
* *
* * *
* * * *
* * * * * 
*/

import java.util.Scanner;

public class Problem001 {
  public static void PrintPattern(int n) {
    for(int i=0;i<n;i++){
      for(int j=0;j<=i;j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }  
  
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Length of an Pattern:");
    int n = sc.nextInt();

    PrintPattern(n);
  }
}