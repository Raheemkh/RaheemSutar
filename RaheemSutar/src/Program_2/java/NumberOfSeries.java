package Program_2.java;

import java.util.Scanner;

public class NumberOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Input a= ");
		int a=sc.nextInt();
		int num=1;
		for(int i=0;i<a;i++) {
			System.out.print(num);
			if(i<a-1) {
				System.out.print(",");
				num+=2;
			}
			
		}	
	}
}
