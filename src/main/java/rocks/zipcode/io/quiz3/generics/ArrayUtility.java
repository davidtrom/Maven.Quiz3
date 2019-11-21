package rocks.zipcode.io.quiz3.generics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {

        return Arrays.stream(array).filter(x -> getNumberOfOccurrences(x) % 2 == 1).findFirst().get();

//        for (int i = 0; i < array.length; i++) {
//            int count = 0;
//            for (int j = 0; j < array.length; j++) {
//                if (array[i] == array[j])
//                    count++;
//            }
//            if (count % 2 != 0)
//                return array[i];
//        }
//        return null;
    }



    public SomeType findEvenOccurringValue() {
        return Arrays.stream(array).filter(x -> getNumberOfOccurrences(x) % 2 == 0).findFirst().get();

//        for (int i = 0; i < array.length; i++) {
//            int count = 0;
//            for (int j = 0; j < array.length; j++) {
//                if (array[i] == array[j])
//                    count++;
//            }
//            if (count % 2 == 0)
//                return array[i];
//        }
//        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Long numOccurences = Arrays.stream(array).filter(z -> z==valueToEvaluate).count();
        return numOccurences.intValue();
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
       Object [] filtered = Arrays.stream(array)
                .filter(predicate::apply).toArray();        //Save results to an object array since highest class and filter the results by applying the given predicate
       SomeType [] target = Arrays.copyOf(array, filtered.length);  //create an array of SomeType that copies over the original array and is the length of the filtered one
       for( int i = 0; i < filtered.length; i++){   //We have to loop through and put the values from our object array into our filtered array being cast to SomeType.
           target [i] = (SomeType) filtered [i];
       }
       return target;
    }
}
