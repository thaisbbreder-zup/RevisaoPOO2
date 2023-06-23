package Ex_04;

public class Peixe extends Animal {
    private String caracteristicas;

    public Peixe(String nome, double comprimento, String cor, double velocidade, String caracteristicas) {
        super(nome, comprimento, 0, cor, "mar", velocidade);
        this.caracteristicas = caracteristicas;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Características: " + caracteristicas);
    }
}