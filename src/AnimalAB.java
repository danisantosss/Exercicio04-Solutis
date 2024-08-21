package src;

public abstract class AnimalAB implements AnimalIF {
    protected int quantidadeComida;
    protected int distanciaPercorrida;
    protected int horasDormidas;
    protected String nome;
    protected String tipoAnimal;
    protected int idade;
    protected String habitat;
    protected double altura;
    protected double peso;

    public AnimalAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso) {
        this.quantidadeComida = 0;
        this.distanciaPercorrida = 0;
        this.horasDormidas = 0;
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.habitat = habitat;
        this.altura = altura;
        this.peso = peso;
    }
    
    public abstract void comer(int quantidadeComida);
    public abstract void moverse(int distancia);
    public abstract void dormir(int horas);

}