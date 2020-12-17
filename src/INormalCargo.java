
public interface INormalCargo<T> extends ICargo<T> {	
	
	
	public Cargo.Days getDeliveryDay();
	
	public int getSize();
	
	public int getPrice();
	
	public void applyDiscount(int discountPercent);
	
	public int generateCargoCode();
	
	
}
