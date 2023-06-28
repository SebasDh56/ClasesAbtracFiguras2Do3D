class Cubo extends Figura {
    @Override
    public double calcularPerimetro() {
        double lado = calcularDistancia(0, 1);
        return 12 * lado;
    }

    @Override
    public double calcularArea() {
        return 0;
    }

    public double calcularAreaSuperficial() {
        double lado = calcularDistancia(0, 1);
        return 6 * lado * lado;
    }

    public double calcularVolumen() {
        double lado = calcularDistancia(0, 1);
        return Math.pow(lado, 3);
    }
}