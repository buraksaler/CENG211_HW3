
public class Amazon extends EcommerceCargo<Integer>{
	
	public Amazon(int weight, int width, int length, int height, Integer cargoCode) {
		super(weight, width, length, height, cargoCode); 
	}

	@Override
	public String getEcommerceSite() {
		return "Amazon";
	}

	@Override
	public Cargo.Days getDeliveryDay() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getDailyPackageLimit() {
		return 5;
	}

	
}
