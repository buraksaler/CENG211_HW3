
public class CargoAcceptanceApp {

	public static void main(String[] args) throws IDNotCorrectException, CodeFormatLengthNotCorrectException {
		
		FileManager fileManager = new FileManager("HW3_PackagesToAccept.csv");
		AppAssistant appAssistant = new AppAssistant(fileManager);
		int index = 1;
		
		
		System.out.println("Welcome!");
		System.out.println("Number of the Accepted Cargos: " + appAssistant.getAcceptedCounter());
		System.out.println("Number of the Not Accepted Cargos: " + appAssistant.getNotAcceptedCounter());
		System.out.println("Here are the details: ");
		System.out.println("Normal Cargo Packages: ");
		
		
		for(NormalCargo normalCargo : fileManager.getNormalCargos()) {
			System.out.println(index++ +" " + normalCargo.getCargoCode() + " "+ normalCargo.getSenderID() + " " + normalCargo.getSenderName() + 
							   " " + normalCargo.getRecipientName() + " " + normalCargo.getRecipientAddress() + " " + normalCargo.getSize() +
							   " " + normalCargo.getPrice() + " " + appAssistant.getDeliveryDay());
		}
		
		System.out.println("Ecommerce Cargo Packages: ");
		index = 1;
	
		
		for(EcommerceCargo<?> ecommerceCargo : appAssistant.getUpdatedEcommerceCargos()) {
			System.out.println(index++ + " " + ecommerceCargo.getEcommerceSite() + " " + ecommerceCargo.getCargoCode() + " " +
							   ecommerceCargo.getStatus() + " " + ecommerceCargo.getSize() + " " + appAssistant.getDeliveryDay());
			
		}
		
		
		
		
		
	}
	

	
	
	
	

}
