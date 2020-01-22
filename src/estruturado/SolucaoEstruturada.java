package estruturado;

import java.util.Locale;
import java.util.Scanner;

public class SolucaoEstruturada {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Entre os dados do Triângulo X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Entre os dados do Triângulo Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) /2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) /2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

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
