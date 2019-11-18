package rocks.zipcode.io.quiz3.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    private String [] vowels = {"a", "e", "i", "o", "u"};

    public static Boolean hasVowels(String word) {
        Integer count = 0;
        char ch;
        for (int j = 0; j < word.length(); j++) {
            ch = word.charAt(j);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count = j;
                if (count >= 1) {
                    return true;
                }
            }
        }
        return false;
    }


    public static Integer getIndexOfFirstVowel(String word) {
        Integer count = 0;
        char ch;
        for (int j = 0; j < word.length(); j++) {
            ch = word.charAt(j);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count = j;
                if (count >= 1) {
                    return count;
                }
            }
        }
        return -1;
    }


//
//        String [] vowels = {"a", "e", "i", "o", "u"};
//        String [] wordArray = word.toLowerCase().split("");
//        for (int i = 0; i < vowels.length; i++) {
//            for (int j = 0; j < wordArray.length; j++){
//                if (vowels[0].equals(wordArray[j])){
//                    return j;
//                }
//            }
//        }
//        return -1;
//    }


    public static Boolean startsWithVowel(String word) {
        String [] vowels = {"a", "e", "i", "o", "u"};
        String [] wordArray = word.toLowerCase().split("");
        String firstLetter = wordArray[0];
        //return true; //Arrays.stream(wordArray).filter(x -> x == "a" || x =="e" || x == "i" || x == "o" || x == "u");

        for(int i = 0; i < vowels.length; i++){
            if (vowels[i].equals(firstLetter)){
                    return true;
            }
        }
        return false;
    }

    public static Boolean isVowel(Character character) {
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' || character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
                return true;
        }
        return false;
    }

}
