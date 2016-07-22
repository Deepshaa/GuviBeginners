import java.util.Scanner;

public class ReverseDigits {
	 public static void reverseMethod(int number) {
	       if (number < 10) {
		   System.out.println(number);
	       }
	       else {
	           System.out.print(number % 10);
	           
	           reverseMethod(number/10);
	       }
	   }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		ReverseDigits rd=new ReverseDigits();
		rd.reverseMethod(number);
	}

}
