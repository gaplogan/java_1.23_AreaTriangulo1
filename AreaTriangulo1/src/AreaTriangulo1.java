import java.util.Scanner;

public class AreaTriangulo1 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        double b, h, area;
            
        System.out.print("Digite o valor da base: ");
        b = entrada.nextDouble();
        // Garante base positiva.
        b = Math.abs(b);

        System.out.print("Digite o valor da altura: ");
        h = entrada.nextDouble();
        // Garante altura positiva.
        h = Math.abs(h);

        // FÛrmula da ·rea do tri‚ngulo
        area = (b * h) / 2;

        System.out.println("\n¡rea do tri‚ngulo: " + area);

        entrada.close();
    }
}
