import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {
	private final String filePath;
	
	public FileManager(String filePath) {
		this.filePath = filePath;		
	}
	
	public ArrayList<String> readFile() {
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
            e.printStackTrace();
        }
        return new ArrayList<String>(lines);
               
    }
}
