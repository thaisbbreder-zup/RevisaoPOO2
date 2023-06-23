package Ex_02;

public class ContaCorrente implements Tributavel {
    private double saldo;

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public double calcularTributos() {
        // Calcula 1% do saldo da conta como tributo
        return saldo * 0.01;
    }
}
