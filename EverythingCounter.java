import java.util.Scanner;

public class EverythingCounter {

    String classWord = "null";
	public static void main(String[] args) { //counting words method
		Scanner input = new Scanner(System.in); 
		System.out.printf("Please type some text: ");
		String userText = input.nextLine();
		
		int sentences = 0;
		int syllables = 0;
		int totalSyllables = 0;
		int words = 0; // declare words counter
		boolean prevCharWasALetter = false; // // set boolean value to false (like 0) to be updated later
		StringBuilder word = new StringBuilder(); //Decalres an array of 16 blank characters as a string
		
		for (int i=0; i<userText.length(); i++) { //Increment the for loop, character by charater, until the length of the userText is reached
			char c = userText.charAt(i); // charAt() method is used to declare c as letter at address current increment value
			
			// apostrophes (and other characters?) should be ignored
			if (c=='\'')
				continue;//skip to the next loop
			
			// everything else is either a letter, or it isn't
			boolean charIsALetter = ((c>='A' && c<='Z') || (c>='a' && c<='z')); //charIsALetter is stored as true if letter, false if not
			
			// and a word is defined as a letter following a non-letter
			if (charIsALetter) { //if char is a letter
				if (!prevCharWasALetter) {//and previous char wasn't a letter
					words++; //add one to words
					
					if (word.length()>0) //word length won't add until word.append
						totalSyllables = totalSyllables + CalcSyllables(word.toString(), syllables);
						
					word.setLength(0);
				}
				
				word.append(c);
			}
            
            //saves whether previous char was a letter (true/false)
			prevCharWasALetter = charIsALetter;
		}
		
       

		if (word.length()>0)
			CalcSyllables(word.toString(), syllables); 
			totalSyllables = totalSyllables + CalcSyllables(word.toString(), syllables);
			System.out.printf("\n\nWords = %d, ", words);
			CalcSentences(userText, sentences);
			System.out.printf("Syllables = %d.\n", totalSyllables);

	}
      /*   public static void CalcTotalSyllables(String userText){//declare the string word in the CalcSyllables method
        int Totalsyllables = 0; // declare syllable counter at least 1
		boolean prevCharWasAVowel = false; // set boolean value to false (like 0) to be updated later
		StringBuilder syllable = new StringBuilder();
		
		for (int i=0; i<userText.length(); i++) {
			char c = userText.charAt(i);
			
			// apostrophes (and other characters?) should be ignored
			if (c=='\'')
				continue;
			
			// declare all vowels
			boolean charIsAVowel = (c=='a' || c=='A' || c=='E'|| c=='e' || c=='I' 
                                    || c=='i' || c=='o' || c=='O' || c=='u' || 
                                    c=='U' || c=='y' || c=='Y');
			
			// a syllable is defined as a vowel or adjacent vowels
			if (charIsAVowel) {
				if ((c=='e'||c=='E') && (i == userText.length()-1)){  
                    if(Totalsyllables == 0){
                        Totalsyllables++;
                    }
                    continue; 
                }
                else if (!prevCharWasAVowel) {
					Totalsyllables++;
                    }
                
				syllable.append(c);
				System.out.print(syllable.toString());

			}
            
            prevCharWasAVowel = charIsAVowel;
        }

        System.out.printf("Syllables = %d.\n", Totalsyllables);
		}
	*/	 
	public static int CalcSyllables(String word, int syllables){//declare the string word in the CalcSyllables method
		boolean prevCharWasAVowel = false; // set boolean value to false (like 0) to be updated later
		StringBuilder syllable = new StringBuilder();

		for (int i=0; i<word.length(); i++) {
			char c = word.charAt(i);
			
			// apostrophes (and other characters?) should be ignored
			if (c=='\'')
				continue;
			
			// declare all vowels
			boolean charIsAVowel = (c=='a' || c=='A' || c=='E'|| c=='e' || c=='I' 
                                    || c=='i' || c=='o' || c=='O' || c=='u' || 
                                    c=='U' || c=='y' || c=='Y');
			
			// a syllable is defined as a vowel or adjacent vowels
			if (charIsAVowel) {
				if ((c=='e'||c=='E') && (i == word.length()-1)){  
                    if(syllables == 0){
                        syllables++;
                    }
                    continue; 
                }
                else if (!prevCharWasAVowel) {
					syllables++;
                    }
                
				syllable.append(c);


			}
            
            prevCharWasAVowel = charIsAVowel;
        }
        System.out.printf("\n'%s' has %d syllables", word.toString(), syllables);
		return syllables;
		}
		
		{	
    }
	 public static int CalcSentences(String userText, int sentences){//declare the string word in the CalcSyllables method
		StringBuilder sentence = new StringBuilder();
		
		for (int i=0; i<userText.length(); i++) {
			char c = userText.charAt(i);
			
			// declare all vowels
			boolean charIsASentence = (c=='.' || c==':' || c==';'|| c=='?' || c=='!');
			// a syllable is defined as a vowel or adjacent vowels
			if (charIsASentence) {
                        sentences++;
                    }
                sentence.append(c);
				}
			System.out.printf("Sentences = %d, ", sentences);
			return sentences;
        }      
}