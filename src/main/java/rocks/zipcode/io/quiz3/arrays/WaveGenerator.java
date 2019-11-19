package rocks.zipcode.io.quiz3.arrays;

import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        String strCopy = str.toLowerCase();
        Integer size;
            str = str.replaceAll("[^A-Za-z]", "");
            size = str.length();

    //String [] strArray = str.toLowerCase().split("");
    String[] strArray = new String[size];
    ArrayList <String > list = new ArrayList<>(size);

        for (int j = 0; j < strCopy.length(); j++) {
                list.add(StringUtils.capitalizeNthCharacter(strCopy, j));
            }
        for (int k = 0; k < list.size(); k++){
            if ( list.get(k).equals(strCopy)){
               list.remove(list.get(k));
            }
        }
//        System.out.println(str);
//        String front = str.substring(0, str.length() - 1);
//            String back = str.substring(str.length() - 1);
//            str.toLowerCase();
//            //str = front + back.toUpperCase();
//            strArray[size - 1] = str;
//        System.out.println(back);
//        System.out.println(Arrays.toString(strArray));

        //        System.out.println(size);
//        String wordToAlter = strCopy;
//        String front = wordToAlter.substring(0, wordToAlter.length() - 2);
//        String back = wordToAlter.substring(wordToAlter.length() - 1);
//        wordToAlter = front + back.toUpperCase();
//        System.out.println(back);
//        //strArray[size-1] = wordToAlter;
        return list.toArray(new String[0]);
    }

}
