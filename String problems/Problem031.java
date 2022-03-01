/*IP Address
-------------
Given a valid (IPv4) IP address, return a defanged version of that IP address.
A defanged IP address replaces every period "." with "[.]".
Example 1:
Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
*/

import java.util.Scanner;
public class Problem031 {
    public static String defangIPaddr(String address){
       String[] s=address.split("\\.");/*Try to split metaCharacters then you will use anyone of the following methods(split("\\.") or split("[.]") or split(Pattern.quote(".")))*/
       String ans="";
       for(int i=0;i<s.length;i++){
          if(s.length-1==i)
              ans=ans+s[i];
          else
            ans=ans+s[i]+"["+"."+"]";
         }
        return ans;
    }
    
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      String address=sc.nextLine();
    
      System.out.println(defangIPaddr(address));
    }
}