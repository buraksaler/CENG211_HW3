
public interface IEcommerceCargo<T> extends ICargo<T> {
	

	public int getDailyPackageLimit();  
	
	public Cargo.Days getDeliveryDay();
	
	public int getSize();
	
	public String getEcommerceSite();
	
	
	
	
}
