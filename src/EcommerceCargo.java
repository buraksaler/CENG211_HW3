
public abstract class EcommerceCargo<T> extends Cargo<T> implements IEcommerceCargo<T>{
	
	
	private final T cargoCode;
	
	public EcommerceCargo(int weight, int width, int length, int height, T cargoCode) {
						 
		super(weight, width, length, height);
		this.cargoCode = cargoCode;
	}
	
	@Override
	public T getCargoCode() {
		return cargoCode;
	}
	
	public abstract String getEcommerceSite();
	
	public abstract String getStatus();

	public abstract int getDailyPackageLimit();

	public abstract Cargo.Days getDeliveryDay();

	
}
