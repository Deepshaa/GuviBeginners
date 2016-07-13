# GuviBeginners
package project.milestone1.lc3;

import java.util.Scanner;

public class MaxMin {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[20];
		int[] large=new int[10];
		for(int i=0;i<20;i++){
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int k=0;
		for(int i=0;i<20;i++){
			if(arr[i]>max){
				max=arr[i];
				large[k]=max;
				k++;
			}	
		}
		for(int i=0;i<large.length;i++){
			System.out.println(large[i]);
		}
		
	}

}
