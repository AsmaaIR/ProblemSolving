package problem.string;

public class CountWords {

	public static void main(String[] args) {

		String text = "One two three\n four\tfive six seven    ";

		System.out.println(countWords1(text));
		System.out.println(countWords2(text));
	}

	// first Solution
	static int countWords1(String text) {

		if (text == null || "".equals(text.trim())) {
			return 0;
		}

		String[] ch = text.trim().split("\\s+");
		return ch.length;
	}

	// Second Solution
	static int countWords2(String text) {

		if (text == null || "".equals(text.trim())) {
			return 0;
		}

		int countWords = 0;
		boolean isLetter = false;

		char[] ch = new char[text.trim().length()];
		for (int i = 0; i < ch.length; i++) {

			if (text.trim().charAt(i) != ' ' && text.trim().charAt(i) != '\t' && text.trim().charAt(i) != '\n') {
				isLetter = true;
			} else {

				if (isLetter) {
					countWords++;
					isLetter = false;
				}
			}
		}

		return countWords + 1;
	}

}
