public class ArraySplit {
	public static void main(String[] args) {
		int[] a = { 4, 2, 3, 4, 2 };
		int[] b2 = new int[a.length / 2];
		int[] b1 = new int[a.length - b2.length];
		for (int i = 0; i < b1.length; i++) {
			b1[i] = a[i];
		}
		int j = b1.length;
		for (int i = 0; i < b2.length; i++) {
			b2[i] = a[j];
			j++;
		}
	}
}
