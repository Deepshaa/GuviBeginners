import java.util.Scanner;

public class Quit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter");
		char c=sc.next().charAt(0);
		if(c=='q'){
			System.exit(0);
		}
		else{
			System.out.println("HI");
		}
	}

}
