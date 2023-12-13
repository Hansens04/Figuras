package FigurasAbsctracto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Ingresar punto");
            System.out.println("2. Ingresar círculo");
            System.out.println("3. Ingresar triángulo");
            System.out.println("4. Ingresar rectángulo");
            System.out.println("5. Imprimir los datos del arreglo (toString())");
            System.out.println("6. Imprimir los cálculos de los elementos del arreglo");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea después de leer el entero

            switch (opcion) {
                case 1:
                    ingresarPunto(figuras);
                    break;
                case 2:
                    ingresarCirculo(figuras);
                    break;
                case 3:
                    ingresarTriangulo(figuras);
                    break;
                case 4:
                    ingresarRectangulo(figuras);
                    break;
                case 5:
                    imprimirDatos(figuras);
                    break;
                case 6:
                    imprimirCalculos(figuras);
                    break;
                default:
                    System.out.println("Opción no válida. Saliendo del programa.");
                    System.exit(0);
            }
        }
    }

    private static void ingresarPunto(ArrayList<Figura> figuras) {
        Punto2D punto = new Punto2D();
        punto.leerDatos();
        figuras.add(punto);
    }

    private static void ingresarCirculo(ArrayList<Figura> figuras) {
        Circulo circulo = new Circulo();
        circulo.leerDatos();
        figuras.add(circulo);
    }

    private static void ingresarTriangulo(ArrayList<Figura> figuras) {
        Triangulo triangulo = new Triangulo();
        triangulo.leerDatos();
        figuras.add(triangulo);
    }

    private static void ingresarRectangulo(ArrayList<Figura> figuras) {
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.leerDatos();
        figuras.add(rectangulo);
    }

    private static void imprimirDatos(ArrayList<Figura> figuras) {
        for (Figura figura : figuras) {
            System.out.println(figura.imprimirDatos());
        }
    }

    private static void imprimirCalculos(ArrayList<Figura> figuras) {
        for (Figura figura : figuras) {
            System.out.println("Tipo de figura: " + figura.getTipo());
            System.out.println("Área: " + figura.calcularArea());
            System.out.println("Perímetro: " + figura.calcularPerimetro());
            System.out.println();
        }
    }
}
