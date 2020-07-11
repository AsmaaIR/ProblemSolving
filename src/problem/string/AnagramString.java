package problem.string;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {

		checkAnagram("School master", "The classroom");
	}

	static void checkAnagram(String text1, String text2) {

		boolean isAnagram = false;
		String s1 = text1.replaceAll("\\s", "");
		String s2 = text2.replaceAll("\\s", "");

		if (s1.length() == s2.length()) {

			char[] arrchar1 = s1.toLowerCase().toCharArray();
			char[] arrchar2 = s2.toLowerCase().toCharArray();

			Arrays.sort(arrchar1);
			Arrays.sort(arrchar2);

			isAnagram = Arrays.equals(arrchar1, arrchar2);
		}

		if (isAnagram) {

			System.out.println("anagrams");
		} else {
			System.out.println("Not anagram");
		}

	}
}
