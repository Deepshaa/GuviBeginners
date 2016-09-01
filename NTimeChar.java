import java.util.Scanner;

public class NTimesChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		String str = sc.next();
		String output = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			i++;
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				String s = String.valueOf(ch);
				for (int j = i + 1; j < str.length(); j++) {
					ch = str.charAt(j);
					while(Character.isDigit(ch)) {
						s += ch;
					}
					if(Character.isAlphabetic(ch)){
						break;
					}
				}
				for (int j = Integer.parseInt(s); j > 0; j--) {
					output += c;
				}
			}
		}
		System.out.println(output);
	}
}
