import java.util.Date;

public class AppAssistant {
	
	

	private final int AMAZON_LIMIT = 5;
	private final int HEPSIBURADA_LIMIT = 5;
	private final int N11_LIMIT = 5;
	private final int TRENDYOL_LIMIT = 5;
	
	private int amazonCounter = 0;
	private int hepsiburadaCounter = 0;
	private int n11Counter = 0;
	private int trendyolCounter = 0;
	
	private int acceptedCounter = 0;
	private int notAcceptedCounter = 0;
	
	public AppAssistant() {
		
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
	
	public void checkLimitAndSetStatus(EcommerceCargo ecommerceCargo) {
		String siteName = ecommerceCargo.getEcommerceSite();
		
		if(siteName.equals("Amazon")) {
			
			if(amazonCounter <= AMAZON_LIMIT) {
				ecommerceCargo.setStatus("Accepted");
				acceptedCounter++;
			}else {
				ecommerceCargo.setStatus("Not Accepted");
				notAcceptedCounter++;
			}
			amazonCounter++;
			
		}else if(siteName.equals("Hepsiburada")) {
			
			if(hepsiburadaCounter <= HEPSIBURADA_LIMIT) {
				ecommerceCargo.setStatus("Accepted");
				acceptedCounter++;
			}else {
				ecommerceCargo.setStatus("Not Accepted");
				notAcceptedCounter++;
			}
			hepsiburadaCounter++;
			
		}else if(siteName.equals("N11")) {
			
			if(n11Counter <= N11_LIMIT) {
				ecommerceCargo.setStatus("Accepted");
				acceptedCounter++;
			}else {
				ecommerceCargo.setStatus("Not Accepted");
				notAcceptedCounter++;
			}
			n11Counter++;
			
		}else if(siteName.equals("Trendyol")) {
			
			if(trendyolCounter <= TRENDYOL_LIMIT) {
				ecommerceCargo.setStatus("Accepted");
				acceptedCounter++;
			}else {
				ecommerceCargo.setStatus("Not Accepted");
				notAcceptedCounter++;
			}
			trendyolCounter++;
		}
		
	}
	
	public int getAcceptedCounter() {
		return acceptedCounter;
	}

	public int getNotAcceptedCounter() {
		return notAcceptedCounter;
	}
	
	
	
}	
