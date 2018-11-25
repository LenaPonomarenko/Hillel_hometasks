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
        countCharacters(myInitials,'*');
        countCharacters(myInitials,' ');
    }

    public static void countCharacters(String str, char symbol) {
        int countSymbol = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == symbol) {
                countSymbol += 1;
            }
        }
        System.out.printf("Number of '%c': %d"+"\n",symbol,countSymbol);
    }
}


