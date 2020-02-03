import views.*;

public class Braille {

	public static void main (String[] args) {
		int length = args[0].length();
		Output output;
		for(int i = 0; i < length; i++) {
			char character = args[0].charAt(i);
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
		}
		
	}
}