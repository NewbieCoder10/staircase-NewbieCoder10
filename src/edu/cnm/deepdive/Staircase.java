package edu.cnm.deepdive;

import java.util.ArrayList;
import java.util.List;

/**
 * This class contains stubs of the {@link #buildLinearStaircase(int)} and
 * {@link #buildFibonacciStaircase(int)} methods. Implementation of these
 * methods is included in the practical exam problems of the Deep Dive Coding
 * Java + Android Bootcamp.
 *
 * @author Nicholas Bennett, Deep Dive Coding
 */
public class Staircase {

  private Staircase() {
    // NOTE: There is NO need to do anything with this constructor! The methods
    //       you will implement in this class are static; thus, there is no need
    //       to create instances of this class.
  }

  /* BASIC PROBLEM */

  /**
   * Constructs and returns an array of strings, where the first element is the top step of the
   * staircase, containing a single asterisk (*), right-aligned (that is, padded on the left with
   * spaces, as necessary), and each successive element is a string containing one more asterisk
   * than the previous. The final string in the array should have <code>height</code> asterisk
   * characters, without any leading spaces.
   *
   * @param height staircase height (number of steps).
   * @return array of length <code>height</code>.
   */
  public static String[] buildLinearStaircase(int height) {
    StringBuilder stringBuilder = new StringBuilder();
    List<String> ladder = new ArrayList<>();

    for (int i = 1; i < height; i++) {
      String str = "";

      for (int j = 0; j < height - i; j++) {
        str += " ";
      }
      for (int k = 0; k < i; k++) {
        str += "*";
      }
    }
    return null; // TODO Replace this line with implementation.
  }

  /* EXTRA CREDIT PROBLEM */

  /**
   * Constructs and returns an array of strings, where the first element is the top step of the
   * staircase, containing a single asterisk (*), right-aligned (that is, padded on the left with
   * spaces, as necessary); the second element also has a single asterisk, right-aligned
   * (left-padded); each successive element is a string containing a number of asterisks equal to
   * the sum of the number of asterisks in the previous 2 elements. For example, the 3<sup>rd</sup>
   * element will have 1 + 1 = 2 asterisks; the 4<sup>th</sup> will have 2 + 1 = 3 asterisks; etc.
   * The last element of the array should contain nothing but asterisks.
   *
   * @param height staircase height (number of steps).
   * @return array of length <code>height</code>.
   */
  public static String[] buildFibonacciStaircase(int height) {
    for (String s : staircase(height: 10)) {
      System.out.println(s);
    }
    return null; // TODO Replace this line with implementation for extra credit.
  }

  private static void staircase(int height) {
  }
}
