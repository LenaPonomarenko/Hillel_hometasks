package ua.hillel.Ponomarenko.Lesson3.task4;

/*Реализовать программу собственного пенсионного накопления.
Изначально вы вклываете некоторую сумму в банк и каждый месяц пополняете данную сумму на фиксированую сумму.
Посчитать сколько будет ваш депозит на момент выхода на пенсию. Банк считает проценты по месяцам исходя из процентной
ставки в год. к примеру ставка 18% годовых. доход за месяц если вклад был 1000грн = 1000*18%/12.
Дополнительно по желанию можно посчитать если вклаываемая сумма будет расти каждый месяц и процентная ставка
уменьшаться каждый год.*/
public class Task4 {
    public static void main(String[] args) {
        countRetirementSavingsAmount(100.0, 1000, 15, 12);
    }

    public static void countRetirementSavingsAmount(double investment, int monthInvestment, int percent, int monthBeforeRetire) {
        double initialInvestment = investment * percent / 12 / 100 + investment;
        investment = initialInvestment;
        for (int i = 1; i < monthBeforeRetire; i++) {
            monthInvestment+=10;
            investment += (double) monthInvestment;
            investment += investment * percent / 12 / 100;
            if ((i+1) % 12 == 0) {
                percent--;
            }
        }
        System.out.println(investment);
    }
}
