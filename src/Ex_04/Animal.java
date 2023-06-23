package Ex_04;

public class Animal {
    private String nome;
    private double comprimento;
    private int numPatas;
    private String cor;
    private String ambiente;
    private double velocidade;

    public Animal(String nome, double comprimento, int numPatas, String cor, String ambiente, double velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numPatas = numPatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Comprimento: " + comprimento + " metros");
        System.out.println("Número de patas: " + numPatas);
        System.out.println("Cor: " + cor);
        System.out.println("Ambiente: " + ambiente);
        System.out.println("Velocidade: " + velocidade + " m/s");
    }
}