package demo.programs;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a=new int[3];
		System.out.println("Enter three values");
		for(int i=0;i<3;i++){
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int i=1;i<3;i++){
			if(a[i]>max){
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
