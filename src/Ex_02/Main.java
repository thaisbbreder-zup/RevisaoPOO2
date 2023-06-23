package Ex_02;

public class Main {
    public static void main(String[] args) {

        ContaPoupanca contaPoupanca = new ContaPoupanca(1000.0);
        ContaCorrente contaCorrente = new ContaCorrente(2000.0);
        SeguroDeVida seguroDeVida = new SeguroDeVida();


        System.out.println("Tributos da Conta Poupança: R$ " + contaPoupanca.calcularTributos());
        System.out.println("Tributos da Conta Corrente: R$ " + contaCorrente.calcularTributos());
        System.out.println("Tributos do Seguro de Vida: R$ " + seguroDeVida.calcularTributos());
    }
}