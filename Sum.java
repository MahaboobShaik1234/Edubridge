package Arrays;
import java.util.*;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scanner=new Scanner(System.in);
 int a[]=new int[10];
 System.out.println("please enetr the array values");
 int evensum=0,oddsum=0;
 for(int i=0;i<10;i++) {
  a[i]=scanner.nextInt();
	
	 if(a[i]%2==0) {
		 evensum=evensum+a[i];
	 }
	 else {
		 oddsum=oddsum+a[i];
		 
	 }
 
 
 }
	 System.out.println("sumof even numbers is "+evensum);
	 System.out.println("sumof odd numbers is"+oddsum);
 

	
	}
}
