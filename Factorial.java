public class Factorial {
	
	public static void main(String[] args) {
		if(args.length==0){
			System.out.println("Please enter an integer number");
		}
		else{
			int n=Integer.parseInt(args[0]);
			int number=n;
			int factorial=1;
			if(n==0){
				System.out.println("The factorial of "+number+" is "+factorial);
			}
			else{
				do{
					factorial*=n;
					n--;
				}
				while(n>0);
				System.out.println("The factorial of "+number+" is "+factorial);
			}
		}
	}

}
