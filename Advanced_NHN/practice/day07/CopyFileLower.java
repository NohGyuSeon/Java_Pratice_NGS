package NGS.NHN.practice.day07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyFileLower {
	
	public static void main(String[] args) {
		String stringFrom, stringTo;
		BufferedReader fileStreamFrom;
		BufferedWriter fileStreamTo;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Copy From: ");
		stringFrom = sc.next();
		System.out.print("Copy To: ");
		stringTo = sc.next();
		
		try {
			FileReader inputFile = new FileReader(stringFrom);
			FileWriter outputFile = new FileWriter(stringTo);
			
			fileStreamFrom = new BufferedReader(inputFile);
			fileStreamTo = new BufferedWriter(outputFile);
			
			String stringBuffer = "";
			while((stringBuffer = fileStreamFrom.readLine()) != null) {
				stringBuffer = stringBuffer.toLowerCase();
				fileStreamTo.write(stringBuffer);
				fileStreamTo.write("\n");
			}
			
			fileStreamFrom.close();
			fileStreamTo.close();
		} catch (FileNotFoundException e){
			System.out.println("File " + stringFrom + " not found");
			e.printStackTrace();
		} catch(IOException ie) {
			System.out.println("Problem occurred when try to writing file");
			ie.printStackTrace();
		} finally {
			sc.close();
		}
		
	}
	
}
