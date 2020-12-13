
public class NormalCargo extends Cargo implements INormalCargo{

	public NormalCargo(int weight, int width, int length, int height) {
		super(weight, width, length, height);
		
	}
	
	@Override
	public int getPrice() {
		return (int) (18.5 + (3* super.getSize()));
	}
	
	
}
