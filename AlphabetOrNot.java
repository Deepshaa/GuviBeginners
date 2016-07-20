package demo.programs;

import java.util.Scanner;

public class AlphabetOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		int value=(int)c;
		if(value>=65&&value<=90||value>=97&&value<=122){
			System.out.println("Alphabet");
		}else{
			System.out.println("Not an alphabet");
		}
	}

}
