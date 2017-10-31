package sample;

public class Split {
	public static void main(String[] args) {
		
		String s = "Java is a object oriented programming language ";

		String[] words = s.split(" ");

		for (String s1 : words) {
			System.out.println(s1);
		}

	
	}

}
