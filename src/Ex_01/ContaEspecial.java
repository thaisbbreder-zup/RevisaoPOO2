package Ex_01;

public class ContaEspecial extends ContaBancaria {
    private double limite;

    public ContaEspecial(String nomeDoCliente, int numConta, double saldo, double limite) {
        super(nomeDoCliente, numConta, saldo);
        this.limite = limite;
    }

    public void sacar(double valorSaque) {
        double saldoDisponivel = getSaldo() + limite;
        if (saldoDisponivel >= valorSaque) {
            setSaldo(getSaldo() - valorSaque);
            System.out.println("O saque foi realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }

    }
}


