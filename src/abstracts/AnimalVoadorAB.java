package abstracts;
public abstract class AnimalVoadorAB extends AnimalAB {
    protected int quantidadeAsas;
    protected int envergaduraAsa;
    
    public abstract void voar(int distanciaPercorrida);

    public AnimalVoadorAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int quantidadeAsas, int envergaduraAsa) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
        this.quantidadeAsas = quantidadeAsas;
        this.envergaduraAsa = envergaduraAsa;
    }
}