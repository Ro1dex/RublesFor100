public class Main {
    public static void main(String[] args) {
        int cash = 100;
        int addCash = 100;
        int bonus;
        if (addCash > 1000) {
            bonus = addCash / 100;
        }
        else {
            bonus = 0;
        }
        int balance = cash + addCash;

        System.out.println("Вас счет составляет: " + balance + " рублей." + " Бонусных рублей начислено: " + bonus);
    }
}