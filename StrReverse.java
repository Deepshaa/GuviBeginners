public class StringReverse {
	public void strReverse(String str){
		for(int i=str.length()-1;i>=0;i--){
			System.out.println(str.charAt(i));
		}
	}
	public static void main(String[] args) {
		StringReverse st=new StringReverse();
		st.strReverse("Apple");
	}

}
