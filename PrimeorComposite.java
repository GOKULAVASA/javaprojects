package javaMock;

public class PrimeorComposite {

    public static void main(String[] args) {
        int num = 737;

        if (num <= 1) {
            System.out.println("not a prime");
        } else {
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    System.out.println("not a prime");
                    return;
                    
                    // Return if a factor is foundx
                }
            }

            System.out.println("prime");
        }
    }
}
