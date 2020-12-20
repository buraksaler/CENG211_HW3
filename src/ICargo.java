
public interface ICargo<T> {
	
	public int getSize();
	
	//T is the Code format type (Integer or String)
	public T getCargoCode();
	
	public Cargo.Days getDeliveryDay();
	
	public void setDeliveryDay(Cargo.Days day);

	@Override
	int hashCode();

	@Override
	boolean equals(Object obj);

	@Override
	String toString();
	
	
}