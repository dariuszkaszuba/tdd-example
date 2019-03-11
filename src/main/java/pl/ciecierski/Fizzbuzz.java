package pl.ciecierski;

public class Fizzbuzz {

  public static String fizzbuzz(int i) {

    if (i % 3 == 0 && i % 5 == 0) {
      return "fizzbuzz";
    }
    if (i % 3 == 0) {
      return "fizz";
    }
    if (i % 5 == 0) {
      return "buzz";
    }

    return String.valueOf(i);
  }
}
