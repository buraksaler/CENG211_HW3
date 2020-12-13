
public abstract class Cargo implements ICargo {

	@Override
	public int findDesi(int width, int length, int heigth) {
		return (width * length * heigth) / 3000;
	}

	@Override
	public int findSize(int desi, int weight) {
		return Math.max(desi, weight);
	}
	
}
