class Triangulo extends Figura {
    @Override
    public double calcularPerimetro() {
        double lado1 = calcularDistancia(0, 1);
        double lado2 = calcularDistancia(1, 2);
        double lado3 = calcularDistancia(2, 0);
        return lado1 + lado2 + lado3;
    }

    @Override
    public double calcularArea() {
        double lado1 = calcularDistancia(0, 1);
        double lado2 = calcularDistancia(1, 2);
        double lado3 = calcularDistancia(2, 0);
        double semiperimetro = calcularPerimetro() / 2;
        return Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
    }
}
