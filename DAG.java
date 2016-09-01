import java.util.Scanner;

public class DAG {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input");
		String str=sc.nextLine();
		char c=(char)92;
		str=str.replace(c, ',');
		String[] s=str.split(','+"");
		int sum=0;
		for(int i=0;i<s.length;i++){
			int max=0;
			String[] s1=s[i].split(" ");
			for(int j=0;j<s1.length;j++){
				if(s1[i].equals("/")||s1[i].equals("")){
					
				}else{
					int n=Integer.parseInt(s1[j]);
					if(n>max){
						max=n;
					}
				}
			}
			sum+=max;
		}
		System.out.println(sum);
	}
}
