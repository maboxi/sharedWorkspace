package de.supremeprojekt.textrandomiser;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Text eingeben: ");
		String text = "";
		do {
			text += s.nextLine();	
		} while(s.hasNextLine());
		
		System.out.println();
		
		if(!text.equals("")) {
			System.out.println(text);
			System.out.println();
			System.out.println("Words in text: " + text.split(" ").length);
		}
		
		s.close();
		
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean contains(String[] array, String contain) {
		for(String s : array)
			if(s.equals(contain))
				return true;
		
		return false;
	}
	
}
