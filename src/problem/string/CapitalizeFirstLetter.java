package problem.string;

public class CapitalizeFirstLetter {
	public static String capitalizeWord(String str) {
		str = str.toLowerCase();
		String[] words = str.split("\\s");
		StringBuilder capitalizeWord = new StringBuilder(str.length());
		for (String w : words) {
			String first = w.substring(0, 1);
			String afterfirst = w.substring(1);
			capitalizeWord.append(first.toUpperCase()).append(afterfirst).append(" ");
		}
		return capitalizeWord.toString().trim();
	}

	public static void main(String[] args) {

		String finalText = capitalizeWord("hellO FROM here");
		System.out.print(finalText);
	}
}
