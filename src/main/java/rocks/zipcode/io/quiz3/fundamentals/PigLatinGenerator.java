package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        StringBuilder sb = new StringBuilder(str);

        if (VowelUtils.startsWithVowel(str)){
            sb.append("way");
            return sb.toString();
        }
        else if (VowelUtils.hasVowels(str) == false){
            sb.append("ay");
            return sb.toString();
        }
        else {

            int index = VowelUtils.getIndexOfFirstVowel(str);
            String second = str.substring(0, index);
            String first = str.substring(index);
            String joined = first + second;
            StringBuilder thisString = new StringBuilder(joined);
            thisString.append("ay");
            return thisString.toString();
        }
    }
}
