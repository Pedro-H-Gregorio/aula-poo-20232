package Personagens;

import modelos.Arma;
import modelos.Personagem;
import enums.tipoArma;
import modelos.Pocao;

public class Mago extends Personagem {

    private int mana;
    public Mago(String nome) {
        super(nome);
        this.mana = 100;
    }

    public int getMana() {
        return mana;
    }

    public boolean isFullMana(){
        return mana == 500;
    }

    public void recuperaMana(Pocao pocao){
        if(isFullMana()){
            System.out.println("Sua capacidade de mana está completa");
        } else mana += pocao.getCura();
    }

    public void recuperaMana(int mana){
        this.mana += isFullMana()? 0 : mana;
    }

    @Override
    public void setArma(Arma arma) {
        if (arma.getTipo().equals(tipoArma.MAGIA)){
            super.setArma(arma);
        }else System.out.println("Você não pode usar armas diferentes do tipo de magia.");
    }

    @Override
    public void pedirBardoTocar(Bardo bardo, Boss personagem) {
        this.setVida(20);
        this.recuperaMana(50);
        super.pedirBardoTocar(bardo,personagem);
    }

    @Override
    public void bardoPara() {
        this.setVida(10);
    }
}
