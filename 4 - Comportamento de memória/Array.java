import java.util.Scanner;
import java.util.Locale; // necessário para usar Locale

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // força ponto como separador decimal

        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }

        for (double m : vect) {
            System.out.println(m);
        }

        sc.close();
    }
}