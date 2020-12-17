
public abstract class EcommerceCargo<T> extends Cargo<T> implements IEcommerceCargo<T>{
	
	private String status;
	
	public EcommerceCargo(int weight, int width, int length, int height, T cargoCode) {
						 
		super(weight, width, length, height, cargoCode);
	}
	
	public abstract String getEcommerceSite();
	
	public abstract int getDailyPackageLimit();

	public abstract Cargo.Days getDeliveryDay();
	
	public void setStatus(String newStatus) {
		status = newStatus;
	}
	
	public String getStatus() {
		return status;
	}
	
}
