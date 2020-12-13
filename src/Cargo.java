
public abstract class Cargo implements ICargo {
	
	private final int size;
	
	public Cargo(int weight, int width, int length, int height) {
		int desi = (width * length * height) / 3000;
		this.size = Math.max(desi, weight);
		
	}
	
	@Override
	public int getSize() {
		return size;
	}


	
}
