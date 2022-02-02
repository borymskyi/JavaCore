/*
    Напишите функцию findNeedle(), которая принимает array полный мусора, но содержит одну "needle".

    После того, как ваша функция найдет иглу, она должна вернуть сообщение (в виде строки), в котором говорится:
    "found the needle at position " плюс index он нашел иглу, так что:
    findNeedle(new Object[] {"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"})
    should return: "found the needle at position 5"
 */
package main.java.net.borymskyi.javacore.codewars.kyu8;

public class CodeWars1 {

    public static String findNeedle(Object[] trash){
        String result = "not found";
        for (int i = 0; i < trash.length; i++) {
            if (trash[i] == "needle") {
                result = "found the needle at position " + i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findNeedle(new Object[] {"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"}));
    }
}
