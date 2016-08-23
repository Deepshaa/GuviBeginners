public class Subset {
	public static void main(String[] args) {
		int[] a1={3,14,28,7};
		int[] a2={48,3,14,28,7,91,61};
		String s1="";
		String s2="";
		for(int i=0;i<a1.length;i++){
			s1=String.valueOf(a1[i]);
		}
		for(int i=0;i<a2.length;i++){
			s2+=String.valueOf(a2[i]);
		}
		if(s2.contains(s1)){
			System.out.println("a1 is a subset of a2");
		}else{
			System.out.println("a1 is not a subset of a2");
		}
	}
