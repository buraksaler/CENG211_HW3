
public class Hepsiburada extends EcommerceCargo<String> {

	public Hepsiburada(int weight, int width, int length, int height, String cargoCode) {
		super(weight, width, length, height, cargoCode);
	}

	@Override
	public String getEcommerceSite() {
		return "Hepsiburada";
	}

	@Override
	public String getStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cargo.Days getDeliveryDay() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getDailyPackageLimit() {
		return 7;
	}
	
}
