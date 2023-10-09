package Personagens;

import modelos.Arma;
import modelos.Personagem;

public class Guerreiro extends Personagem {

    private int forca;
    public Bardo bardo;

    public Guerreiro(String nome) {
        super(nome);
        this.forca = 10;
    }

    public int getForca() {
        return forca;
    }

    @Override
    public void setArma(Arma arma) {
        if(arma.getTipo().equals("corpo")){
            arma.setDano(arma.getDano() + 5);
        }
        super.setArma(arma);
    }

    @Override
    public void pedirBardoTocar(Bardo bardo, Boss personagem) {
        this.forca += 5;
        setVida(getVida() + 10);
        super.pedirBardoTocar(bardo, personagem);
    }

    @Override
    public void bardoPara() {
        this.forca -= 5;
        setVida(getVida() - 5);
    }

    @Override
    public void atacar(Boss outro) {
        if (getArma() == null) {
            System.out.printf("%s atacou %s com a mão%n",
                    this.getNome(), outro.getNome());
            outro.receberDano(1 + getForca());
            return;
        }

        System.out.printf("%s atacou %s com %s%n",
                this.getNome(), outro.getNome(), getArma().getNome());
        outro.receberDano(getArma().getDano() + getForca());
    }
}
