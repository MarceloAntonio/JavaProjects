import java.util.Scanner;

public class Calculos {
    Scanner sc = new Scanner(System.in);

//##################################################################//
    //Retangulo


    public void areaPerimetroRetangulo() {

        System.out.println("qual a medida de tamanho usada:");
        String medida = sc.next();


        System.out.println("digite a altura do retangulo");
        double altura = sc.nextDouble();


        System.out.println("digite a base do retangulo");
        double base = sc.nextDouble();
        sc.close();


        double area = altura * base;
        double perimetro = 2 * (altura + base);

        System.out.println("A área do retangulo é de: " + area + medida);
        System.out.println("O perimetro do seu retangulo é de: " + perimetro + medida);
    }


//##################################################################//
    //Triangulo

    public void areaPerimetroTriangulo() {
        System.out.println("qual a medida de tamanho usada:");
        String medida = sc.next();


        System.out.println("digite a altura do triângulo: ");
        double altura = sc.nextDouble();


        System.out.println("digte a base do triângulo");
        double base = sc.nextDouble();


        double area = altura * base / 2;
        double perimetro;


        System.out.println("os dois lados do triangulos são iguais?");
        System.out.println("S/N");
        String resposta = sc.next();


        switch (resposta) {
            case "S", "s":
                System.out.println("qual é o tamanho dos lados?");
                double lados = sc.nextDouble();


                perimetro = lados + lados + base;


                System.out.println("o perimetro do triangulo é de: " + perimetro + medida);
                System.out.println("a area do triangulo é de: " + area + medida);
                sc.close();
                break;


            case "N", "n":
                System.out.println("diga o tamanho do lado direto");
                double ladoDireto = sc.nextDouble();


                System.out.println("diga o tamanho do lado esquerdo");
                double ladoEsquerdo = sc.nextDouble();


                perimetro = ladoDireto + ladoEsquerdo + base;
                System.out.println("o perimetro do triangulo é de: " + perimetro + medida);
                System.out.println("a area do triangulo é de: " + area + medida);
                sc.close();
                break;


            default:
                System.out.println("houve um erro");
                areaPerimetroTriangulo();
                break;
        }
    }

//##################################################################//
    //Circulo

    public void areaPerimetroCirculo() {
        System.out.println("qual a medida de tamanho usada:");
        String medida = sc.next();


        System.out.println("qual o Raio do circulo");
        double raio = sc.nextDouble();
        double pi = Math.PI;

        double area = pi * (Math.pow(raio,2));
        double perimetro = 2 * pi * raio;
        System.out.println("o perimetro do circulo é de: " + perimetro + medida);
        System.out.println("a área do circulo é de: " + area + medida + "²");


    }


}




