public class PrimeNumber {
	public void prime(int n){
		int count=0;
		for(int i=n;i>0;i--){
			if(n%i==0){
				count++;
			}
		}
		if(count==2)
				System.out.println("It is prime number");
		else
			System.out.println("Not a prime number");
	}
	public static void main(String[] args) {
		PrimeNumber pr=new PrimeNumber();
		pr.prime(12);
		pr.prime(5);
	}

}
