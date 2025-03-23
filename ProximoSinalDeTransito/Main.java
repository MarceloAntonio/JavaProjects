import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        secundario sec = new secundario();

        System.out.println("1 - sinal vermelho");
        System.out.println("2 - sinal verde");
        System.out.println("3 - sinal amarelo");

        int numero = sc.nextInt();

        sec.switchh(numero);

    }
}
