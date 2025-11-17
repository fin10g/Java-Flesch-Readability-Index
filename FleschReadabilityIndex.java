import java.util.Scanner;

public class FleschReadabilityIndex {
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in); 
		System.out.printf("Please type some text: ");
		String userText = input.nextLine();
		
		int sentences = 0;
		int syllables = 0;
		int totalSyllables = 0;
		int words = 0;

		double fleschReadabilityIndex = 0;
		boolean prevCharWasALetter = false; 
		StringBuilder word = new StringBuilder(); 
		
		for (int i=0; i<userText.length(); i++) { 
			char c = userText.charAt(i); 
			
			
			if (c=='\'')
				continue;
			
		
			boolean charIsALetter = ((c>='A' && c<='Z') || (c>='a' && c<='z'));
			
			if (charIsALetter) { 
				if (!prevCharWasALetter) {
					words++; 
					
					if (word.length()>0){
						if (userText.length()<100){
							System.out.printf("\n'%s' has %d syllables", RetWordSyllables(word.toString(), 
							syllables), CalcSyllables(word.toString(), syllables));
							totalSyllables = totalSyllables + CalcSyllables(word.toString(), syllables);
						}
						else
							totalSyllables = totalSyllables + CalcSyllables(word.toString(), syllables);
						}

					word.setLength(0);
				}
				
				word.append(c);
			}
            
			prevCharWasALetter = charIsALetter;
		}
		
		if (word.length()>0)

			if (words<20){
				System.out.printf("\n'%s' has %d syllables", RetWordSyllables(word.toString(), 
				syllables), CalcSyllables(word.toString(), syllables)); 
				totalSyllables = totalSyllables + CalcSyllables(word.toString(), syllables);
				
				System.out.printf("\n\nWords = %d, ", words);
				System.out.printf("Sentences = %d, ", CalcSentences(userText, sentences));
				System.out.printf("Syllables = %d.\n", totalSyllables);
			
				double dsentences = CalcSentences(userText, sentences);
				double dtotalSyllables = totalSyllables;
				double dwords = words;
				
				fleschReadabilityIndex =  206.835-84.6*(dtotalSyllables/dwords)-1.015*(dwords/dsentences);
				System.out.printf("\nFlesch Readability Index = %f.\n", fleschReadabilityIndex);
			}
			else{
				totalSyllables = totalSyllables + CalcSyllables(word.toString(), syllables);
				
				double dsentences = CalcSentences(userText, sentences);
				double dtotalSyllables = totalSyllables;
				double dwords = words;
				
				fleschReadabilityIndex =  206.835-84.6*(dtotalSyllables/dwords)-1.015*(dwords/dsentences);
				System.out.printf("\nFlesch Readability Index = %f.\n", fleschReadabilityIndex);
			}
	}
//CalcSyllables method to return syllables variable as an int 
	public static int CalcSyllables(String word, int syllables){
		boolean prevCharWasAVowel = false; 
		StringBuilder syllable = new StringBuilder();

		for (int i=0; i<word.length(); i++) {
			char c = word.charAt(i);
			
			if (c=='\'')
				continue;
			
			boolean charIsAVowel = (c=='a' || c=='A' || c=='E'|| c=='e' || c=='I' 
                                    || c=='i' || c=='o' || c=='O' || c=='u' || 
                                    c=='U' || c=='y' || c=='Y');
			
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
		return syllables;
		}
//RetWordSyllables method to return current word as a string
	public static String RetWordSyllables(String word, int syllables){
		boolean prevCharWasAVowel = false; 
		StringBuilder syllable = new StringBuilder();

		for (int i=0; i<word.length(); i++) {
			char c = word.charAt(i);
			
			if (c=='\'')
				continue;
			
			boolean charIsAVowel = (c=='a' || c=='A' || c=='E'|| c=='e' || c=='I' 
                                    || c=='i' || c=='o' || c=='O' || c=='u' || 
                                    c=='U' || c=='y' || c=='Y');
			
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
		return word.toString();
		}
		
		{	
    }
// CalcSentences method to return setences value as an int	
	 public static int CalcSentences(String userText, int sentences){
		StringBuilder sentence = new StringBuilder();
		
		for (int i=0; i<userText.length(); i++) {
			char c = userText.charAt(i);
			
			boolean charIsASentence = (c=='.' || c==':' || c==';'|| c=='?' || c=='!');

			if (charIsASentence) {
                        sentences++;
                    }
                sentence.append(c);
				}
			return sentences;
        }      
}