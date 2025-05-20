import java.util.Scanner;

public class FórmulaDeBhaskara {
    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double delta;
        double bhaskara1;
        double bhaskara2;


        Scanner sc = new Scanner(System.in);
        System.out.println("insira o valor de a");
        a = sc.nextDouble();
        System.out.println("insira o valor de b");
        b = sc.nextDouble();
        System.out.println("insira o valor de c");
        c = sc.nextDouble();
        delta = (Math.pow(b, 2) - 4 * a * c);
        bhaskara1 = (-b + Math.sqrt(delta)) / (2 * a);
        bhaskara2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.println(bhaskara1);
        System.out.println(bhaskara2);
        sc.close();
    }
}
