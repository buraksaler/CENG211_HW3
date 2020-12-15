
public interface INormalCargo extends ICargo {	
	
	
	public Cargo.Days getDeliveryDay();
	
	public int getSize();
	
	public int getPrice();
	
	public void applyDiscount(int discountPercent);
}
