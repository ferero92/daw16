import javax.swing.JOptionPane;
public class Calendar {

	public static void main(String[] args) {
		int year = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a year:", "Calender", JOptionPane.QUESTION_MESSAGE));
		
		int month = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a month number:", "Calender", JOptionPane.QUESTION_MESSAGE));
		
		System.out.println("\t" + "\t" + "\t" + monthName(month) + " of " + year);
		System.out.println("_______________________________________________________________");
		System.out.println("\t" + "Mo" + "\t" + "Tu" + "\t" + "We" + "\t" + "Th" + "\t" + "Fr" + "\t" + "Sa" + "\t" + "Su");
		//System.out.println(days(month));

	}
	
	public static long oneAtOne(){
		
		long today = System.currentTimeMillis();
		
		long oneJanuary = today - currentTime();
		
		return oneJanuary;		
	}
	
	public static long currentTime(){
		
		long millis = System.currentTimeMillis();		
		long seconds = millis / 1000;					
		long current = seconds % 60 * 1000;						
		long minutes = seconds / 60;		
		current += minutes % 60 * 60 * 1000;							
		long hours = minutes / 60;		
		current += hours % 24 * 60 * 60 * 1000;		
		long days = hours / 24;		
		current += days % 365 * 24 * 60 * 60 * 1000;
		
		return current;						
	}

	public static String monthName (int m){
		
		switch(m){
			case 1: return "January";				
			case 2: return "February";				
			case 3: return "March";				
			case 4: return "April";				
			case 5: return "May";				
			case 6: return "June";				
			case 7: return "July";				
			case 8: return "August";				
			case 9: return "September";				
			case 10: return "October";				
			case 11: return "November";				
			case 12: return "December";
				default: return "Error";
		}
	}

	/*public static String days(int m){

		switch(m){
			case 1: return thertyOne();				
			case 2: return february();				
			case 3: return thertyOne();				
			case 4: return therty();				
			case 5: return thertyOne();				
			case 6: return therty();				
			case 7: return thertyOne();				
			case 8: return thertyOne();				
			case 9: return therty();				
			case 10: return thertyOne();				
			case 11: return therty();				
			case 12: return thertyOne();
				default: return "Error";		
		}		
	}
	
	public static String thertyOne(){
		
	}
	
	public static String therty(){
		
	}
	
	public static String february(){
		
		if(isLeap(year)){
			
			
			
		}
		else{
			
			
			
		}
	}*/
	
	public static boolean isLeap(int year){
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
			return true;
		}
		else return false;
	}
}
