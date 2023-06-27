import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Figura {
    List<Punto> listaPuntos = new ArrayList<>();

    public abstract double calcularPerimetro();
    public abstract double calcularArea();

    public void ingresarPuntos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la componente x:");
        double x = sc.nextDouble();
        System.out.println("Ingresa la componente y:");
        double y = sc.nextDouble();
        System.out.println("Ingresa la componente z:");
        double z = sc.nextDouble();

        Punto punto = new Punto(x, y, z);
        listaPuntos.add(punto);
    }

    public double calcularDistancia(int i, int j) {
        Punto punto1 = listaPuntos.get(i);
        Punto punto2 = listaPuntos.get(j);
        double distancia = Math.sqrt(Math.pow(punto1.getX() - punto2.getX(), 2) +
                Math.pow(punto1.getY() - punto2.getY(), 2) +
                Math.pow(punto1.getZ() - punto2.getZ(), 2));
        return distancia;
    }

    }
