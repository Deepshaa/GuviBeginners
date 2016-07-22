import java.util.Scanner;

public class EvenOddCharacter {
	public void evenOdd(){
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a string");
	    String str=sc.next();
	    int len=str.length();
	    StringBuilder sb=new StringBuilder(str);
	    for(int i=0;i<len-1;i+=2){
	        char c;
	        c=str.charAt(i);
	        sb.setCharAt(i, str.charAt(i+1));
	        sb.setCharAt(i+1, c);
	    }
	    String s=sb.toString();
	   System.out.println(s);
	}
	public static void main(String[] args) {
		EvenOddCharacter eoc=new EvenOddCharacter();
		eoc.evenOdd();
	}

}
