package formas;

public abstract class Forma {
    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    @Override
    public String toString() {
        return String.format("Área: %.2f, Perímetro: %.2f", calcularArea(), calcularPerimetro());
    }
}
