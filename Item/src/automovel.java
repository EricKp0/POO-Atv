public class automovel extends item {
    public void motor(String y){
        System.out.println("O motor do automóvel: " + y + " está ligado");
    }

    public void descricao() {
        System.out.println("Automóvel: " + marca + " " + modelo + " - Preço: " + preco);
    }
}
