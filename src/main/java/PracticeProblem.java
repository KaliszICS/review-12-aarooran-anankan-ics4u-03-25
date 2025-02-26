public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(isPalindrome("was it a CAR or a cat i saw"));
	}

	public static boolean isPalindrome(String word) {

		boolean Paldimore = false;
		
		word = word.toLowerCase();
		word = word.replaceAll(" ", "");

		char[] wordArr = new char[word.length()];
		int each = 0;

		for (int i=0; i<word.length(); i++) { //word char = array values
			wordArr[i] = word.charAt(i);
		}

		for (int i=0; i<word.length(); i++) {
			if (wordArr[i]==wordArr[wordArr.length-1-i]) {
				each++;
			}

			if (each == wordArr.length-1) {
				Paldimore = true;
			}
		}

		return Paldimore;

	}

	public static int getAge(String[] nameArr, int[] ageArr, String name) {

		int nameLoc = 0;

		for (int i=0; i<nameArr.length;i++) {
			if (nameArr[i].equals(name)) {
				nameLoc = i;
			}
		}

		int finAge = ageArr[nameLoc];
		return finAge;

	}

	public static int countWords(String phrase, char letter) {
		
		int withLet = 0;
		String let = String.valueOf(letter);

		String[] phraseArr = phrase.split(" ");

		for (int i=0; i<phraseArr.length; i++) {

			String word = phraseArr[i];
			if (word.contains(let)) {
				withLet++;
			}

		}

		return withLet;

	}

}