
public abstract class Cargo<T> implements ICargo<T> {
	
	private final int size;
	private final T cargoCode;
	
	public Cargo(int weight, int width, int length, int height, T cargoCode) {
		int desi = (width * length * height) / 3000;
		this.size = Math.max(desi, weight);
		this.cargoCode = cargoCode;
		
	}
	
	public static enum Days{
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY,SUNDAY
	}
	
	@Override
	public int getSize() {
		return size;
	}
	
	public abstract Days getDeliveryDay();
	
	public T getCargoCode() {
		return cargoCode;
	}

	
}
