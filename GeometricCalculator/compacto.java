import java.util.Scanner;

public class compacto {
    Calculos calculo = new Calculos();
    Scanner sc = new Scanner(System.in);


//##################################################################//
//      Menu


    int menu() {

        System.out.println("1 - Retangulo");
        System.out.println("2 - Triangulo");
        System.out.println("3 - Circulo");
        System.out.println("4 - Sair");

        return 0;
    }

//##################################################################//
//      Switch


    int switchEscolhedor(int a) {


        switch (a) {
            case 1:
                calculo.areaPerimetroRetangulo();
                break;
            case 2:
                calculo.areaPerimetroTriangulo();
                break;
            case 3:
                calculo.areaPerimetroCirculo();

                break;
            default:
                System.out.println("erro");
        }
        return 0;
    }

    //##################################################################//

}
