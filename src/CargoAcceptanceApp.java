
public class CargoAcceptanceApp {

	public static void main(String[] args) throws IDNotCorrectException, CodeFormatLengthNotCorrectException {
		
		FileManager fileManager = new FileManager("HW3_PackagesToAccept.csv");
		AppAssistant appAssistant = new AppAssistant();
		int index = 1;
		
		for (EcommerceCargo<?> ecommerceCargo : fileManager.getEcommerceCargos()) {
			ecommerceCargo.setStatus((appAssistant.checkLimit(ecommerceCargo)) ? "Accepted" : "Not Accepted");     ;
		}


		
		
		System.out.println("Welcome!");
		System.out.println("Number of Accepted Cargo: " + appAssistant.getAcceptedCounter());
		System.out.println("Number of Not Accepted Cargo: " + appAssistant.getNotAcceptedCounter());
		System.out.println("Here are the details: ");
		System.out.println("Normal Cargo Packages: ");
		System.out.println("No Cargo Code  Sender ID  Sender Name  Recipient Name  Recipient Address  Size  Price  Delivery Day");
		
		for(NormalCargo normalCargo : fileManager.getNormalCargos()) {
			System.out.println(index++ + " " + normalCargo.getCargoCode() + " " + normalCargo.getSenderID() + " " + normalCargo.getSenderName() + 
							   " " + normalCargo.getRecipientName() + " " + normalCargo.getRecipientAddress() + " " + normalCargo.getSize() +
							   " " + normalCargo.getPrice() + " " + appAssistant.getDeliveryDay());
		}
		
		System.out.println("Ecommerce Cargo Packages: ");
		index = 1;
		System.out.println("No  E-commerce Site  Cargo Code  Status  Size  Delivery Day");
		
		for(EcommerceCargo<?> ecommerceCargo : fileManager.getEcommerceCargos()) {
			System.out.println(index++ + " " + ecommerceCargo.getEcommerceSite() + " " + ecommerceCargo.getCargoCode() + " " +
							   ecommerceCargo.getStatus() + " " + ecommerceCargo.getSize() + " " + appAssistant.getDeliveryDay());
			
		}
		
		
		
		
		
	}
	

	
	
	
	

}
