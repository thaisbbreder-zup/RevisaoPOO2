package Ex_02;

public class ContaPoupanca implements Tributavel {
    private double saldo;

    public ContaPoupanca(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public double calcularTributos() {
        // ContaPoupanca não é tributável, portanto, retorna 0 para os tributos
        return 0;
    }
}
