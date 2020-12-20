
public class CargoAcceptanceApp {

	public static void main(String[] args) throws IDNotCorrectException, CodeFormatLengthNotCorrectException {
		
		AppAssistant appAssistant = new AppAssistant();
		int index = 1;
		
		System.out.println("Welcome!");
		System.out.println("Number of the Accepted Cargos: " + appAssistant.getAcceptedCounter());
		System.out.println("Number of the Not Accepted Cargos: " + appAssistant.getNotAcceptedCounter());
		System.out.println("Here are the details: ");
		System.out.println("Normal Cargo Packages: ");
		
		for(NormalCargo normalCargo : appAssistant.getNormalCargos()) {
			System.out.println(index++ +" " + normalCargo.getCargoCode() + " "+ normalCargo.getSenderID() + " " + normalCargo.getSenderName() + 
							   " " + normalCargo.getRecipientName() + " " + normalCargo.getRecipientAddress() + " " + normalCargo.getSize() +
							   " " + normalCargo.getPrice() + " " + normalCargo.getDeliveryDay());
		}
		System.out.println("Ecommerce Cargo Packages: ");
		index = 1;
	
		for(EcommerceCargo<?> ecommerceCargo : appAssistant.getEcommerceCargos()) {
			System.out.println(index++ + " " + ecommerceCargo.getEcommerceSite() + " " + ecommerceCargo.getCargoCode() + " " +
							   ecommerceCargo.getStatus() + " " + ecommerceCargo.getSize() + " " + ecommerceCargo.getDeliveryDay());
		}
	}
	

	
	
	
	

}
