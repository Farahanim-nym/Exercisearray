package ArrayOneDimension;
import java.util.Scanner;
public class Exercise3 {

	public static void main(String[] args) {
		// program that create an array of 10 element size ,your program should prompt the user to input numbers in array and display the sum of all array element
		 Scanner obj= new Scanner(System.in);
		 int sum=0;
		 int[] num=new int[10];
		 
		 System.out.println("Enter 10 number :");
		 for(int i=0;i<num.length;i++) {
			
			 num[i]=obj.nextInt();
			 sum=sum+num[i];
		 }
		 System.out.println("10 numbers you have entered: ");
		 for(int i=0;i<num.length;i++) {
			 
		     System.out.println(num[i]);
		 }
		 
	     System.out.println("Sum: "+sum);
		     
		 
	}

}
