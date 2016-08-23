import java.util.Arrays;
import java.util.Scanner;

public class FindTall {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int[] height = new int[50];
		for (int i = 0; i < 50; i++) {
			height[i] = scr.nextInt();
		}
		Arrays.sort(height);
		System.out.println("4 th Height " + height[height.length - 4]);
		System.out.println("Enter K value");
		int k = scr.nextInt();
		System.out.println("k th Height" + height[height.length - k]);
	}
}
