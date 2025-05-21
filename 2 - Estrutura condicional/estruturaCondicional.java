import java.util.Scanner;

public class estruturaCondicional {
    public static void main(String[] args) {
        int x = 4;
        if (x == 2) {
            System.out.println("bom dia");
        } else {
            System.out.println("boa noite");
        }

        int digito;
        int senha = 123;

        Scanner sc = new Scanner(System.in);
        System.out.println("digite a senha");
        digito = sc.nextInt();
        if (digito == senha) {
            System.out.println("bem vindo");
        } else {
            System.out.println("senha incorreta");
        }

//        operação cumulativa
//        a += b; a = a + b;
//        a -= b;
//        a *= b;
//        a /= b;
//        a %= b;

        System.out.print("Digite um número de 1 a 7: ");
        int numero = sc.nextInt();

        String dia = switch (numero) {
            case 1 -> "Domingo";
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            case 7 -> "Sábado";
            default -> "Número inválido";
        };

        System.out.println("Dia da semana: " + dia);
    }
}
