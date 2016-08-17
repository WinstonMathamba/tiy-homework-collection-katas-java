/**
 * Created by win808mac on 8/14/16.
 */

import com.sun.tools.hat.internal.util.ArraySorter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> ints = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();


        ints.add(1);
        ints.add(2);
        ints.add(6);

        boolean result = Kata.firstLastSix(ints);
        System.out.printf("Kata.firstLastSix(%s) -> %s\n", ints, result);

        ints.add(0, 6);
        ints.add(3, 3);
        ints.remove(4);
        System.out.printf("Kata.firstLastSix(%s) -> %s\n", ints, result);

        ints.add(0, 13);
        System.out.printf("Kata.firstLastSix(%s) -> %s\n", ints, result);

        ints.add(5, 6);
        System.out.printf("Kata.firstLastSix(%s) -> %s\n", ints, result);


        ints.remove(0);
        ints.remove(1);
        ints.remove(ints.size() - 1);
        System.out.printf("Kata.firstLastSix(%s) -> %s\n", ints, result);

        ints.remove(0);
        System.out.printf("Kata.firstLastSix(%s) -> %s\n", ints, result);
        System.out.println();

//example of Same First Last

        ints.add(0, 1);
        result = Kata.sameFirstLast(ints);
        System.out.printf("Kata.sameFirstLast(%s) -> %s\n", ints, result);

        ints.add(1);
        result = Kata.sameFirstLast(ints);
        System.out.printf("Kata.sameFirstLast(%s) -> %s\n", ints, result);

        ints.remove(2);
        result = Kata.sameFirstLast(ints);
        System.out.printf("Kata.sameFirstLast(%s) -> %s\n", ints, result);

        ints.add(0, 4);
        result = Kata.sameFirstLast(ints);
        System.out.printf("Kata.sameFirstLast(%s) -> %s\n", ints, result);

        ints.remove(3);
        result = Kata.sameFirstLast(ints);
        System.out.printf("Kata.sameFirstLast(%s) -> %s\n", ints, result);

        ints.add(4);
        result = Kata.sameFirstLast(ints);
        System.out.printf("Kata.sameFirstLast(%s) -> %s\n", ints, result);
        System.out.println();

//Example of Rotate Left
        ints.clear();
        ints.addAll(Arrays.asList(1, 2, 3));
        System.out.printf("Katas.rotateLeft(%s)", ints);
        Kata.rotateLeft(ints);
        System.out.printf(" -> %s\n", ints);

        ints.clear();
        ints.addAll(Arrays.asList(5, 11, 9));
        System.out.printf("Katas.rotateLeft(%s)", ints);
        Kata.rotateLeft(ints);
        System.out.printf(" -> %s\n", ints);

        ints.clear();
        ints.addAll(Arrays.asList(7, 0, 0));
        System.out.printf("Katas.rotateLeft(%s)", ints);
        Kata.rotateLeft(ints);
        System.out.printf(" -> %s\n", ints);

        ints.clear();
        ints.addAll(Arrays.asList(4, 2, 0));
        System.out.printf("Katas.rotateLeft(%s)", ints);
        Kata.rotateLeft(ints);
        System.out.printf(" -> %s\n", ints);

        ints.clear();
        ints.addAll(Arrays.asList(6, 7, 8));
        System.out.printf("Katas.rotateLeft(%s)", ints);
        Kata.rotateLeft(ints);
        System.out.printf(" -> %s\n", ints);

        ints.clear();
        ints.addAll(Arrays.asList(21, 22, 23));
        System.out.printf("Katas.rotateLeft(%s)", ints);
        Kata.rotateLeft(ints);
        System.out.printf(" -> %s\n", ints);
        System.out.println();

