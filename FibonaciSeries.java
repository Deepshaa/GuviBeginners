package demo.programs;

public class FibonaciSeries {

    public static long output1;
	   
    public static void nthFibonacci(int input1){
       int first=-1;
       int second=1;
       int sum=0;
       for(int i=0;i<input1;i++){
    	   sum=first+second;
    	   first=second;
    	   second=sum;  
       }
       output1=sum;
    }	
	public static void main(String[] args) {
		//FibonaciSeries fs=new FibonaciSeries();
		FibonaciSeries.nthFibonacci(4);
		System.out.println(output1);
	}

}
