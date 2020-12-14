import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {
	private final String filePath;

	
	public FileManager(String filePath) {
		this.filePath = filePath;		
	}
	
	private ArrayList<String> readFile() {
		String line;
		ArrayList<String> lines = new ArrayList<String>();
		
        try {
          
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
            	
            	lines.add(line);
            	
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.getMessage();
        }
        return new ArrayList<String>(lines);               
    }
	
	public ArrayList<Cargo> parseLinesIntoCargoObjects() throws IDNotCorrectException, CodeFormatNotCorrectException{
		ArrayList<Cargo> cargos = new ArrayList<Cargo>();
		ArrayList<String> lines = readFile();
		
		for(String line : lines) {
			String type = line.split(",")[0].split(";")[0]; //just accessing type
			
			if(type.equals("Normal")) {
				String senderId = line.split(",")[0].split(";")[1];
				if(senderId.length() != 11) {
					throw new IDNotCorrectException();
				}
				
				String senderName = line.split(",")[0].split(";")[2];
				String recipientName = line.split(",")[0].split(";")[3];
				String recipientAddress = line.split(",")[0].split(";")[4] + "," + line.split(",")[1] + 
										  "," + line.split(",")[2].split(";")[0];
				
				int weight = Integer.valueOf(line.split(",")[2].split(";")[1]);
				int width = Integer.valueOf(line.split(",")[2].split(";")[2]);
				int length = Integer.valueOf(line.split(",")[2].split(";")[3]);
				int height = Integer.valueOf(line.split(",")[2].split(";")[4]);
						
				cargos.add(new NormalCargo(weight, width, length, height, senderId,
										   senderName, recipientName, recipientAddress));	
				
				
			}else if(type.equals("Ecommerce")) {
				
				String siteName = line.split(";")[1];
				String cargoCode = line.split(";")[2];
				
				int weight = Integer.valueOf(line.split(";")[3]);
				int width = Integer.valueOf(line.split(";")[4]);
				int length = Integer.valueOf(line.split(";")[5]);
				int height = Integer.valueOf(line.split(";")[6]);
				
				if(siteName.equals("Amazon")) {	
					
					if(cargoCode.length() != 7) {
						throw new CodeFormatNotCorrectException();
					}
					
					try {
						int integerCargo = Integer.valueOf(cargoCode);
						cargos.add(new Amazon(weight, width, length, height, integerCargo));
					} catch (NumberFormatException e) {
						e.getMessage();
					}					
										
				}else if (siteName.equals("Hepsiburada")) {
					
					if(cargoCode.length() != 8) {
						throw new CodeFormatNotCorrectException();
					}
					cargos.add(new Hepsiburada(weight, width, length, height, cargoCode));
					
				}else if (siteName.equals("N11")) {
					
					if(cargoCode.length() != 7) {
						throw new CodeFormatNotCorrectException();
					}
					cargos.add(new N11(weight, width, length, height, cargoCode));
					
				}else if (siteName.equals("Trendyol")) {
					
					if(cargoCode.length() != 8) {
						throw new CodeFormatNotCorrectException();
					}
					
					try {
						int integerCargo = Integer.valueOf(cargoCode);
						cargos.add(new Trendyol(weight, width, length, height, integerCargo));
						
					} catch (NumberFormatException e) {
						e.getMessage();
					}					
				}
				
				
			}
		}
		
		return new ArrayList<Cargo>(cargos);

		
	}
	
	
	
}
