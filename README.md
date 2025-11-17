# Java-Flesch-Readability-Index
A java program that utilises string handling to count words, syllables and sentences. It then calculates readability based on the Flesch Readability Index. I learned a lot about passing returning variables through methods. 

1. Count all words. A word is any sequence of characters delimited by white space.
2. Count all syllables in each word. Each group of adjacent vowels (a, e, i, o, u, y) counts as one syllable (for example, the "ea" in "real" contributes one syllable, but the "e..a" in "regal" counts as two syllables). However, an "e" at the end of a word doesn't count as a syllable. Also, each word has at least 1 syllable, even if the previous rules give a count of 0.
3. Count all sentences. A sentence is ended by a full stop, colon, semicolon, question mark, or exclamation mark.
4. The index is computed by the following formula: Index = 206.835 − 84.6 * syllables/words − 1.015 * words/sentences
