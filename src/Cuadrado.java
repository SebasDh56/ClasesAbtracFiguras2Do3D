import java.util.Scanner;

public class Cuadrado extends Figura {
    @Override
    public double calcularPerimetro() {
        double lado = calcularDistancia(0, 1);
        return lado * 4;
    }

    @Override
    public double calcularArea() {
        double lado = calcularDistancia(0, 1);
        return Math.pow(lado, 2);
    }

    @Override
    public void ingresarPuntos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las coordenadas de los 2 puntos del cuadrado:");

        for (int i = 0; i < 2; i++) {
            System.out.println("Punto " + (i + 1) + ":");
            System.out.print("x: ");
            double x = sc.nextDouble();
            System.out.print("y: ");
            double y = sc.nextDouble();
            System.out.print("z: ");
            double z = sc.nextDouble();

            Punto punto = new Punto(x, y, z);
            listaPuntos.add(punto);
        }
    }
}