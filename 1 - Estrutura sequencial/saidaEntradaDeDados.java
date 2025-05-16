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

//        Entrada de dados string de linha única
//        String b;
//        Scanner sc = new Scanner(System.in);
//        b = sc.next(); o Sc.next lê apenas uma palavra
//        System.out.println(b);

        //Entrada de dados int
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade");
        c = sc.nextInt();
        sc.nextLine();
        System.out.println("sua idade é " + c + " anos");


        //sc.nextLine(); lê mais de uma palavra,
        // permitindo espaços e números mas lendo tudo como strings
        String d;
        d = sc.nextLine();
        System.out.println(d);
        sc.close();
    }
}
