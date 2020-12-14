
public class N11 extends EcommerceCargo<String> {

	public N11(int weight, int width, int length, int height, String cargoCode) {
		super(weight, width, length, height, cargoCode, "N11", 6);//Daily package limit is 6 for N11
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
