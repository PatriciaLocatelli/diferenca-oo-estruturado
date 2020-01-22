package oo;

import java.util.Locale;
import java.util.Scanner;

public class SolucaoOO {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo();

        System.out.println("Entre os dados do Triângulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Entre os dados do Triângulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();


        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.3f%n", areaX);
        System.out.printf("Triangle Y area: %.3f%n", areaY);

        if(areaX > areaY){
            System.out.println("Maior area: x");
        }
        else{
            System.out.println("Maior area: y");
        }
        sc.close();


    }
}
