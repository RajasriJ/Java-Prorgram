/*You own a Goal Parser that can interpret a string command. 
The command consists of an alphabet of "G", "()" and/or "(al)" in some order.
The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al".
The interpreted strings are then concatenated in the original order.
Given the string command, return the Goal Parser's interpretation of command.

Input: command = "G()(al)"
Output: "Goal"
Explanation: The Goal Parser interprets the command as follows:
G -> G
() -> o
(al) -> al
The final concatenated result is "Goal".
*/
import java.util.Scanner;
public class Problem033 {
    public static String interpret(String command) {
        char[] s=command.toCharArray();
        int i=0;
        String ans="";
        while(i<s.length){
            if(s[i]=='(' && s[i+1]=='a'){
                ans=ans+'a';
                ans=ans+'l';
                i=i+4;
            }
            else if(s[i]=='(' && s[i+1]==')'){
                ans=ans+'o';
                i=i+2;
                
            }
            else{
                ans=ans+'G';
                i++;
            }
        }
        return ans;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String command=sc.nextLine();
        String ans=interpret(command);
        
        System.out.println(ans);
      
    }
}