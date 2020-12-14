
public class Trendyol extends EcommerceCargo<Integer> {

	public Trendyol(int weight, int width, int length, int height, Integer cargoCode) {
		super(weight, width, length, height, cargoCode, "Trendyol", 9);//Daily package limit is 9 for Trendyol
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
