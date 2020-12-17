
public class Trendyol extends EcommerceCargo<Integer> {

	public Trendyol(int weight, int width, int length, int height, Integer cargoCode) {
		super(weight, width, length, height, cargoCode); 
	}

	@Override
	public String getEcommerceSite() {
		return "Trendyol";
	}	

	@Override
	public Cargo.Days getDeliveryDay() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getDailyPackageLimit() {
		return 9;
	}

}
