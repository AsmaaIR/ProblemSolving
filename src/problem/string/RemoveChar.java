package problem.string;

public class RemoveChar {

	public static void main(String[] args) {

		String text = "hello from here";
		System.out.println(RemoveChar.removeCharAt(text, 4));
	}

	public static String removeCharAt(String text, int position) {

		return text.substring(0, position) + text.substring(position + 1);
	}

}
