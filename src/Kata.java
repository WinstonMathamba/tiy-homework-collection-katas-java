
/**
 * Created by win808mac on 8/14/16.
 */
import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Collections;


public class Kata {

//First Last Six - Given an ArrayList of ints, return true if 6
//appears as either the first or last element in the ArrayList.
//The ArrayList will be length 1 or more.

    public boolean firstLastSix(ArrayList<Integer> nums) {
      if (nums.get(0).equals(6) || (nums.get(nums.size() - 1).equals(6))) {
          return true;
      }
      else {
          return false;
      }

    }
//Same First Last - Given an ArrayList of Integers, return true if the ArrayList
//is length 1 or more, and the first element and the last element are equal.

    public boolean sameFirstLast(ArrayList<Integer> num) {
        return (num.size() >= 1 && num.get(0) == num.get(num.size()-1));

    }

//Rotate Left 3 - Given an ArrayList of Integers length 3,
//return an ArrayList with the elements "rotated left"
// so [1, 2, 3] yields [2, 3, 1].

    public void rotateLeft(ArrayList<Integer> num) {
        Collections.rotate(num, num.size() - 2);

    }

//Reverse 3 - Given an ArrayList of Integers length 3, return a new ArrayList
//with the elements in reverse order, so [1, 2, 3] becomes [3, 2, 1].

    public void reverse(ArrayList<Integer> num) {
        ArrayUtil.
}
