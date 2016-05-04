package PredicateTest;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by anjalhussan on 4/26/16.
 */
public class PredicateFunctionalInterface {

    public static void main(String [] ags){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

    }

    public static void evaluateNumbers(List<Integer> list, Predicate<Integer>predicate){
        for (Integer n:list){
            if (predicate.test(n)){
                System.out.println(n+ " ");
            }
        }
    }
}
