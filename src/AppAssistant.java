import java.util.Date;

public class AppAssistant {
	
	Date date= new Date();  

	public enum Days{ MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY} 
	
	public Days getDeliveryDay() {
		String day = date.toString();
		day = day.substring(0,3); //date returns whole date and time so we just need the day
		int index;
		
		if(day.equals("Mon")) {
			//if it is monday, delivery takes 2 days and delivery day would be wednesday whose index is 2
			index = 2;		
		}else if(day.equals("Tue")) {
			index = 3;
		}else if(day.equals("Wed")) {
			index = 4;
		}else if(day.equals("Thu")) {
			index = 5;
		}else if(day.equals("Fri")) {
			//no delivery on sunday so delivery would be on monday
			index = 0;
		}else if(day.equals("Sat")) {
			//no delivery on sunday
			index = 1;
		}else if(day.equals("Sun")) {
			//no delivery on sunday
			index = 2;
		}else {
			System.out.println("Day format is not correct");
			index = -1;
		}
		
		return Days.values()[index];
		
		
		
	}
	
	
}	
