package entities;
import abstracts.AnimalVoadorAB;

public class Pombo extends AnimalVoadorAB {
    private int quantidadeComida;
    private int distanciaPercorrida;
    private int horasDormidas;

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
    
    public int getQuantidadeComida() {
        return quantidadeComida;
    }

    public void setQuantidadeComida(int quantidadeComida) {
        this.quantidadeComida = quantidadeComida;
    }

    public int getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void setDistanciaPercorrida(int distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public int getHorasDormidas() {
        return horasDormidas;
    }

    public void setHorasDormidas(int horasDormidas) {
        this.horasDormidas = horasDormidas;
    }
}