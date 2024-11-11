package formas;

public class Retangulo extends Forma {
    private final double largura;
    private final double altura;

    public Retangulo(double largura, double altura) {
        if (largura <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Largura e altura devem ser maiores que zero.");
        }
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    @Override
    public String toString() {
        return "Retângulo - " + super.toString();
    }
}
