
/**
 * Created by win808mac on 8/14/16.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class Kata {

/**First Last Six - Given an ArrayList of ints, return true if 6
 *appears as either the first or last element in the ArrayList.
 *The ArrayList will be length 1 or more.*/

    public static boolean firstLastSix(ArrayList<Integer> nums) {
        if (nums.get(0).equals(6) || (nums.get(nums.size() - 1).equals(6))) {
            return true;
        } else {
            return false;
        }

    }

/**Same First Last - Given an ArrayList of Integers, return true if the ArrayList
 *is length 1 or more, and the first element and the last element are equal.*/

    public static boolean sameFirstLast(ArrayList<Integer> num) {
        return (num.size() >= 1 && num.get(0) == num.get(num.size() - 1));

    }

/**Rotate Left 3 - Given an ArrayList of Integers length 3,
 *return an ArrayList with the elements "rotated left"
 *so [1, 2, 3] yields [2, 3, 1].*/

    public static ArrayList<Integer> rotateLeft(ArrayList<Integer> num) {
        Collections.rotate(num, num.size() - 2);
        return num;

    }

 /**Reverse 3 - Given an ArrayList of Integers length 3, return a new ArrayList
  *with the elements in reverse order, so [1, 2, 3] becomes [3, 2, 1].*/

    public static ArrayList<Integer> reverse3(ArrayList<Integer> num) {
        if (num.size() > 1) {
            Integer value = num.remove(0);
            reverse3(num);
            num.add(value);
        }
        return num;
    }

/**Sum First Penultimate - Given an ArrayList of Integers of at least length 2,
 *return the sum of the first elements in the ArrayList and the second from last element.
 *If the ArrayList length is less than 2, just sum up the elements that exist,
 *returning 0 if the array is length 0.*/

    public static int sumFirstPenultimate(ArrayList<Integer> num) {
        if (num.size() == 0) {
            return 0;
        } else if (num.size() == 1) {
            return num.get(0);
        } else {
            return num.get(0) + num.get(num.size() - 2);
        }
    }

/**Map Bully
 *Modify and return the given HashMap as follows: if the key "a" has a value,
 *set the key "b" to have that value, and set the key "a" to have the value "".
 *Basically "b" is a bully, taking the value of "a".    */

    public static HashMap<String, String> mapBully(HashMap<String, String> data) {
        if (data.containsKey("a")) {
            data.put("b", data.get("a"));
            data.put("a", "");
        }
        return data;

    }

/**Map Share - Modify and return the given HashMap as follows:
 *if the key "a" has a value, set the key "b" to have that same value.
 *In all cases remove the key "c", leaving the rest of the map unchanged.*/

    public static HashMap<String, String> mapShare(HashMap<String, String> data) {
        if (data.containsKey("a")) {
            data.put("b", data.get("a"));
        }
        data.remove("c");
        return data;
    }

/**Map AB - Modify and return the given HashMap as follows: for this problem the
 *HashMap may or may not contain the "a" and "b" keys. If both keys are present,
 *append their 2 string values together and store the result under the key "ab" */

    public static HashMap<String, String> mapAB(HashMap<String, String> data) {
        if(data.containsKey("a") && data.containsKey("b")) {
            String a = data.get("a");
            String b = data.get("b");
           data.put("AB",a + b);
        }
        return data;
    }

/**Word Length - Given an ArrayList of strings, return a HashMap containing a
 *key for every different string in the ArrayList, and the value is that string's length.*/

    public static HashMap<String, Integer> wordLength(ArrayList<String> data) {
        HashMap<String, Integer> deDuped = new HashMap<>();

        for(String item : data){
            if(!deDuped.containsKey(item)){
                deDuped.put(item, item.length());
            }

        }
        return deDuped;
    }

/** Index Words - Given an ArrayList of words, return a HashMap> containing a keys
 *for every word's first letter. The value for the key will be an ArrayList of all words
 *in the list that start with that letter. An empty string has no first
 *letter so don't add a key for it. */

    public static HashMap<Character, ArrayList<String>> indexWords(ArrayList<String> data) {

        HashMap<Character, ArrayList<String>> newMap = new HashMap<>();

        for(String item : data){
            if (item.length() != 0) {
                char firstLetter = item.charAt(0);


                if (!newMap.containsKey(firstLetter)) {
                    newMap.put(firstLetter, new ArrayList<>());
                }
                ArrayList<String> itemList = newMap.get(firstLetter);
                itemList.add(item);
            }
        }
        return newMap;

    }

}