package Practice;

import java.util.*;
import java.lang.*;
import java.math.*;
public class powerDigitSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
            int N = sc.nextInt();
            int sum=0;
            int rem;
            int a=(int)Math.pow(2,N);
            while(a>0){
               rem=a%10;
               sum=sum+rem;
               a=a/10; 
            }
            System.out.println(sum);
        sc.close(); 
	}
	

}
