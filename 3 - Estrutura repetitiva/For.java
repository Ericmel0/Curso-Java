import java.util.Scanner;

public class For {
    public static void main(String[] args) {

        int senha;
        int teste;
        boolean acessoPermitido = false;
        Scanner sc = new Scanner(System.in);
        for (int tentativa = 3; tentativa >= 0; tentativa--) {

            System.out.println("insira  a senha");
            senha = sc.nextInt();
            if (senha == 123) {
                acessoPermitido = true;
                break;
            } else if (tentativa > 0) {
                System.out.println("senha incorreta " + tentativa + " Tentativas restantes");
            } else {
                break;
            }

        }
        if (acessoPermitido == true) {
            System.out.println("bem vindo");
        } else {
            System.out.println("limite de tentativas atingido");
        }
        sc.close();
    }

}
