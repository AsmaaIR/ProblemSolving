package problem.string;

public class ReverseStringPreservingSpacePositions {

	public static void main(String[] args) {

		String text = "Welcome to github";
		reverseString(text);

	}

	/**
	 * @param text
	 */
	static void reverseString(String text) {

		int sizeOfString = text.length();

		// mark Space in SpacesArr
		char[] spaces = new char[sizeOfString];
		for (int x = 0; x < sizeOfString; x++) {

			if (text.charAt(x) == ' ') {
				spaces[x] = ' ';
			}
		}

		char[] ch = text.toCharArray();
		int j = spaces.length - 1;
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] != ' ') {
				if (spaces[j] == ' ') {
					j--;
				}
				spaces[j] = ch[i];
				j--;
			}
		}

		System.out.println(String.valueOf(spaces));
	}
}