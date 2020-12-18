
public interface IEcommerceCargo<T> extends ICargo<T> {
	
	public final int AMAZON_LIMIT = 5;
	public final int HEPSIBURADA_LIMIT = 7;
	public final int N11_LIMIT = 6;
	public final int TRENDYOL_LIMIT = 9; 
	
	
	
	public int getSize();
	
	public String getEcommerceSite();
	
	
	
	
}
