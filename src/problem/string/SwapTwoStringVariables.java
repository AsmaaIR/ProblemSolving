package problem.string;

public class SwapTwoStringVariables {

	public static void main(String[] args) {

		String text1 = "Hello";
		String text2 = "Here";

		System.out.println("Before Swapping =>" + text1 + " " + text2);

		text1 = text2 + text1;

		text2 = text1.substring(text2.length());
		text1 = text1.substring(0, text1.length() - text2.length());

		System.out.println("After Swapping =>" + text1 + " " + text2);

	}

}
