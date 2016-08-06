import java.util.Scanner;

public class DeletingLeast {
	public static void main(String[] args) {
		int n, i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer");
		n = sc.nextInt();
		int[] arr = new int[5];
		System.out.println("Enter number of digit u want to delete(1-5)");
		int digit = sc.nextInt();
		while (n != 0) {
			arr[i] = n % 10;
			n = n / 10;
			i++;
		}
		for (int j = 0; j < arr.length; j++) {
			for (int k = j + 1; k < arr.length; k++) {
				if (arr[j] < arr[k]) {
					int temp = arr[j];
					arr[j] = arr[k];
					arr[k] = temp;
				}
			}
		}
		for (int j = 0; j < (arr.length - digit); j++) {
			System.out.print(arr[j]);
		}
		sc.close();
	}
}
