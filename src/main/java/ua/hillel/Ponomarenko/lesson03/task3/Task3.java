package ua.hillel.Ponomarenko.lesson03.task3;

public class Task3 {
    public static void main(String[] args) {
        callCheckPalindrome("А роза упала на лапу Азора");
        callCheckPalindrome("А роза упала на лапу");
    }

    public static void callCheckPalindrome(String palindrome) {
        Util.checkPalindrome(palindrome);
    }
}
