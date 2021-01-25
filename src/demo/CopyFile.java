package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
 private static int x;
 private int y;
 
 
 public CopyFile() {
	 x = 9;
	 System.out.println("i am in constructor X : " + x);
 }
 private static List<String> students = new ArrayList<>();
  
 {
	 x =7;
	 System.out.println("i am in non static block X : "+ x);
	 
 }
 static {
	 x =5;
	 students.add("abc");
	 students.add("xyz");
	 System.out.println("i am in static block X : " + x);
 }
	public static void getX() {
		System.out.println("i am in static method getX X : " +x);
	}
	
	
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
