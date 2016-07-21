package demo.programs;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year");
		int year=sc.nextInt();
		if(year%4==0){
			System.out.println("Leap year");
		}else{
			System.out.println("Not a leap year");
		}
	}

}
