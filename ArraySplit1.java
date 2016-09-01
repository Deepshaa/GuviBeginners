public class ArraySplit {
	public static void main(String[] args) {
		int[] a = { 4, 2, 3, 4, 2 };
		int[] b2 = new int[a.length / 2];
		int[] b1 = new int[a.length - b2.length];
		double avg1=0;
		double avg2=0;
		int sum=0;
		for (int i = 0; i < b1.length; i++) {
			b1[i] = a[i];
			sum+=b1[i];
		}
		avg1=sum/b1.length;
		int j = b1.length;
		sum=0;
		for (int i = 0; i < b2.length; i++) {
			b2[i] = a[j];
			j++;
			sum+=b2[i];
		}
		avg2=sum/b2.length;
		if(avg1==avg2){
			System.out.println("Possible");
		}else{
			System.out.println("Not Possible");
		}
	}
}
