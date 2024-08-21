package src;

public class Gato extends AnimalTerrestreAB {
    public Gato(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int quantidadePatas) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, quantidadePatas);
    }

    @Override
    public void comer(int quantidadeComida) {
        this.quantidadeComida += quantidadeComida;
    }

    @Override
    public void moverse(int distancia) {
        this.distanciaPercorrida += distancia;
    }

    @Override
    public void dormir(int horas) {
        this.horasDormidas += horas;
    }
}