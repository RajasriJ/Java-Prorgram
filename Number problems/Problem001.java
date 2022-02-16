/*Ugly Number in Java
-------------------------
A number is said to be an Ugly number if positive numbers whose prime factors only include 2, 3, 5.
For example, 6(2×3), 8(2x2x2), 15(3×5) are ugly numbers while 14(2×7) is not ugly since it includes another prime factor 7.
Note that 1 is typically treated as an ugly number.
*/



import java.util.*;
public class Problem001 {
    public static boolean IsUglyNumber(int N){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        boolean flag=false;
        for(int i=2;i<N/2;i++){
            if(N%i==0){
                boolean check=false;
                for(int j=2;j<=i/2;j++){
                    if(i%j==0){
                        check=true;
                        break;
                    }
                }
                if(check==false){
                   arr.add(i);
                }
            }
        }
        
      for( int i=0;i<arr.size();i++){
          for(int j=2;j<arr.get(i)/2;j++){
              if(arr.get(i)%i==0){
                  continue;
              }
              else{
                if(!(arr.get(i)==2 || arr.get(i)==3 || arr.get(i)==5 || arr.get(i)==1 || arr.get(i)==1)){
                    flag=true;
                    break;
                }
              }
          } 
        }
        
        return flag;
    }
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
     int N=sc.nextInt();
     
     boolean flag=IsUglyNumber(N);
       if(flag==true){
            System.out.println("Not an Ugly Number");
        }
        else{
            System.out.println("Ugly Number");
        }
    }
}