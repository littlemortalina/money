public class Main {
    public static void main(String[] args) {
        // Назначение переменных для хранения стоимости билета
        int startBalance = 100; // сумма начального баланса
        int replenishment = 1000; // сумма пополнения
        int bonus = 0; // количество бонусных рублей
        int finalBalance = startBalance + replenishment + bonus; // итоговый баланс

        // Расчёт бонусов
        if(replenishment >= 1000) {
            bonus = replenishment/100;
        }

        // Вывод результатов
        System.out.println ("Бонус равен " + bonus + " руб."); // вывод количества бонусов
        System.out.println("Баланс равен " + finalBalance + " руб."); // вывод баланса
    }
}