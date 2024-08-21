package src;

public class Pombo extends AnimalVoadorAB {
    public Pombo(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int quantidadeAsas, int envergaduraAsa) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, quantidadeAsas, envergaduraAsa);
    }

    @Override
    public void comer(int quantidadeComida) {
        this.quantidadeComida += quantidadeComida;
    }

    @Override
    public void moverse(int distancia) {
        voar(distancia);
    }

    @Override
    public void dormir(int horas) {
        this.horasDormidas += horas;
    }

    @Override
    public void voar(int distancia) {
        this.distanciaPercorrida += distancia;
    }
}