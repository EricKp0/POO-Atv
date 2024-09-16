public class eletrodomestico extends item {
    public void ligado(String x){
        System.out.println("O eletrodoméstico: " + x + " está ligado(a)");
    }

    public void descricao() {
        System.out.println("Eletrodoméstico: " + marca + " " + modelo + " - Preço: " + preco);
    }
}
