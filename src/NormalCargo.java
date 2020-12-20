import java.util.Random;

public class NormalCargo extends Cargo<Integer> implements INormalCargo<Integer>, IDiscountedPriceCalculator{

	private final String senderId;
	private final String senderName;
	private final String recipientName;
	private final String recipientAddress;
	
	private int price = (int) (18.5 + (3* super.getSize()));

	public NormalCargo(int weight, int width, int length, int height, String senderId, String senderName,
					   String recipientName, String recipientAddress) {		
		
		super(weight, width, length, height, generateCargoCode());
		
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
	public int getDiscountedPrice() {
		return price;
	}

	@Override
	public int getPrice() {
		return price;
	}
	
	@Override
	public String getSenderID() {
		return senderId;
	}
	
	@Override
	public String getSenderName() {
		return senderName;
	}
	
	@Override
	public String getRecipientName() {
		return recipientName;
	}
	
	@Override
	public String getRecipientAddress() {
		return recipientAddress;
	}
	
	public static int generateCargoCode() {
		Random random = new Random();
		return random.nextInt(9000000) + 1000000; // 7 digit random number
	}
	
}
