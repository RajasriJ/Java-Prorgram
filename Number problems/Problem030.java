/*. Program to convert days into years.
----------------------------------------
Number of years = days / 365 = 799 / 365 = 2.
*/

import java.util.Scanner;
public class Problem030 {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int days=sc.nextInt();
      
      int years=days/365;
      System.out.println(years);
    }
}