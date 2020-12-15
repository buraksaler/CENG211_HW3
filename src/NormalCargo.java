
public class NormalCargo extends Cargo implements INormalCargo{
	
	private final String senderId;
	private final String senderName;
	private final String recipientName;
	private final String recipientAddress;
	private int price = (int) (18.5 + (3* super.getSize()));

	public NormalCargo(int weight, int width, int length, int height, String senderId, String senderName,
					   String recipientName, String recipientAddress) {
		super(weight, width, length, height);
		this.senderId = senderId;
		this.senderName = senderName;
		this.recipientName = recipientName;
		this.recipientAddress = recipientAddress;
		
	}

	
	
	@Override
	public void applyDiscount(int discountPercent) {
		price *= 1 - (discountPercent/100);
	}


	
	@Override
	public int getPrice() {
		return price;
	}
	
	public String getSenderID() {
		return senderId;
	}
	
	public String getSenderName() {
		return senderName;
	}
	
	public String getRecipientName() {
		return recipientName;
	}
	
	public String getRecipientAddress() {
		return recipientAddress;
	}


	@Override
	public Cargo.Days getDeliveryDay() {
		// TODO Auto-generated method stub
		return null;
	}




	
	
	
}
