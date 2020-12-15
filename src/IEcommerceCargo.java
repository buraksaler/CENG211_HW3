
public interface IEcommerceCargo<T> extends ICargo {
	
	
	
	public int getDailyPackageLimit();  
	
	public Cargo.Days getDeliveryDay();
	
	public int getSize();
	
	//T is the Code format type (Integer or String)
	public T getCargoCode();
	
	public String getEcommerceSite();
	
	public String getStatus();
	
	
	
}
