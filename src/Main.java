public class Main {
    public static void main(String[] args) {
        int wallet = 300;
        int summa = 1100;
        int bonus;
        if (summa < 1000) {
            bonus = 0;
        } else {
            bonus = summa / 100;
        }
        System.out.println(bonus);
    }
    }