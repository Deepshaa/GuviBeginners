import java.util.Scanner;

public class CountChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.next();
		int count=0;
		for(int i=0;i<str.length();i++){
			count++;
		}
		System.out.println(count);
	}

}
