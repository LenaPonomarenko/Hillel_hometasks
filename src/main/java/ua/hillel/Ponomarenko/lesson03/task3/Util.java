package ua.hillel.Ponomarenko.lesson03.task3;

public class Util {
    public static void checkPalindrome(String str) {
        String strWithoutSpaces = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                strWithoutSpaces += str.charAt(i);
            }
        }
        String reversedString = new StringBuffer(strWithoutSpaces).reverse().toString();
        String sub1 = strWithoutSpaces.substring(0, strWithoutSpaces.length() / 2);
        String sub2 = reversedString.substring(0, reversedString.length() / 2);
        if (sub1.equalsIgnoreCase(sub2)) {
            System.out.println("This string is palindrome");
        } else {
            System.out.println("This string is not palindrome");
        }

    }
}
