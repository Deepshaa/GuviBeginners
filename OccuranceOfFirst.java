public class OccuranceOfFirst {
	public static void main(String[] args) {
		String[] str={"AL","AH","F","VE","RR"};
		for(int i=0;i<str.length;i++){
			if(str[i].length()==1){
				System.out.println(str[i]);
				break;
			}
		}
	}
}
