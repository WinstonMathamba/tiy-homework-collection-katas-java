/**
 * Created by win808mac on 8/14/16.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        Kata kata = new Kata();

        ArrayList<Integer> ints = new ArrayList<>();

        ints.add(1);
        ints.add(2);
        ints.add(6);

        boolean result = kata.firstLastSix(ints);
        System.out.printf("Kata.firstLastSix(%s) -> %s\n",ints, result);

        ints.add(0, 6);
        ints.add(3,3);
        ints.remove(4);
        result = kata.firstLastSix(ints);
        System.out.printf("Kata.firstLastSix(%s) -> %s\n",ints, result);

        ints.add(0,13);
        result = kata.firstLastSix(ints);
        System.out.printf("Kata.firstLastSix(%s) -> %s\n",ints, result);

        ints.add(5,6);
        result = kata.firstLastSix(ints);
        System.out.printf("Kata.firstLastSix(%s) -> %s\n",ints, result);


        ints.remove(0);
        ints.remove(1);
        ints.remove(ints.size()-1);
        result = kata.firstLastSix(ints);
        System.out.printf("Kata.firstLastSix(%s) -> %s\n",ints, result);

        ints.remove(0);
        result = kata.firstLastSix(ints);
        System.out.printf("Kata.firstLastSix(%s) -> %s\n",ints, result);
        System.out.println();

        //example of Same First Last

        ints.add(0,1);
        result = kata.sameFirstLast(ints);
        System.out.printf("Kata.sameFirstLast(%s) -> %s\n",ints, result);

        ints.add(1);
        result = kata.sameFirstLast(ints);
        System.out.printf("Kata.sameFirstLast(%s) -> %s\n",ints, result);

        ints.remove(2);
        result = kata.sameFirstLast(ints);
        System.out.printf("Kata.sameFirstLast(%s) -> %s\n",ints, result);

        ints.add(0, 4);
        result = kata.sameFirstLast(ints);
        System.out.printf("Kata.sameFirstLast(%s) -> %s\n",ints, result);

        ints.remove(3);
        result = kata.sameFirstLast(ints);
        System.out.printf("Kata.sameFirstLast(%s) -> %s\n",ints, result);

        ints.add(4);
        result = kata.sameFirstLast(ints);
        System.out.printf("Kata.sameFirstLast(%s) -> %s\n",ints, result);
        System.out.println();

        //Example of Rotate Left
        ints.clear();
        ints.addAll(Arrays.asList(1,2,3));
        System.out.printf("Katas.rotateLeft(%s)", ints);
        kata.rotateLeft(ints);
        System.out.printf(" -> %s\n", ints);

        ints.clear();
        ints.addAll(Arrays.asList(5,11,9));
        System.out.printf("Katas.rotateLeft(%s)", ints);
        kata.rotateLeft(ints);
        System.out.printf(" -> %s\n", ints);

        ints.clear();
        ints.addAll(Arrays.asList(7,0,0));
        System.out.printf("Katas.rotateLeft(%s)", ints);
        kata.rotateLeft(ints);
        System.out.printf(" -> %s\n", ints);

        ints.clear();
        ints.addAll(Arrays.asList(4,2,0));
        System.out.printf("Katas.rotateLeft(%s)", ints);
        kata.rotateLeft(ints);
        System.out.printf(" -> %s\n", ints);

        ints.clear();
        ints.addAll(Arrays.asList(6,7,8));
        System.out.printf("Katas.rotateLeft(%s)", ints);
        kata.rotateLeft(ints);
        System.out.printf(" -> %s\n", ints);

        ints.clear();
        ints.addAll(Arrays.asList(21,22,23));
        System.out.printf("Katas.rotateLeft(%s)", ints);
        kata.rotateLeft(ints);
        System.out.printf(" -> %s\n", ints);
        System.out.println();

        //Examples of Reverse 3
        System.out.printf("Katas.reverse(%s)", ints);
        kata.reverse(ints);
        System.out.printf(" --> %s\n", ints);
    }
}
