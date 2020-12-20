
public abstract class EcommerceCargo<T> extends Cargo<T> implements IEcommerceCargo<T>{
	
	private String status;
	
	public EcommerceCargo(int weight, int width, int length, int height, T cargoCode) {
						 
		super(weight, width, length, height, cargoCode);
	}

	@Override
	public abstract String getEcommerceSite();
	
	@Override
	public void setStatus(String newStatus) {
		status = newStatus;
	}
	
	@Override
	public String getStatus() {
		return status;
	}
	
}
