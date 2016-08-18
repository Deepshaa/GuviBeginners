public class SumOdd {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=15;i++){
			sum+=i;
		}
		System.out.println("Sum of 15 numbers:"+sum);
		sum=0;
		for(int i=15;i<=45;i++){
			if(i%2==1){
				sum+=i;
			}
		}
		System.out.println("Sum of odd numbers between 15 to 45:"+sum);
	}

}
