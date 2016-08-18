import java.util.Scanner;

public class NumCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int count=0;
		char[] c={'0','1','2','3','4','5','6','7','8','9'};
		for(int i=0;i<str.length();i++){
			char n=str.charAt(i);
			for(int j=0;j<c.length;j++){
				if(n==c[j]){
					count++;
					break;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}

}
