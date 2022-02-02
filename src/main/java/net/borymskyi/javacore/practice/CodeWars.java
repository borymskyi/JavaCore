/*
public class Kata {
  public static boolean solution(String str, String ending) {
    return false;
  }
}
// Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).
//solution('abc', 'bc') // returns true
//solution('abc', 'd') // returns false
 */
package main.java.net.borymskyi.javacore.practice;

public class CodeWars {
    public static boolean solution(String str, String ending) {
        if (str.endsWith(ending)) {
            return true;
        }
        else {
            return false;
        }
    }


    public static void main(String[] args) {
        String str0 = "hello";
        String str1 = "lo";
        System.out.println(solution(str0, str1));
    }
}
