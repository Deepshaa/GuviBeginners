import java.util.Scanner;

public class CommonPrefixString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Strings:");
		int num = sc.nextInt();
		String a[]=new String[100];
		System.out.println("Enter "+num+" of strings");
		for(int i=0;i<num;i++)
		{
		a[i]=sc.next();
		}
		String longest="";
		if(a.length>0){
			longest=a[0];
		}
		String check;
		int temp=0;
		for(int i=1;i<a.length;i++)
		{
		check=a[i];
		for(int j=0;j<Math.min(longest.length(),a[i].length());j++)
		{
		if(longest.charAt(j)!=check.charAt(j)){
			temp=j;
			break;
		}
		
		}
		longest=a[i].substring(0,temp);
		}
		System.out.println("longest prefix is:"+longest);
		sc.close();
	}
}
