package src;

public class Peixe extends AnimalMarinhoAB {
    public Peixe(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
    }

    @Override
    public void comer(int quantidadeComida) {
        this.quantidadeComida += quantidadeComida;
    }

    @Override
    public void moverse(int distancia) {
        nadar(distancia);
    }

    @Override
    public void dormir(int horas) {
        this.horasDormidas += horas;
    }

    @Override
    public void nadar(int distancia) {
        this.distanciaPercorrida += distancia;
    }
}