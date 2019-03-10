package ua.hillel.Ponomarenko.lesson04.task04;

/*дан массив 8*8 запоненный нулями и единицами который отображает шахматную доску.
0 - клетка пуста
1 - клетка заполнена турой. (тура бьет по вертикали и горизонтали)
проверить что все фигуры не бьют одна другую.*/
public class Task04 {
    public static void main(String[] args) {
        //true - figures don't beat each other
        //false - figures beat each other
        int arr1[][] = {{0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0}};
        int arr2[][] = {{0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 0, 0}};
        System.out.println(checkIfTheFiguresBeatEachOther(arr1));
        System.out.println(checkIfTheFiguresBeatEachOther(arr2));
    }

    public static boolean checkIfTheFiguresBeatEachOther(int array[][]) {
        boolean check = true;
        int count = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                count += array[i][j];
            }
            if (count > 1) {
                return false;
            }
            count = 0;
            for (int j = 0; j < 8; j++) {
                count += array[j][i];
            }
            if (count > 1) {
                return false;
            }
            count = 0;
        }
        return true;
    }
}
