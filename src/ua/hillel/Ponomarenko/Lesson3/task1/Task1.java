package ua.hillel.Ponomarenko.Lesson3.task1;

/*Написать метод считающий сколько в строке встречается определеный символ.
        Посчитать в ваших инициалах из первой задачи сколько пробелов и звездочек.*/
public class Task1 {
    public static void main(String[] args) {
        String myInitials = "********  ******" + "\n" +
                "********  *******" + "\n" +
                "**        **    **" + "\n" +
                "**        **    **" + "\n" +
                "******    *******" + "\n" +
                "******    ******" + "\n" +
                "**        **" + "\n" +
                "**        **" + "\n" +
                "********  **" + "\n" +
                "********  **";
        countCharacters(myInitials);
    }

    public static void countCharacters(String str) {
        int countAsterisk = 0;
        int countSpase = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                countAsterisk += 1;
            }
            if (str.charAt(i) == ' ') {
                countSpase += 1;
            }
        }
        System.out.println("Number of *: " + countAsterisk);
        System.out.println("Number of spaces: " + countSpase);
    }
}


