
public class CargoAcceptanceApp {

	public static void main(String[] args) {
		FileManager fileManager = new FileManager("HW3_PackagesToAccept.csv");
		AppAssistant appAssistant = new AppAssistant();
		


		
		
		System.out.println("Welcome!");
		System.out.println("Number of Accepted Cargo: " + appAssistant.getAcceptedCounter());
		System.out.println("Number of Not Accepted Cargo: " + appAssistant.getNotAcceptedCounter());
		System.out.println("Here are the details: ");
		System.out.println("Normal Cargo Packages: ");
		System.out.println("No Cargo Code  Sender ID  Sender Name  Recipient Name  Recipient Address  Size  Price  Delivery Day");
		
		
	}
	

	
	
	
	

}
