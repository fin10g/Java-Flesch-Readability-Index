import java.util.Scanner;

public class SeparatingWordsByIteratingCharacters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.printf("Please type some text: ");
		String userText = input.nextLine();
		
		int words = 0;
		boolean prevCharWasALetter = false;
		StringBuilder word = new StringBuilder();
		
		for (int i=0; i<userText.length(); i++) {
			char c = userText.charAt(i);
			
			// apostrophes (and other characters?) should be ignored
			if (c=='\'')
				continue;
			
			// everything else is either a letter, or it isn't
			boolean charIsALetter = ((c>='A' && c<='Z') || (c>='a' && c<='z'));
			
			// and a word is defined as a letter following a non-letter
			if (charIsALetter) {
				if (!prevCharWasALetter) {
					words++;
					
					if (word.length()>0)
						System.out.printf("\n%s (length %d)", word.toString(), word.length());
						
					word.setLength(0);
				}
				
				word.append(c);
			}
		
			prevCharWasALetter = charIsALetter;
		}
		
		if (word.length()>0)
			System.out.printf("\n%s (length %d)", word.toString(), word.length());

		System.out.printf("\nYou typed %d words.\n", words);
	}

}
