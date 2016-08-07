public class Days {
	
	public static boolean workingDay(String str){
		if(str.equalsIgnoreCase("Monday")||str.equalsIgnoreCase("Tuesday")||str.equalsIgnoreCase("Wednesday")||str.equalsIgnoreCase("Thursday")||str.equalsIgnoreCase("Friday")){
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(workingDay("Monday"));
	}

}
