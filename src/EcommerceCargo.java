
public abstract class EcommerceCargo<T> extends Cargo implements IEcommerceCargo{
	
	private final int dailyPackageLimit;
	private final T code;
	
	public EcommerceCargo(int weight, int width, int length, int height, T code, int dailyPackageLimit) {
		super(weight, width, length, height);
		this.dailyPackageLimit = dailyPackageLimit;
		this.code = code;
		// TODO Auto-generated constructor stub
	}
	
	public T getCode() {
		return code;
	}
	
	
}
