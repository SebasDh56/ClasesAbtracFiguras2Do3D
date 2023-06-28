class Piramide extends Figura {
    public double altura;

    @Override
    public double calcularPerimetro() {
        double lado1 = calcularDistancia(0, 1);
        double lado2 = calcularDistancia(1, 2);
        double lado3 = calcularDistancia(2, 0);
        return lado1 + lado2 + lado3;
    }

    @Override
    public double calcularArea() {
        return 0;
    }

    public double calcularAreaBase() {
        double lado1 = calcularDistancia(0, 1);
        double lado2 = calcularDistancia(1, 2);
        double lado3 = calcularDistancia(2, 0);
        double semiperimetro = calcularPerimetro() / 2;
        double areaBase = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
        double areaLateral = calcularPerimetro() * altura / 2;
        return areaBase + areaLateral;
    }

    public double calcularAreaSuperficial() {
        double semiperimetroBase = calcularPerimetro() / 2;
        double areaBase = Math.sqrt(
                semiperimetroBase *
                        (semiperimetroBase - calcularDistancia(0, 1)) *
                        (semiperimetroBase - calcularDistancia(1, 2)) *
                        (semiperimetroBase - calcularDistancia(2, 0))
        );

        double semiperimetro1 = (calcularDistancia(0, 3) + calcularDistancia(3, 1) + calcularDistancia(1, 0)) / 2;
        double areaTriangulo1 = Math.sqrt(
                semiperimetro1 *
                        (semiperimetro1 - calcularDistancia(0, 3)) *
                        (semiperimetro1 - calcularDistancia(3, 1)) *
                        (semiperimetro1 - calcularDistancia(1, 0))
        );

        double semiperimetro2 = (calcularDistancia(1, 3) + calcularDistancia(3, 2) + calcularDistancia(2, 1)) / 2;
        double areaTriangulo2 = Math.sqrt(
                semiperimetro2 *
                        (semiperimetro2 - calcularDistancia(1, 3)) *
                        (semiperimetro2 - calcularDistancia(3, 2)) *
                        (semiperimetro2 - calcularDistancia(2, 1))
        );

        double semiperimetro3 = (calcularDistancia(2, 3) + calcularDistancia(3, 0) + calcularDistancia(0, 2)) / 2;
        double areaTriangulo3 = Math.sqrt(
                semiperimetro3 *
                        (semiperimetro3 - calcularDistancia(2, 3)) *
                        (semiperimetro3 - calcularDistancia(3, 0)) *
                        (semiperimetro3 - calcularDistancia(0, 2))
        );

        double semiperimetro4 = (calcularDistancia(0, 3) + calcularDistancia(3, 2) + calcularDistancia(2, 0)) / 2;
        double areaTriangulo4 = Math.sqrt(
                semiperimetro4 *
                        (semiperimetro4 - calcularDistancia(0, 3)) *
                        (semiperimetro4 - calcularDistancia(3, 2)) *
                        (semiperimetro4 - calcularDistancia(2, 0))
        );

        return areaBase + areaTriangulo1 + areaTriangulo2 + areaTriangulo3 + areaTriangulo4;
    }

    public double calcularVolumen() {
        double lado1 = calcularDistancia(0, 1);
        double lado2 = calcularDistancia(1, 2);
        double lado3 = calcularDistancia(2, 0);
        double semiperimetro = calcularPerimetro() / 2;
        double areaBase = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
        return (areaBase * altura) / 3;
    }
}
