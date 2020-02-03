public class Braille {
	public static void main (String[] args) {
		char[] letters = args[0].toCharArray();
		for(int i  = 0; i < args[0].length(); i++) {
			System.out.println(letters[i]);
		}
		
	}
}