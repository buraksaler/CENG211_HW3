
public class N11 extends EcommerceCargo<String> {

	public N11(int weight, int width, int length, int height, String cargoCode) {
		super(weight, width, length, height, cargoCode);
	}

	@Override
	public String getEcommerceSite() {
		return "N11";
	}
 

}
