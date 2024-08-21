package entities;
import abstracts.AnimalMarinhoAB;

public class Peixe extends AnimalMarinhoAB {
    private int quantidadeComida;
    private int distanciaPercorrida;
    private int horasDormidas;

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