//Examples of Reverse 3
        ints.clear();
        ints.addAll(Arrays.asList(1, 2, 3));
        System.out.printf("Katas.reverse3(%s)", ints);
        Kata.reverse3(ints);
        System.out.printf(" --> %s\n", ints);

        ints.clear();
        ints.addAll(Arrays.asList(5, 11, 9));
        System.out.printf("Katas.reverse3(%s)", ints);
        Kata.reverse3(ints);
        System.out.printf(" --> %s\n", ints);

        ints.clear();
        ints.addAll(Arrays.asList(7, 0, 0));
        System.out.printf("Katas.reverse3(%s)", ints);
        Kata.reverse3(ints);
        System.out.printf(" --> %s\n", ints);

        ints.clear();
        ints.addAll(Arrays.asList(4, 8, 12));
        System.out.printf("Katas.reverse3(%s)", ints);
        Kata.reverse3(ints);
        System.out.printf(" --> %s\n", ints);

        ints.clear();
        ints.addAll(Arrays.asList(8, 16, 24));
        System.out.printf("Katas.reverse3(%s)", ints);
        Kata.reverse3(ints);
        System.out.printf(" --> %s\n", ints);
        System.out.println();

//Example of Sum First Penultimate
        ints.clear();
        ints.addAll(Arrays.asList(1, 2, 3));
        System.out.printf("Katas.sumFirstPenultimate%s", ints);
        System.out.printf(" --> %s\n", Kata.sumFirstPenultimate(ints));

        ints.clear();
        ints.addAll(Arrays.asList(1, 1));
        System.out.printf("Katas.sumFirstPenultimate%s", ints);
        System.out.printf(" --> %s\n", Kata.sumFirstPenultimate(ints));

        ints.clear();
        ints.addAll(Arrays.asList(1, 1, 1, 1));
        System.out.printf("Katas.sumFirstPenultimate%s", ints);
        System.out.printf(" --> %s\n", Kata.sumFirstPenultimate(ints));

        ints.clear();
        ints.addAll(Arrays.asList(1, 2, 3, 4));
        System.out.printf("Katas.sumFirstPenultimate%s", ints);
        System.out.printf(" --> %s\n", Kata.sumFirstPenultimate(ints));

        ints.clear();
        ints.addAll(Arrays.asList(5, 1, 3, 4));
        System.out.printf("Katas.sumFirstPenultimate%s", ints);
        System.out.printf(" --> %s\n", Kata.sumFirstPenultimate(ints));

        ints.clear();
        ints.addAll(Arrays.asList(10, 1, 5, 6));
        System.out.printf("Katas.sumFirstPenultimate%s", ints);
        System.out.printf(" --> %s\n", Kata.sumFirstPenultimate(ints));
        System.out.println();

//Example of mapBully

        map.put("a", "candy");
        map.put("b", "dirt");
        System.out.printf("Kata for Map Bully %s", map);
        System.out.printf(" --> %s\n ", Kata.mapBully(map));

        map.clear();
        map.put("a", "candy");
        map.put("b", "");
        System.out.printf("Kata for Map Bully %s", map);
        System.out.printf(" --> %s\n ", Kata.mapBully(map));

        map.clear();
        map.put("b", "carrot");
        map.put("c", "meh");
        map.put("a", "candy");
        System.out.printf("Kata for Map Bully %s ", map);
        System.out.printf(" --> %s\n", Kata.mapBully(map));

        map.clear();
        map.put("a", "lunch money");
        map.put("b", "crackers");
        map.put("c", "pb&j");
        System.out.printf("Kata for Map Bully %s ", map);
        System.out.printf(" --> %s\n", Kata.mapBully(map));

        map.clear();
        map.put("a", "homework");
        map.put("b", "lint");
        System.out.printf("Kata for Map Bully %s ", map);
        System.out.printf(" --> %s\n", Kata.mapBully(map));

        map.clear();
        map.put("a", "ball");
        map.put("a", "sneakers");
        map.put("c", "jacket");
        System.out.printf("Kata for Map Bully %s ", map);
        System.out.printf(" --> %s\n", Kata.mapBully(map));
        System.out.println();

