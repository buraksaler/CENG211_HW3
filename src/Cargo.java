
public abstract class Cargo<T> implements ICargo<T> {
	
	private final int size;
	private final T cargoCode;
	private Days day = null;
	
	public enum Days{ MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY} 
	
	public Cargo(int weight, int width, int length, int height, T cargoCode) {
		
		int desi = (width * length * height) / 3000;
		this.size = Math.max(desi, weight);
		
		this.cargoCode = cargoCode;
		
	}
	
	@Override
	public Cargo.Days getDeliveryDay() {
		return day;
	}

	@Override
	public void setDeliveryDay(Cargo.Days day) {
		this.day = day;
	}

	@Override
	public int getSize() {
		return size;
	}
	
	public T getCargoCode() {
		return cargoCode;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return super.toString();
	}

	
	
	
	
}
