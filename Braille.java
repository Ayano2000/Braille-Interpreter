import views.*;
import java.io.*;

public class Braille {
	private static BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
	public static void main (String[] args) throws IOException {
		System.out.println("Welcome, enter something for me to convert!");
		String line = Reader.readLine();
		// System.out.println(line);
		while (!line.equals("exit")) {
			int length = line.length();
			Output output;
			for(int i = 0; i < length; i++) {
				char character = line.charAt(i);
				if (Character.isUpperCase(character)) {
					output = new Uppercase(character);
					// System.out.println("Uppercase " + character);
				} else if (character == ' ') {
					output = new Space(character);
					// System.out.println("Space " + character);
				} else if (Character.isLowerCase(character)) {
					output = new Lowercase(character);
					// System.out.println("Lowercase " + character);
				} else if (Character.isDigit(character)) {
					output = new Digit(character);
					// System.out.println("Digit " + character);
				} else {
					output = new Space(character);
					// Garbage char
				}
					// System.out.println(character);
			}System.out.println("Type \"exit\" to close the programme");
			line = Reader.readLine();
		}	
	}
}