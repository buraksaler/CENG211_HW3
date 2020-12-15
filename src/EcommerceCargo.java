
public abstract class EcommerceCargo<T,E> extends Cargo implements IEcommerceCargo<T,E>{
	
	
	private final T cargoCode;
	
	public EcommerceCargo(int weight, int width, int length, int height, T cargoCode) {
						 
		super(weight, width, length, height);
		this.cargoCode = cargoCode;
	}
	
	@Override
	public T getCargoCode() {
		return cargoCode;
	}
	
	public abstract E getEcommerceSite();
	
	public abstract String getStatus();
	
}
