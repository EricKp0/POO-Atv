package banco;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Lucas Pereira", "234.567.890-01");
        Cliente cliente2 = new Cliente("Ana Souza", "876.543.210-09");

        Conta conta1 = new Conta(2001, cliente1);
        Conta conta2 = new Conta(2002, cliente2);

        Banco banco = new Banco();
        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);

        conta1.depositar(800.0);
        conta1.sacar(300.0);
        System.out.println("Saldo da conta de Lucas: " + conta1.getSaldo());

        conta2.depositar(1500.0);
        conta2.sacar(250.0);
        System.out.println("Saldo da conta de Ana: " + conta2.getSaldo());
    }
}
