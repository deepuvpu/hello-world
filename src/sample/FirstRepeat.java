package sample;

import java.util.Scanner;

public class FirstRepeat {
	
	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		FirstRepeat fr= new FirstRepeat();
		fr.loop();
		
	}
	
	void loop() {
		String str ="";
		System.out.println("enter string:" );
		str = scan.next();
		str = str.toUpperCase();
		for(int i =0; i<str.length();i++) {
			 char character =str.charAt(i);
			int firstIndex = str.indexOf(character);
			int lastIndex = str.lastIndexOf(character);
			if(firstIndex == lastIndex) {
				System.out.println("The character "+character);
				break;
			}
		}
	}

}
