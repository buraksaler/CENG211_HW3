
public interface IEcommerceCargo<T,E> extends ICargo {
	
	
	//E is the ecommerce cargo type (amazon,n11,trendyol,hepsiburada)
	public E getDailyPackageLimit();  
	
	public Cargo.Days getDeliveryDay();
	
	public int getSize();
	
	//T is the Code format type (Integer or String)
	public T getCargoCode();
	
	public E getEcommerceSite();
	
	public String getStatus();
	
	
	
}
