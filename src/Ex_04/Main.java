package Ex_04;

public class Main {
    public static void main(String[] args) {
        Animal camelo = new Animal("Camelo", 2.0, 4, "Marrom", "Deserto", 15.0);
        Animal iguana = new Animal("Iguana", 0.5, 4, "Verde", "Floresta", 5.0);
        Animal leao = new Animal("Leão", 1.2, 4, "Amarelo", "Savana", 20.0);
        Mamifero micoLeaoDourado = new Mamifero("Mico-leão-dourado", 0.3, 4, "Laranja", 8.0, "Frutas");
        Mamifero ursoDoCanada = new Mamifero("Urso-do-Canadá", 1.8, 4, "Castanho", 10.0, "Mel");
        Peixe tubarao = new Peixe("Tubarão", 3.5, "Cinza", 25.0, "Barbatanas e cauda");

        camelo.exibirInfo();
        System.out.println("\n----------------------");
        tubarao.exibirInfo();
        System.out.println("\n----------------------");
        ursoDoCanada.exibirInfo();
        System.out.println("\n----------------------");
        iguana.exibirInfo();
        System.out.println("\n----------------------");
        leao.exibirInfo();
        System.out.println("\n----------------------");
        micoLeaoDourado.exibirInfo();
    }
}

