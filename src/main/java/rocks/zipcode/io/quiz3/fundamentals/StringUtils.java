package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String [] strArray = str.split("");
        strArray[indexToCapitalize] = strArray[indexToCapitalize].toUpperCase();
        return String.join("", strArray);
                //Arrays.toString(strArray);
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        char ch = characterToCheckFor.toLowerCase(characterToCheckFor);
        if(baseString.toLowerCase().indexOf(indexOfString)==(ch)) {
            return true;
        }
        return false;
    }

    public static String[] getAllSubStrings(String string) {
//        for (int i = 0; i < str.length(); i++) {
//            for (int j = i+1; j <= str.length(); j++) {
//                System.out.println(str.substring(i,j));
//        char ch = characterToCheckFor.toLowerCase(characterToCheckFor);
        return null;
    }

    public static Integer getNumberOfSubStrings(String input){


        //        Integer sum = 0;
//        String [] inputArray = input.split("");
//        for (int i = 0; i < inputArray.length; i++){
//            sum += inputArray[i] * (i + 1) * (inputArray.length - i);
//        }
        return null;
    }
}
