package Personagens;

import modelos.Arma;
import modelos.Personagem;
import enums.tipoArma;
import modelos.Pocao;

public class Mago extends Personagem {

    private int mana;
    private int maxMana;
    public Mago(String nome) {
        super(nome);
        this.mana = 100;
        this.maxMana = 500;
    }

    public int getMana() {
        return mana;
    }

    public boolean isFullMana(){
        return mana == maxMana;
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
        if (arma.getTipo().getKey()  == tipoArma.CORPO_A_CORPO.getKey()){
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

    @Override
    public void subirDeNivel() {
        this.mana += 100;
        this.maxMana += 200;
        super.subirDeNivel();
    }
}
