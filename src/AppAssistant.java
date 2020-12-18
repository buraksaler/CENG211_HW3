import java.util.ArrayList;
import java.util.Date;

public class AppAssistant {

	private int amazonCounter = 0;
	private int hepsiburadaCounter = 0;
	private int n11Counter = 0;
	private int trendyolCounter = 0;
	
	private int acceptedCounter = 0;
	private int notAcceptedCounter = 0;
	private FileManager fileManager;	
	private ArrayList<EcommerceCargo<?>> ecommerceCargos;
	
	public AppAssistant(FileManager fileManager) throws IDNotCorrectException, CodeFormatLengthNotCorrectException {
		this.fileManager = fileManager;
		ecommerceCargos = fileManager.getEcommerceCargos();
		updatedEcommerceCargos();
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
	
	private void updatedEcommerceCargos() throws IDNotCorrectException, CodeFormatLengthNotCorrectException {
		for(EcommerceCargo<?> ecommerceCargo : ecommerceCargos ) {
			String siteName = ecommerceCargo.getEcommerceSite();
			if(siteName.equals("Amazon")) {
				
				if(amazonCounter <= IEcommerceCargo.AMAZON_LIMIT) {
					ecommerceCargo.setStatus("Accepted");
					amazonCounter++;
					acceptedCounter++;
					
				}else {
					ecommerceCargo.setStatus("Not Accepted");
					notAcceptedCounter++;
					
				}
				
				
			}else if(siteName.equals("Hepsiburada")) {
				
				if(hepsiburadaCounter <= IEcommerceCargo.HEPSIBURADA_LIMIT) {
					ecommerceCargo.setStatus("Accepted");
					acceptedCounter++;
					hepsiburadaCounter++;
					
				}else {
					ecommerceCargo.setStatus("Not Accepted");
					notAcceptedCounter++;
					
				}
			
				
			}else if(siteName.equals("N11")) {
				
				if(n11Counter <= IEcommerceCargo.N11_LIMIT) {
					ecommerceCargo.setStatus("Accepted");
					acceptedCounter++;
					n11Counter++;
					
				}else {
					ecommerceCargo.setStatus("Not Accepted");
					notAcceptedCounter++;
					
				}
				
			}else{
				
				if(trendyolCounter <= IEcommerceCargo.TRENDYOL_LIMIT) {
					ecommerceCargo.setStatus("Accepted");
					acceptedCounter++;
					trendyolCounter++;
					
				}else {
					ecommerceCargo.setStatus("Not Accepted");
					notAcceptedCounter++;
					
				}
				
			}
		}
	
		
	}
	
	public ArrayList<EcommerceCargo<?>> getUpdatedEcommerceCargos(){
		return new ArrayList<EcommerceCargo<?>>(ecommerceCargos);
	}
	public int getAcceptedCounter() throws IDNotCorrectException, CodeFormatLengthNotCorrectException {
		acceptedCounter += fileManager.getNormalCargos().size();
		return acceptedCounter;
	}

	public int getNotAcceptedCounter() {
		return notAcceptedCounter;
	}
	
	
	
}	
