# Java-Flesch-Readability-Index
A java program that utilises string handling to count words, syllables and sentences. It then calculates readability based on the Flesch Readability Index. I learned a lot about passing returning variables through methods. 

1. Count all words. A word is any sequence of characters delimited by white space.
2. Count all syllables in each word. Each group of adjacent vowels (a, e, i, o, u, y) counts as one syllable (for example, the "ea" in "real" contributes one syllable, but the "e..a" in "regal" counts as two syllables). However, an "e" at the end of a word doesn't count as a syllable. Also, each word has at least 1 syllable, even if the previous rules give a count of 0.
3. Count all sentences. A sentence is ended by a full stop, colon, semicolon, question mark, or exclamation mark.
4. The index is computed by the following formula: Index = 206.835 − 84.6 * syllables/words − 1.015 * words/sentences

//Sample Output

Please type (or paste) some text: If you have used @override then the compiler will give an error.
'If' has 1 syllables
'you' has 1 syllables
'have' has 1 syllables 
'used' has 2 syllables 
'override' has 3 syllables 
'then' has 1 syllables 
'the' has 1 syllables 
'compiler' has 3 syllables 
'will' has 1 syllables 
'give' has 1 syllables
'an' has 1 syllables 
'error' has 2 syllables

Words=12, Sentences=1, Syllables=18. 

Flesch Readability Index = 67.755000


//More Sample Output

Please type (or paste) some text: I AM SAM. I AM SAM. SAM I AM. DO YOU LIKE GREEN EGGS AND HAM?
'I' has 1 syllables
'AM' has 1 syllables 
'SAM' has 1 syllables
'I' has 1 syllables
'AM' has 1 syllables 
'SAM' has 1 syllables 'SAM' has 1 syllables
'I' has 1 syllables
'AM' has 1 syllables 
'DO' has 1 syllables 
'YOU' has 1 syllables 
'LIKE' has 1 syllables 
'GREEN' has 1 syllables 
'EGGS' has 1 syllables 
'AND' has 1 syllables 
'HAM' has 1 syllables

Words=16, Sentences=4, Syllables=16. 

Flesch Readability Index = 118.175000

//More Sample Output

(Input longer than 50 characters only outputs Flesch Readability Index results)

Please type (or paste) some text: A path from a point approximately 330 metres east of the most south westerly corner of 17 Batherton Close, Widnes and approximately 208 metres east-south-east of the most southerly corner of Unit 3 Foundry Industrial Estate, Victoria Street, Widnes, proceeding in a generally east- north-easterly direction for approximately 28 metres to a point approximately 202 metres east-south-east of the most south-easterly corner of Unit 4 Foundry Industrial Estate, Victoria Street, and approximately 347 metres east of the most south-easterly corner of 17 Batherton Close.

Flesch Readability Index = -34.246220

//More Sample Output

Please type (or paste) some text: It doesn't appear to have any effect in terms of functionality, but is recommended as a form of compile-time correctness checking. For example, consider the scenario where you write a method called print() which replaces a superclass method called Print(). If you have used @override then the compiler will give an error, but if you don't use it then you'll simply have created a different method which has nothing to do with the original, since the method names are not the same. So the use of @override could potentially save you hours of debugging work.
Flesch Readability 

Index = 52.931250

