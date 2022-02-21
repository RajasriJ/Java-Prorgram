/*Armstrong Number Program in Java
Armstrong Number is a positive number 
if it is equal to the sum of cubes of its digits is called Armstrong number
 and 

if its sum is not equal to the number then its not a Armstrong number.


Examples: 153 is Armstrong, (1*1*1)+(5*5*5)+(3*3*3) = 153*/





import java.util.*;



public class Problem024{

    
public static void main(String args[]) {

      
	Scanner sc=new Scanner(System.in);

      
	int num=sc.nextInt();

      
	//String s=Integer.toString(num);//For finding a digit.

        int digits=(int)Math.log10(num);
      
	double sum=0;

      
	int num1=num;


      
      
	for(int i=0;i<digits;i++){

          
		int temp=num%10;

          
		sum=sum + Math.pow(temp,s.length());

          
		num=num/10;

         
     
	}

      
	if(num1==sum){

         
		System.out.println("Armstrong Number");

      
	}

      
	else{

         
		System.out.println("Not an Armstrong Number");

      
	}

    
}


}