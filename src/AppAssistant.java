import java.util.ArrayList;
import java.util.Date;

public class AppAssistant {

	private int amazonCounter = 0;
	private int hepsiburadaCounter = 0;
	private int n11Counter = 0;
	private int trendyolCounter = 0;
	
	private int acceptedCounter = 0;
	private int notAcceptedCounter = 0;

	FileManager fileManager = new FileManager("HW3_PackagesToAccept.csv");
	ArrayList<EcommerceCargo<?>> ecommerceCargos = fileManager.getEcommerceCargos();
	ArrayList<NormalCargo> normalCargos = fileManager.getNormalCargos();
	
	public AppAssistant() throws IDNotCorrectException, CodeFormatLengthNotCorrectException{
		updateEcommerceCargos();
		updateNormalCargos();
	}
	
	Date date = new Date();  
	
	private Cargo.Days getDeliveryDay() {
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
			System.out.println("Something went wrong!");
			index = -1;
		}
		
		return Cargo.Days.values()[index];
		
	}
	
	private void updateEcommerceCargos() throws IDNotCorrectException, CodeFormatLengthNotCorrectException {
		for(EcommerceCargo<?> ecommerceCargo : ecommerceCargos) {
			String siteName = ecommerceCargo.getEcommerceSite();
			if(siteName.equals("Amazon")) {
				
				if(amazonCounter < IEcommerceCargo.AMAZON_DAILY_LIMIT) {
					ecommerceCargo.setStatus("Accepted");
					ecommerceCargo.setDeliveryDay(getDeliveryDay());
					amazonCounter++;
					acceptedCounter++;
					
				}else {
					ecommerceCargo.setStatus("Not Accepted");
					notAcceptedCounter++;
					ecommerceCargo.setDeliveryDay(null);
					
				}
				
				
			}else if(siteName.equals("Hepsiburada")) {
				
				if(hepsiburadaCounter < IEcommerceCargo.HEPSIBURADA_DAILY_LIMIT) {
					ecommerceCargo.setStatus("Accepted");
					ecommerceCargo.setDeliveryDay(getDeliveryDay());
					acceptedCounter++;
					hepsiburadaCounter++;
					
				}else {
					ecommerceCargo.setStatus("Not Accepted");
					notAcceptedCounter++;
					ecommerceCargo.setDeliveryDay(null);
					
				}
			
				
			}else if(siteName.equals("N11")) {
				
				if(n11Counter < IEcommerceCargo.N11_DAILY_LIMIT) {
					ecommerceCargo.setStatus("Accepted");
					ecommerceCargo.setDeliveryDay(getDeliveryDay());
					acceptedCounter++;
					n11Counter++;
					
				}else {
					ecommerceCargo.setStatus("Not Accepted");
					ecommerceCargo.setDeliveryDay(null);
					notAcceptedCounter++;
					
				}
				
			}else{
				
				if(trendyolCounter < IEcommerceCargo.TRENDYOL_DAILY_LIMIT) {
					ecommerceCargo.setStatus("Accepted");
					ecommerceCargo.setDeliveryDay(getDeliveryDay());
					acceptedCounter++;
					trendyolCounter++;
					
				}else {
					ecommerceCargo.setStatus("Not Accepted");
					ecommerceCargo.setDeliveryDay(null);
					notAcceptedCounter++;
					
				}
				
			}
		}
	}
	private void updateNormalCargos() {
		for(NormalCargo normalCargo : normalCargos) {
			normalCargo.setDeliveryDay(getDeliveryDay());
		}
	}
	public ArrayList<NormalCargo> getNormalCargos(){
		return new ArrayList<NormalCargo>(this.normalCargos);
	}
	
	public ArrayList<EcommerceCargo<?>> getEcommerceCargos(){
		return new ArrayList<EcommerceCargo<?>>(ecommerceCargos);
	}
	
	public int getAcceptedCounter() throws IDNotCorrectException, CodeFormatLengthNotCorrectException {
		acceptedCounter += getNormalCargos().size();
		return acceptedCounter;
	}

	public int getNotAcceptedCounter() {
		return notAcceptedCounter;
	}
	
	
	
}	
