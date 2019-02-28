import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class fileReader {
	
	private File f;
	private BufferedReader br;
	public ArrayList<String> fileData = new ArrayList<String>();

	public fileReader(char c) throws IOException {
		if(Character.getNumericValue(c) >= 0 && Character.getNumericValue(c) < 4) {
			getData(Character.getNumericValue(c));
		} else {
			
		}
	}
	
	public fileReader(int i) throws IOException {
		if(i >= 0 && i < 4) {
			getData(i);
		} else {
			
		}
	}
	
	private String getFilepath(int i) {
		String s = "";
		switch (i) {
			case 0:
				s = Values.a;
				break;
			case 1:
				s = Values.b;
				break;
			case 2:
				s = Values.c;
				break;
			case 3:
				s = Values.d;
				break;
			case 4:
				s = Values.e;
				break;
		}
		return s;
	}
	
	private void getData(int pointer) throws IOException {
		int id = 0;
		String s = getFilepath(pointer);
		br = new BufferedReader(new FileReader(s));
		String line = br.readLine();
		int records = Integer.parseInt(line);
		line = br.readLine();
		for(int i=0; i<records;i++) {
			fileData.add(Integer.toString(id) + " " + line);
			id++;
			line = br.readLine();
		}
	}

	public ArrayList<String> getFileData() {
		return fileData;
	}

	public void setFileData(ArrayList<String> fileData) {
		this.fileData = fileData;
	}

}
