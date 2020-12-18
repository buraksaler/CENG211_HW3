
public class Trendyol extends EcommerceCargo<Integer> {

	public Trendyol(int weight, int width, int length, int height, Integer cargoCode) {
		super(weight, width, length, height, cargoCode); 
	}

	@Override
	public String getEcommerceSite() {
		return "Trendyol";
	}	


}
