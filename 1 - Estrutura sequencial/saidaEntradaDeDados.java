import java.util.Scanner;

public class saidaEntradaDeDados {
    public static void main(String[] args) {
        //saída de dados string
        System.out.println("hello world");
        //Saída de dados variável
        int a = 20;
        System.out.println(a);
        //para limmitar números após a virgula use "%.2f%n"
        //para unir variáveis e strings se usa +
        System.out.println("eu tenho " + a + " anos");

        //Entrada de dados string
        String x;
        Scanner sc = new Scanner(System.in);
        x = sc.next();


        System.out.println(x);

        //Entrada de dados int
        int z;
        z = sc.nextInt();
        System.out.println(z);

        sc.close();
    }
}
