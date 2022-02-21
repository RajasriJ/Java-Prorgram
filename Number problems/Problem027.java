/*CoPrime Numbers Program in Java
Two integers a and b are said to be relatively prime, mutually prime, or coprime if the only positive integer that divides both of them is 1. 
Example: 13 and 15 are co prime.*/

import java.util.*;
public class Problem027{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        
        int a[]=new int[num1/2];
        int b[]=new int[num2/2];
        boolean flag=false;
        
        for(int i=2,j=0;i<num1;i++){
            if(num1%i==0){
              a[j]=i;
              j++;
            }
        }
        for(int i=2,j=0;i<num2;i++){
            if(num2%i==0){
               b[j]=i;
               j++;
            }
        }
        
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j] && a[i]!=0 && b[j]!=0){
                    flag=true;
                    break;
                }
            }
        }
       
        if(flag==false){
            System.out.println("Co-prime");
        }
        else{
            System.out.println("Not a Co-prime");
        }
    }
}