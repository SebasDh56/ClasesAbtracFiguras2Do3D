import java.util.Scanner;

public class Triangulo extends Figura {
    double l1, l2, l3;

    @Override
    public double calcularPerimetro() {
        l1 = calcularDistancia(0, 1);
        l2 = calcularDistancia(0, 2);
        l3 = calcularDistancia(1, 2);
        return l1 + l2 + l3;
    }

    @Override
    public double calcularArea() {
        double s = calcularPerimetro() / 2;
        double area = Math.sqrt(s * (s - l1) * (s - l2) * (s - l3));
        return area;
    }

    @Override
    public void ingresarPuntos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las coordenadas de los puntos del triángulo:");

        for (int i = 0; i < 3; i++) {
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