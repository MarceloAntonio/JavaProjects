import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        compacto comp = new compacto();
        Scanner sc = new Scanner(System.in);

        comp.menu();


        int inputValue = sc.nextInt();


        comp.switchEscolhedor(inputValue);


    }

}














