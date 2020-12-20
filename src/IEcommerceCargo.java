
public interface IEcommerceCargo<T> extends ICargo<T> {
	
	public final int AMAZON_DAILY_LIMIT = 5;
	public final int HEPSIBURADA_DAILY_LIMIT = 7;
	public final int N11_DAILY_LIMIT = 6;
	public final int TRENDYOL_DAILY_LIMIT = 9; 
	
	public final int AMAZON_CODE_LENGTH = 7;
	public final int HEPSIBURADA_CODE_LENGTH = 8;
	public final int N11_CODE_LENGTH = 7;
	public final int TRENDYOL_CODE_LENGTH = 8;
	
	
	public int getSize();
	
	public String getEcommerceSite();
	
	
	
	
}
