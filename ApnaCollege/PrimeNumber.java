public class PrimeNumber {

    public static void main(String[] args) {

        PrimeNumber p = new PrimeNumber();
        p.prime(12);
    }

    void prime(int n) {
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                System.out.println("Prime Number");
                break;
            }
            System.out.println("Not a prime Number");
        }

    }

}
