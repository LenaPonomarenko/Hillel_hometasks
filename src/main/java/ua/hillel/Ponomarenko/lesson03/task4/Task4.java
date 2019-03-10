package ua.hillel.Ponomarenko.lesson03.task4;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*Реализовать программу собственного пенсионного накопления.
Изначально вы вклываете некоторую сумму в банк и каждый месяц пополняете данную сумму на фиксированую сумму.
Посчитать сколько будет ваш депозит на момент выхода на пенсию. Банк считает проценты по месяцам исходя из процентной
ставки в год. к примеру ставка 18% годовых. доход за месяц если вклад был 1000грн = 1000*18%/12.
Дополнительно по желанию можно посчитать если вклаываемая сумма будет расти каждый месяц и процентная ставка
уменьшаться каждый год.*/
public class Task4 {
    public static void main(String[] args) {
        countRetirementSavingsAmount(new BigDecimal(100), 1000, 15, 5);
    }

    public static void countRetirementSavingsAmount(BigDecimal investment, int monthInvestment, int percent, int monthBeforeRetire) {
        BigDecimal initialInvestment = investment.add(investment.multiply(new BigDecimal(percent)).divide(new BigDecimal("1200")));
        System.out.println(initialInvestment);
        System.out.println();
        investment = initialInvestment;
        for (int i = 1; i < monthBeforeRetire; i++) {
            monthInvestment+=10;
            investment = investment.add(new BigDecimal(monthInvestment));
            investment = investment.add(investment.multiply(new BigDecimal(percent)).divide(new BigDecimal("1200"))) ;
            System.out.println(investment);
            if ((i+1) % 12 == 0) {
                percent--;
            }
        }
        System.out.println(investment.setScale(2,RoundingMode.HALF_UP));
    }
}
