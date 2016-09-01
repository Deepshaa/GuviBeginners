import java.util.Scanner;

public class ChildrenPair {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int num=sc.nextInt();
		int temp=1;
		for(int i=0;i<num*2;i++){
			if(num!=num*2-i){
				int x=temp++;
				int n=num*2-i;
				System.out.println(x+" "+n);
			}
		}
	}
}
