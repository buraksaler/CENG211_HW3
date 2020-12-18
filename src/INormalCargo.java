
public interface INormalCargo<T> extends ICargo<T> {	
	
	
	public int getSize();
	
	public int getPrice();
	  
	public void applyDiscount(int discountPercent);
	
	
	
}
