/* A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.
A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.
For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.

Input: s = "Myself2 Me1 I4 and3"
Output: "Me Myself and I"
Explanation: Sort the words in s to their original positions "Me1 Myself2 and3 I4", then remove the numbers.
*/

import java.util.*;
public class Problem034 {
     public static String sortSentence(String s) {
        String[] str=s.split(" ");
        String[] ans=new String[str.length];
        for(int i=0;i<str.length;i++){
            String temp=str[i];
            int index=str[i].length();
            int pos2=Character. getNumericValue(str[i].charAt(index-1)); 
            String temporary=str[i].substring(0,str[i].length()-1);
            ans[pos2-1]=temporary;
        }
        String result="";
        result=result+ans[0];
        for(int i=1;i<ans.length;i++){
            result=result+" "+ans[i];
        }
        return result; 
    }
    
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      System.out.println(sortSentence(s));
    }
}