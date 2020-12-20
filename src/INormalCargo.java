
public interface INormalCargo<T> extends ICargo<T> {	
	
	public int getPrice();
	 
	public String getSenderID();
	
	public String getSenderName();
	
	public String getRecipientName();
	
	public String getRecipientAddress();

}
