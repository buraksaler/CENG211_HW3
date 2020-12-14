
public class Amazon extends EcommerceCargo<Integer>{
	
	public Amazon(int weight, int width, int length, int height, Integer cargoCode) {
		super(weight, width, length, height, cargoCode, "Amazon", 5 ); //Daily package limit is 5 for Amazon
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
