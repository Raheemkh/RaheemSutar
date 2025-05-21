package Program_3.java;

import java.util.Scanner;

public class OddNumSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Input a= ");
		int a=sc.nextInt();
		int count=(a%2==0)?a-1:a;//even=a-1,odd=a
		int num=1;
		for(int i=0;i<count;i++) {
			System.out.print(num);
			if(i<count-1) {
				System.out.print(",");
			}
				num+=2;
			}
	}
}


