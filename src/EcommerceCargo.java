
public abstract class EcommerceCargo<T> extends Cargo implements IEcommerceCargo<T>{
	
	
	private final String siteName;
	private final int dailyPackageLimit;
	private final T cargoCode;
	
	public EcommerceCargo(int weight, int width, int length, int height, T cargoCode, String siteName,
						  int dailyPackageLimit) {
		super(weight, width, length, height);
		this.dailyPackageLimit = dailyPackageLimit;
		this.cargoCode = cargoCode;
		this.siteName = siteName;
	}
	
	@Override
	public T getCargoCode() {
		return cargoCode;
	}
	
	
}
