public class Main {
    public static void main(String[] args) {
        int wallet = 300;
        int amount = 1100;
        int bonus;
        if (amount < 1000) {
            bonus = 0;
        } else {
            bonus = amount / 100;
        }
        System.out.println(bonus);
    }
}