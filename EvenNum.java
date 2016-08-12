import java.util.Scanner;

public class EvenNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range(as 2 numbers)");
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=a;i<=b;i=i+2){
			if(i%2==0){
				System.out.println(i+1);
			}
			else{
				System.out.println(i);
			}
		}
	}

}
