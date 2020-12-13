
public class Amazon extends EcommerceCargo<Integer>{
	
	public Amazon(int weight, int width, int length, int height, Integer cargoCode) {
		super(weight, width, length, height, cargoCode, "Amazon", 5 ); //Daily package limit is 5 for Amazon
 		// TODO Auto-generated constructor stub
	}

}
