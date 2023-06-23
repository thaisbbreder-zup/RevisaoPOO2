package Ex_01;

import java.time.LocalDate;


public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;

    public ContaPoupanca(String nomeDoCliente, int numConta, double saldo, int diaRendimento) {
        super(nomeDoCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    @Override
    public void sacar(double valorSaque) {
        if (valorSaque > 0 && valorSaque <= getSaldo()) {
            setSaldo(getSaldo() - valorSaque);
            System.out.println("O saque foi realizado com sucesso.");
        } else {
            System.out.println("Não foi possível realizar o saque.");
        }
    }

    public void calcularNovoSaldo(double taxaDeRendimento) {
        LocalDate dataAtual = LocalDate.now();
        int diaAtual = dataAtual.getDayOfMonth();

        if (diaAtual == diaRendimento) {
            double rendimento = getSaldo() * taxaDeRendimento;
            setSaldo(getSaldo() + rendimento);
            System.out.println("Novo saldo após rendimento: " + getSaldo());
        } else {
            System.out.println("Ainda não é o dia de rendimento.");
        }
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public void setTaxaDeRendimento(double taxaRendimento) {
    }
}