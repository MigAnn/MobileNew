public class Main {
    public static void main(String[] args) {
        int score = 120;
        int refill = 1500;
        BonusMilesService bonus = new BonusMilesService();
        int bonus1 = bonus.calculate(120, 1500);
        System.out.println("OP: 1635, ФР:" + bonus1);
    }
}
