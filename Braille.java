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
				System.out.println("Space " + character);
			} else {
				output = new Lowercase(character);
				// System.out.println("Lowercase " + character);
			}
				// System.out.println(character);
		}
		
	}
}