public class Main {
    public static void main(String[] args) {
        // Назначение переменных для хранения стоимости билета
        int startBalance = 100; // сумма начального баланса
        int replenishment = 1100; // сумма пополнения
        int bonus = 0; // количество бонусных рублей


        // Условия получения бонусов
        if (replenishment >= 1000) {
            bonus = replenishment / 100;
        }

        // Расчёт бонусов
        int finalBalance = startBalance + replenishment + bonus;

        // Вывод результатов
        System.out.println("Бонус равен " + bonus + " руб."); // вывод количества бонусов
        System.out.println("Баланс равен " + finalBalance + " руб."); // вывод баланса
    }
}