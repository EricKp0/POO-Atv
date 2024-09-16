public class Main {
    public static void main(String[] args) {

        // Televisor Objeto 1//
        televisor televisor1 = new televisor();
        televisor1.marca = "Samsung";
        televisor1.modelo = "UA55TU8000";
        televisor1.preco = 3000;
        televisor1.descricao();
        televisor1.ligado("televisor");

        // Geladeira Objeto 2//
        eletrodomestico geladeira = new eletrodomestico();
        geladeira.marca = "Eletrolux";
        geladeira.modelo = "LF1600";
        geladeira.preco = 2500;
        geladeira.descricao();
        geladeira.ligado("geladeira");

        // Fogão Objeto 3//
        eletrodomestico fogao = new eletrodomestico();
        fogao.marca = "Brastemp";
        fogao.modelo = "F1";
        fogao.preco = 1500;
        fogao.descricao();
        fogao.ligado("fogão");

        // Automóvel Objeto 4//
        automovel automovel1 = new automovel();
        automovel1.marca = "Volkswagen";
        automovel1.modelo = "Gol";
        automovel1.preco = 40000;
        automovel1.descricao();
        automovel1.motor("gol");

        // Televisor com DVD Objeto 5//
        televisor televisor2 = new televisor();
        televisor2.marca = "LG";
        televisor2.modelo = "BH500X";
        televisor2.preco = 6000;
        televisor2.descricao();
        televisor2.ligado("televisor com DVD");

    }
}
