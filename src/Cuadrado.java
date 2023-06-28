class Cuadrado extends Figura {
    @Override
    public double calcularPerimetro() {

        double lado = calcularDistancia(0, 1);
        return lado * 4;

    }

    @Override
    public double calcularArea() {
        double lado = calcularDistancia(0, 1);
        return lado * lado;
    }
}
