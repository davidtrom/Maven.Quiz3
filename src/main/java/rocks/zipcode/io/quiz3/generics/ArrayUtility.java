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

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j])
                    count++;
            }
            if (count % 2 != 0)
                return array[i];
        }
        return null;
    }


    public SomeType findEvenOccurringValue() {
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j])
                    count++;
            }
            if (count % 2 == 0)
                return array[i];
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Long numOccurences = Arrays.stream(array).filter(z -> z==valueToEvaluate).count();
        return numOccurences.intValue();
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        List myFilter = Arrays.stream(array).map(predicate).collect(Collectors.toList());
        return (SomeType[]) myFilter.toArray(Arrays.copyOf(array,myFilter.size()));
    }
}
