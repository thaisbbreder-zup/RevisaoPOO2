package Ex_04;

public class Mamifero extends Animal {
    private String alimento;

    public Mamifero(String nome, double comprimento, int numPatas, String cor, double velocidade, String alimento) {
        super(nome, comprimento, numPatas, cor, "terra", velocidade);
        this.alimento = alimento;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Alimento: " + alimento);
    }
}