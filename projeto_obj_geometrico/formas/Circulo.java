package formas;

public class Circulo extends Forma {
    private final double raio;

    public Circulo(double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("O raio deve ser maior que zero.");
        }
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String toString() {
        return "Círculo - " + super.toString();
    }
}
