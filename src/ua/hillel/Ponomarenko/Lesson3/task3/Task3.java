package ua.hillel.Ponomarenko.Lesson3.task3;

/*Реализавать в ItelliJ IDEA. Создать две ветки репозитория. В одной реализовать метод проверки является ли строка
палидромом.запаковать все в jar файл. Во ворой ветке "пристыковать" полученный в первой ветке jar файл и вызвать метод
и вывестирезультат. "Смёржить" эти две ветки.*/
public class Task3 {
    public static void main(String[] args) {
        checkPalindrome("А роза упала на лапу Азора");
    }

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
