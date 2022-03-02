/* Shuffle String
------------------
You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at
the ith position moves to indices[i] in the shuffled string.
Return the shuffled string.
Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
*/


import java.util.Scanner;
public class Problem032 {
     public static String restoreString(String s, int[] indices) {
        char[] str=s.toCharArray();
        String ans="";
        for(int i=0;i<indices.length;){
            for(int j=0;i<str.length;j++){
               if(indices[j]==i){
                  ans=ans+str[j];
                  i++;
                  break;
                }
            }
        }
     return ans;
    }
    
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      int[] indices=new int[s.length()];
      for(int i=0;i<s.length();i++){
          indices[i]=sc.nextInt();
      }
      
      System.out.println(restoreString(s,indices));
    }
}
