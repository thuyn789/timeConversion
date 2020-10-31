class Main {
  public static void main(String[] args) {
    //System.out.println("Hello world!");

		//System.out.println();  
		System.out.println(timeConversion("12:05:45AM"));
  }

	public static String timeConversion(String s) {
		String time[] = s.split(":");
		int hour = Integer.parseInt(time[0]);
		String period = time[2].substring(2);
		
		time[2] = time[2].substring(0,2);
		
		if(period.charAt(0) == 'P' && hour != 12) {
			hour += 12;
			time[0] = "" + hour;
		}
		
		if(period.charAt(0) == 'A' && hour == 12) {
			time[0] = "00";
		}
		
		return time[0] + ":" + time[1] + ":" + time[2];
		
	}
}
