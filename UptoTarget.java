import java.util.Scanner;

public class UptoTarget {
	public void add(){
		int a[]=new int[10];
		int n,i,k,j;
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number of values");
		 n=sc.nextInt();
		 System.out.println("Enter the array elements");
		  for(i=0;i<n;i++){
		    a[i]=sc.nextInt();
		  }
		  System.out.println("Enter the target element");
		 k=sc.nextInt();
		  for(i=0;i<n;i++){
		    for(j=0;j<n;j++){
		    if(k==a[i]+a[j])
		     System.out.println("Numbers are: "+a[i]+" "+a[j]);
		    }
		  }
	}

	public static void main(String[] args) {
		UptoTarget ut=new UptoTarget();
		ut.add();

	}

}
