import entities.Cachorro;
import entities.Elefante;
import entities.Gato;
import entities.Leão;
import entities.Peixe;
import entities.Pombo;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Bolt", "Cachorro", 1, "Doméstico", 1, 10, 4);
        Elefante elefante = new Elefante("Dumbo", "Elefante", 1, "Selva", 1, 5, 4);
        Gato gato = new Gato("Garfield", "Gato", 1, "Doméstico", 10, 100, 4);
        Leão leao = new Leão("Mufasa", "Leão", 1, "Selva", 2, 10, 4);
        Peixe peixe = new Peixe("Nemo", "Peixe", 1, "Oceano", 0.5, 0.5);
        Pombo pombo = new Pombo("Muttley", "Pombo", 1, "Campo", 0.5, 0.5, 2, 0);

        cachorro.moverse(10);
        elefante.comer(100);
        gato.dormir(8);
        leao.comer(50);
        peixe.nadar(10);
        pombo.voar(10);

        System.out.println("Cachorro se moveu " + cachorro.getDistanciaPercorrida() + " metros.");
        System.out.println("Elefante comeu " + elefante.getQuantidadeComida() + " gramas de comida.");
        System.out.println("Gato dormiu " + gato.getHorasDormidas() + " horas.");
        System.out.println("Leão comeu " + leao.getQuantidadeComida() + " gramas de comida.");
        System.out.println("Peixe nadou " + peixe.getDistanciaPercorrida() + " metros.");
        System.out.println("Pombo voou " + pombo.getDistanciaPercorrida() + " metros.");

    }
}
