import java.util.Date;

public class AppAssistant {

	private int amazonCounter;
	private int hepsiburadaCounter;
	private int n11Counter;
	private int trendyolCounter;
	
	private int acceptedCounter;
	private int notAcceptedCounter;
	
	public AppAssistant() {
		amazonCounter = 0;
		hepsiburadaCounter = 0;
		n11Counter = 0;
		trendyolCounter = 0;
		acceptedCounter = 0;
		notAcceptedCounter = 0;
	
	}

	Date date = new Date();  

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
	
	public boolean checkLimit(EcommerceCargo<?> ecommerceCargo) {
		String siteName = ecommerceCargo.getEcommerceSite();
		
		if(siteName.equals("Amazon")) {
			
			if(amazonCounter <= IEcommerceCargo.AMAZON_LIMIT) {
				amazonCounter++;
				acceptedCounter++;
				return true;
			}else {
				ecommerceCargo.setStatus("Not Accepted");
				notAcceptedCounter++;
				return false;
			}
			
			
		}else if(siteName.equals("Hepsiburada")) {
			
			if(hepsiburadaCounter <= IEcommerceCargo.HEPSIBURADA_LIMIT) {
				ecommerceCargo.setStatus("Accepted");
				acceptedCounter++;
				hepsiburadaCounter++;
				return true;
			}else {
				ecommerceCargo.setStatus("Not Accepted");
				notAcceptedCounter++;
				return false;
			}
		
			
		}else if(siteName.equals("N11")) {
			
			if(n11Counter <= IEcommerceCargo.N11_LIMIT) {
				ecommerceCargo.setStatus("Accepted");
				acceptedCounter++;
				n11Counter++;
				return true;
			}else {
				ecommerceCargo.setStatus("Not Accepted");
				notAcceptedCounter++;
				return false;
			}
			
		}else{
			
			if(trendyolCounter <= IEcommerceCargo.TRENDYOL_LIMIT) {
				ecommerceCargo.setStatus("Accepted");
				acceptedCounter++;
				trendyolCounter++;
				return true;
			}else {
				ecommerceCargo.setStatus("Not Accepted");
				notAcceptedCounter++;
				return false;
			}
			
		}
		
	}
	public int getAcceptedCounter() {
		return acceptedCounter;
	}

	public int getNotAcceptedCounter() {
		return notAcceptedCounter;
	}
	
	
	
}	