//Examples of Map Share -
        map.clear();
        map.put("a", "aaa");
        map.put("b", "bbb");
        map.put("c", "ccc");
        System.out.printf("Kata for Map Share %s ", map);
        System.out.printf(" --> %s\n", Kata.mapShare(map));

        map.clear();
        map.put("b", "xyz");
        map.put("c", "ccc");
        System.out.printf("Kata for Map Share %s ", map);
        System.out.printf(" --> %s\n", Kata.mapShare(map));

        map.clear();
        map.put("d", "hi");
        map.put("c", "meh");
        map.put("a", "aaa");
        System.out.printf("Kata for Map Share %s ", map);
        System.out.printf(" --> %s\n", Kata.mapShare(map));

        map.clear();
        map.put("b", "lou");
        map.put("c", "dew");
        map.put("a", "poo");
        System.out.printf("Kata for Map Share %s ", map);
        System.out.printf(" --> %s\n", Kata.mapShare(map));

        map.clear();
        map.put("a", "choo");
        map.put("c", "seadoo");
        map.put("a", "threw");
        System.out.printf("Kata for Map Share %s ", map);
        System.out.printf(" --> %s\n", Kata.mapShare(map));

        map.clear();
        map.put("e", "cat");
        map.put("a", "dog");
        map.put("c", "fish");
        System.out.printf("Kata for Map Share %s ", map);
        System.out.printf(" --> %s\n", Kata.mapShare(map));
        System.out.println();

//Example of mapAB
        map.clear();
        map.put("a", "Hi");
        map.put("b", "there");
        System.out.printf("Kata for mapAB %s ", map);
        System.out.printf(" --> %s\n", Kata.mapAB(map));

        map.clear();
        map.put("a", "Hi");
        System.out.printf("Kata for mapAB %s ", map);
        System.out.printf(" --> %s\n", Kata.mapAB(map));

        map.clear();
        map.put("b", "there");
        System.out.printf("Kata for mapAB %s ", map);
        System.out.printf(" --> %s\n", Kata.mapAB(map));

        map.clear();
        map.put("a", "PB&");
        map.put("b", "Jelly");
        System.out.printf("Kata for mapAB %s ", map);
        System.out.printf(" --> %s\n", Kata.mapAB(map));

        map.clear();
        map.put("a","Beans");
        map.put("b","Rice");
        System.out.printf("Kata for mapAB %s ", map);
        System.out.printf(" --> %s\n", Kata.mapAB(map));

        map.clear();
        map.put("a","sweet");
        map.put("b","sour");
        System.out.printf("Kata for mapAB %s ", map);
        System.out.printf(" --> %s\n", Kata.mapAB(map));
        System.out.println();

//Example of Word Length
        ArrayList<String> letters = new ArrayList<>();
        letters.addAll(Arrays.asList("a", "bb", "a", "bb"));
        System.out.printf("Kata for Word Length %s ", letters);
        System.out.printf(" --> %s\n", Kata.wordLength(letters));

        letters.clear();
        letters.addAll(Arrays.asList("this", "and", "that", "and"));
        System.out.printf("Kata for Word Length %s ", letters);
        System.out.printf(" --> %s\n", Kata.wordLength(letters));

        letters.clear();
        letters.addAll(Arrays.asList("code", "code", "code", "bug"));
        System.out.printf("Kata for Word Length %s ", letters);
        System.out.printf(" --> %s\n", Kata.wordLength(letters));

        letters.clear();
        letters.addAll(Arrays.asList("fifth", "tri", "tri", "fifth","cheese"));
        System.out.printf("Kata for Word Length %s ", letters);
        System.out.printf(" --> %s\n", Kata.wordLength(letters));

        letters.clear();
        letters.addAll(Arrays.asList("free", "tiki", "tiki", "key"));
        System.out.printf("Kata for Word Length %s ", letters);
        System.out.printf(" --> %s\n", Kata.wordLength(letters));

        letters.clear();
        letters.addAll(Arrays.asList("sorely", "magnanimous", "magnanimous", "bee"));
        System.out.printf("Kata for Word Length %s ", letters);
        System.out.printf(" --> %s\n", Kata.wordLength(letters));
        System.out.println();

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("aardvark", "apple", "zamboni", "phone"));
        System.out.printf("Kata for Index Words %s ", words);
        System.out.printf(" --> %s\n", Kata.indexWords(words));


    }
}
