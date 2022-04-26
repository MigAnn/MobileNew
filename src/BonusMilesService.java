public class BonusMilesService {
    public int calculate(int score, int refill) {
        int sum = score + refill;
        int bonus = refill / 100;
        int change = bonus + sum;
        if (refill < 1000) {
            System.out.println("Ваш счёт пополнен на : " + sum);
        } else {
            System.out.println("Ваш счёт пополнен на : " + change);
        }
        return change;
    }
}
