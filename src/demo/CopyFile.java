package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		File fileR = new File("/home/faheem/rubrica.txt");
		File fileW = new File("/home/faheem/nuovoW.txt");
		
		FileReader fileReader = new FileReader(fileR);
		FileWriter fileWriter = new FileWriter(fileW);
		
		while(fileReader.ready()) {
			 fileWriter.write(fileReader.read());
		}

		fileReader.close();
		fileWriter.flush();
		fileWriter.close();
		
		
	}

}
