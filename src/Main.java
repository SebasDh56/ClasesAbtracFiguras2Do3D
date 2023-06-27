import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int poa;
        do {
            System.out.println("Elige una opción:");
            System.out.println("1. Calcular área y perímetro de un cuadrado");
            System.out.println("2. Calcular área y perímetro de un círculo");
            System.out.println("3. Calcular área y perímetro de un triángulo");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Cuadrado cuadrado = new Cuadrado();
                    System.out.println("Ingrese los puntos del cuadrado:");

                    for (int i = 0; i < 2; i++) {
                        cuadrado.ingresarPuntos();
                    }

                    System.out.println("1. Calcular perímetro");
                    System.out.println("2. Calcular área");
                    poa = scanner.nextInt();
                    switch (poa) {
                        case 1:
                            System.out.println("El perímetro del cuadrado es: " + cuadrado.calcularPerimetro());
                            break;
                        case 2:
                            System.out.println("El área del cuadrado es: " + cuadrado.calcularArea());
                            break;
                    }
                    break;

                case 2:
                    Circulo circulo = new Circulo();
                    System.out.println("Ingrese el punto centro del círculo:");
                    System.out.print("x: ");
                    circulo.centro.setX(scanner.nextDouble());
                    System.out.print("y: ");
                    circulo.centro.setY(scanner.nextDouble());
                    System.out.print("z: ");
                    circulo.centro.setZ(scanner.nextDouble());

                    System.out.println("Ingrese el radio del círculo:");
                    circulo.radio = scanner.nextDouble();

                    System.out.println("1. Calcular perímetro");
                    System.out.println("2. Calcular áraea");
                    poa = scanner.nextInt();
                    switch (poa) {
                        case 1:
                            System.out.println("El perímetro del círculo es: " + circulo.calcularPerimetro());
                            break;
                        case 2:
                            System.out.println("El área del círculo es: " + circulo.calcularArea());
                            break;
                    }
                    break;

                case 3:
                    Triangulo triangulo = new Triangulo();
                    System.out.println("Ingrese los puntos del triángulo:");

                    for (int i = 0; i < 3; i++) {
                        triangulo.ingresarPuntos();
                    }

                    System.out.println("1. Calcular perímetro");
                    System.out.println("2. Calcular área");
                    poa = scanner.nextInt();
                    switch (poa) {
                        case 1:
                            System.out.println("El perímetro del triángulo es: " + triangulo.calcularPerimetro());
                            break;
                        case 2:
                            System.out.println("El área del triángulo es: " + triangulo.calcularArea());
                            break;
                    }
                    break;

                case 0:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, elija nuevamente.");
            }

        } while (opcion != 0);
    }
}