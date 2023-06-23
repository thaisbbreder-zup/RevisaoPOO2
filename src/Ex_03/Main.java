package Ex_03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) { //static indica que o método pertence à classe em si e não a uma instância específica da classe, podendo ser chamado diretamente pela classe, sem a necessidade de criar um objeto

        List<ObjetoCor> objetosCores = new ArrayList<>();

        objetosCores.add(new ObjetoCor("bola", "azul"));
        objetosCores.add(new ObjetoCor("boneca", "amarela"));
        objetosCores.add(new ObjetoCor("dado", "rosa"));

        for (ObjetoCor objetoCor : objetosCores) {
            System.out.println("Objeto: " + objetoCor.getObjeto() + "\nCor: " + objetoCor.getCor());
        }
    }
}

