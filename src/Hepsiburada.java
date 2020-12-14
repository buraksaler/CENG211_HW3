
public class Hepsiburada extends EcommerceCargo<String> {

	public Hepsiburada(int weight, int width, int length, int height, String cargoCode) {
		super(weight, width, length, height, cargoCode, "Hepsiburada",  7); //Daily package limit is 7 for Hepsiburada
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getEcommerceSite() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDeliveryDay() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
