
public interface ICargo<T> {
	
	
	public Cargo.Days getDeliveryDay();
	
	public int getSize();
	
	//T is the Code format type (Integer or String)
	public T getCargoCode();
}