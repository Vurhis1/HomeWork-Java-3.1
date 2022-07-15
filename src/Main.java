public class Main {
    public static void main(String[] args) {

        int ticket = 12203; // Цена Билета на самолет
        int bonus = 20; // количество потраченных рублей на 1 бонусную милю
        int percent = ticket / bonus;
        System.out.println("Вам начислено " + percent + " бонусов");
    }
}


